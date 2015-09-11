package com.formation.strategy;

public class RunningStrategy implements EscapeStrategy {

	@Override
	public void execute() {
		System.out.println("S'enfuir en courant.");
	}

}
