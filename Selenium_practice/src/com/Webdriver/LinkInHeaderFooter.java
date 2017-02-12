package com.Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkInHeaderFooter {

	public static void main(String[] args) {
		 
		//System.setProperty("webdriver.gecko.driver", "C://Users/kumar/workspace/selenium packg zar/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C://Users/kumar/workspace/selenium packg zar/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.ebay.com/");
		//count of all links 
		System.out.println("Links in page : " + driver.findElements(By.tagName("a")).size());
		
		//Links in footer section
		WebElement footer = driver.findElement(By.xpath(".//*[@id='glbfooter']"));
		int Footercount = footer.findElements(By.tagName("a")).size();
		System.out.println("Links in footer section : " + Footercount);		
		
		//Links in second footer column section sell and tools & apps
		WebElement Sellsec = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		int Seccount = Sellsec.findElements(By.tagName("a")).size();
		System.out.println("Links in sell and tools $ app section : " + Seccount);
		
		String Beforeclicking = null;
		String Afterclicking;
		
		//Link names in second footer column section sell and tools & apps
		for (int i=0; i<Seccount; i++)
		{
			//System.out.println(Sellsec.findElements(By.tagName("a")).get(i).getText());
			if (Sellsec.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
			{
				Beforeclicking = driver.getTitle();
				Sellsec.findElements(By.tagName("a")).get(i).click();
				break;
			}
		}

		Afterclicking =driver.getTitle();
		System.out.println(Beforeclicking);
		System.out.println(Afterclicking);
	}
}