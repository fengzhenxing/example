package com.ahamojo.www.example.template;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.ahamojo.www.example.application.MenuItemEnum;

public abstract class Base extends WebPage {

	/**
	 *
	 */
	private static final long serialVersionUID = -8550834696247898199L;

	public Base(PageParameters parameters){
		super(parameters);
		add(new HeaderPanel("header"));
		add(new FooterPanel("footer"));
	}

	public abstract Class<? extends Base> getSubPage();

	public abstract MenuItemEnum getActiveMenu();


}
