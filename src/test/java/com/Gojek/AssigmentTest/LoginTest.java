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


public class LoginTest extends GojekGenricUtils  {
	LoginPage loginpage;
	HomePage home;
	GojekAssignmentLib business;
	SearchPage search;
	
	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void launchBrowser() {
		
		initialization();
		loginpage=new LoginPage();
		home=new HomePage();
		business=new GojekAssignmentLib();
		search=new SearchPage();
			
	}
	
	@Test
	public void loginAndLogout() {
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		loginpage.logout();
		
	}
	
	@AfterMethod
	public void quiteDriver() {
		Driver.driver.quit();
		
	}

}
