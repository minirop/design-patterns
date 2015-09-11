package com.formation.composite;

public interface Visitor {
	void visit(HtmlBlockElement block);
	void visit(HtmlInlineElement inline);
	void visit(HtmlTextElement text);
}
