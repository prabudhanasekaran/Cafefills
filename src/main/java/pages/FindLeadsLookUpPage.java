package pages;

import java.util.concurrent.TimeUnit;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindLeadsLookUpPage extends OpentapsWrappers{
	public static String LeadId;
	public FindLeadsLookUpPage() {
		if(!verifyTitle("Find Leads"))
			Reporter.reportStep("This is not Find Leads Page", "FAIL");
	}	

public FindLeadsLookUpPage enterLookUpFirstName(String data){
	enterByXpath((prop.getProperty("FindLeadsLookupPage.FirstName.Xpath")),data);
	return this;
}

public FindLeadsLookUpPage clickLookUpFindLeadsBtn(){
	clickByXpath(prop.getProperty("FindLeadsLookupPage.FindLeads.Xpath"));
	return this;
}

public ViewLeadPage clickLookUpFirstMatchLead(){
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	clickByXpath(prop.getProperty("FindLeadsLookupPage.FirstRow.Xpath"));
	return new ViewLeadPage();
}



/*public FindLeadsLookUpPage printLookUpFirstLead(){
	LeadId = getTextByXpath(prop.getProperty("FindLeadsPage.FirstMatchLeadText.Xpath"));
	if(LeadId!="")
	Reporter.reportStep("The First Matching Lead Id is: "+LeadId, "PASS");
	return this;
}*/
}