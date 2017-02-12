package com.Webdriver;

//import java.util.Set;
//import java.util.Iterator;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesWork {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.gecko.driver", "C://Users/kumar/workspace/selenium packg zar/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		//driver.findElement(By.cssSelector("input[class='input_password']")).sendKeys("6541");
		/////////////////////driver.switchTo().frame(1);
		driver.getPageSource();
		
		driver.findElement(By.xpath(".//*[@id='demon_content']/div[2]/input")).click();
		
		driver.findElement(By.cssSelector("input[id='usernameId']")).sendKeys("abhi46lash");
		driver.findElement(By.cssSelector("input[class='loginPassword']")).sendKeys("adt478");
		System.out.println(driver.findElement(By.xpath(".//*[@id='cimage']")).getTagName());
		String captcha = driver.findElement(By.xpath(".//*[@id='cimage']")).getText();
		System.out.println(captcha);
		//driver.findElement(By.xpath(".//*[@id='loginFormId']/div[1]/div[2]/table[1]/tbody/tr[3]/td[2]/input")).sendKeys(captcha);
		
		//driver.findElement(By.cssSelector("input[id='loginbutton']")).click();
	
	}
	
	
}