package pages;

import java.util.concurrent.TimeUnit;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindLeadsPage extends OpentapsWrappers{
	public static String LeadId;
	public FindLeadsPage() {
		if(!verifyTitle("Find Leads | opentaps CRM"))
			Reporter.reportStep("This is not CRM Home Page", "FAIL");
	}	

public FindLeadsPage enterFirstname(String data){
	enterByXpath(prop.getProperty("FindLeadsPage.FirstnameInpBox.Xpath"),data);
	return  this;
}

//FindLeadsPage.FirstMatchLead.Xpath
public FindLeadsPage clickFindLeadsBtn(){
	clickByXpath(prop.getProperty("FindLeadsPage.FindLeadsButton.Xpath"));
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	return this;
}

public FindLeadsPage printFirstLead(){
	LeadId = getTextByXpath(prop.getProperty("FindLeadsPage.FirstMatchLeadText.Xpath"));
	if(LeadId!="")
	Reporter.reportStep("The First Matching Lead Id is: "+LeadId, "PASS");
	return this;
}


public FindLeadsPage enterLeadId(){
		enterByName(prop.getProperty("FindLeadsPage.LeadIdInpBox.Name"),LeadId);
	return this;
}

public ViewLeadPage clickFirstMatchLead(){
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	clickByXpath(prop.getProperty("FindLeadsPage.FirstMatchLead.Xpath"));
	return new ViewLeadPage();
}

public FindLeadsPage verifyDeleteLead(String data){
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//Thread.sleep(3000);
//	ObjSyncWait(prop.getProperty("FindLeadsPage.NoRecordsdisplay.Xpath"));
	verifyTextByXpath(prop.getProperty("FindLeadsPage.NoRecordsdisplay.Xpath"), data);
	//String ActualTxt = getTextByXpath(prop.getProperty("FindLeadsPage.NoRecordsdisplay.Xpath"));
	//CompareTxtStr(ActualTxt,data);
	return this;
}





}
