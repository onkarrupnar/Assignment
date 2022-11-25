package com.Utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {

	//creating methods to perform action on elements
	//Purpose of this to reduce code length and increase readability and reuseability.
	
	public static ExtentTest test;
	public static WebDriver driver;

	public static void Custom_Sendkeys(WebElement element,String value) {
		try {
		element.sendKeys(value);
		
	}	
	    catch (Exception e) {
	    	System.out.println(e.getMessage());
	    }	
	}
	
	
	public static void Custom_Click(WebElement element) {
		try {
		element.click();
		}
		 catch (Exception e) {
		    	System.out.println(e.getMessage());
		    }	
		
	}	

	
	
	
}
