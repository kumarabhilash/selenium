package Basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCommands {
	
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
				
		//Select ‘Continents’ Drop down ( Use Id to identify the element )
		WebElement element = driver.findElement(By.id("continents"));
		Select oselect = new Select(element);
		
		//Select option ‘Europe’ (Use selectByIndex)
		oselect.selectByIndex(1);
		Thread.sleep(2000);
		
		//Select option ‘Africa’ now (Use selectByVisibleText)
		oselect.selectByVisibleText("Africa");
		Thread.sleep(2000);
		
		//Print all the options for the selected drop down and select one option of your choice
		List<WebElement> Listcontent = oselect.getOptions();
		int Listsize = Listcontent.size();
		for(int i=0; i<Listsize; i++){
			String svalues = Listcontent.get(i).getText();
			System.out.println(svalues);
			if(svalues.equalsIgnoreCase("North America")){
				oselect.selectByIndex(i);
				break;
			}
		}
		
		// Kill the browser
		driver.quit();
	}
}
