package com.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static ConfigDataProvider config;
	
	
	// Fetching Baseurl from properties file 
	@BeforeSuite
	public void Getting_data() throws Exception {
		
	   config=new ConfigDataProvider();
	   
	}
	
	
	@BeforeMethod
	public void SetUp() {
		
		//Browser Opening  
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(config.get_Base_Url());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
	}
	
	@AfterMethod
	public void TearDown() throws Exception {
		
		//Browser closing
		
		Thread.sleep(2000);
		driver.close();
	}
	
}
