package com.formation.strategy;

public class StrategyMain {
	public static void main(String[] args) {
		Rambo r = new Rambo(new RunningStrategy());
		r.escape();
		r.changeStrategy(new SuicideStrategy());
		r.escape();
	}
}
