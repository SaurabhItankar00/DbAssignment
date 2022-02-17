package stepDefinition;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import util.BeforeTestSteps;

public class LoginSteps2 {

	WebDriver driver;
	WebDriverWait wait = null;
	LoginPage login;
	BeforeTestSteps beforeTestStep;
	

	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		/*
		 * String projectPath = System.getProperty("user.dir");
		 * System.out.println(" Project path is " + projectPath);
		 * System.setProperty("webdriver.chrome.driver", projectPath +
		 * "/src/test/resources/ChromeDriver/chromedriver.exe"); driver = new
		 * ChromeDriver(); driver.get("https://twitter.com/i/flow/login");
		 */
		beforeTestStep = new BeforeTestSteps();
		driver = beforeTestStep.init();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		
		login = new LoginPage(driver);
		
		login.enterUsername(username);
		login.clicknext();
		login.enterPassWord(password);
		
	}

	@And("click on login button")
	public void click_on_login_button() {
		// Write code here that turns the phrase above into concrete actions

		
		login.loginButton();
		
		
		
	}

	@Then("should be able to land on home page")
	public void should_be_able_to_land_on_home_page() {
		// Write code here that turns the phrase above into concrete actions
		
		
		login.checkhomePage();
		driver.close();
	}

	

}
