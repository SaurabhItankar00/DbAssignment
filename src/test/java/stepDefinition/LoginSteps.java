package stepDefinition;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	/*
	 * WebDriver driver = null; WebDriverWait wait = null;
	 * 
	 * @Given("user is on login page") public void user_is_on_login_page() throws
	 * InterruptedException { // Write code here that turns the phrase above into
	 * concrete actions
	 * 
	 * String projectPath = System.getProperty("user.dir");
	 * System.out.println(" Project path is " + projectPath);
	 * System.setProperty("webdriver.chrome.driver", projectPath +
	 * "/src/test/resources/drivers/chromedriver.exe"); driver = new ChromeDriver();
	 * driver.get("https://twitter.com/i/flow/login");
	 * driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 * Thread.sleep(5000); }
	 * 
	 * @When("^user enters (.*) and (.*)$") public void
	 * user_enters_username_and_password(String username, String password) throws
	 * InterruptedException { // Write code here that turns the phrase above into
	 * concrete actions
	 * 
	 * 
	 * 
	 * driver.findElement(By.xpath(".//input[@type='text']")).sendKeys(username);
	 * 
	 * driver.findElement(By.xpath("//*[text()='Next']")).click();
	 * 
	 * driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 * Thread.sleep(5000); wait = new WebDriverWait(driver, 20); WebElement
	 * passwordFeild; passwordFeild = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//input[@type='password']"))); if (passwordFeild.isEnabled()) {
	 * 
	 * driver.findElement(By.xpath(".//input[@type='password']")).sendKeys(password)
	 * ; }
	 * 
	 * }
	 * 
	 * @And("click on login button") public void click_on_login_button() { // Write
	 * code here that turns the phrase above into concrete actions
	 * 
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
	 * xpath("//span[text()='Log in']"))).isDisplayed();
	 * 
	 * List<WebElement> buttonList =
	 * driver.findElements(By.xpath("//span[text()='Log in']"));
	 * 
	 * buttonList.get(0).click();
	 * 
	 * }
	 * 
	 * @Then("should be able to land on home page") public void
	 * should_be_able_to_land_on_home_page() { // Write code here that turns the
	 * phrase above into concrete actions
	 * 
	 * WebElement home; home = wait
	 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//span[text()='Home']"))); home.isDisplayed(); }
	 */
	

}
