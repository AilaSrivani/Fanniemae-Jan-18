package com.techouts.fanniemae.testcases;

import static com.techouts.fanniemae.webelement.ops.WebElementOperations.captureScreenShotOnPass;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.executeJS;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.verifyPageTitle;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForPageLoad;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.webElementHighlighter;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.fanniemae.automation.approvalTest.model.ApprovalTest;
import com.fanniemae.automation.approvalTest.model.ApprovalWebElements;
import com.fanniemae.automation.approvalWorkflowTest.model.ApprovalWorkFlowWebelements;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.createMasterServiceAgreementTest.model.CreateMasterServiceAgreementTest;
import com.fanniemae.automation.loginLogoutTest.model.LoginLogoutTest;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.CreateMasterServiceAgreementPageActions;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.fanniemae.automation.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class CreateContractMasterServicesAgreement extends AbstractTest {
	private static final Logger LOG = Logger.getLogger(CreateContractMasterServicesAgreement.class.getName());
	
	private int userName = FanniemaeConstants.G;
	private int password = FanniemaeConstants.H;
	private int landingPageTitle = FanniemaeConstants.K;
	private int homePageTitle = FanniemaeConstants.L;
	
	static CreateMasterServiceAgreementPageActions createMasterServiceAgreementPageActions;
	
	static {
		LoginLogoutTest loginLogout=new LoginLogoutTest();
		loginLogout.init(DRIVER);
		
		ApprovalTest approvalTest=new ApprovalTest();
		approvalTest.init(DRIVER);
		
		CreateMasterServiceAgreementTest createMasterServiceAgreementTest=new CreateMasterServiceAgreementTest();
		createMasterServiceAgreementTest.init(DRIVER);
		
		createMasterServiceAgreementPageActions=new CreateMasterServiceAgreementPageActions(createMasterServiceAgreementTest, DRIVER);
		HOMEPAGE_ACTIONS=new HomePageActions(loginLogout, DRIVER);
	}
	
	
	@Test(priority = 5)
	public void createContractMasterServicesAgreement() {
		String testCaseNumber = "5";
		String testCaseName = "createContractMasterServicesAgreement";
		try {
			getFannieMaePage();
			Assert.assertTrue(verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(testCaseNumber, landingPageTitle, DEFAULT_SHEET_NAME)));
			captureScreenShotOnPass(getDriver(), testCaseNumber);
			Assert.assertTrue(HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(testCaseNumber, userName, DEFAULT_SHEET_NAME),
					REPOSITORY.getCellDataOnTestCase(testCaseNumber, password, DEFAULT_SHEET_NAME),
					REPOSITORY.getCellDataOnTestCase(testCaseNumber, homePageTitle, DEFAULT_SHEET_NAME)),"Login to the application failed");
			captureScreenShotOnPass(getDriver(), testCaseName);
			createMasterServiceAgreementPageActions.createMasterServicesAgreement(testCaseName, testCaseNumber,DEFAULT_SHEET_NAME);
			webElementHighlighter(getDriver(),ApprovalWebElements.saveButton);
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT,ApprovalWebElements.saveButton);
			park(2);
			waitForPageLoad(getDriver(), 15);
			
			webElementHighlighter(getDriver(),ApprovalWebElements.contractTeamSet);
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT,ApprovalWebElements.contractTeamSet);
			park(2);
			waitForPageLoad(getDriver(), 15);
			Assert.assertTrue(ApprovalWebElements.saveButtonMarkC.isDisplayed());
			WebElementOperations.click(getDriver(), ApprovalWebElements.saveButtonMarkC);
			Assert.assertTrue(ApprovalWebElements.approveButton.isDisplayed());
			click(getDriver(), ApprovalWebElements.approveButton);
			HOMEPAGE_ACTIONS.logout(testCaseName);
			addPassedTestCaseResult(testCaseName);
			LOG.info("Successfully create contract Master services Agreement");
		} catch (Exception e) {
			performPostExceptionProcess(testCaseName, testCaseNumber, "contractMasterServicesAgreement has failed", e, getDefaultConfiguredWorkbookSheetName());
		}
	}
	
}
