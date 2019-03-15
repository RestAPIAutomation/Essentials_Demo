package com.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import org.apache.maven.shared.invoker.DefaultInvocationRequest;
import org.apache.maven.shared.invoker.DefaultInvoker;
import org.apache.maven.shared.invoker.InvocationRequest;
import org.apache.maven.shared.invoker.Invoker;
import org.apache.maven.shared.invoker.MavenInvocationException;
import org.testng.TestNG;



public class TestBase {

	public Properties prop;
	public int RESPONSE_STATUS_CODE_200 = 200;
	public int RESPONSE_STATUS_CODE_500 = 500;
	public int RESPONSE_STATUS_CODE_201 = 201;
	
	
//	public static void main(String[] args) {
//		// Create object of TestNG Class
//		
//		}
	
	

	public TestBase() {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"D://Vivek//Project//Essentials_Demo//src//main//java//com//qa//config//config.properties");
//			FileInputStream ip = new FileInputStream(
//					"//usr//local//service//src//main//java//com//qa//config//config.properties");
			prop.load(ip);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
