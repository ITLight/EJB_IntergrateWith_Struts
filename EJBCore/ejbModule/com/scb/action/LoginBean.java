package com.scb.action;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.InitialDirContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.scb.connection.utility.OracleConnUtils;
import com.scb.connection.utility.PropValueUtils;
import com.scb.model.ScbcsUser;

/**
 * Session Bean implementation class LoginBean
 */
@Stateless(mappedName="Login")
@EJB(name="login", beanInterface=Login.class)
public class LoginBean implements Login {
	
    private String INITIAL_CONTEXT_FACTORY = "INITIAL_CONTEXT_FACTORY";
    private String PROVIDER_URL = "PROVIDER_URL";
    private String SECURITY_PRINCIPAL = "SECURITY_PRINCIPAL";
    private String pathSQLFile = "Sql.properties";
    private PropValueUtils propValueUtils = null;
    private Properties properties = null;
    private Connection connection = null;
    private EntityManagerFactory mEntityManagerFactory;
    private EntityManager mEntityManager;
    
    public LoginBean() {
    	if (propValueUtils == null) {
    		propValueUtils = new PropValueUtils();
    	}
    	if (properties == null) {
    		properties = new Properties();
    	}
    	mEntityManagerFactory = Persistence.createEntityManagerFactory("EJBCore");
    }
    
	@Override
	public String login(String username, String password) {
		return "success";
//		if (LDAPAuthentication(username, password)) {
//			return "success";
//		} else {
//			return "error";
//		}
	}
	
	public String getDetail(String username) {
		OracleConnUtils oracleConnUtils = new OracleConnUtils();
		String rs = "";
		try {
			properties = propValueUtils.getPropValues(pathSQLFile);
			String sql = properties.getProperty("S_SQL_DETAIL");
			mEntityManager = mEntityManagerFactory.createEntityManager();
			Query query = mEntityManager.createNativeQuery(sql);
			query.setParameter(1, username.trim().toUpperCase());
			List<String> list = query.getResultList();
			rs = list.get(0);
			mEntityManager.flush();
			mEntityManager.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public ResultSet getResultSetInfo(String username) {
		OracleConnUtils oracleConnUtils = new OracleConnUtils();
		ResultSet resultSet = null;
		try {
			properties = propValueUtils.getPropValues(pathSQLFile);
			String sql = properties.getProperty("S_SQL_DETAIL_TABLE");
			connection = oracleConnUtils.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, username.trim().toUpperCase());
			resultSet = preparedStatement.executeQuery();
		} catch (Exception e) {
			
		}
		return resultSet;
	}
	

}
