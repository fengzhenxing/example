package com.ahamojo.www.example.template;

import org.apache.wicket.behavior.AttributeAppender;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.Panel;

public class MenuLinkItem extends Panel {

	/**
	 *
	 */
	private static final long serialVersionUID = 15590316035090360L;

	public MenuLinkItem(String id, BookmarkablePageLink<?> pageLink,boolean shouldBeActive) {
		super(id);
		add(pageLink);
		if (shouldBeActive) {
			add(new AttributeAppender("class", "active"));
		}
	}
}
