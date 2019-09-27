package humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import humanity.page.objects.HumanityHome;
import humanity.page.objects.HumanityProfile;
import humanity.page.objects.HumanitySettings;

public class HumanitySettingsTest {

	public static void SettingsTest() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "geckodriver");
		WebDriver driver = new FirefoxDriver();
		if (!driver.getCurrentUrl().equals(HumanityHome.URL)) {
			driver.navigate().to(HumanityHome.URL);
		}
		driver.get(HumanityHome.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		try {
			HumanityHome.getLoginPath(driver);
			HumanityHome.clickLoginPath(driver);
			HumanityHome.getEmailButton(driver);
			HumanityHome.EmailSendKeys(driver, "kesiva@net1mail.com");
			HumanityHome.getPassButton(driver);
			HumanityHome.PassSendKeys(driver, "kafana6");
			HumanityHome.getLoginButton(driver);
			HumanityHome.clickLoginButton(driver);

			Thread.sleep(5000);
			// ENTER SETTINGS

			HumanitySettings.clickSettings(driver);
			// SELECT COUNTRY

			HumanitySettings.inputCountry(driver, "Serbia");
			// SELECT LANGUAGE

			HumanitySettings.inputLanguage(driver, "Serbian (machine)");
			// SELECT TIME FORM

			HumanitySettings.inputTime(driver, "24h");

			HumanitySettings.getSaveBtn(driver);
			HumanitySettings.clickSaveBtn(driver);

			Thread.sleep(7000);
			driver.quit();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}
}