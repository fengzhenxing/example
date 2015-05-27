package com.ahamojo.www.example.application;

import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.ahamojo.www.example.panels.Account;
import com.ahamojo.www.example.panels.AccountPanel;
import com.ahamojo.www.example.template.Base;

public class CreateAccount extends Base{

	/**
	 *
	 */
	private static final long serialVersionUID = -1365639096980064761L;

	public CreateAccount(PageParameters parameters) {
		super(parameters);
		add(new AccountPanel("form-account-file-p",Model.of(new Account())));
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
