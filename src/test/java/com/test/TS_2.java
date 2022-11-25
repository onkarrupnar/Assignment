package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.HomePagePom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class TS_2 extends BaseClass{

	@Test
	public void verify() {
		
		//Passing arguments into the elements at homepage
		
		HomePagePom hm=PageFactory.initElements(driver,HomePagePom.class);
		Library.Custom_Sendkeys(hm.getSearchBar(),"Hp laptop");
		hm.getSearchBar().clear();
		Library.Custom_Sendkeys(hm.getSearchBar(),"Samsung Galaxy A53");
		Library.Custom_Click(hm.getSearch());
		
		
		//verifying the first item title with the argument passed
		
		WebElement phone=driver.findElement(By.xpath("//span[text()='Samsung Galaxy A53 5G - 128GB (GSM UNLOCKED) SM-A536U Single Sim 6.5\" - Black']"));
		String s=phone.getText();
		System.out.println(s);
				
		System.out.println(s.contains("Samsung Galaxy A53"));
		
		
	}
}
