package com.design.patterns.tickets.ticket;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
	
	private List<Line> lineList;
	
	public Ticket() {
		this.lineList = new ArrayList<Line>();
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

	public void add(Line line) {
		lineList.add(line);
	}
	
	public int lines() {
		return lineList.size();
	}
}
