package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC005_EditLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void editLead(String userName, String passWord, 
			String VerifyUsername, String firstname, String title, String industry, String verifyIndustry) {

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
		.clickFirstMatchLead()
		.verifyViewLeadTitle(title)
		.clickEditLead()
		.selectIndustryDrpDwn(industry)
		.clickUpdateButton()
		.verifyIndustry(verifyIndustry);
		
		
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC004";
		browserName="chrome";
		testCaseName="Edit Lead Open Taps";
		testDescription="Editing existing Lead";
	}	
}
