package com.design.patterns.tickets.spanishConfiguration;

import com.design.patterns.tickets.countryConfiguration.CountryFactory;
import com.design.patterns.tickets.menu.Menu;
import com.design.patterns.tickets.ticket.Ticket;

public class SpanishFactory extends CountryFactory {
	
	public SpanishFactory() {
		this.menu = new SpanishMenu();
		this.ticketBuilder = new SpanishTicketBuilder();
	}
}
