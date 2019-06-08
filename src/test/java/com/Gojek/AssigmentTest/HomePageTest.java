package com.Gojek.AssigmentTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Gojek.BusinessLib.GojekAssignmentLib;
import com.Gojek.GenricUtils.Driver;
import com.Gojek.GenricUtils.GojekGenricUtils;
import com.Gojek.PageFactory.HomePage;
import com.Gojek.PageFactory.LoginPage;
import com.Gojek.PageFactory.SearchPage;

public class HomePageTest extends GojekGenricUtils {
	LoginPage loginpage;
	GojekAssignmentLib business;
	HomePage home;
	SearchPage search;
	
	public HomePageTest() {
		super();
		
	}
	
	@BeforeMethod
	public void launchBrowser() {
		initialization();
		loginpage=new LoginPage();
		search=new SearchPage();
		home=new HomePage();
		business=new GojekAssignmentLib();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@Test(priority=1)
	public void addEarphoneToCart() {
		business.addEarphoneToCart();
		
	}
	
	@Test(priority=2)
	public void addSeondItem() {
		business.addMacbookToCart();
			
	}
	@Test(priority=3)
	public void deleteItemsFromCart() {
		business.deleteItemfromCart();
		business.reduceQnty();
	
	}
		
	
	@AfterMethod
	public void quitDriver() {
		//loginpage.logout();
		Driver.driver.quit();
		
	}
}
