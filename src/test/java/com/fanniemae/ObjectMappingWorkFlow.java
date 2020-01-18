package com.fanniemae;



import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.loginLogoutTest.model.LoginLogoutTest;
import com.fanniemae.automation.objectMappingWFTest.model.ObjectMappingWFTest;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.fanniemae.automation.test.page.actions.ObjectMappingWorkflowPageActions;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class ObjectMappingWorkFlow extends AbstractTest {
private Logger LOG=Logger.getLogger(ObjectMappingWorkFlow.class.getName());
private int userName=FanniemaeConstants.C;
private int passWord=FanniemaeConstants.D;
private int landingPageTitle=FanniemaeConstants.E;
static ObjectMappingWorkflowPageActions OBJECTMAPPINGWORKFLOWPAGE_ACTIONS;

static{
	LoginLogoutTest loginLogout=new LoginLogoutTest();
	loginLogout.init(DRIVER);
	
	ObjectMappingWFTest objectMappingWFTest=new ObjectMappingWFTest();
	objectMappingWFTest.init(DRIVER);
	
	OBJECTMAPPINGWORKFLOWPAGE_ACTIONS=new ObjectMappingWorkflowPageActions(objectMappingWFTest,DRIVER);
	HOMEPAGE_ACTIONS=new HomePageActions(loginLogout, DRIVER);
      }

@Test
public void mainFunction() throws IOException {
	String testCaseName="ObjectMappingWorkflow";
	String serialNo="6";
	try {
		getFannieMaePage();
		Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
		WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
		HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, passWord, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
		WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
		OBJECTMAPPINGWORKFLOWPAGE_ACTIONS.objectMappingWorkflow(testCaseName, serialNo, DEFAULT_SHEET_NAME);
		OBJECTMAPPINGWORKFLOWPAGE_ACTIONS.generateScriptInObjectMappingWorkflow(testCaseName, serialNo, DEFAULT_SHEET_NAME);
	   HOMEPAGE_ACTIONS.logout(testCaseName);
	   }catch(Exception e) {
	performPostExceptionProcess(testCaseName, serialNo, "ObjectMappingWorkflow has failed", e, DEFAULT_SHEET_NAME);
	
           }
          }
        }