package com.design.patterns.state.fine;

import com.design.patterns.utils.Console;

public class Person {
	
	private Mood mood;
	
	public Person() {
		this.mood = new Happy();
		Console.instance().writeln("Creating person with happy mood");
	}

	public void eat() {
		this.mood.eat();
		Console.instance().writeln("Keeping state");	
	}
	
	public void dance() {
		this.mood.dance();
		Console.instance().writeln("Setting state to Happy");
		this.mood = new Happy();
	}
	
	public void work() {
		this.mood.work();
		Console.instance().writeln("Setting state to Sad");
		this.mood = new Sad();
	}
}
