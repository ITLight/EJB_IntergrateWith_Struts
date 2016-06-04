package com.scb.connection.utility;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class OracleConnUtils {
	
	public Connection getConnection() throws ClassNotFoundException, SQLException, IOException {
		String pathFile = "Sql.properties";
    	Properties properties = new Properties();
    	PropValueUtils propValueUtils = new PropValueUtils();
    	properties = propValueUtils.getPropValues(pathFile);
		Class.forName("oracle.jdbc.driver.OracleDriver");
	    String connectionURL = "jdbc:oracle:thin:@" + properties.getProperty("HOSTNAMEDB") + ":1521:" + properties.getProperty("SID");
	    Connection conn = DriverManager.getConnection(connectionURL, properties.getProperty("USER"),properties.getProperty("PASSWORD"));
	    properties.clear();
	    properties = null;
	    propValueUtils = null;
	    return conn;
	}

}
