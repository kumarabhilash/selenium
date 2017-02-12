package Basic;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class WebelementCommands {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		// Create a new instance of the FireFox driver
		String exePath = "C:\\Users\\AbhilashKumar\\workspace\\jars and plugins\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();

		// Open ToolsQA web site
		String appUrl = "https://login.salesforce.com";
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.id("username")).sendKeys("Pavanakn@cognizant.com");
	    
	    //clear()
	    driver.findElement(By.id("username")).clear();
	    
	    //isDisplayed
	    System.out.println("Is the Username field is displayed?? " +driver.findElement(By.id("username")).isDisplayed());
	    
	    //IsSelected()
	    driver.findElement(By.id("rememberUn")).click();
	    System.out.println("Is the Remember me is selected?? " +driver.findElement(By.id("rememberUn")).isSelected());
	    driver.findElement(By.id("rememberUn")).click();
	    System.out.println("Is the Remember me is selected?? " +driver.findElement(By.id("rememberUn")).isSelected());
	    
	    //getText()
	    System.out.println("The text at Use custom domain : " +driver.findElement(By.id("mydomainLink")).getText());
	    
	    //getAttribute
	    System.out.println("Attribute of forgot link id is : " +driver.findElement(By.id("forgot_password_link")).getAttribute("href"));
	    
	    //getSize
	    WebElement element = driver.findElement(By.id("username"));
	    Dimension dimension = element.getSize();
	    System.out.println("Height : " + dimension.height + " Width : "+ dimension.width);
	    
	    //getLocation
	    Point point = element.getLocation();
	    System.out.println("X cordinate : " + point.x + " Y cordinate: " + point.y);

	}
}