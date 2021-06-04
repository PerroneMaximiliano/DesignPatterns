package com.design.patterns.tickets;

import com.design.patterns.tickets.spanishFactory.SpanishFactory;

public abstract class CountryFactory {
	
	private static CountryFactory countryFactory = null;

	protected static CountryFactory instance() {
		if (CountryFactory.countryFactory == null) {
			CountryFactory.countryFactory = new SpanishFactory();
		}
		return CountryFactory.countryFactory;
	}
	
	public abstract Menu createMenu();
	
	public abstract Ticket createTicket();
}
