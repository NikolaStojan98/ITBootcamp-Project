package humanity.page.tests;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field.Xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import humanity.page.objects.HumanityHome;
import humanity.page.objects.HumanityMenu;
import humanity.page.objects.HumanityStaff;

public class HumanityAddNewEmployeeTests {

	public static boolean testAddEmployee() {
		System.setProperty("webdriver.gecko.driver", "geckodriver");

		Scanner sc = new Scanner(System.in);

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		try {
			int i;
			int k;
			driver.get(HumanityHome.URL);
			driver.manage().window().maximize();

			// HumanityHome.getLoginPath(driver);
			HumanityHome.clickLoginPath(driver);
			// HumanityHome.getEmailButton(driver);
			HumanityHome.EmailSendKeys(driver, "kesiva@net1mail.com");
			// HumanityHome.getPassButton(driver);
			HumanityHome.PassSendKeys(driver, "kafana6");
			// HumanityHome.getLoginButton(driver);
			HumanityHome.clickLoginButton(driver);
			Thread.sleep(4000);
			if (driver.getCurrentUrl().equals(HumanityMenu.URL)) {
				System.out.println("Log in successful.");
			} else {
				System.out.println("Log in was not successful.");
			}
			Thread.sleep(6000);
			HumanityMenu.clickStaff(driver);
			Thread.sleep(1000);
			HumanityStaff.getAddEmployeeButton(driver).click();
			Thread.sleep(1000);
			System.out.println("unesite polje");
			i = sc.nextInt();
			sc.nextLine();

			HumanityStaff.getFirstName(driver, i).click();
			System.out.println("Unesi first name");
			String firstname = sc.nextLine();
			HumanityStaff.FirstNameSendKeys(driver, firstname, i);
			System.out.println("Unesi lastname");
			String lastname = sc.nextLine();
			HumanityStaff.getLastName(driver, i).click();
			HumanityStaff.LastNameSendKeys(driver, lastname, i);
			HumanityStaff.getEmail(driver, i).click();
			System.out.println("Unesi email");
			String email = sc.nextLine();
			HumanityStaff.EmailSendKeys(driver, email, i);

			WebElement element = driver.findElement(By.id("//button[@id='_as_save_multiple']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(500);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement button = driver.findElement(By.xpath("//button[@id='_as_save_multiple']"));
			js.executeScript("arguments[0].scrollIntoView(true);", button);
			button.click();

			driver.quit();

		} catch (Exception e) {
			System.out.println("Neuspesno logovanje!" + e.toString());

		}

		return true;

	}

}
