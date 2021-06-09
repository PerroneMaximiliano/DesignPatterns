package com.design.patterns.tickets.ticket;

public class SaleLine extends IdLine {

	public SaleLine(int id, int units) {
		super(id, units);
	}

	@Override
	public String toString() {
		return "SaleLine " + super.toString();
	}
}
