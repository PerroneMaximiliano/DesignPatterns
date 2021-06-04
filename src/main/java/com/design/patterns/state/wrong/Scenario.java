package com.design.patterns.state.wrong;

public class Scenario {

	private void start() {
		Person person = new Person();
		person.work();
		person.eat();
		person.dance();
		person.eat();
	}

	public static void main(String[] arguments) {
		new Scenario().start();
	}
}
