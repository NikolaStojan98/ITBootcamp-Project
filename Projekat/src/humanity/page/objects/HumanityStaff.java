package humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {

	public static final String URL = "https://gradskakafana.humanity.com/app/staff/list/load/true/";
	private static final String ADDEMPLOYEE_BUTTON = "//button[@id='act_primary']";
	private static final String EMPLOYEE = "//a[contains(text(),";
	private static final String EMPLOYEE1 = "//a[contains(text(),'Jasar Ahmedovski')]";
	private static final String EMPLOYEE2 = "//a[contains(text(),'Sinan Sakic')]";
	private static final String EDITDETAILS = "//a[contains(text(),'Edit Details')]";
	private static final String UPLOADPICTURE = "//input[@id='fileupload']";
	private static final String FIRSTNAME_PATH = "//input[@id='_asf";
	private static final String LASTNAME_PATH = "//input[@id='_asl";
	private static final String EMAIL_PATH = "//input[@id='_ase";
	private static final String SAVEEMPLOYEE_BUTTON = "//button[@id='_as_save_multiple']";

	public static WebElement getEmployee(WebDriver driver, String s) {
		return driver.findElement(By.xpath(EMPLOYEE + "'" + s + "')]"));

	}

	public static WebElement getAddEmployeeButton(WebDriver driver) {
		return driver.findElement(By.xpath(ADDEMPLOYEE_BUTTON));
	}

	/*
	 * public static WebElement getEmployee1(WebDriver driver) { return
	 * driver.findElement(By.xpath(EMPLOYEE1)); }
	 * 
	 * public static WebElement getEmployee2(WebDriver driver) { return
	 * driver.findElement(By.xpath(EMPLOYEE2)); }
	 */
	public static WebElement getEditDetails(WebDriver driver) {
		return driver.findElement(By.xpath(EDITDETAILS));
	}

	public static WebElement getUploadPicture(WebDriver driver) {
		return driver.findElement(By.xpath(UPLOADPICTURE));

	}

	public static void UploadPicture(WebDriver driver) {
		getUploadPicture(driver).sendKeys("/home/nikola/Downloads/dvd-rental-sample-database-diagram.png");
	}

	public static WebElement getFirstName(WebDriver driver, int i) {
		return driver.findElement(By.xpath(FIRSTNAME_PATH + i + "']"));
	}

	public static void FirstNameSendKeys(WebDriver driver, String data, int i) {
		getFirstName(driver, i).sendKeys(data);

	}

	public static WebElement getLastName(WebDriver driver, int i) {
		return driver.findElement(By.xpath(LASTNAME_PATH + i + "']"));
	}

	public static void LastNameSendKeys(WebDriver driver, String data, int i) {
		getLastName(driver, i).sendKeys(data);

	}

	public static WebElement getEmail(WebDriver driver, int i) {
		return driver.findElement(By.xpath(EMAIL_PATH + i + "']"));
	}

	public static void EmailSendKeys(WebDriver driver, String data, int i) {
		getEmail(driver, i).sendKeys(data);

	}

	public static WebElement getSaveEmployeeButton(WebDriver driver) {
		return driver.findElement(By.xpath(SAVEEMPLOYEE_BUTTON));
	}

}
