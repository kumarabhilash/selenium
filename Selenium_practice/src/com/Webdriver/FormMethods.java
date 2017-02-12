package com.Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FormMethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C://Users/kumar/workspace/selenium packg zar/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/flights");
		
		System.out.println("Before clicking");
		System.out.println(driver.findElement(By.xpath("//a[@id='return_date_sec']")).isDisplayed());
		
		driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).click();
		
		System.out.println("After clicking");
		System.out.println(driver.findElement(By.xpath("//a[@id='return_date_sec']")).isDisplayed());

		//if u want to validate an object is present in web page or code base
		int count = driver.findElements(By.xpath("//a[@id='return_date_sec']")).size();
		if (count == 0)
		{
			System.out.println("Verify");
		}
		}
	}
