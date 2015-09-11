package com.formation.composite;

public class HtmlVisitor implements Visitor {
	private static int ident = 0;
	
	private void printIdent(int ident) {
		for(int i = 0;i < ident;i++) {
			System.out.print("    ");
		}
	}

	@Override
	public void visit(HtmlBlockElement block) {
		printIdent(ident);
		System.out.println("<" + block.getName() + block.outputAttributes() + ">");
		
		ident++;
		for(HtmlComponent comp : block.getChildren()) {
			comp.accept(this);
		}
		ident--;
		
		printIdent(ident);
		System.out.println("</" + block.getName() + ">");
	}

	@Override
	public void visit(HtmlInlineElement block) {
		printIdent(ident);
		System.out.println("<" + block.getName() + block.outputAttributes() + " />");
	}

	@Override
	public void visit(HtmlTextElement text) {
		printIdent(ident);
		System.out.println(text.getName());
	}

}
