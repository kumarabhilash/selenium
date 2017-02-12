package Basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxRadioBtn {

	public static WebDriver driver;
	public static void main(String[] args) {
	
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
				
		//Challenge One – Select the deselected Radio button (female) for category Sex (Use IsSelected method)
		List<WebElement> SexradBtn = driver.findElements(By.name("sex"));
		@SuppressWarnings("unused")
		boolean btrue = false;
		btrue = SexradBtn.get(0).isSelected();
		if(btrue = true){
			SexradBtn.get(1).click();
		}
		else{
			SexradBtn.get(0).click();
		}
		
		//Challenge Two – Select the Third radio button for category ‘Years of Exp’ (Use Id attribute to select Radio button)
		WebElement expradBtn = driver.findElement(By.id("exp-2"));
		expradBtn.click();
		
		//Challenge Three – Check the Check Box ‘Automation Tester’ for category ‘Profession'( Use Value attribute to match the selection)
		List<WebElement> profradBtn = driver.findElements(By.name("profession"));
		int iSize = profradBtn.size();
		for(int i=0; i<iSize; i++){
			String sValue = profradBtn.get(i).getAttribute("value");
			if(sValue.equalsIgnoreCase("Automation Tester")){
				profradBtn.get(i).click();
				break;
			}
		}
		
		//Challenge Four – Check the Check Box ‘Selenium IDE’ for category ‘Automation Tool’ (Use cssSelector)
		WebElement oCheckBox = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
		oCheckBox.click();
		
		// Kill the browser
		driver.quit();
	}

}
