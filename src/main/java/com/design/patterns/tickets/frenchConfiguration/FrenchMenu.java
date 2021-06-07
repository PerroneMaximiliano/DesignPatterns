package com.design.patterns.tickets.frenchConfiguration;

import com.design.patterns.tickets.menu.CancellationLineCommand;
import com.design.patterns.tickets.menu.Menu;
import com.design.patterns.tickets.menu.RepetitionLineCommand;
import com.design.patterns.tickets.menu.SaleLineCommand;

public class FrenchMenu extends Menu {

	@Override
	protected void setCommands() {
		commandList.add(new SaleLineCommand());
		commandList.add(new RepetitionLineCommand());
		commandList.add(new CancellationLineCommand());
	}

}
