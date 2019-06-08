package com.Gojek.GenricUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;


public class GojekGenricUtils {
	
	public static Properties prop;
	static long IMPLICITE_WAIT=20;
	static long PAGE_TIMEOUT=20;
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
			System.setProperty("webdriver.chrome.driver", "F:\\EclipsPGM\\GoJek_Assignment\\ChromeDriver\\chromedriver.exe");
			Driver.driver=new ChromeDriver();
		}else if(browsername.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "F:\\EclipsPGM\\GoJek_Assignment\\geckoDriver\\geckodriver.exe");
			Driver.driver=new FirefoxDriver();
			}else if(browsername.equals("IE")) {
				System.setProperty("webdriver.ie.driver", "F:\\EclipsPGM\\GoJek_Assignment\\IEDriver\\IEDriverServer.exe");
				Driver.driver=new InternetExplorerDriver();		
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
	
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) Driver.driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
	
	
}
