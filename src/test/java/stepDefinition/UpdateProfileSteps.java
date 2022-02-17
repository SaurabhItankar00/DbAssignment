package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.ProfilePage;
import util.BeforeTestSteps;

public class UpdateProfileSteps {

	WebDriver driver = null;
	WebDriverWait wait = null;
	LoginPage login;
	ProfilePage profilePage;
	BeforeTestSteps beforeTestStep;
	
	@Given("^User is loged in (.*) and (.*)$")
	public void User_is_loged_in(String username,String password) throws InterruptedException {
		beforeTestStep = new BeforeTestSteps();
		driver = beforeTestStep.init();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		login = new LoginPage(driver);
		login.LoginValidUser(username, password);
	}

	@And("clicks on profile page and edit")
	public void clicks_on_profile_page_and_edit() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		profilePage =new ProfilePage(driver);
		profilePage.goToProfilePage();
	}

	

	@When("user enters BIO text box")
	public void user_enters_BIO_text_box() throws InterruptedException {
		Thread.sleep(2000);
	    profilePage.updateBIO();
	}
	
	
	
	@When("user update his location")
	public void user_update_his_location() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	  profilePage.updateLocation();
	  
	}

	@When("user update his Website")
	public void user_update_his_Website() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
	   profilePage.updateWebsite();
	  
	   profilePage.saveUpdate();
	}

	@Then("user should be able to update profile page")
	public void user_should_be_able_to_update_profile_page() {
	   //profilePage.verifyText();
	   driver.close();
	}
	
	

	
	
	
}
