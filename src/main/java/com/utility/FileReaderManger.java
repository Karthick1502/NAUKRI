package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;

public class FileReaderManger {

	private static FileInputStream fileInputStream;
	private static Properties property;
	
	private static void setUpProperty() throws IOException {
		File file = new File("/Users/javagar/eclipse-workspace/Naukri/src/main/resources/TestData.properties");
		try {
			fileInputStream = new FileInputStream(file); // allowing to read 
			property = new Properties(); // creating 
			property.load(fileInputStream);
		} catch (FileNotFoundException e) {
			Assert.fail("ERROR : OCCURS DURING FILE LOADING");
		} catch (Exception e ) {
			Assert.fail("ERROR : OCCURS DURING FILE LOADING");
		}
	}
	
	public static String getDataProperty( String dataValue) throws IOException {
		setUpProperty();
		String data = property.getProperty(dataValue);
		return data ;
	}
	
}
