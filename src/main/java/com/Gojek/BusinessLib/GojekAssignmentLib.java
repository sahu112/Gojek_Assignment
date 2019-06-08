package com.Gojek.BusinessLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Gojek.GenricUtils.Driver;
import com.Gojek.GenricUtils.GojekGenricUtils;
import com.Gojek.PageFactory.CartPage;
import com.Gojek.PageFactory.HomePage;
import com.Gojek.PageFactory.ProductPage;
import com.Gojek.PageFactory.SearchPage;

public class GojekAssignmentLib extends GojekGenricUtils {
	HomePage home=PageFactory.initElements(Driver.driver, HomePage.class);
	SearchPage sp=PageFactory.initElements(Driver.driver, SearchPage.class);
	ProductPage product=PageFactory.initElements(Driver.driver, ProductPage.class);
	CartPage cart=PageFactory.initElements(Driver.driver, CartPage.class);
	Actions act;
	Select sel;
	
	public void addEarphoneToCart(){
		act=new Actions(Driver.driver);
		act.moveToElement(home.getShopAllTab()).build().perform();
		home.getElectronicsBtn().click();
		home.getHeadphoneBtn().click();
		home.getFristheadphoneLink().click();
		impliciteWait();
		home.getAddToCartBtn().click();
		home.getCkeckoutClose().click();
	}
	
	public void addMacbookToCart() {
		sp.getSearchBox().sendKeys(prop.getProperty("searchBox"));
		sp.getSearchBtn().click();
		impliciteWait();
		product.getProductLink().click();
		impliciteWait();
		product.getQuantydropdown().click();
		product.getQuanty().click();
		home.getAddToCartBtn().click();
		home.getCkeckoutClose().click();	
	}
	
	public void deleteItemfromCart() {
		cart.getCartbtn().click();
		cart.getDeleteBtn().click();	
	}
	
	
	public void reduceQnty() {
		cart.getCartbtn().click();
		cart.getQntOnCart().click();
		cart.getQnty().click();
	
	}
}
	
	

