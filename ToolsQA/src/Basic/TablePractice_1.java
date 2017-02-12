package Basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePractice_1 {
	
		public static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			
			// Create a new instance of the FireFox driver
			String exePath = "C:\\Users\\AbhilashKumar\\workspace\\jars and plugins\\chromedriver_win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);
			driver = new ChromeDriver();
			
			// Put an Implicit wait, 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			// Open ToolsQA web site
			String appUrl = "http://toolsqa.wpengine.com/automation-practice-table";
			driver.get(appUrl);
			driver.manage().window().maximize();
			
			//Here we are storing the value from the cell in to the string variable
			String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
			System.out.println(sCellValue);
			
			// Here we are clicking on the link of first row and the last column
			driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();        
			System.out.println("Link has been clicked otherwise an exception would have thrown");
			driver.close();

	}

}
