package humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import humanity.page.objects.HumanityEditStaff;
import humanity.page.objects.HumanityHome;
import humanity.page.objects.HumanityProfile;

public class HumanityEditStaffTest {

	public static void EditStaffTest() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.get(HumanityHome.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		try {

			// FILL LOGIN FORM
			driver.get(HumanityHome.URL);
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
			Thread.sleep(5000);
			// EDIT PROFILE
			HumanityEditStaff.getEdit(driver);
			HumanityEditStaff.clickEdit(driver);
			Thread.sleep(4000);
			// UPLOAD PHOTO
			// HumanityEditStaff.getUploadImg(driver);
			HumanityEditStaff.getImgPath(driver);
			Thread.sleep(2000);
			// INPUT NICK
			HumanityEditStaff.getNickname(driver);
			HumanityEditStaff.clickNickname(driver);
			HumanityEditStaff.inputNickname(driver, "PM");
			// SAVE
			HumanityEditStaff.getSaveChanges(driver);
			HumanityEditStaff.clickSaveChanges(driver);

			Thread.sleep(3000);
			driver.quit();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}
}
