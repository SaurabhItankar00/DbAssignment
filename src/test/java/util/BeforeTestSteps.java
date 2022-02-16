package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BeforeTestSteps {
	WebDriver driver;
	
	public BeforeTestSteps(WebDriver driver) {
		this.driver = driver;
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(" Project path is " + projectPath);
		//System.setProperty("webdriver.gecko.driver",projectPath + "/src/test/resources/ChromeDriver/geckodriver.exe");
		
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/ChromeDriver/chromedriver.exe");
		driver.get("https://twitter.com/i/flow/login");
		
	}
	


}
