package com.ahamojo.www.example.panels;

import java.io.Serializable;

public class Repository implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 600592032159737035L;
	private String repoName;
	private String repoDesc;
	private String notes;
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getRepoName() {
		return repoName;
	}
	public void setRepoName(String repoName) {
		this.repoName = repoName;
	}
	public String getRepoDesc() {
		return repoDesc;
	}
	public void setRepoDesc(String repoDesc) {
		this.repoDesc = repoDesc;
	}
	@Override
	public String toString() {
		return "Repository [repoName=" + repoName + ", repoDesc=" + repoDesc
				+ ", notes=" + notes + "]";
	}

}
