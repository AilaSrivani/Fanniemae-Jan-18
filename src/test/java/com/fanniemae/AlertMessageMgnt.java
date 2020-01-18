package com.fanniemae;


import org.apache.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.fanniemae.automation.alertMessageManagementTest.model.AlertMessageManagementTest;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.loginLogoutTest.model.LoginLogoutTest;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.AlertMessageManagementPageActions;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

	public class AlertMessageMgnt  extends AbstractTest {
		
		private Logger LOG=Logger.getLogger(AlertMessageMgnt.class.getName());
		private int userName=FanniemaeConstants.C;
		private int password=FanniemaeConstants.D;
		private int landingPageTitle=FanniemaeConstants.E;
		static AlertMessageManagementPageActions ALERTMESSAGEMANAGEMENTPAGE_ACTIONS;
		
		static {
			LoginLogoutTest loginLogout=new LoginLogoutTest();
			loginLogout.init(DRIVER);
			AlertMessageManagementTest alert=new AlertMessageManagementTest();
			alert.init(DRIVER);
			ALERTMESSAGEMANAGEMENTPAGE_ACTIONS=new AlertMessageManagementPageActions(alert, DRIVER);
			HOMEPAGE_ACTIONS=new HomePageActions(loginLogout, DRIVER);
			
		}
		@Test
		public void alertMsgManagement() {
			String testCaseName="AlertMessageManagement";
			String serialNo="4";
			try {
				    getFannieMaePage();
					Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
					WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
					HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
					WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
					WebElementOperations.park(2);
					ALERTMESSAGEMANAGEMENTPAGE_ACTIONS.searchAlert(testCaseName, serialNo, DEFAULT_SHEET_NAME);
					ALERTMESSAGEMANAGEMENTPAGE_ACTIONS.createAnAlert(testCaseName, serialNo, DEFAULT_SHEET_NAME);
					HOMEPAGE_ACTIONS.logout(testCaseName);
				}
			catch(Exception e){
				HOMEPAGE_ACTIONS.logout(testCaseName);
			}
			
		}
		
		

	}



