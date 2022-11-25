package com.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.PageObject.HomePagePom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class TS_1 extends BaseClass {

	
	@Test
	public void TC_1() throws Exception {
		
	  //Navigating to cell phones 	
	 driver.navigate().to("https://www.ebay.com/b/Cell-Phones-Smart-Watches-Accessories/15032/bn_1865441");
	 driver.findElement(By.xpath("//a[text()='Cell Phones & Smartphones']")).click();
	 driver.findElement(By.xpath("//span[text()='See All']")).click();
	
	   //Applying filter to search 
 	 driver.findElement(By.xpath("//span[text()='Screen Size']")).click();
	 driver.findElement(By.xpath("(//input[@role='checkbox'])[3]")).click();
	 System.out.println("screensize is selected  : "+driver.findElement(By.xpath("(//input[@role='checkbox'])[3]")).isSelected());
	 
	 WebElement price_element=driver.findElement(By.xpath("(//span[text()='Price'])[2]"));
	 //scrolling upto element to see all infromation 
	  JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollintoview",price_element);
	       price_element.click();
	 
	  driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("20");
	  driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("40");
	  System.out.println("price textbox is enable : "+driver.findElement(By.xpath("(//input[@type='text'])[2]")).isEnabled());
	  System.out.println("price textbox is enable : "+driver.findElement(By.xpath("(//input[@type='text'])[3]")).isEnabled());
	    
	       
	 WebElement location_element =driver.findElement(By.xpath("//span[text()='Item Location']"));
	 js.executeScript("arguments[0].scrollintoview",location_element);
	 location_element.click();
	 driver.findElement(By.xpath("//input[@value='Worldwide']")).click();
	 System.out.println("location element is selected : "+driver.findElement(By.xpath("//input[@value='Worldwide']")).isSelected());

	 
	 //click on apply button
	 
	 WebElement Apply_btn=driver.findElement(By.xpath("//button[text()='Apply']"));
	    Apply_btn.click();
      
	
	 
	     
	     
         
	}	
}
