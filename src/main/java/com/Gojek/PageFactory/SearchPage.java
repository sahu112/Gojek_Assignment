package com.Gojek.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Sachin Sahu
 *
 */
public class SearchPage {
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchBox;
	
	@FindBy(xpath="//input[@value='Go']")
	private WebElement searchBtn;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	

	

}
