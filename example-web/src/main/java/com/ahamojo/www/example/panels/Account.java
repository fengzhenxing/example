package com.ahamojo.www.example.panels;

import java.io.Serializable;
import java.util.List;

import org.apache.wicket.markup.html.form.upload.FileUpload;

public class Account implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = -5944224398339477316L;

	private String userName;

	private String password;

	private Integer gender;

	private String degree;

	private String birthdate;

	private List<FileUpload> photo;

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public List<FileUpload> getPhoto() {
		return photo;
	}

	public void setPhoto(List<FileUpload> photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Account [userName=" + userName + ", password=" + password
				+ ", gender=" + gender + ", degree=" + degree + ", birthdate="
				+ birthdate + ", photo=" + photo + "]";
	}

}
