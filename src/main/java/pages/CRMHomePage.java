package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CRMHomePage extends OpentapsWrappers{

	public CRMHomePage() {
		if(!verifyTitle("My Home | opentaps CRM"))
			Reporter.reportStep("This is not Create Lead Page", "FAIL");
	}	

	public CreateLeadPage clickCreateLeadLink(){
		clickByLink(prop.getProperty("CRMHomePage.CreateLeadLink.LinkText"));
		return new CreateLeadPage();
	}

public MyLeadsPage clickLeadsTab(){
	clickByLink(prop.getProperty("CRMHomePage.LeadsTab.LinkText"));
	return new MyLeadsPage();
}











}
