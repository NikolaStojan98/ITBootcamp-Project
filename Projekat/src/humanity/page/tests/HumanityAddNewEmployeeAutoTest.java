package humanity.page.tests;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import humanity.page.objects.HumanityHome;
import humanity.page.objects.HumanityMenu;
import humanity.page.objects.HumanityStaff;
import humanity.utility.Utility;

public class HumanityAddNewEmployeeAutoTest {
	
	public static boolean testAddEmployee() {
	
		Utility.setExcell("Data.xls");
		Utility.setWorkSheet(1);	
		
	System.setProperty("webdriver.gecko.driver", "geckodriver");

	

	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	try {
		int i;
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
	for(i=1; i<Utility.getRowNumber();i++) {
		if(HumanityStaff.getFirstName(driver, i)!=null) {
		HumanityStaff.getFirstName(driver, i).click();
		String firstname=Utility.getDataAt(i, 0);
		HumanityStaff.FirstNameSendKeys(driver, firstname, i);
		HumanityStaff.getLastName(driver, i).click();
		String lastname=Utility.getDataAt(i, 1);
		HumanityStaff.LastNameSendKeys(driver, lastname, i);
		HumanityStaff.getEmail(driver,i).click();
		String mail=Utility.getDataAt(i, 2);
		HumanityStaff.EmailSendKeys(driver, mail, i);

		WebElement element = driver.findElement(By.id("//button[@id='_as_save_multiple']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);
		element.click();
		
		}
	}
		Thread.sleep(3000);
		
		

		driver.quit();
		  
		}
		catch(Exception e) {
			System.out.println("Neuspesno logovanje!"+e.toString());
		
		}
	
	return true;
	}
}