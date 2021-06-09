package com.design.patterns.tickets.menu;

import java.util.ArrayList;
import java.util.List;

import com.design.patterns.tickets.ticket.Ticket;
import com.design.patterns.utils.Console;
import com.design.patterns.utils.LimitedIntDialog;

public abstract class Menu {
	
	protected List<Command> commandList;
	
	private ExitCommand exitCommand;
	
	public Menu() {
		commandList = new ArrayList<Command>();
		this.setCommands();
		exitCommand = new ExitCommand();
		commandList.add(exitCommand);
	}

	protected abstract void setCommands();

	protected void set(Ticket ticket) {
		for (Command command : commandList) {
			command.set(ticket);
		}
	}
	
	public void execute(Ticket ticket) {
		this.set(ticket);
		exitCommand.reset();
		do {
			this.write();
			int option = this.getOption();
			commandList.get(option).execute();
		} while(!exitCommand.closed());
	}

	private void write() {
		Console.instance().writeln();
		Console.instance().writeln("---------------------");
		for (int i = 0; i < commandList.size(); i++) {
			Console.instance().writeln((i + 1) + ". " + commandList.get(i).getTitle());
		}
	}
	
	private int getOption() {
		return LimitedIntDialog.instance()
				.read("Opción", 1, commandList.size()) - 1;
	}
}
