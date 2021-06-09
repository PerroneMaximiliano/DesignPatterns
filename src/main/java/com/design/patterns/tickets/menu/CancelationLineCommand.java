package com.design.patterns.tickets.menu;

import com.design.patterns.tickets.ticket.CancellationLine;
import com.design.patterns.utils.LimitedIntDialog;

public class CancelationLineCommand extends Command {

	public CancelationLineCommand() {
		super("Linea de cancelación");
	}

	@Override
	public void execute() {
		int max = ticket.lines();
		int line = LimitedIntDialog.instance().read("Línea", max);
		ticket.add(new CancellationLine(line));
	}

}
