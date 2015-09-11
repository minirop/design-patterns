package com.formation.composite;

public class HtmlTextElement extends HtmlInlineElement {

	public HtmlTextElement(String value) {
		super(value);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
