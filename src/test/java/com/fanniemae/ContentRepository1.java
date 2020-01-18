package com.fanniemae;



import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.fanniemae.automation.Administration.model.Administration;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.loginLogoutTest.model.LoginLogoutTest;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.ContentRepositoryPageActions;
import com.fanniemae.automation.test.page.actions.HomePageActions;

import com.fanniemae.automation.util.PathProvider;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class ContentRepository1 extends AbstractTest {
	private static Logger LOG=Logger.getLogger(ContentRepository1.class.getName());
	
	public static final String ADD_FILES_EXE = PathProvider.getForTestData()+"/AddFiles.exe";
	private int userName=FanniemaeConstants.C;
	private int passWord=FanniemaeConstants.D;
	private int landingPageTitle=FanniemaeConstants.E;
	
	protected static ContentRepositoryPageActions CONTENTREPOSITORYPAGE_ACTIONS ;
	static{
		LoginLogoutTest loginLogout=new LoginLogoutTest();
		loginLogout.init(DRIVER);
		
		Administration administration=new Administration();
		administration.init(DRIVER);
		CONTENTREPOSITORYPAGE_ACTIONS=new ContentRepositoryPageActions(administration, DRIVER);
		
		HOMEPAGE_ACTIONS=new HomePageActions(loginLogout, DRIVER);
	}
	@Test
	public void mainFunction() throws IOException {
		String testCaseName="ContentRepository";
		String serialNo="2";
		try {
			getFannieMaePage();
			Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
			WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
			HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, passWord, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
			WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
			WebElementOperations.park(2);
			CONTENTREPOSITORYPAGE_ACTIONS.SearchingDocumentsInContentRepositpry(testCaseName, serialNo, DEFAULT_SHEET_NAME);
			CONTENTREPOSITORYPAGE_ACTIONS.creatingNewDocument(testCaseName, serialNo, DEFAULT_SHEET_NAME);
			HOMEPAGE_ACTIONS.logout(testCaseName);
			}
		catch(Exception e) {
			HOMEPAGE_ACTIONS.logout(testCaseName);
			}
		
	}
	

}
