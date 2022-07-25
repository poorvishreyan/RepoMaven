package com.maven.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice3Test {
	
	@Test
	
	public void method3()
	{
		String url = System.getProperty("URL");
		String browser = System.getProperty("BROWSER");
		String username = System.getProperty("USERNAME");
		String password = System.getProperty("PASSWORD");
		
		//Reporter.log("url=======>", true);
		//Reporter.log("browser====>", true);
		//Reporter.log("username====>", true);
		//Reporter.log("password=====>", true);
		
		System.out.println("url====>"+ url);
		System.out.println("browser===>"+ browser);
		System.out.println("username===>"+ username);
		System.out.println("password====>"+ password);
		
	}
}
