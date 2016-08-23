package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MyLeadsPage extends OpentapsWrappers{

	public MyLeadsPage() {
		if(!verifyTitle("My Leads | opentaps CRM"))
			Reporter.reportStep("This is not CRM Home Page", "FAIL");
	}	

public FindLeadsPage clickFindLeads() {
	clickByLink(prop.getProperty("MyLeadsPage.FindLeadsLink.LinkText"));
	return new FindLeadsPage();
}

public MergeLeadsPage clickMergeLeadsLink() {
	clickByLink(prop.getProperty("MergeLeadsPage.MergeLeadsLink.LinkText"));
	return new MergeLeadsPage();
}








}
