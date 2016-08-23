package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CreateLeadPage extends OpentapsWrappers{

	public CreateLeadPage() {
		if(!verifyTitle("Create Lead | opentaps CRM"))
			Reporter.reportStep("This is not CRM Home Page", "FAIL");
	}
	
	public CreateLeadPage enterCompanyName(String data) {
		enterById(prop.getProperty("CreateLeadPage.Companyname.Id"), data);
		return this;
	}

	public CreateLeadPage enterFirstName(String data) {
		enterById(prop.getProperty("CreateLeadPage.Firstname.Id"), data);
		return this;
	}

	public CreateLeadPage enterLastName(String data) {
		enterById(prop.getProperty("CreateLeadPage.Lastname.Id"), data);
		return this;
	}
		
	public ViewLeadPage clickCreateLead()
	{
		clickByClassName(prop.getProperty("CreateLeadPage.CreateLeadButton.Class"));
		return new ViewLeadPage();
	}

}
