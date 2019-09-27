package humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import humanity.page.objects.HumanityHome;
import humanity.page.objects.HumanityMenu;
import humanity.page.objects.HumanityProfile;

public class HumanityProfileTest {
	public static void ProfileTest() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "geckodriver");
		WebDriver driver = new FirefoxDriver();
		if (!driver.getCurrentUrl().equals(HumanityHome.URL)) {
			driver.navigate().to(HumanityHome.URL);
		}
		driver.get(HumanityHome.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		try {

			// FILL LOGIN FORM
			HumanityHome.getLoginPath(driver);
			HumanityHome.clickLoginPath(driver);
			HumanityHome.getEmailButton(driver);
			HumanityHome.EmailSendKeys(driver, "kesiva@net1mail.com");
			HumanityHome.getPassButton(driver);
			HumanityHome.PassSendKeys(driver, "kafana6");
			HumanityHome.getLoginButton(driver);
			HumanityHome.clickLoginButton(driver);

			Thread.sleep(5000);

			HumanityProfile.getProfileIcon(driver);
			HumanityProfile.clickProfileIcon(driver);
			HumanityProfile.getProfile(driver);
			HumanityProfile.clickProfile(driver);

			HumanityProfile.getProfileIcon(driver);
			HumanityProfile.clickProfileIcon(driver);
			HumanityProfile.getSingOut(driver);
			HumanityProfile.clickSingOut(driver);
			Thread.sleep(5000);
			if (driver.getCurrentUrl().equals("https://gradskakafana.humanity.com/app/")) {
				System.out.println("Uspesna odjava");

			} else {
				System.out.println("Neuspesna odjava");
			}

			Thread.sleep(5000);
			driver.quit();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}
}