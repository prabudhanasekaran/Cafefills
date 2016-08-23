package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class EditLeadPage extends OpentapsWrappers{

	public EditLeadPage() {
		if(!verifyTitle("opentaps CRM"))
			Reporter.reportStep("This is not CRM Home Page", "FAIL");
	}	

public EditLeadPage selectIndustryDrpDwn(String data){
	selectById(prop.getProperty("EditLeadPage.IndustryDrpDwn.Id"),data);
	return this;
}

public ViewLeadPage clickUpdateButton(){
	clickByXpath(prop.getProperty("EditLeadPage.UpdateButton.Xpath"));
return new ViewLeadPage();
}
	












}
