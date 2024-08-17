package com.vtiger.genericUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtility {
	public String readDatafromPf(String key) throws Throwable {//un
		
		//FileInputStream fis=new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\Framework\\src\\test\\resources\\CommonData.Properties");
		FileInputStream fis=new FileInputStream(Iconstantpaths.propertyfilepath);
		     Properties p=new Properties();
		     p.load(fis);
		     return p.getProperty(key);
	}

}
