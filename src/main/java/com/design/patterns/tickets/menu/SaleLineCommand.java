package com.design.patterns.tickets.menu;

import com.design.patterns.tickets.ticket.SaleLine;
import com.design.patterns.utils.LimitedIntDialog;

public class SaleLineCommand extends Command {

	public SaleLineCommand() {
		super("Linea de venta");
	}

	@Override
	public void execute() {
		int id = LimitedIntDialog.instance().read("Código", 1000);
		int units = LimitedIntDialog.instance().read("Unidades", 1000);
		ticket.add(new SaleLine(id, units));
	}

}
