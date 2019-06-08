package com.Gojek.GenricUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Gojek.PageFactory.LoginPage;

public class GojekGenricUtils {
	
	public static Properties prop;
	static long IMPLICITE_WAIT=20;
	static long PAGE_TIMEOUT=10;
	Actions act;
	
	
	public GojekGenricUtils() {
		
		prop=new Properties();
		try {
			FileInputStream file=new FileInputStream("F:\\EclipsPGM\\GoJek_Assignment\\src\\main\\java\\com\\Gojek\\GenricUtils\\config.properties") ;
			prop.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	public void initialization() {
		
		
		String browsername=prop.getProperty("browser");
		
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\EclipsPGM\\GoJek_Assignment\\Chrome\\chromedriver.exe");
			Driver.driver=new ChromeDriver();
		}else if(browsername.equals("FF")) {
			System.setProperty("webdriver.geko.driver", "D:\\\\chromedriver\\\\chromedriver.exe");
			Driver.driver=new FirefoxDriver();
			}
		
		Driver.driver.manage().window().maximize();
		Driver.driver.manage().deleteAllCookies();
		Driver.driver.manage().timeouts().pageLoadTimeout(PAGE_TIMEOUT, TimeUnit.SECONDS);
		Driver.driver.manage().timeouts().implicitlyWait(IMPLICITE_WAIT, TimeUnit.SECONDS);
		Driver.driver.get(prop.getProperty("url"));	
		
		
	}

	public void impliciteWait() {
		Driver.driver.manage().timeouts().implicitlyWait(IMPLICITE_WAIT, TimeUnit.SECONDS);
		
	}
	
	/*public void expliciteWait(WebElement xpath) {
		WebDriverWait wait=new WebDriverWait(Driver.driver, IMPLICITE_WAIT);
		wait.until(ExpectedConditions.visibilityOfElementLocated(xpath));
	}*/
}
