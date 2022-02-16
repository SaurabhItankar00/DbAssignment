package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	WebDriver driver;
	WebDriverWait wait = null;
	By txt_username = By.xpath("//input[@type='text']");
	By btn_next = By.xpath("//*[text()='Next']");
	By txt_password = By.xpath("//input[@type='password']");
	By btn_login = By.xpath("//span[text()='Log in']");
	By btn_home = By.xpath("//span[text()='Home']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String username) {

		driver.findElement(txt_username).sendKeys(username);
	}

	public void clicknext() {

		driver.findElement(btn_next).click();
	}

	public void enterPassWord(String password) throws InterruptedException {

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		wait = new WebDriverWait(driver, 20);
		WebElement passwordFeild;
		passwordFeild = wait.until(ExpectedConditions.visibilityOfElementLocated(txt_password));
		if (passwordFeild.isEnabled()) {

			driver.findElement(txt_password).sendKeys(password);
		}

		// driver.findElement(txt_password).sendKeys(password);
	}

	public void loginButton() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(btn_login)).isDisplayed();

		List<WebElement> buttonList = driver.findElements(btn_login);

		buttonList.get(0).click();

		// driver.findElement(btn_login).click();
	}

	public void checkhomePage() {
		WebElement home;
		home = wait
				.until(ExpectedConditions.visibilityOfElementLocated(btn_home));
		home.isDisplayed();
		
	}
	public void LoginValidUser(String username, String password) throws InterruptedException {
		enterUsername(username);
		clicknext();
		enterPassWord(password);
		loginButton();
		checkhomePage();
	}

}
