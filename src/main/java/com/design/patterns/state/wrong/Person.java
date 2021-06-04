package com.design.patterns.state.wrong;

import com.design.patterns.utils.Console;

public class Person {

	enum AvailableMood {
		HAPPY, SAD;
	}
	
	private AvailableMood mood;
	
	public Person() {
		this.mood = AvailableMood.HAPPY;
		Console.instance().writeln("Creating person with " + this.mood + " mood");
	}

	public void eat() {
		if (this.mood == AvailableMood.HAPPY) {
			this.eatHappy();
		} else if (this.mood == AvailableMood.SAD) {
			this.eatSad();
		}
		Console.instance().writeln("Keeping state");	
	}
	
	private void eatHappy() {
		Console.instance().writeln("Eating in happy mood");
	}
	
	private void eatSad() {
		Console.instance().writeln("Eating in sad mood");
	}
	
	public void dance() {
		if (this.mood == AvailableMood.HAPPY) {
			this.danceHappy();
		} else if (this.mood == AvailableMood.SAD) {
			this.danceSad();
			this.mood = AvailableMood.HAPPY;
		}
		Console.instance().writeln("Setting state to Happy");
	}
	
	private void danceHappy() {
		Console.instance().writeln("Dancing in happy mood");
	}
	
	private void danceSad() {
		Console.instance().writeln("Dancing in sad mood");
	}
	
	public void work() {
		if (this.mood == AvailableMood.HAPPY) {
			this.workHappy();
			this.mood = AvailableMood.SAD;
		} else if (this.mood == AvailableMood.SAD) {
			this.workSad();
		}
		Console.instance().writeln("Setting state to Sad");
	}
	
	private void workHappy() {
		Console.instance().writeln("Working in happy mood");
	}

	private void workSad() {
		Console.instance().writeln("Working in sad mood");
	}
}
