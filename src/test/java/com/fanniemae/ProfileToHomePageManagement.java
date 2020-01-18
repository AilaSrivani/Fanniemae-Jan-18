package com.fanniemae;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.loginLogoutTest.model.LoginLogoutTest;
import com.fanniemae.automation.profileToHomepageMappingTest.model.ProfileToHomepageMappingTest;
import com.fanniemae.automation.profileToHomepageMappingTest.model.ProfileToHomepageWebelements;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class ProfileToHomePageManagement extends AbstractTest{
	private Logger LOG=Logger.getLogger(ThresholdManagement.class.getName());
	private int userName=FanniemaeConstants.C;
	private int passWord=FanniemaeConstants.D;
	private int landingPageTitle=FanniemaeConstants.E;
	private int keywords=FanniemaeConstants.F;
	private int homePage=FanniemaeConstants.G;
	private int profile=FanniemaeConstants.H;
	private int testSelPage=FanniemaeConstants.BK;
	
	
	static{
		LoginLogoutTest loginLogout=new LoginLogoutTest();
		loginLogout.init(DRIVER);
		
		ProfileToHomepageMappingTest profileToHomepageMappingTest=new ProfileToHomepageMappingTest();
		profileToHomepageMappingTest.init(DRIVER);
		
		HOMEPAGE_ACTIONS=new HomePageActions(loginLogout, DRIVER);
	      }
	
	@Test
	public void mainFunction() throws IOException {
		String testCaseName="Profile to homepage mapping and pagemass unit";
		String serialNo="9";
		try {
			getFannieMaePage();
			Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
			WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
			HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, passWord, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
			WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), ProfileToHomepageWebelements.administration);
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), ProfileToHomepageWebelements.profileToHomepageMappingHeader);
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), ProfileToHomepageWebelements.keywordsBox, REPOSITORY.getCellDataOnTestCase(serialNo, keywords, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.dropDownByTextVisibility(getDriver(), ProfileToHomepageWebelements.homePageCodeDropDown, REPOSITORY.getCellDataOnTestCase(serialNo, homePage, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.dropDownByTextVisibility(getDriver(), ProfileToHomepageWebelements.profileDropDown, REPOSITORY.getCellDataOnTestCase(serialNo, profile, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), ProfileToHomepageWebelements.searchBox);
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), ProfileToHomepageWebelements.resetBox);
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), ProfileToHomepageWebelements.save);
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), ProfileToHomepageWebelements.administration);
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), ProfileToHomepageWebelements.pageMassEdit);
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), ProfileToHomepageWebelements.txtSelPage, REPOSITORY.getCellDataOnTestCase(serialNo, testSelPage, DEFAULT_SHEET_NAME));
			WebElementOperations.enterByRobot();
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), ProfileToHomepageWebelements.activate);
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), ProfileToHomepageWebelements.deactivate);
			WebElementOperations.park(2);
			HOMEPAGE_ACTIONS.logout(testCaseName);
		}
		catch(Exception e) {
			performPostExceptionProcess(testCaseName, serialNo, "profile to homepage management and page mass edit", e, DEFAULT_SHEET_NAME);
			
		}
	}
}
