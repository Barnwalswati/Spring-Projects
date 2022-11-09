package com.demo.factory;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.demo.comp.Courier;
import com.demo.comp.Flipkart;

public class FlipkartFactory {
	private static Properties props;
	static {
		//if we use try with resource, no need to close fileStream.
		try(//load properties file
			FileInputStream fs = new FileInputStream("src/main/java/com/demo/commons/info.properties")) {
			
			//load properties file content to java.util.Properties class obj
			props = new Properties();
			props.load(fs);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	//static factory method supporting factory pattern
	public static Flipkart createFlipkart() throws Exception {
		// create target class obj;
		Flipkart fpkt=new Flipkart();
		
		//load Dependent class
		Class c = Class.forName(props.getProperty("dependent.comp"));
		//create object using reflection object
		Constructor cons[] = c.getDeclaredConstructors();
		//create object
		Courier courier = (Courier) cons[0].newInstance();
		fpkt.setCourier(courier);
		return fpkt;
	}
}
