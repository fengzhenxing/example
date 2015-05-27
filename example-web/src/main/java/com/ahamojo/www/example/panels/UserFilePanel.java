package com.ahamojo.www.example.panels;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.SubmitLink;
import org.apache.wicket.markup.html.form.TextArea;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;

public class UserFilePanel extends Panel{

	/**
	 *
	 */
	private static final long serialVersionUID = 2242699765326485162L;

	public UserFilePanel(String id, IModel<UserFile> model) {
		super(id, model);

		final IModel<UserFile> repoModel = new CompoundPropertyModel<UserFile>(model);

		Form<UserFile> repoForm = new Form<UserFile>("form-user-file", repoModel){

			/**
			 *
			 */
			private static final long serialVersionUID = 6984005900518005838L;

			@Override
			protected void onSubmit() {
				System.out.println("user file submit:"+repoModel);
				super.onSubmit();
			}
		};

		repoForm.add(new Label("notes"));
		repoForm.add(new TextField<String>("fileDirectory"));
		repoForm.add(new TextField<String>("fileName"));

		repoForm.add(new TextArea<String>("fileContent"));
		repoForm.add(new TextArea<String>("commitMsg"));
		repoForm.add(new SubmitLink("repo-user-submit"));

		add(repoForm);
	}
}
