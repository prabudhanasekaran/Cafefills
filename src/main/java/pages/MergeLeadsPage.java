package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MergeLeadsPage extends OpentapsWrappers{
	public static String parentWindow;
	public MergeLeadsPage() {
		if(!verifyTitle("Merge Leads | opentaps CRM"))
			Reporter.reportStep("This is not CRM Home Page", "FAIL");
	}	

public FindLeadsLookUpPage clickFirstImgIcon() {
	parentWindow = driver.getWindowHandle();
	clickByXpath(prop.getProperty("MyLeadsPage.FindLeadsLink.LinkText"));
	switchToLastWindow();
	return new FindLeadsLookUpPage();
}










}
