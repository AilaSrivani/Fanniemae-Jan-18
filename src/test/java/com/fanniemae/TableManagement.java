package com.fanniemae;



	import org.apache.log4j.Logger;
	import org.testng.annotations.Test;

	import com.fanniemae.automation.Administration.model.Administration;
	import com.fanniemae.automation.consts.FanniemaeConstants;
	import com.fanniemae.automation.loginLogoutTest.model.LoginLogoutTest;
import com.fanniemae.automation.test.AbstractTest;
	import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.fanniemae.automation.test.page.actions.TableManagementPageActions;
import com.fanniemae.automation.util.Assert;
	import com.techouts.fanniemae.webelement.ops.WebElementOperations;


	public class TableManagement extends AbstractTest {
	
		private static final Logger LOG=Logger.getLogger(TableManagement.class.getName());
		
		private int userName=FanniemaeConstants.C;
		private int passWord=FanniemaeConstants.D;
		private int landingPageTitle=FanniemaeConstants.E;
		
		//private int landingPageTitle=FanniemaeConstants.E;
		protected static TableManagementPageActions TABLEMANAGEMENT_ACTIONS ;
		static{
			LoginLogoutTest loginLogout=new LoginLogoutTest();
			loginLogout.init(DRIVER);
			
			Administration administration=new Administration();
			administration.init(DRIVER);
			
			TABLEMANAGEMENT_ACTIONS=new TableManagementPageActions(administration, DRIVER);
			
			HOMEPAGE_ACTIONS=new HomePageActions(loginLogout, DRIVER);
		}
		
		@Test
		public void tableManagement() {
		  String testCaseName="TimeManagement";
		  String serialNo="1";
		  try {
			  getFannieMaePage();
			  Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
			  WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
			  HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME),REPOSITORY.getCellDataOnTestCase(serialNo, passWord, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, FanniemaeConstants.L, DEFAULT_SHEET_NAME)); 
			  WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
			  WebElementOperations.park(2);
			  TABLEMANAGEMENT_ACTIONS.tableManagement(testCaseName, serialNo, DEFAULT_SHEET_NAME);
			  HOMEPAGE_ACTIONS.logout(testCaseName);
			  }
		  catch(Exception e){
			  HOMEPAGE_ACTIONS.logout(testCaseName);
			  
		  }
		  
		}
		

	}


