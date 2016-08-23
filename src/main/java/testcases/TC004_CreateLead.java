package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC004_CreateLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void createLead(String userName, String passWord, 
			String VerifyUsername, String companyName, String firstname, String lastName) {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(VerifyUsername)
		.clickCrmsfa()
		.clickCreateLeadLink()
		.enterCompanyName(companyName)
		.enterFirstName(firstname)
		.enterLastName(lastName)
		.clickCreateLead();
		
		
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC003";
		browserName="chrome";
		testCaseName="Create Lead Open Taps";
		testDescription="Creating a new Lead";
	}	
}
