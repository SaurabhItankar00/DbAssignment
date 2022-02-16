package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import util.TestData;

public class RetriveTweetsSteps {
	WebDriver driver;
	LoginPage login;
	HomePage homePage;
	
	@Given("User is logged in")
	public void user_is_logged_in() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 String projectPath = System.getProperty("user.dir");
		 System.out.println(" Project path is " + projectPath);
		 System.setProperty("webdriver.chrome.driver", projectPath +
		 "/src/test/resources/ChromeDriver/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://twitter.com/i/flow/login");
		 driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		login = new LoginPage(driver);
		login.LoginValidUser(TestData.username, TestData.password);
	}

	@And("user search for Times of India")
	public void user_search_for_Times_of_India() {
	    // Write code here that turns the phrase above into concrete actions
	   homePage = new HomePage(driver);
	   homePage.search(TestData.searchBox);
	}

	@When("users press enter")
	public void users_press_enter() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		homePage.pressEnter();
	}

	@And("clicks on the Times of india page")
	public void clicks_on_the_Times_of_india_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
	    homePage.clickOnFirstLink();
	}

	@And("the page opens")
	public void the_page_opens() {
	    // Write code here that turns the phrase above into concrete actions
	   homePage.verifyPage();
	}

	@Then("retrive tweets from the page")
	public void retrive_tweets_from_the_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(5000);
	   //homePage.retriveTweets();
		homePage.getCall();
	}

	@And("which is published in last 2hs")
	public void which_is_published_in_last_2hs() {
	    // Write code here that turns the phrase above into concrete actions

	}

	
}
