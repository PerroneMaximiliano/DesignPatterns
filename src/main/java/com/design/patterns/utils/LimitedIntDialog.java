package com.design.patterns.utils;

public class LimitedIntDialog {
	
	private static LimitedIntDialog limitedIntDialog = null;

	public static LimitedIntDialog instance() {
		if (limitedIntDialog == null) {
			limitedIntDialog = new LimitedIntDialog();
		}
		return limitedIntDialog;
	}

	private LimitedIntDialog() {

	}

	public int read(String title, int min, int max) {
		ClosedInterval limits = new ClosedInterval(min, max);
		ClosedIntervalView limitsView = new ClosedIntervalView("El valor debe estar entre ", limits);
		int value;
		boolean ok;
		do {
			value = Console.instance().readInt(title + " " + limitsView + ": ");
			ok = limits.includes(value);
			if (!ok) {
				limitsView.writeln();
			}
		} while (!ok);
		return value;
	}
	
	public int read(String title, int max) {
		return this.read(title, 1, max);
	}
}
