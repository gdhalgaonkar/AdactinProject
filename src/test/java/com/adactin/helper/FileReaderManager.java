package com.adactin.helper;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderManager {
	
	//Purpose of this class - FileReaderManager is to create an object for configuration reader to 
	//read the file from configuration reader
	//three main things are - 
	//1. private empty constructor for this class (frm - file reader manager) = to restrict creation of o
	//object of file reader frm anywhere else we created private empty constructor
	//2. one static method = to use and call non static method crInstance
	//3. non static method
	
	private FileReaderManager() {
		//so this class object cannot be created anywhere else
	}
	
	public static FileReaderManager getInstance() {
		FileReaderManager frm =  new FileReaderManager();
		return frm;
	}
	public ConfigurationReader getCrInstance() throws FileNotFoundException, IOException {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
	}

}
