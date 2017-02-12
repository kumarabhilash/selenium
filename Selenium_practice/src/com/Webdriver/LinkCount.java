package com.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkCount {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C://Users/kumar/workspace/selenium packg zar/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.ebay.com/");
		
		//Total number of links in page
		System.out.println("Total number of links in page ");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footer = driver.findElement(By.xpath(".//*[@id='glbfooter']"));
		System.out.println("Total number of links in footer section ");
		System.out.println(footer.findElements(By.tagName("a")).size());
		

	}

}
