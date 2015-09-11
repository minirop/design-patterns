package com.formation.composite;

import java.util.ArrayList;

public class HtmlBlockElement extends HtmlComponent {

	ArrayList<HtmlComponent> children = new ArrayList<>();
	String name;
	
	public HtmlBlockElement(String name) {
		this.name = name;
	}
	
	public HtmlBlockElement add(HtmlComponent e) {
		children.add(e);
		return this;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public ArrayList<HtmlComponent> getChildren() {
		return children;
	}

	public String getName() {
		return name;
	}

}
