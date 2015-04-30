package com.huge.wrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWrapper {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	
	public SeleniumWrapper(String driverName, int defaultWaitTime) {
		
		if (driverName == "firefox") {
			driver = new FirefoxDriver();
		
		wait = new WebDriverWait(driver, defaultWaitTime);
		

		}
	}
	
	public void navigate(String url) {
		driver.get(url);
	}
	
	public void sayHello(){
		System.out.println("hello");
	}
	
	public WebElement waitForElement(ExpectedCondition<WebElement> expectedCondition){
		//System.out.println(expectedCondition.getClass());
		WebElement myDynamicElement = wait.until(expectedCondition);
		
		return myDynamicElement;
	}
	
	public void exit() {
		driver.close();
		driver.quit();
	}

}
