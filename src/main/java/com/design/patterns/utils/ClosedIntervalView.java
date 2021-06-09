package com.design.patterns.utils;

public class ClosedIntervalView {

	private String title;

	private ClosedInterval limits;

	public ClosedIntervalView(String title, ClosedInterval limits) {
		this.title = title;
		this.limits = limits;
	}
	
	public void writeln() {
		Console.instance().writeln(title + " " + this.toString());
	}
	
	@Override
	public String toString() {
		return "[" + limits.getMin() + ", " + limits.getMax() + "]";
	}
}
