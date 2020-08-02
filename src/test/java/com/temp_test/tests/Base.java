package com.temp_test.tests;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
    protected WebDriver driver;
	
	//----------------------------------------GUI---------------------------------------------------
	@BeforeMethod
	public void initialSetUp2()  {
		System.out.println("performing initial setup of WebDriver");
		WebDriverManager.chromedriver().setup();
		this.driver=new ChromeDriver();
        //this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        this.driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}	
	
	
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		
		System.out.println("Executing : tearDown()");
		this.driver.quit();
		String name=result.getMethod().getMethodName();
		System.out.println("---------Test : " + name + " ends-----------");
		System.out.print("\n");
		
		
	}

}
