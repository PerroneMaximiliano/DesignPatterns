package com.design.patterns.tickets.spanishConfiguration;

import com.design.patterns.tickets.menu.CancellationLineCommand;
import com.design.patterns.tickets.menu.Menu;
import com.design.patterns.tickets.menu.RepetitionLineCommand;
import com.design.patterns.tickets.menu.ReturnLineCommand;
import com.design.patterns.tickets.menu.SaleLineCommand;

public class SpanishMenu extends Menu {

	@Override
	protected void setCommands() {
		commandList.add(new SaleLineCommand());
		commandList.add(new RepetitionLineCommand());
		commandList.add(new ReturnLineCommand());
		commandList.add(new CancellationLineCommand());
	}

}
