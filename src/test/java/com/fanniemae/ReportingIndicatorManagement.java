package com.fanniemae;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.omg.CORBA.RepositoryIdHelper;
import org.testng.annotations.Test;

import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.loginLogoutTest.model.LoginLogoutTest;
import com.fanniemae.automation.reportingindicatorManagementTest.model.ReportingIndicatorManagementWebelements;
import com.fanniemae.automation.reportingindicatorManagementTest.model.ReportingindicatorManagementTest;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class ReportingIndicatorManagement extends AbstractTest {
	private Logger LOG=Logger.getLogger(PageAndMenuManagement.class.getName());
	private int userName=FanniemaeConstants.C;
	private int password=FanniemaeConstants.D;
	private int landingPageTitle=FanniemaeConstants.E;
	private int keywords=FanniemaeConstants.F;
	private int module=FanniemaeConstants.G;
	private int domain=FanniemaeConstants.BP;
	private int calculateFormula=FanniemaeConstants.BQ;
	private int calculateFormulaBox=FanniemaeConstants.BR;
	private int viewAuthorisation=FanniemaeConstants.AJ;
	private int type=FanniemaeConstants.H;
	private int order=FanniemaeConstants.Q;
	static {
		LoginLogoutTest loginLogout=new LoginLogoutTest();
		loginLogout.init(DRIVER);
		
		ReportingindicatorManagementTest reportingindicatorManagementTest=new ReportingindicatorManagementTest();
		reportingindicatorManagementTest.init(DRIVER);
		
		HOMEPAGE_ACTIONS=new HomePageActions(loginLogout, DRIVER);
	}
	@Test
	public void alertMsgManagement() {
		String testCaseName="Reporting Indicator Management";
		String serialNo="12";
		try {
			getFannieMaePage();
			Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
			WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
			HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
			WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), ReportingIndicatorManagementWebelements.administration);
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), ReportingIndicatorManagementWebelements.reportingIndicatorManagementHeader);
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), ReportingIndicatorManagementWebelements.domain, REPOSITORY.getCellDataOnTestCase(serialNo, domain, DEFAULT_SHEET_NAME));
			WebElementOperations.enterByRobot();
			WebElementOperations.sendKeys(getDriver(), ReportingIndicatorManagementWebelements.keywordsBox, REPOSITORY.getCellDataOnTestCase(serialNo, keywords, DEFAULT_SHEET_NAME));
			WebElementOperations.enterByRobot();
			WebElementOperations.dropDownByTextVisibility(getDriver(), ReportingIndicatorManagementWebelements.module, REPOSITORY.getCellDataOnTestCase(serialNo, module, DEFAULT_SHEET_NAME));
			WebElementOperations.enterByRobot();
			WebElementOperations.click(getDriver(), ReportingIndicatorManagementWebelements.searchBox);
			WebElementOperations.enterByRobot();
			WebElementOperations.click(getDriver(), ReportingIndicatorManagementWebelements.resetBox);
			WebElementOperations.enterByRobot();
			WebElementOperations.click(getDriver(), ReportingIndicatorManagementWebelements.addANewIndicator);
			WebElementOperations.enterByRobot();
			WebElementOperations.sendKeys(getDriver(), ReportingIndicatorManagementWebelements.calculateFormula, REPOSITORY.getCellDataOnTestCase(serialNo, calculateFormula, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), ReportingIndicatorManagementWebelements.calculateFormulaBox, REPOSITORY.getCellDataOnTestCase(serialNo, calculateFormulaBox, DEFAULT_SHEET_NAME));
			WebElementOperations.enterByRobot();
			WebElementOperations.park(2);
			WebElementOperations.dropDownByTextVisibility(getDriver(), ReportingIndicatorManagementWebelements.type, REPOSITORY.getCellDataOnTestCase(serialNo, type, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			//WebElementOperations.sendKeys(getDriver(), ReportingIndicatorManagementWebelements.co, token);
			WebElementOperations.sendKeys(getDriver(), ReportingIndicatorManagementWebelements.order, REPOSITORY.getCellDataOnTestCase(serialNo, order, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), ReportingIndicatorManagementWebelements.viewAuthorisation, REPOSITORY.getCellDataOnTestCase(serialNo, viewAuthorisation, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			

    }catch(Exception e) {
	
      }
	}
}
