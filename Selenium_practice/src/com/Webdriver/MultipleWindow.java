package com.Webdriver;

import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver", "C://Users/kumar/workspace/selenium packg zar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://accounts.google.com/signup");
		//Actions action = new Actions(driver);
		
		driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
		System.out.println(driver.getTitle());
		
		Set<String> ids  = driver.getWindowHandles();		
		Iterator<String> it = ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		
		//switch to new tab
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath(".//*[@id='gb']/div[2]/div[4]/div/a")).click();
		
		//switching again to parent tab
		driver.switchTo().window(parentid);
		driver.findElement(By.xpath(".//*[@id='FirstName']")).sendKeys("Kumar abhilash");
		driver.getTitle();
		
		
	}
}