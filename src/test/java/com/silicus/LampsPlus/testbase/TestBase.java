package com.silicus.LampsPlus.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class TestBase {

	public static Properties Repositary = new Properties();
	public File f;
	public FileInputStream fi;
	public WebDriver driver;
	
	public void init() throws InterruptedException, IOException{
	loadPropertiesFile();
	driver.get(Repositary.getProperty("url"));
	Thread.sleep(5000);
	
	}
	
	
	public void loadPropertiesFile() throws IOException{
		f = new File (System.getProperty("user.dir")+"//src//test//java//com//silicus//LampsPlus//config//config.properties");
		fi = new FileInputStream(f);
		Repositary.load(fi);
	}
	
	public WebDriver selectBrowser (String browser)
	{
		if(browser.equals("FIREFOX")|| browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//src//test//java//com//silicus//LampsPlus//browserproperty//geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			return driver;
		}else if(browser.equals("CHROME")||browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//java//com//silicus//LampsPlus//browserproperty//chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    return driver;
		}else if(browser.equals("IE")||browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//src//test//java//com//silicus//LampsPlus//browserproperty//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			return driver;
		}
		return null;
	}
	
	
}
