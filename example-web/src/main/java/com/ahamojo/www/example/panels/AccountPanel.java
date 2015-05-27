package com.ahamojo.www.example.panels;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.IChoiceRenderer;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.Radio;
import org.apache.wicket.markup.html.form.RadioGroup;
import org.apache.wicket.markup.html.form.SubmitLink;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.form.upload.FileUploadField;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;


public class AccountPanel extends Panel{

	/**
	 *
	 */
	private static final long serialVersionUID = 8120618453406163122L;

	private List<String> letters = Arrays.asList(new String[] { "A", "B", "C" });

	public String selected = "B";

	private final static Map<Integer, String> statusMap = new HashMap<Integer, String>();

	static{
		statusMap.put(0,"xx");
		statusMap.put(1,"cz");
		statusMap.put(2,"gz");
		statusMap.put(3,"dx");
	}

	public <T> AccountPanel(String id, IModel<Account> model) {
		super(id, model);

		final IModel<Account> repoModel = new CompoundPropertyModel<Account>(model);

		Form<Account> repoForm = new Form<Account>("form-account-file", repoModel){

			private static final long serialVersionUID = -8831991892530917808L;

			@Override
			protected void onSubmit() {
				System.out.println("========================account submit:"+repoModel);
				super.onSubmit();
				System.out.println("========================account submit:"+repoModel.getObject().getPhoto().get(0).getClientFileName());
			}

		};

		repoForm.setMultiPart(true);

		repoForm.add(new TextField<String>("userName"));
		repoForm.add(new PasswordTextField("password").setRequired(true));

		RadioGroup<Integer> genderGroup = new RadioGroup<Integer>("gender");
		genderGroup.add(new Radio<Integer>("1",Model.of(1)));
		genderGroup.add(new Radio<Integer>("0",Model.of(0)));
		repoForm.add(genderGroup);

		repoForm.add(new TextField<String>("birthdate"));



		repoForm.add(new DropDownChoice<String>("degree",new PropertyModel<String>(this,"selected"), letters));

		IChoiceRenderer<Integer> choiceRenderer = new IChoiceRenderer<Integer>() {

			private static final long serialVersionUID = 1548723834041783820L;

			public Object getDisplayValue(Integer object) {
				return statusMap.get(object);
			}

			public String getIdValue(Integer object, int index) {
				return object.toString();
			}

			public Integer getObject(String id, IModel choices) {
				return null;
			}

		};


		repoForm.add(new FileUploadField("photo"));

		repoForm.add(new SubmitLink("account-submit"));

		add(repoForm);

	}



}
