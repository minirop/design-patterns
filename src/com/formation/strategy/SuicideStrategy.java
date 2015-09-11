package com.formation.strategy;

public class SuicideStrategy implements EscapeStrategy {

	@Override
	public void execute() {
		System.out.println("Se suicider.");
	}

}
