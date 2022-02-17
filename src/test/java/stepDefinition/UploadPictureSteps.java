
package stepDefinition;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.ProfilePage;
import util.BeforeTestSteps;

public class UploadPictureSteps {

	WebDriver driver = null;
	WebDriverWait wait = null;
	LoginPage login;
	ProfilePage profilePage;
	BeforeTestSteps beforeTestStep;

	@Given("^User is able to login with valid credentials (.*) and (.*)$")
	public void user_is_able_to_login_with_valid_credentials(String username, String password) throws InterruptedException {
		beforeTestStep = new BeforeTestSteps();
		driver = beforeTestStep.init();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		login = new LoginPage(driver);
		login.LoginValidUser(username, password);

	}

	@And("navigate to profile page")
	public void navigate_to_profile_page() throws AWTException, InterruptedException {
		profilePage = new ProfilePage(driver);
		profilePage.goToProfilePage();
		
		
	}

	@When("when he upload picture")
	public void when_he_upload_picture() throws InterruptedException {
		profilePage.uploadPicture();
	}

	@Then("user should be able to upload picture")
	public void user_should_be_able_to_upload_picture() throws InterruptedException {
		Thread.sleep(5000);
		profilePage.verifyPicture();
		driver.close();
	}

}
