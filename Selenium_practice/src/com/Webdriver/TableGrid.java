package com.Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class TableGrid {

	public static void main(String[] args) {
		 
		//System.setProperty("webdriver.gecko.driver", "C://Users/kumar/workspace/selenium packg zar/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C://Users/kumar/workspace/selenium packg zar/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.espncricinfo.com/australia-v-pakistan-2016-17/engine/match/1000885.html");
		WebElement table = driver.findElement(By.className("score-table"));
		List<WebElement> noofrows = table.findElements(By.tagName("tr"));
		System.out.println("Number of rows are : " + noofrows.size());
		
		int i = 0;
		//find column count in each row
		for(WebElement column : noofrows)
		{
			List<WebElement> noofcolumns = column.findElements(By.tagName("td"));
			i++;
			System.out.println("Number of columns in " +i+ "th row is : " +noofcolumns.size());
			//find column value of each row
			for(WebElement text : noofcolumns)
			{
			  System.out.println(text.getText());	
			}
		}
	}
}