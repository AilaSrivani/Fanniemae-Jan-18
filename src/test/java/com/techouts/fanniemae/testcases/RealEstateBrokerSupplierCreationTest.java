package com.techouts.fanniemae.testcases;

import static com.techouts.fanniemae.webelement.ops.WebElementOperations.acceptAlertIfPresent;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.captureScreenShotOnPass;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.dropDownByTextVisibility;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.executeJS;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.getTimeStamp;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.sendKeys;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToDefaultContentFrame;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToFrame;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.verifyPageTitle;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForPageLoad;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.webElementHighlighter;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.fanniemae.automation.approvalWorkflowTest.model.ApprovalWorkFlowWebelements;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.loginLogoutTest.model.LoginLogoutTest;
import com.fanniemae.automation.realEstateBrokerTest.model.RealEstateBrokerTest;
import com.fanniemae.automation.realEstateBrokerTest.model.RealEstateBrokerWebelements;
import com.fanniemae.automation.supplierTest.model.SupplierWebelements;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.fanniemae.automation.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class RealEstateBrokerSupplierCreationTest extends AbstractTest {
	
	private static final Logger LOG = Logger.getLogger(RealEstateBrokerSupplierCreationTest.class.getName());
	private int userName = FanniemaeConstants.G;
	private int password = FanniemaeConstants.H;
	private int landingPageTitle = FanniemaeConstants.K;
	private int homePageTitle = FanniemaeConstants.L;
	private int supplierType= FanniemaeConstants.AD;
	private int legalName= FanniemaeConstants.AF;
	private int addressLine1= FanniemaeConstants.AG;
	private int city= FanniemaeConstants.AH;
	private int zip= FanniemaeConstants.AI;
	private int state= FanniemaeConstants.AJ;
	private int country= FanniemaeConstants.AK;
	private static int additional = FanniemaeConstants.AN;
	private int equatorId= FanniemaeConstants.AY;
	CorporateSupplierCreationTest corporateSupplierCreationTest;
	static {
		LoginLogoutTest loginLogout=new LoginLogoutTest();
		loginLogout.init(DRIVER);
		
		RealEstateBrokerTest realEstateBrokerTest=new RealEstateBrokerTest();
		realEstateBrokerTest.init(DRIVER);
		

		
		HOMEPAGE_ACTIONS = new HomePageActions(loginLogout,DRIVER);
	}
	
	@Test(priority = 4)
	public void createRealEstateBrokerSupplier() {
		String testCaseNumber = "4";
		String testCaseName = "CreateRealEstateBrokerSupplier";
		corporateSupplierCreationTest=new CorporateSupplierCreationTest();
		try {
			getFannieMaePage();
			String legalNameUpdate=REPOSITORY.getCellDataOnTestCase(testCaseNumber, legalName, DEFAULT_SHEET_NAME);
		  	Assert.assertTrue(verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(testCaseNumber, landingPageTitle, DEFAULT_SHEET_NAME)));
			captureScreenShotOnPass(getDriver(), testCaseName);
			Assert.assertTrue(HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(testCaseNumber, userName, DEFAULT_SHEET_NAME),
					REPOSITORY.getCellDataOnTestCase(testCaseNumber, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(testCaseNumber, homePageTitle, DEFAULT_SHEET_NAME)));
			captureScreenShotOnPass(getDriver(), testCaseName);
			Assert.assertTrue(mainInfoDetailsOfRealEstateBroker(testCaseName, testCaseNumber, legalNameUpdate),"Fails to add Main Info Details due to issue");
			Assert.assertTrue(additionalInfoOfRealEstateBroker(testCaseName,testCaseNumber),"Fails during add additional information");
			waitForPageLoad(getDriver(),15);
			String email="test"+getTimeStamp(FanniemaeConstants.DDMMYYHHMMSSSSS)+"@testing.com";
			corporateSupplierCreationTest.contactInfoForCreateSupplier2(testCaseName,testCaseNumber,"BPC","Test",email);
			park(2);
			supplierContactManagement(testCaseName,email,"12345");
			dropDownByTextVisibility(getDriver(),RealEstateBrokerWebelements.supplierRole ,"Broker Assistant / Backup");
			park(0.5);
			dropDownByTextVisibility(getDriver(), RealEstateBrokerWebelements.supplierRole, "Broker Primary Contact");
			webElementHighlighter(getDriver(), RealEstateBrokerWebelements.createSupplierSaveButton);
			//executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, RealEstateBroker.createSupplierSaveButton);
			park(2);
			waitForPageLoad(getDriver(), 15);
			email="test"+getTimeStamp(FanniemaeConstants.DDMMYYHHMMSSSSS)+"@testing.com";;
			corporateSupplierCreationTest.contactInfoForCreateSupplier2(testCaseName,testCaseNumber,"BO","Test",email);
			park(2);
			supplierContactManagement(testCaseName,email,"12345");
			park(0.5);
			dropDownByTextVisibility(getDriver(), RealEstateBrokerWebelements.supplierRole2, "MLA Signer");
			park(0.5);
			dropDownByTextVisibility(getDriver(), RealEstateBrokerWebelements.supplierRole2, "Broker / Owner");
			park(0.5);
			dropDownByTextVisibility(getDriver(), RealEstateBrokerWebelements.supplierRole2, "Main RFx contact");
			captureScreenShotOnPass(getDriver(), testCaseName);
			webElementHighlighter(getDriver(), RealEstateBrokerWebelements.createSupplierSaveButton);
			park(2);
			waitForPageLoad(getDriver(), 15);
			//executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, RealEstateBroker.createSupplierSaveButton);
			approvalWorkflowForRealEstateBroker(testCaseName);
			click(getDriver(), RealEstateBrokerWebelements.mainInfoTab);
			park(1);
			waitForPageLoad(getDriver(), 15);
			webElementHighlighter(getDriver(), RealEstateBrokerWebelements.supplierId);
			String supplierId=RealEstateBrokerWebelements.supplierId.getText();
			LOG.info("Supplier ID is "+supplierId);
			park(1);
			//Assert.assertTrue(HOMEPAGE_ACTIONS.searchAndVerifyCreatedOne(testCaseName,testCaseNumber, supplierId, DEFAULT_SHEET_NAME),"After create supplier search and find supplier fails");
			HOMEPAGE_ACTIONS.logout(testCaseName);
			addPassedTestCaseResult(testCaseName);
		} catch (Exception e) {
			String msg = "TestCase["+testCaseName+"] has failed.";
			LOG.error(msg,e);
			performPostExceptionProcess(testCaseName, testCaseNumber, msg, e, getDefaultConfiguredWorkbookSheetName());
		}
	}
	
	public boolean clickOnThreeDotsAndSelectData(String testCaseName,WebElement button,String searchText){
		try {
			click(getDriver(),button);
			switchToFrame(getDriver(), 0);
			captureScreenShotOnPass(getDriver(), testCaseName);
			sendKeys(getDriver(),RealEstateBrokerWebelements.createSupplierBankInfoSearchBox,searchText);
			click(getDriver(),RealEstateBrokerWebelements.createSupplierBankInfoSearchBtn);
			click(getDriver(),RealEstateBrokerWebelements.createSupplierBankInfoClickOnResult);
			switchToDefaultContentFrame(getDriver());
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	private boolean mainInfoDetailsOfRealEstateBroker(String testCaseName, String testCaseNumber, String legalNameUpdate){
		try {
			//Navigate corporate
			Assert.assertTrue(RealEstateBrokerWebelements.createSupplierSupplierLink.isDisplayed());
			click(getDriver(),RealEstateBrokerWebelements.createSupplierSupplierLink);
			click(getDriver(), RealEstateBrokerWebelements.createSupplierLink);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			
			//create Corporate
			dropDownByTextVisibility(getDriver(), RealEstateBrokerWebelements.createSupplierSupplierType, REPOSITORY.getCellDataOnTestCase(testCaseNumber, supplierType, DEFAULT_SHEET_NAME));
			park(4);
			waitForPageLoad(getDriver(), 15);
			park(4);
			sendKeys(getDriver(),RealEstateBrokerWebelements.createSupplierLegalName,legalNameUpdate);
			sendKeys(getDriver(),RealEstateBrokerWebelements.createSupplierMainSupplierAddressNameAdditional,"Test Address");
			sendKeys(getDriver(),RealEstateBrokerWebelements.createSupplierAddressLine1,REPOSITORY.getCellDataOnTestCase(testCaseNumber, addressLine1, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),RealEstateBrokerWebelements.createSupplierCity,REPOSITORY.getCellDataOnTestCase(testCaseNumber, city, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),RealEstateBrokerWebelements.createSupplierZip,REPOSITORY.getCellDataOnTestCase(testCaseNumber, zip, DEFAULT_SHEET_NAME));
			HOMEPAGE_ACTIONS.autoSuggestionHandle(RealEstateBrokerWebelements.createSupplierState, REPOSITORY.getCellDataOnTestCase(testCaseNumber, state, DEFAULT_SHEET_NAME));
			dropDownByTextVisibility(getDriver(), RealEstateBrokerWebelements.createSupplierCountry, REPOSITORY.getCellDataOnTestCase(testCaseNumber, country, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),RealEstateBrokerWebelements.createSupplierRealEstateBrokerEquatorIdEVID,REPOSITORY.getCellDataOnTestCase(testCaseNumber, equatorId, DEFAULT_SHEET_NAME));
			click(getDriver(), RealEstateBrokerWebelements.createSupplierRealEstateBrokerUsingWeb);
			Assert.assertTrue(RealEstateBrokerWebelements.createSupplierRealEstateBrokerIsPayable.isDisplayed());
			click(getDriver(), RealEstateBrokerWebelements.createSupplierRealEstateBrokerIsPayable);
			captureScreenShotOnPass(getDriver(), testCaseName);
			webElementHighlighter(getDriver(),RealEstateBrokerWebelements.createSupplierSaveButton);
			//executeJS(getDriver(), FanniemaeConstants.JS_CLICK_SCRIPT, RealEstateBroker.createSupplierSaveButton);
			return true;
		}
		catch (Exception e) 
		{
			LOG.error("Fails to add main info details fo Real Estate Broker Suppler");
			return false;
		}
	}
	private boolean approvalWorkflowForRealEstateBroker(String testCaseName){
		try {
			//ApprovalWorkflowTab
			Assert.assertTrue(RealEstateBrokerWebelements.createSupplierApprovalWorkflowTab.isDisplayed());
			click(getDriver(), RealEstateBrokerWebelements.createSupplierApprovalWorkflowTab);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			Assert.assertTrue(RealEstateBrokerWebelements.createSupplierSaveButton.isDisplayed());
			Assert.assertTrue(RealEstateBrokerWebelements.exitButton.isDisplayed());
			Assert.assertTrue(RealEstateBrokerWebelements.createSupplierApprovalWorkflowSubmitForDiligence.isDisplayed());
			//waitForElementPresence(getDriver(), getWebElementFactory().realEstateBroker.createSupplierApprovalWorkflowSubmitForDiligence, 15);
			Assert.assertTrue(RealEstateBrokerWebelements.createSupplierApprovalWorkflowSubmitForDiligence.isDisplayed());
			click(getDriver(), RealEstateBrokerWebelements.createSupplierApprovalWorkflowSubmitForDiligence);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			Assert.assertTrue(RealEstateBrokerWebelements.createSupplierApprovalWorkflowSubmitToWorkflow.isDisplayed());
			click(getDriver(), RealEstateBrokerWebelements.createSupplierApprovalWorkflowSubmitToWorkflow);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			Assert.assertTrue(RealEstateBrokerWebelements.createSupplierApprovalWorkflowSubmitToWorkflow.isDisplayed());
			
			click(getDriver(), RealEstateBrokerWebelements.createSupplierRealEstateBrokerContinueOnBoarding);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), RealEstateBrokerWebelements.createSupplierRealEstateBrokerProfileDocumentUpdate);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), RealEstateBrokerWebelements.createSupplierRealEstateBrokerApprove);
			park(2);
			
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), RealEstateBrokerWebelements.createSupplierRealEstateBrokerNoFindings);
			park(2);
			
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), RealEstateBrokerWebelements.createSupplierRealEstateBrokerTraxUpdated);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), RealEstateBrokerWebelements.createSupplierRealEstateBrokerProcureOneUpdated);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), RealEstateBrokerWebelements.createSupplierRealEstateBrokerACHInformationUpdated);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), RealEstateBrokerWebelements.createSupplierRealEstateBrokerApproveFinal);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			sendKeys(getDriver(), RealEstateBrokerWebelements.createSupplierRealEstateBrokerReason, "Test");
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), RealEstateBrokerWebelements.createSupplierRealEstateBrokerReasonConfirm);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean additionalInfoOfRealEstateBroker(String testCaseName,String testCaseNumber){
		try {
			//Additional info
			Assert.assertTrue(RealEstateBrokerWebelements.createSupplierAdditionalInfoTab.isDisplayed());
			click(getDriver(),RealEstateBrokerWebelements.createSupplierAdditionalInfoTab);
			captureScreenShotOnPass(getDriver(), testCaseName);
			//validate
			Assert.assertTrue(RealEstateBrokerWebelements.createSupplierSaveButton.isDisplayed());
			Assert.assertTrue(RealEstateBrokerWebelements.exitButton.isDisplayed());
			//Address
		    sendKeys(getDriver(),RealEstateBrokerWebelements.createSupplierNameAdditional, REPOSITORY.getCellDataOnTestCase(testCaseNumber, additional, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),RealEstateBrokerWebelements.createSupplierAddInfoAddressLine1,REPOSITORY.getCellDataOnTestCase(testCaseNumber, addressLine1, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),RealEstateBrokerWebelements.createSupplierAddInfoCity, REPOSITORY.getCellDataOnTestCase(testCaseNumber, city, DEFAULT_SHEET_NAME));
			sendKeys(getDriver(),RealEstateBrokerWebelements.createSupplierAddInfoZip, REPOSITORY.getCellDataOnTestCase(testCaseNumber, zip, DEFAULT_SHEET_NAME));
			HOMEPAGE_ACTIONS.autoSuggestionHandle(RealEstateBrokerWebelements.createSupplierAddInfoState,REPOSITORY.getCellDataOnTestCase(testCaseNumber, state, DEFAULT_SHEET_NAME));
			dropDownByTextVisibility(getDriver(),RealEstateBrokerWebelements.createSupplierAddInfoCountry,REPOSITORY.getCellDataOnTestCase(testCaseNumber, country, DEFAULT_SHEET_NAME));
			captureScreenShotOnPass(getDriver(), testCaseName);
			webElementHighlighter(getDriver(), RealEstateBrokerWebelements.createSupplierSaveButton);
	    executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, RealEstateBrokerWebelements.createSupplierSaveButton);
			return true;
		} catch (Exception e) {
			
			return false;
		}
	}
	
	private boolean supplierContactManagement(String testCaseName,String email,String pass){
		try {
		executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, RealEstateBrokerWebelements.createSupplierSaveButton);

		    park(3);
			click(getDriver(), RealEstateBrokerWebelements.superLoginIcon);
			park(2);
			switchToDefaultContentFrame(getDriver());
			park(2);
			switchToFrame(getDriver(), 1);
			
			sendKeys(getDriver(),RealEstateBrokerWebelements.superLoginlogin, email);
			sendKeys(getDriver(), RealEstateBrokerWebelements.superLoginpassword,pass);
			webElementHighlighter(getDriver(), RealEstateBrokerWebelements.createSupplierContactInfoSaveAndClose);
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, RealEstateBrokerWebelements.createSupplierContactInfoSaveAndClose);
			try {
				acceptAlertIfPresent(getDriver(), 3);
				LOG.info("Alert present");
			} catch (Exception e) {
				LOG.info("Alert is not present");
			}
			park(2);
			switchToDefaultContentFrame(getDriver());
			switchToFrame(getDriver(), 0);
			click(getDriver(), RealEstateBrokerWebelements.regenaratePasswordButton);
			park(2);
			switchToDefaultContentFrame(getDriver());
			switchToFrame(getDriver(), 1);
			click(getDriver(), RealEstateBrokerWebelements.regenaratepassword);
			park(2);
			WebElementOperations.click(getDriver(), RealEstateBrokerWebelements.saveButtonMarkC);
			click(getDriver(), RealEstateBrokerWebelements.regenaratePasswordClose);
			park(4);
			switchToDefaultContentFrame(getDriver());
			switchToFrame(getDriver(), 0);
			webElementHighlighter(getDriver(), RealEstateBrokerWebelements.createSupplierContactInfoSaveAndClose);
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, RealEstateBrokerWebelements.createSupplierContactInfoSaveAndClose);
			park(2);
			switchToDefaultContentFrame(getDriver());			
			park(5);
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
