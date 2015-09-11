package com.formation.composite;

public class HtmlDraw {

	public static void main(String[] args) {
		HtmlBlockElement htmlElem = new HtmlBlockElement("html")
			.add(new HtmlBlockElement("head")
					.add(new HtmlInlineElement("title"))
					.add(new HtmlInlineElement("meta").addAttribute("charset", "UTF-8"))
					)
			.add(new HtmlBlockElement("body")
					.add(new HtmlBlockElement("header")
							.add(new HtmlBlockElement("h1")
									.add(new HtmlTextElement("Bonjour"))
									.addAttribute("id", "title")
									)
							)
					.add(new HtmlBlockElement("div")
							.add(new HtmlInlineElement("img").addAttribute("src", "images/java.png"))
							)
					.add(new HtmlBlockElement("footer")
							.add(new HtmlBlockElement("h6")
									.add(new HtmlTextElement("Copyright"))
									)
							.addAttribute("class", "footer")
							)
					)
		;
		
		HtmlVisitor visitor = new HtmlVisitor();
		htmlElem.accept(visitor);
	}

}
