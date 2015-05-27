package com.ahamojo.www.example.panels;

import java.io.Serializable;

public class UserFile implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1548664450389865363L;

	private String fileDirectory;

	private String fileName;

	private String fileContent;

	private String commitMsg;

	private String notes;

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public UserFile() {
		// TODO Auto-generated constructor stub
	}

	public UserFile(String notes,String fileContent) {
		this.fileContent = fileContent;
		this.notes = notes;
	}

	public UserFile(String notes) {
		this.notes = notes;
	}

	public String getFileDirectory() {
		return fileDirectory;
	}

	public void setFileDirectory(String fileDirectory) {
		this.fileDirectory = fileDirectory;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileContent() {
		return fileContent;
	}

	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
	}

	public String getCommitMsg() {
		return commitMsg;
	}

	public void setCommitMsg(String commitMsg) {
		this.commitMsg = commitMsg;
	}

	@Override
	public String toString() {
		return "UserFile [fileDirectory=" + fileDirectory + ", fileName="
				+ fileName + ", fileContent=" + fileContent + ", commitMsg="
				+ commitMsg + ", notes=" + notes + "]";
	}



}
