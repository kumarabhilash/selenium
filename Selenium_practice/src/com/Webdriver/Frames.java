package com.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class Frames {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.gecko.driver", "C://Users/kumar/workspace/selenium packg zar/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "C://Users/kumar/workspace/selenium packg zar/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/recaptcha/api2/demo");
		int number = FindFrameNumber(driver,By.xpath(".//*[@id='recaptcha-anchor']/div[5]"));
		driver.switchTo().frame(number);
		driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
		driver.switchTo().defaultContent();
		//
		int number1 = FindFrameNumber(driver,By.xpath(".//*[@id='recaptcha-verify-button']"));
		driver.switchTo().frame(number1);
		driver.findElement(By.xpath(".//*[@id='recaptcha-verify-button']")).click();

	}	
	
	
	public static int FindFrameNumber(WebDriver driver, By by)
	{
		int i = 0;
		int framecount = driver.findElements(By.tagName("iframe")).size();	
		
		for(int j=0; j<framecount; j++)
		{
			driver.switchTo().frame(j);
			int count = driver.findElements(by).size();
			if(count > 0)
			{
				//driver.findElement(by).click();
				break;
			}
			else
			{
				System.out.println("Continue looping");
			}
			
		}
		driver.switchTo().defaultContent();
		return i;
	}
}