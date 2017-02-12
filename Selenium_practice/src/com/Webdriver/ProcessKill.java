package com.Webdriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.os.WindowsUtils;

public class ProcessKill {

	public static void main(String[] args) throws IOException {
		 
		System.setProperty("webdriver.gecko.driver", "C://Users/kumar/workspace/selenium packg zar/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=L4NwWJz2GO_x8AeAwqyQCw");
		
		//WindowsUtils util = new WindowsUtils();
		// Kill notepad++ process
		//WindowsUtils.tryToKillByName("Notepad++.exe");
		
		//Take screenshot
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("G:\\screenshot.png"));
		
		
		}
}