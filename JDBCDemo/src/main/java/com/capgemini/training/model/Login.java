package com.capgemini.training.model;

import java.util.Date;

public class Login {
	
	private int lid;
	private String email;
	private String pass;
	private String role;
	private Date doc;
	
	/**
	 * @return the uid
	 */
	public int getLid() {
		return lid;
	}
	/**
	 * @param uid the uid to set
	 */
	public void setLid(int lid) {
		this.lid = lid;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}
	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
	/**
	 * @return the doc
	 */
	public Date getDoc() {
		return doc;
	}
	/**
	 * @param doc the doc to set
	 */
	public void setDoc(Date doc) {
		this.doc = doc;
	}
}
