package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;
	
	public Properties initializeProp() {
		 
		prop= new Properties();
		
		try {
			FileInputStream ip = new FileInputStream("./src/test/resources/Config/config.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return prop;
		
	}
	
	
	
	
	
	
}
