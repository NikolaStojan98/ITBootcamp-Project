package humanity.page.tests;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import humanity.utility.Utility;
import humanity.page.objects.HumanityHome;
import humanity.page.objects.HumanityMenu;

public class HumanityLoginAutoTest {

	public static void fillLogInForm() {

		Utility.setExcell("Data.xls");
		Utility.setWorkSheet(0);

		System.setProperty("webdriver.gecko.driver", "geckodriver");

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		try {
			driver.get(HumanityHome.URL);
			HumanityHome.getLoginPath(driver);
			HumanityHome.clickLoginPath(driver);
			HumanityHome.getEmailButton(driver);
			String email = Utility.getDataAt(1, 0);
			HumanityHome.EmailSendKeys(driver, email);
			HumanityHome.getPassButton(driver);
			String password = Utility.getDataAt(1, 1);
			HumanityHome.PassSendKeys(driver, password);
			HumanityHome.getLoginButton(driver);
			HumanityHome.clickLoginButton(driver);

			Thread.sleep(3000);
			if (driver.getCurrentUrl().equals(HumanityMenu.URL)) {
				System.out.println("Log in successful.");
			} else {
				System.out.println("Log in was not successful.");
			}

			Thread.sleep(4000);
			driver.quit();

		} catch (Exception e) {
			System.out.println("Neuspesno logovanje!");

		}

	}

}