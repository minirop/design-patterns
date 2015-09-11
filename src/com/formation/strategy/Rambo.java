package com.formation.strategy;

public class Rambo {
	private EscapeStrategy strategy;

	public Rambo(EscapeStrategy strategy) {
		super();
		this.changeStrategy(strategy);
	}

	public void changeStrategy(EscapeStrategy strategy) {
		this.strategy = strategy;
	}

	public void escape() {
		strategy.execute();
	}
}
