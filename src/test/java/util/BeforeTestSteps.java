package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BeforeTestSteps {
	WebDriver driver;
	
	public WebDriver init() {
		String projectPath = System.getProperty("user.dir");
		 System.out.println(" Project path is " + projectPath);
		 System.setProperty("webdriver.chrome.driver", projectPath +
		 "/src/test/resources/ChromeDriver/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get(TestData.url);
		 driver.manage().window().maximize();
		return driver;
		
	}
	


}
