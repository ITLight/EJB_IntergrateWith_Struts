package com.scb.action;

import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.opensymphony.xwork2.ActionSupport;
import com.scb.action.*;

public class LoginAction extends ActionSupport {
	private Login login = null;
	private String username;
	private String password;
	public String execute() {
		String result = "error";
		ResultSet resultSet = null;
		try {
			Context context = new InitialContext();
			login = (Login) context.lookup("Login#com.scb.action.Login");
			result = login.login(this.username, this.password);
			this.username = login.getDetail(this.username);
			@SuppressWarnings("unused")
			String test = this.username;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
