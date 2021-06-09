package com.design.patterns.tickets.countryConfiguration;

import com.design.patterns.tickets.menu.Menu;
import com.design.patterns.tickets.spanishConfiguration.SpanishFactory;
import com.design.patterns.tickets.ticket.Ticket;

public abstract class CountryFactory {
	
	private static CountryFactory countryFactory = null;

	public static CountryFactory instance() {
		if (CountryFactory.countryFactory == null) {
			CountryFactory.countryFactory = new SpanishFactory();
		}
		return CountryFactory.countryFactory;
	}
	
	protected Menu menu;

	protected TicketBuilder ticketBuilder;

	public Ticket getTicket() {
		return ticketBuilder.build();
	}

	public Menu getMenu() {
		return menu;
	}
}
