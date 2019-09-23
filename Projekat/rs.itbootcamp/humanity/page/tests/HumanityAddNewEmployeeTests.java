package humanity.page.tests;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import humanity.page.objects.HumanityHome;
import humanity.page.objects.HumanityMenu;
import humanity.page.objects.HumanityStaff;

public class HumanityAddNewEmployeeTests {

	public static boolean testAddEmployee() {
		System.setProperty("webdriver.gecko.driver", "geckodriver");

		
		Scanner sc=new Scanner(System.in);

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		try {
			driver.get(HumanityHome.URL);
			driver.manage().window().maximize();
			//HumanityHome.getLoginPath(driver);
			HumanityHome.clickLoginPath(driver);
			//HumanityHome.getEmailButton(driver);
			HumanityHome.EmailSendKeys(driver, "kesiva@net1mail.com");
			//HumanityHome.getPassButton(driver);
			HumanityHome.PassSendKeys(driver, "kafana6");
			//HumanityHome.getLoginButton(driver);
			HumanityHome.clickLoginButton(driver);
			Thread.sleep(3000);
			if (driver.getCurrentUrl().equals(HumanityMenu.URL)) {
				System.out.println("Log in successful.");
			} else {
				System.out.println("Log in was not successful.");
		}
			Thread.sleep(1000);
			HumanityMenu.clickStaff(driver);
			Thread.sleep(1000);
			HumanityStaff.getAddEmployeeButton(driver).click();
			Thread.sleep(1000);
			HumanityStaff.getFirstName(driver).click();
			System.out.println("Unesi first name");
			HumanityStaff.FirstNameSendKeys(driver, sc.nextLine());
			HumanityStaff.getLastName(driver).click();
			System.out.println("Unesi lastname");
			HumanityStaff.LastNameSendKeys(driver, sc.nextLine());
			HumanityStaff.getEmail(driver).click();;
			System.out.println("Unesi email");
			HumanityStaff.EmailSendKeys(driver, sc.nextLine());
			HumanityStaff.getAddEmployeeButton(driver).click();
			
			
			Thread.sleep(3000);
			if (driver.getCurrentUrl().equals(HumanityStaff.URL)) {
				System.out.println("Adding is successful.");
			} else {
				System.out.println("Adding was not successful.");
		}
			

			driver.quit();
			  
			}
			catch(Exception e) {
				System.out.println("Neuspesno logovanje!"+e.toString());
			
			}
		
		return true;
		
	}

		
	}

