package com.Gojek.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage  {
	
	@FindBy(xpath="//*[@id=\"nav-cart\"]")
	private WebElement cartbtn;
	
	@FindBy(xpath="(//*[@value='Delete'])[2]")
	private WebElement deleteBtn;
	
	@FindBy(name="proceedToCheckout")
	private WebElement checkout;
	
	@FindBy(xpath="//span[@class='a-button a-button-dropdown a-button-small a-button-span8 quantity']")
	private WebElement qntOnCart;
	
	@FindBy(xpath="//*[@id=\"dropdown1_1\"]")
	private WebElement qnty;
	
	
	public WebElement getQnty() {
		return qnty;
	}

	public WebElement getQntOnCart() {
		return qntOnCart;
	}

	public WebElement getCartbtn() {
		return cartbtn;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	public WebElement getCheckout() {
		return checkout;
	}
	

}
