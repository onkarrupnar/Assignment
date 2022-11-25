package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {

	public static  Properties p;
	ConfigDataProvider() throws Exception{
		
		String path="D:\\Demo Workspace\\Assignment\\Config\\Config.properties";
		FileInputStream file=new FileInputStream(path);
		p=new Properties();
		p.load(file);
	}
	
	public String get_Base_Url() {
		return p.getProperty("url");
	}
	
}
