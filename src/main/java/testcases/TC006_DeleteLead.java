package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC006_DeleteLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void editLead(String userName, String passWord, 
			String VerifyUsername, String firstname, String title, String verifydelete) {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(VerifyUsername)
		.clickCrmsfa()
		.clickLeadsTab()
		.clickFindLeads()
		.enterFirstname(firstname)
		.clickFindLeadsBtn()
		.printFirstLead()
		.clickFirstMatchLead()
		.verifyViewLeadTitle(title)
		.clickDeleteLead()
		.clickFindLeads()
		.enterLeadId()
		.clickFindLeadsBtn()
		.verifyDeleteLead(verifydelete);
		
		
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC005";
		browserName="chrome";
		testCaseName="Delete Lead Open Taps";
		testDescription="Deleting existing Lead";
	}	
}
