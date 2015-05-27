package com.ahamojo.www.example.panels;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.SubmitLink;
import org.apache.wicket.markup.html.form.TextArea;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;

public class RepositoryPanel extends Panel{

	/**
	 *
	 */
	private static final long serialVersionUID = -4684807507858081341L;

	public RepositoryPanel(String id,IModel<Repository> model) {
		super(id, model);

		final IModel<Repository> repoModel = new CompoundPropertyModel<Repository>(model);

		Form<Repository> repoForm = new Form<Repository>("form-repo", repoModel){
			private static final long serialVersionUID = -5229153344973070015L;

			@Override
			protected void onSubmit() {
				System.out.println("==============>>"+repoModel);
				super.onSubmit();
			}
		};
		repoForm.add(new TextField<String>("repoName"));
		repoForm.add(new TextArea<String>("repoDesc"));
		repoForm.add(new SubmitLink("repo-submit"));

		add(repoForm);
	}

}
