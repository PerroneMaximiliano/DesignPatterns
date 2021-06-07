package com.design.patterns.tickets.menu;

import java.util.ArrayList;
import java.util.List;

import com.design.patterns.tickets.Ticket;
import com.design.patterns.utils.Console;

import designPatterns.exercises.n2_tickets.v1.utils.IO;

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
		boolean exit = false;
		do {
			Console.instance().writeln("1. Añadir linea de venta");
			Console.instance().writeln("2. Añadir linea de anulacion");
			int option = Console.instance().readInt("Opcion? ");
			switch (option) {
			case 1:
				break;
			case 2:
				break;
			default:
				break;
			}
		} while(!exit);
	}
	
	private void write() {
		IO.instance().writeln();
		IO.instance().writeln();
		IO.instance().writeln("---------------------");
		for (int i = 0; i < commandList.size(); i++) {
			IO.instance().writeln(
					(i + 1) + ". " + commandList.get(i).getTitle());
		}
	}
}
