package com.fanniemae;



import static com.techouts.fanniemae.webelement.ops.WebElementOperations.captureScreenShotOnPass;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.verifyPageTitle;
import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.loginLogoutTest.model.LoginLogoutTest;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.fanniemae.automation.test.page.actions.WorkflowManagementPageActions;
import com.fanniemae.automation.util.Assert;
import com.fanniemae.automation.workflowManagementTest.model.WorkflowManagementTest;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class WorkFlowManagement extends AbstractTest {
	private Logger LOG=Logger.getLogger(WorkFlowManagement.class.getName());
	
	 private int userName=FanniemaeConstants.C;
	 private int password=FanniemaeConstants.D;
	 private int landingPageTitle=FanniemaeConstants.E;
	 private int homePageTitle=FanniemaeConstants.AQ;
	 static WorkflowManagementPageActions WORKFLOEMANAGEMENTPAGE_ACTIONS;
	static {
		LoginLogoutTest loginLogout=new LoginLogoutTest();
		loginLogout.init(DRIVER);
		
		WorkflowManagementTest workflowManagementTest=new WorkflowManagementTest();
		workflowManagementTest.init(DRIVER);
		
		WORKFLOEMANAGEMENTPAGE_ACTIONS=new WorkflowManagementPageActions(workflowManagementTest,DRIVER);
		HOMEPAGE_ACTIONS=new HomePageActions(loginLogout, DRIVER);
		 }
	 
	 @Test
	 public void workflowMgnt() {
		 String testCaseName="WorkFlowManagement";
		 String serialNo="5";
		 try {
		 getFannieMaePage();
			Assert.assertTrue(verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
			captureScreenShotOnPass(getDriver(), serialNo);
			Assert.assertTrue(HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME),
					REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME),
					REPOSITORY.getCellDataOnTestCase(serialNo, homePageTitle, DEFAULT_SHEET_NAME)),"Login to the application failed");
			captureScreenShotOnPass(getDriver(), testCaseName);
			WORKFLOEMANAGEMENTPAGE_ACTIONS.workflowManagement(testCaseName, serialNo, DEFAULT_SHEET_NAME);
			 HOMEPAGE_ACTIONS.logout(testCaseName);
			}
		 catch(Exception e) {
			 performPostExceptionProcess(testCaseName, serialNo, "workflow Management has failed", e, getDefaultConfiguredWorkbookSheetName());		
			 }
	 }
	 
	
	
	

}
