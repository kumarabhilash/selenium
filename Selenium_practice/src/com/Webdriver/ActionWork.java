package com.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionWork {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver", "C://Users/kumar/workspace/selenium packg zar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.in/");
		Actions action = new Actions(driver);
		
		//Mouse hover on an element
		WebElement element = driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']"));
		action.moveToElement(element).build().perform();
		
		//Entering uppercase  text in textfield 
		WebElement xyz = driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));  
		
		action.keyDown(Keys.SHIFT).moveToElement(xyz).sendKeys("hello brother").build().perform();
		
		action.contextClick(xyz).build().perform();
		
		action.doubleClick().click(driver.findElement(By.xpath(".//*[@id='nav-your-amazon']"))).build().perform();
		
		
	}
}