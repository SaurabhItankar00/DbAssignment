package pages;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;

	WebDriverWait wait = null;
	
	By txt_search = By.xpath("//input[@data-testid='SearchBox_Search_Input']");
	By lnk_times = By.xpath("//a[@href='/timesofindia']");
	By list_tweets = By.xpath("//article[@data-testid='tweet']");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void search(String searchTxt) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(50,250)", "");
		driver.findElement(txt_search).sendKeys(searchTxt);
		
		
	}
	
	public void pressEnter() {
		driver.findElement(txt_search).sendKeys(Keys.ENTER);
	}
	
	public void clickOnFirstLink() {
		List<WebElement> timesLinks = driver.findElements(lnk_times);
		timesLinks.get(1).click();
		
		
	}
	
	public void verifyPage() {
		System.out.println(driver.getTitle());
	}
	
	public void retriveTweets() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(50,400)", "");
		List<WebElement> listOfTweets =driver.findElements(list_tweets);
		
		for(WebElement e:listOfTweets) {
			System.out.println(e.getText().contains(null));
		}
	}
	
	public void getCall() {
		given().
		when().
		 get("https://api.twitter.com/2/users/134758540/tweets").
		then().
			assertThat().
			statusCode(200).
			and().
			body("MRData.CircuitTable.Circuits.circuitId",hasSize(20)).
			and().
			header("Content-Length", equalTo("4551")).
			and().
			header("Content-Type", equalTo("application/json; charset=utf-8"));
		
	}
	
}
