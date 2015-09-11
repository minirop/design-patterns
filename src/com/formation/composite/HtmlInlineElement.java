package com.formation.composite;

public class HtmlInlineElement extends HtmlComponent {
	String name;
	
	public HtmlInlineElement(String name) {
		this.name = name;
	}
	
	protected String getName()
	{
		return this.name;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
