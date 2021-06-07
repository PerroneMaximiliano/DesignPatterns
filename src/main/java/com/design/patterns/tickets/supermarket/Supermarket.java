package com.design.patterns.tickets.supermarket;

import com.design.patterns.tickets.Clock;
import com.design.patterns.tickets.CountryFactory;
import com.design.patterns.tickets.Ticket;
import com.design.patterns.tickets.menu.Menu;

public class Supermarket {
	
	private final static double CLOSING_TIME = 20.0;
	
	private Menu menu;
	
	public Supermarket() {
		menu = CountryFactory.instance().getMenu();
	}
	
	public void sell() {
		Clock clock = new Clock();
		do {
			Ticket ticket = CountryFactory.instance().getTicket();
			menu.execute(ticket);
			ticket.close();
		} while(!clock.isClosed(CLOSING_TIME));
	}
	
	public static void main(String[] args) {
		new Supermarket().sell();
	}
}
