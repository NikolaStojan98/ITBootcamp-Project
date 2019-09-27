package humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityProfile {
	
	private static final String PROFILE_ICON_XPATH ="//div[@id='wrap_us_menu']";
	private static final String PROFILE_XPATH ="//a[contains(text(),'Profile')]";
	private static final String SETTINGS_XPATH ="//div[@class='userm userm-mainPage']//a[contains(text(),'Settings')]";
	private static final String AVAILABILITY_XPATH ="//div[@class='userm userm-mainPage']//a[contains(text(),'Availability')]";
	private static final String LOGOUT_XPATH = "//a[contains(text(),'Sign Out')]";
	private static final String VERSION_XPATH ="//b[contains(text(),'9.5.5')]";
	
	public static WebElement getProfileIcon(WebDriver driver) {
		return driver.findElement(By.xpath(PROFILE_ICON_XPATH));
	}
	public static void clickProfileIcon(WebDriver driver) {
		getProfileIcon(driver).click();
	}
	public static WebElement getProfile(WebDriver driver) {
		return driver.findElement(By.xpath(PROFILE_XPATH));
	}
	public static void clickProfile(WebDriver driver) {
		getProfile(driver).click();
	}
	public static WebElement getSettings(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_XPATH));
	}
	public static void clickSettings(WebDriver driver) {
		getSettings(driver).click();
	}
	public static WebElement getAvailability(WebDriver driver) {
		return driver.findElement(By.xpath(AVAILABILITY_XPATH ));
	}
	public static void clickAvailability(WebDriver driver) {
		getAvailability(driver).click();
	}
	public static WebElement getSingOut(WebDriver driver) {
		return driver.findElement(By.xpath(LOGOUT_XPATH ));
	}
	public static void clickSingOut(WebDriver driver) {
		getSingOut(driver).click();
	}
	public static WebElement getVersion(WebDriver driver) {
		return driver.findElement(By.xpath(VERSION_XPATH));
	}
	public static void getLastVersion(WebDriver driver) {
		System.out.println("Version 9.5.5");
	}
}
