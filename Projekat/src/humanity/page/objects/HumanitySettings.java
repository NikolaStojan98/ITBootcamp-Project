package humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HumanitySettings {
	private static final String SETTINGS_XPATH = "//a[@id='sn_admin']";
	private static final String COUNTRY_XPATH = "//select[@id='country']";
	private static final String LANGUAGE_XPATH = "//select[@name='language']";
	private static final String TIME_XPATH = "//select[@name='pref_24hr']";
	private static final String SAVE_SETTINGS_XPATH = "//button[@id='act_primary']";
	
	//SETTINGS BUTTON
	public static WebElement getSettings (WebDriver driver) {
		return(driver.findElement(By.xpath(SETTINGS_XPATH)));
	}
	public static void clickSettings (WebDriver driver) {
		getSettings (driver).click();
	}
	//COUNTRY SELECT
	public static Select getCountry(WebDriver driver) {
		return new Select (driver.findElement(By.xpath(COUNTRY_XPATH)));
	}
	public static void inputCountry (WebDriver driver, String data) {
		getCountry(driver).selectByVisibleText(data);
	}
	//LANGUAGE
	public static Select getLanguage(WebDriver driver) {
		return new Select (driver.findElement(By.xpath(LANGUAGE_XPATH)));
	}
	public static void inputLanguage (WebDriver driver, String data) {
		getLanguage(driver).selectByVisibleText(data);
	}
	//TIME FORM
	public static Select getTime(WebDriver driver) {
		return new Select ((WebElement) driver.findElements(By.xpath(TIME_XPATH)));
	}
	public static void inputTime (WebDriver driver, String data) {
		getTime(driver).selectByVisibleText(data);
	}
	//SAVE BUTTON 
	public static WebElement getSaveBtn(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_SETTINGS_XPATH));
	}
	public static void clickSaveBtn (WebDriver driver) {
		getSaveBtn(driver).click();
	}
	
}
