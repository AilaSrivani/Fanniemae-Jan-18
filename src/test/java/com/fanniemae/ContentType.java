package com.fanniemae;



import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.fanniemae.automation.Administration.model.Administration;

import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.contentTypesTest.model.ContentTypesTest;
import com.fanniemae.automation.loginLogoutTest.model.LoginLogoutTest;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.ContentTypesPageActions;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class ContentType extends AbstractTest{
	private static Logger LOG=Logger.getLogger(ContentType.class.getName());
	
	private int userName=FanniemaeConstants.C;
	private int passWord=FanniemaeConstants.D;
	private int landingPageTitle=FanniemaeConstants.E;
	static ContentTypesPageActions CONTENTTYPESPAGE_ACTIONS;
	
	static{
		LoginLogoutTest loginLogout=new LoginLogoutTest();
		loginLogout.init(DRIVER);
		
		ContentTypesTest contentTypesTest=new ContentTypesTest();
		contentTypesTest.init(DRIVER);
		
		CONTENTTYPESPAGE_ACTIONS=new ContentTypesPageActions(contentTypesTest, DRIVER);
		HOMEPAGE_ACTIONS=new HomePageActions(loginLogout, DRIVER);
		
	}
	@Test
	public void mainFunction() throws IOException {
		String testCaseName="ContentTypes";
		String serialNo="3";
		try {
			getFannieMaePage();
			Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
			WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
			HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, passWord, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
			WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
			WebElementOperations.park(2);
			CONTENTTYPESPAGE_ACTIONS.contentTypes(testCaseName, serialNo, DEFAULT_SHEET_NAME);
			CONTENTTYPESPAGE_ACTIONS.addADocumentInContentTypes(testCaseName, serialNo, DEFAULT_SHEET_NAME);
		  HOMEPAGE_ACTIONS.logout(testCaseName);
		  
		}catch(Exception e) {
			  HOMEPAGE_ACTIONS.logout(testCaseName);
		}
	}
}
