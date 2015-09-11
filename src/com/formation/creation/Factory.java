package com.formation.creation;

public class Factory {
	public static Object create(String name) {
		switch(name) {
		case "int":
			return new Integer(0);
		case "double":
			return new Double(0.0);
		default:
			return name;
		}
	}
}
