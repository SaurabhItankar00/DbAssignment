package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {

	WebDriver driver;

	WebDriverWait wait = null;

	By btn_profileMenu = By.xpath("//a[@href='/User101Test' and @data-testid='AppTabBar_Profile_Link']");
	By btn_editProfile = By.xpath("//span[text()='Edit profile']");
	By btn_uploadButton = By.xpath(
			"//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div/div[3]/input");
	String projectPath = System.getProperty("user.dir");

	String picturePath = projectPath + "/src/test/resources/picture/profile-picture.jpg";

	By btn_apply = By.xpath("//span[text()='Apply']");
	By btn_save = By.xpath("//span[text()='Save']");

	By txt_feild = By.xpath("//textarea[@name='description']");
	By txt_location = By.xpath("//input[@name='location']");
	By txt_website = By.xpath("//input[@name='url']");

	public ProfilePage(WebDriver driver) {

		this.driver = driver;
	}

	public void goToProfilePage() throws InterruptedException {
		driver.findElement(btn_profileMenu).click();
		driver.findElement(btn_editProfile).click();
		Thread.sleep(5000);

	}

	public void uploadPicture() throws InterruptedException {
		System.out.println(picturePath);
		driver.findElement(btn_uploadButton).sendKeys(picturePath);
		Thread.sleep(1000);
		driver.findElement(btn_apply).click();
		driver.findElement(btn_save).click();
	}

	public void verifyPicture() {

		List<WebElement> imageTile = driver.findElements(
				By.xpath("//div[@class='css-1dbjc4n r-12181gd r-1pi2tsx r-1ny4l3l r-o7ynqc r-6416eg r-13qz1uu']"));
		imageTile.get(0).click();

		boolean img_display = driver.findElement(By.xpath("//img[@alt='Image']")).isDisplayed();
		if (!img_display) {
			System.out.println("Image is NOT Displayed");
		} else {
			System.out.println("Image is Displayed");
		}
	}

	public void updateBIO() {
		// driver.switchTo().frame((WebElement) By.xpath("//div[@class='css-1dbjc4n
		// r-vacyoi']"))

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(50,250)", "");
		if (driver.findElement(txt_feild).getText()!= null ||driver.findElement(txt_feild).getText()==" " ) {
			driver.findElement(txt_feild).clear();
			System.out.println("HI in BIO block");
			driver.findElement(txt_feild).sendKeys("Selenium Automation user");
		}
		else
		{
			driver.findElement(txt_feild).sendKeys("Selenium Automation user");
		}
	}

	public void updateLocation() {

		if (driver.findElement(txt_location).getText() != null|| driver.findElement(txt_location).getText()==" ") {
			driver.findElement(txt_location).clear();
			driver.findElement(txt_location).sendKeys("Pune");
		}
		else
		{
			driver.findElement(txt_location).sendKeys("Pune");
		}

	}

	public void updateWebsite() {

		if (driver.findElement(txt_website).getText() != null || driver.findElement(txt_website).getText()==" ") {
			driver.findElement(txt_website).clear();
			driver.findElement(txt_website).sendKeys("twitter.com");
		}
		else
		{
			driver.findElement(txt_website).sendKeys("twitter.com");
		}

	}

	public void verifyText() {
		String bio_txt = driver.findElement(txt_feild).getText();
		String location_txt = driver.findElement(txt_location).getText();
		String website_txt = driver.findElement(txt_website).getText();

		Assert.assertEquals(bio_txt, "Selenium Automation user");
		Assert.assertEquals(location_txt, "Pune");
		Assert.assertEquals(website_txt, "twitter.com");

	}

	public void saveUpdate() {
		driver.findElement(btn_save).click();
	}

}
