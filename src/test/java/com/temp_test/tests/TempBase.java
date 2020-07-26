package com.temp_test.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TempBase {
	
    protected WebDriver driver;
    
	@BeforeMethod
	public void initialSetUp() {
		
		System.out.println("performing initial setup of WebDriver");
    	WebDriverManager.chromedriver().setup();
    	this.driver=new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
