package com.ahamojo.www.example.application;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

public class ExampleApplication extends WebApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		return Home.class;
	}

	@Override
	protected void init() {
		super.init();
	}

}
