package com.huge.wrapper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;


public class App {

	public static void main(String[] args) {
		
		String driverName = "firefox";
		int defaultWaitTime = 20;
		String url = "http://www.realestate.com.au";
		
		/*
		SeleniumWrapper wrapper = new SeleniumWrapper(driverName, defaultWaitTime);
		
		wrapper.navigate(url);
		wrapper.waitForElement(ExpectedConditions.presenceOfElementLocated(By.id("where1"))).sendKeys("hello");
		wrapper.exit();
		*/
		
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		
		WebElement searchField = driver.findElement(By.id("where"));
		searchField.sendKeys("Guildford, WA 6055");
		WebElement searchButton = driver.findElement(By.className("rui-search-button"));
		searchButton.click();
		
		List<WebElement> searchResults = driver.findElements(By.xpath("//div[starts-with(@id, 't')]"));
		//WebElement searchResults = driver.findElement(By.id("searchResultsTbl"));
		//List<WebElement> children = searchResults.findElements(By.xpath(".//*"));
		
		File file = new File("C:\\Temp\\text.txt");
		
		int count = 1;
		for (WebElement result : searchResults) {
			System.out.println(count);
			count += 1;
			System.out.println(result.getText());
			System.out.println("================");
			
			
		}
		
		driver.close();
		driver.quit();
		
		//document.getElementById("searchResultsTbl").children
				
		
		
		/*
		List<WebElement> elements = driver.findElements(By.tagName("span"));
		System.out.println("==> For Loop Example.");
		for (int i = 0; i < elements.size(); i++) {
			WebElement element = elements.get(i);
			if (element.getText().contains("Buy")){
				element.click();
			}
		}
		*/
		
				
		
	}

}
