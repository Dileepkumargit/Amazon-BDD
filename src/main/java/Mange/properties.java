package Mange;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class properties {
	 public static Properties prop ;
	
	public static String obj(String  key) throws IOException {
		prop = new Properties();					
	    FileInputStream objfile = new FileInputStream("C:\\Users\\Dhilip\\eclipse-workspace\\Amazon\\elements.properties");									
	    prop.load(objfile);
		return prop.getProperty(key);
	}

}
