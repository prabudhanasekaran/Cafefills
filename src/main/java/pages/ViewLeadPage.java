package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewLeadPage extends OpentapsWrappers{

	public ViewLeadPage() {
		if(!verifyTitle("View Lead | opentaps CRM"))
			Reporter.reportStep("This is not CRM Home Page", "FAIL");
	}	

public EditLeadPage clickEditLead() {
	clickByXpath(prop.getProperty("ViewLeadPage.EditLeadButton.Xpath"));
	return new EditLeadPage();
}

public MyLeadsPage clickDeleteLead() {
	clickByLink(prop.getProperty("ViewLeadPage.DeleteLeadButton.Link"));
	return new MyLeadsPage();
}

public ViewLeadPage verifyIndustry(String data){
	verifyTextByXpath(prop.getProperty("ViewLeadPage.VerifyIndustry.Xpath"), data);
	return this;
}

public ViewLeadPage verifyViewLeadTitle(String data){
	verifyTextContainsByXpath(prop.getProperty("ViewLeadPage.VerifyPageTitle.Xpath"),data);
return this;
}












}
