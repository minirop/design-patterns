package com.formation.composite;

import java.util.HashMap;

public abstract class HtmlComponent implements Visitable {
	HashMap<String, String> attributes = new HashMap<>();
	
	public HtmlComponent addAttribute(String name, String value) {
		attributes.put(name, value);
		return this;
	}
	
	public String outputAttributes() {
		StringBuilder builder = new StringBuilder();
		attributes.forEach((k, v) -> builder.append(" " + k + "=\"" + v + "\""));
		return builder.toString();
	}
	
	abstract public void accept(Visitor visitor);
}
