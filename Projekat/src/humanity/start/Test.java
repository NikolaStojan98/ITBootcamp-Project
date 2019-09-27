package humanity.start;
import humanity.page.tests.HumanityLoginTests;
import humanity.page.tests.HumanityAddNewEmployeeTests;

import java.util.Scanner;

import humanity.page.tests.HumanityAddNewEmployeeAutoTest;
import humanity.page.tests.HumanityEditStaffTest;
import humanity.page.tests.HumanityProfileTest;
import humanity.page.tests.HumanitySettingsTest;
import humanity.page.tests.HumanityLoginAutoTest;


public class Test {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int opcija;
		do {
			System.out.println("Please choose number for testing:");
			System.out.println("0 - EXIT");
			System.out.println("1 - Login");
			System.out.println("2 - Profile test");
			System.out.println("3 - Settings test");
			System.out.println("4 - Edit staff test ");
			System.out.println("5 - Add employee test");
			 opcija = sc.nextInt();
		  switch(opcija) {
		  case 1:
			  	HumanityLoginAutoTest.fillLogInForm();;;
			  	break;  
		  case 2: 
			  	HumanityProfileTest.ProfileTest();
			  	break;
		  case 3: 
			  	HumanitySettingsTest.SettingsTest();
			  	break;
		  case 4: 
			  	HumanityEditStaffTest.EditStaffTest();
			  	break;
		  case 5:
			  	HumanityAddNewEmployeeTests.testAddEmployee();;
			  	break;
			case 0: 
				System.out.println("You left the testing room");
				break;
			}
		  
		} while (opcija!=0);
	}

}
