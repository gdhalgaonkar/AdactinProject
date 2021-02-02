package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ConfigurationReader {
	
	//Purpose of this class 'Configuration manager' is to load our property file to the predefined property file
	public static Properties ps;
	public ConfigurationReader() throws FileNotFoundException, IOException {
		File f = new File("src\\test\\java\\com\\adactin\\properties\\Adactin.properties");
		FileInputStream fis = new FileInputStream(f);
		ps = new Properties(); //predefined class - properties
		ps.load(fis);//original properties file after loading it to predefined file
	}
	
	public String getBrowserName() {
		String browsername = ps.getProperty("BrowserName");
		//System.out.println(browsername);
		return browsername;
	}
	
	public String getURL() {
		String url = ps.getProperty("Url");
		//System.out.println(url);
		return url;		
	}
	
	/*
	 * public static void main(String[] args) throws FileNotFoundException,
	 * IOException { ConfigurationReader cr = new ConfigurationReader();
	 * cr.getBrowserName(); cr.getURL(); }
	 */
	
}
