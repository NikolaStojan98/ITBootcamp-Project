package humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityHome {

	public static final String URL = "https://www.humanity.com/";
	private static final String USERNAME_PATH = "//div[@class='input-wrapper']//input[@placeholder='Full Name']";
	private static final String WORKINGMAIL_PATH = "//div[@class='input-wrapper']//input[@placeholder='Work Email']\n";
	private static final String LOGIN_PATH = "//p[contains(text(),'LOGIN')]";
	private static final String EMAIl_PATH = "//input[@id='email']";
	private static final String PASSWORD_PATH = "//input[@id='password']";
	private static final String LOGIN_BUTTON = "//button[contains(text(),'Log in')]";
	private static final String TRYFREE_PATH = "//div[@id='tryForFree']";
	private static final String ABOUT_PATH = "//a[@class='nav-link'][contains(text(),'About us')]";
	private static final String STARTFREETRIAL_PATH = "//input[@id='free-trial-link-01']\n]";

	public static WebElement getUsername(WebDriver driver) {
		return driver.findElement(By.xpath(USERNAME_PATH));
	}

	public static void clickUsername(WebDriver driver) {
		getUsername(driver).click();

	}

	public static void UsernameSendKeys(WebDriver driver, String data) {
		getUsername(driver).sendKeys(data);

	}

	public static WebElement getWorkingMail(WebDriver driver) {
		return driver.findElement(By.xpath(WORKINGMAIL_PATH));
	}

	public static void WorkingMailSendKeys(WebDriver driver) {
		getWorkingMail(driver).sendKeys("kesiva@net1mail.com");

	}

	public static WebElement getLoginPath(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_PATH));
	}

	public static void clickLoginPath(WebDriver driver) {
		getLoginPath(driver).click();

	}

	public static WebElement getEmailButton(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIl_PATH));

	}

	// kesiva@net1mail.com
	public static void EmailSendKeys(WebDriver driver, String data) {
		getEmailButton(driver).sendKeys(data);

	}

	public static WebElement getPassButton(WebDriver driver) {
		return driver.findElement(By.xpath(PASSWORD_PATH));

	}

	// kafana6
	public static void PassSendKeys(WebDriver driver, String data) {
		getPassButton(driver).sendKeys(data);

	}

	public static WebElement getLoginButton(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_BUTTON));
	}

	public static void clickLoginButton(WebDriver driver) {
		getLoginButton(driver).click();

	}

	public static WebElement getTryFree(WebDriver driver) {
		return driver.findElement(By.xpath(TRYFREE_PATH));
	}

	public static void clickTryFree(WebDriver driver) {
		getTryFree(driver).click();

	}

	public static WebElement getAbout(WebDriver driver) {
		return driver.findElement(By.xpath(ABOUT_PATH));
	}

	public static void clickAbout(WebDriver driver) {
		getAbout(driver).click();

	}

	public static WebElement getStartFreeTrial(WebDriver driver) {
		return driver.findElement(By.xpath(STARTFREETRIAL_PATH));
	}

	public static void clickStartFreeTrial(WebDriver driver) {
		getStartFreeTrial(driver).click();

	}

}