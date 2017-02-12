package Basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectCommands {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		// Create a new instance of the FireFox driver
		String exePath = "C:\\Users\\AbhilashKumar\\workspace\\jars and plugins\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		
		// Put an Implicit wait, 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Open ToolsQA web site
		String appUrl = "http://toolsqa.wpengine.com/automation-practice-form";
		driver.get(appUrl);
		driver.manage().window().maximize();
		
		//Select ‘Selenium Commands’ Multiple selection box ( Use Name locator to identify the element )
		WebElement element = driver.findElement(By.name("selenium_commands"));
		Select oselect = new Select(element);
		
		//Select option ‘Browser Commands’  and then deselect it (Use selectByIndex and deselectByIndex)
		oselect.selectByIndex(0);
		Thread.sleep(2000);
		oselect.deselectByIndex(0);
		
		//Select option ‘Navigation Commands’  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
		oselect.selectByVisibleText("Navigation Commands");
		Thread.sleep(2000);
		oselect.deselectByVisibleText("Navigation Commands");
		
		//Print and select all the options for the selected Multiple selection list.
		List<WebElement> Listcontent = oselect.getOptions();
		int Listsize = Listcontent.size();
		for(int i=0; i<Listsize; i++){
			String svalues = Listcontent.get(i).getText();
			System.out.println(svalues);
			oselect.selectByIndex(i);
			Thread.sleep(2000);
		}
		
		//Deselect all options
		oselect.deselectAll();
		
		// Kill the browser
		driver.close();
	}
}
