package com.design.patterns.state.fine;

import com.design.patterns.utils.Console;

public class Sad extends Mood {

	@Override
	protected void eat() {
		Console.instance().writeln("Eating in sad mood");
	}

	@Override
	protected void dance() {
		Console.instance().writeln("Dancing in sad mood");
	}

	@Override
	protected void work() {
		Console.instance().writeln("Working in sad mood");
	}

}
