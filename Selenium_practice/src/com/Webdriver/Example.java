package com.Webdriver;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class Example {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.gecko.driver", "C://Users/kumar/workspace/selenium packg zar/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		/*
		System.setProperty("webdriver.chrome.driver", "C://Users/kumar/workspace/selenium packg zar/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.ie.driver", "C://Users/kumar/workspace/selenium packg zar/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
			
		driver.get("https://www.cognizant.com");
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		*/
		System.out.println(driver.getCurrentUrl());
		
		
		driver.close();
		

	}

}
