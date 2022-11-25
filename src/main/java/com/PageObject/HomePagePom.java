package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePagePom {

	
	//Identifying the elements present on homepage
	
	@FindBy(how=How.XPATH,using="//input[@name='_nkw']")
	private WebElement SearchBar;
	
	@FindBy(how=How.XPATH,using="//input[@id='gh-btn']")
	private WebElement Search;
	

	// getter methods for the elements
	
	public WebElement getSearchBar() {
		return SearchBar;
	}

	public WebElement getSearch() {
		return Search;
	}
	
	
	
}
