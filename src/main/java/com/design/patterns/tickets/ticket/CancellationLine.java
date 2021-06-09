package com.design.patterns.tickets.ticket;

public class CancellationLine extends NumberLine {

	public CancellationLine(int number) {
		super(number);
	}
	
	@Override
	public String toString() {
		return "CancellationLine " + super.toString();
	}
}
