package com.scb.connection.utility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropValueUtils {
	public Properties getPropValues(String pathSQLFile) throws IOException {
		Properties properties = new Properties();
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(pathSQLFile);
		if (inputStream != null) {
			properties.load(inputStream);
			inputStream.close();
			return properties;
		} else {
			throw new FileNotFoundException("Property file at path "+pathSQLFile+" not found.");
		}
	}
}
