package com.Gojek.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {
	
	@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")
	private WebElement productLink;

	@FindBy(xpath="//*[@id=\"a-autoid-2\"]")
	private WebElement quantydropdown;


	@FindBy(xpath="//*[@id=\"quantity_1\"]")
	private WebElement quanty;


	public WebElement getProductLink() {
		return productLink;
	}


	public WebElement getQuantydropdown() {
		return quantydropdown;
	}


	public WebElement getQuanty() {
		return quanty;
	}
	
	
	
	

	
	
	

}
