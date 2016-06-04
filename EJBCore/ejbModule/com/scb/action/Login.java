package com.scb.action;

import java.sql.ResultSet;

import javax.ejb.Remote;

@Remote
public interface Login {
	public String login(String username, String password);
	public String getDetail(String username);
	public ResultSet getResultSetInfo(String username);
}
