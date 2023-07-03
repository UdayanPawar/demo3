package com.externizable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\CHETANA SADARE\\Desktop\\app.properties");
		Properties properties = new Properties();
		properties.load(fis);
		String usname=properties.getProperty("username");
		String pwd=properties.getProperty("password");
		
		System.out.println(usname);
		System.out.println(pwd);
		
	}

}
