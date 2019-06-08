package com.Gojek.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import com.Gojek.GenricUtils.Driver;
import com.Gojek.GenricUtils.GojekGenricUtils;

public class LoginPage extends GojekGenricUtils {
	HomePage home=new HomePage();
	Actions act;
	
	//Page Factory
	
	@FindBy(xpath="(//span[text()='Sign in'])[1]")
	private WebElement signIn;
	
	@FindBy(name="email")
	private WebElement username;
	
	@FindBy(xpath="//*[@id=\"ap_password\"]")
	private WebElement password;
	
	@FindBy(id="signInSubmit")
	private WebElement signInbtn;
	
	@FindBy(xpath="//*[@id=\"nav-link-accountList\"]")
	private WebElement accountListBtn;
	
	@FindBy(xpath="//span[text()='Sign Out']")
	private WebElement signout;
	
	
	
	public LoginPage() {
		PageFactory.initElements(Driver.driver, this);
		
	}
	public HomePage login(String un,String pw) {
		//Readmi
		//Login and validating login successful or not.
		accountListBtn.click();
		username.sendKeys(un);
		password.sendKeys(pw);	
		signInbtn.click();
		String user=home.homepageValidation();
		boolean title=user.contains("Gojek");
		Assert.assertEquals(title, true);
		return new HomePage();
		
	}
	
	public void logout() {
		act=new Actions(Driver.driver);
		act.moveToElement(accountListBtn).build().perform();
		signout.click();
		
	}
	

}
