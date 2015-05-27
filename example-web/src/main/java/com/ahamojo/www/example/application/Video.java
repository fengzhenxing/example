package com.ahamojo.www.example.application;

import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.ahamojo.www.example.template.Base;

public class Video extends Base{

	/**
	 *
	 */
	private static final long serialVersionUID = 3081326046015659838L;

	public Video(PageParameters parameters) {
		super(parameters);
	}

	@Override
	public Class<? extends Base> getSubPage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MenuItemEnum getActiveMenu() {
		// TODO Auto-generated method stub
		return null;
	}

}
