package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC007_MergeLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void mergeLead(String userName, String passWord, 
			String VerifyUsername, String firstLead, String secondLead, String verifydelete) {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(VerifyUsername)
		.clickCrmsfa()
		.clickLeadsTab()
		.clickMergeLeadsLink()
		.clickFirstImgIcon()
		.enterLookUpFirstName(firstLead)
		.clickLookUpFindLeadsBtn()
		.clickLookUpFirstMatchLead();
		
		
	//	fromLeadsToToLeads(1, firstLead, parentWindow);
		//fromLeadsToToLeads(2, secondLead, parentWindow);
		
		
		/*.enterFirstname(firstname)
		.clickFindLeadsBtn()
		.printFirstLead()
		.clickFirstMatchLead()
		.verifyViewLeadTitle(title)
		.clickDeleteLead()
		.clickFindLeads()
		.enterLeadId()
		.clickFindLeadsBtn()
		.verifyDeleteLead(verifydelete);*/
		
		
	}
	
	public void fromLeadsToToLeads(int n, String name, String curWindow) throws InterruptedException{
		clickByXpath("(//img[@alt='Lookup'])["+n+"]");
		Thread.sleep(2000);
		switchToLastWindow();
		enterByXpath("//input[@name='firstName']",name);
		clickByXpath("//button[contains(text(),'Find Leads')]");
		Thread.sleep(2000);
		String Match = getTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']");
		clickByLink(Match);
		driver.switchTo().window(curWindow);
	}
	
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC005";
		browserName="chrome";
		testCaseName="Merge Lead Open Taps";
		testDescription="Merging existing Leads";
	}	
}
