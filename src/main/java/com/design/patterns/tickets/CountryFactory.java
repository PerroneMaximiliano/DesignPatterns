package com.design.patterns.tickets;

import com.design.patterns.tickets.menu.Menu;
import com.design.patterns.tickets.spanishConfiguration.SpanishFactory;

public abstract class CountryFactory {
	
	private static CountryFactory countryFactory = null;

	public static CountryFactory instance() {
		if (CountryFactory.countryFactory == null) {
			CountryFactory.countryFactory = new SpanishFactory();
		}
		return CountryFactory.countryFactory;
	}
	
	public abstract Menu getMenu();
	
	public abstract Ticket getTicket();
}
