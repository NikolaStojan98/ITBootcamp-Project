package humanity.page.tests;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import humanity.page.objects.HumanityHome;
import humanity.page.objects.HumanityMenu;

public class HumanityLoginTests {

	public static boolean LoginTest() {
		
		
		System.setProperty("webdriver.gecko.driver", "geckodriver");



		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		
		try {
			driver.get(HumanityHome.URL);
			HumanityHome.getLoginPath(driver);
			HumanityHome.clickLoginPath(driver);
			HumanityHome.getEmailButton(driver);
			HumanityHome.EmailSendKeys(driver, "kesiva@net1mail.com");
			HumanityHome.getPassButton(driver);
			HumanityHome.PassSendKeys(driver, "kafana6");
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
			
			  
			}
			catch(Exception e) {
				System.out.println("Neuspesno logovanje!");
			
			}
		
		return true;
	
	}
}

