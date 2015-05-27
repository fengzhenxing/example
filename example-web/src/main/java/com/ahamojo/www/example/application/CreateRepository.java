package com.ahamojo.www.example.application;

import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.ahamojo.www.example.panels.Repository;
import com.ahamojo.www.example.panels.RepositoryPanel;
import com.ahamojo.www.example.template.Base;

public class CreateRepository extends Base{

	/**
	 *
	 */
	private static final long serialVersionUID = 1329542242920023390L;

	public CreateRepository(PageParameters parameters) {
		super(parameters);
		add(new RepositoryPanel("form-repo-p",Model.of(new Repository())));
		// TODO Auto-generated constructor stub
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
