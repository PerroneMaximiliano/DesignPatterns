package com.design.patterns.state.fine;

import com.design.patterns.utils.Console;

public class Happy extends Mood {

	@Override
	protected void eat() {
		Console.instance().writeln("Eating in happy mood");
	}

	@Override
	protected void dance() {
		Console.instance().writeln("Dancing in happy mood");
	}

	@Override
	protected void work() {
		Console.instance().writeln("Working in happy mood");
	}

}
