package com.Gojek.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Gojek.GenricUtils.Driver;
import com.Gojek.GenricUtils.GojekGenricUtils;

public class HomePage extends GojekGenricUtils {
	
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]")
	private WebElement accountListBtn;
	
	@FindBy(xpath="//*[@id=\"nav-link-shopall\"]")
	private WebElement shopAllTab;
	
	@FindBy(xpath="//*[@id='nav-flyout-shopAll']//span[text()='Electronics']")
	private WebElement electronicsBtn;
	
	@FindBy(xpath="//*[@id=\"leftNav\"]//span[text()='Headphones']")
	private WebElement headphoneBtn;
	
	@FindBy(xpath="(//a[@class='a-link-normal a-text-normal'])[1]")
	private WebElement fristheadphoneLink;
	
	@FindBy(id="add-to-cart-button")
	private WebElement addToCartBtn;
	
	@FindBy(xpath="//*[@id=\"attach-close_sideSheet-link\"]")
	private WebElement ckeckoutClose;
	

	public WebElement getAccountListBtn() {
		return accountListBtn;
	}
	public WebElement getShopAllTab() {
		return shopAllTab;
	}
	public WebElement getElectronicsBtn() {
		return electronicsBtn;
	}
	public WebElement getHeadphoneBtn() {
		return headphoneBtn;
	}
	public WebElement getFristheadphoneLink() {
		return fristheadphoneLink;
	}
	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}
	public WebElement getCkeckoutClose() {
		return ckeckoutClose;
	}
	
	public HomePage() {
		PageFactory.initElements(Driver.driver, this);
	}
	public String homepageValidation() {
		return accountListBtn.getText();
	}
	
	

}
