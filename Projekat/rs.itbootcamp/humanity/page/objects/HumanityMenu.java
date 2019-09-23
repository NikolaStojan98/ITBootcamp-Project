package humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityMenu {

	public static final String URL = "https://gradskakafana.humanity.com/app/dashboard/";
	private static final String DASHBOARD_PATH = "//a[@id='sn_dashboard']//span[@class='primNavQtip__inner']";
	private static final String SHIFTPLANING_PATH = "//a[@id='sn_schedule']//span[@class='primNavQtip__inner']";
	private static final String TIMECLOCK_PATH = "//a[@id='sn_timeclock']//span[@class='primNavQtip__inner']";
	private static final String LEAVE_PATH = "//a[@id='sn_requests']//span[@class='primNavQtip__inner']";
	private static final String TRAINING_PATH = "//a[@id='sn_training']//span[@class='primNavQtip__inner']";
	private static final String STAFF_PATH = "//a[@id='sn_staff']";
	private static final String PAYROLL_PATH = "//a[@id='sn_payroll']//span[@class='primNavQtip__inner']";
	private static final String REPORTS_PATH = "//a[@id='sn_reports']//span[@class='primNavQtip__inner']";

	public static WebElement getDashboard(WebDriver driver) {
		return driver.findElement(By.xpath(DASHBOARD_PATH));
	}

	public static WebElement getShiftplaning(WebDriver driver) {
		return driver.findElement(By.xpath(SHIFTPLANING_PATH));
	}

	public static WebElement getTimeClock(WebDriver driver) {
		return driver.findElement(By.xpath(TIMECLOCK_PATH));
	}

	public static WebElement getLeave(WebDriver driver) {
		return driver.findElement(By.xpath(LEAVE_PATH));
	}

	public static WebElement getTraining(WebDriver driver) {
		return driver.findElement(By.xpath(TRAINING_PATH));
	}

	public static WebElement getStaff(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF_PATH));
	}

	public static void clickStaff(WebDriver driver) {
		getStaff(driver).click();

	}

	public static WebElement getPayroll(WebDriver driver) {
		return driver.findElement(By.xpath(PAYROLL_PATH));
	}

	public static WebElement getReports(WebDriver driver) {
		return driver.findElement(By.xpath(REPORTS_PATH));
	}

}
