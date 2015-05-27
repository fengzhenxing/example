package com.ahamojo.www.example.template;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;


public class Base extends WebPage{

	/**
	 *
	 */
	private static final long serialVersionUID = -8550834696247898199L;

	public Base() {
		super();
	}

	public Base(final PageParameters params){
		super(params);
        //add header panel
        add(new HeaderPanel("header"));
        add(new FooterPanel("footer"));

	}
}
