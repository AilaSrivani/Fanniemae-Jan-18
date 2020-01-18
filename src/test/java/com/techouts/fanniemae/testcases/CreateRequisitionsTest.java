package com.techouts.fanniemae.testcases;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.dropDownByTextVisibility;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForPageLoad;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.createRequisitionTest.model.CreateRequisitionTest;
import com.fanniemae.automation.createRequisitionTest.model.CreateRequistionWebelements;
import com.fanniemae.automation.loginLogoutTest.model.LoginLogoutTest;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.CreateRequisitionTestPageActions;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.fanniemae.automation.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class CreateRequisitionsTest extends AbstractTest {
	private static final Logger LOG = Logger.getLogger(CreateRequisitionsTest.class.getName());
	private String sheetname = FanniemaeConstants.SHEET_NAME;
	private String requester = null;
	private String basketNo = null;
	private int userName = FanniemaeConstants.G;
	private int password = FanniemaeConstants.H;
	private int landingPageTitle = FanniemaeConstants.K;
	private int userNameCommodity = FanniemaeConstants.T;
	private int passwordCommodity = FanniemaeConstants.U;
	private int corporateHomePageTitle = FanniemaeConstants.V;
	private int status = FanniemaeConstants.I;
	static CreateRequisitionTestPageActions createRequisitionTestPageActions;
	
  static
	{
		CreateRequisitionTest createRequisitionTest=new CreateRequisitionTest();
		createRequisitionTest.init(DRIVER);
		
	    LoginLogoutTest loginLogout=new LoginLogoutTest();
	    loginLogout.init(DRIVER);
	    
		HOMEPAGE_ACTIONS=new HomePageActions(loginLogout, DRIVER);
		
		createRequisitionTestPageActions=new CreateRequisitionTestPageActions(createRequisitionTest, DRIVER);
		
	}
	@Test(priority = 1) 
	public void createSpecialRequestsRequisitions(){
		String testCaseName = "CreateSpecialRequestsRequisitions";
		String serialNo = "1";
	  try {
		  getFannieMaePage();
		  Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo,landingPageTitle, DEFAULT_SHEET_NAME))); 
		  WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
		  Assert.assertTrue(HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME),REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, FanniemaeConstants.L, DEFAULT_SHEET_NAME))); 
		  WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
		  String[] data = createRequisitionTestPageActions.createRequisition(testCaseName, serialNo,DEFAULT_SHEET_NAME); 
		  if(data.length > 1){
			  basketNo = data[0]; 
			  requester=data[1]; 
		  } else{
			  LOG.error("BasketNo or requester name miss"); 
		  }
		  Assert.assertTrue(createRequisitionTestPageActions.addItemDetails(testCaseName, serialNo, requester,DEFAULT_SHEET_NAME),"Fails to add item details");
		  Assert.assertTrue(createRequisitionTestPageActions.costAllocationAndCommentUpdate(testCaseName,serialNo,DEFAULT_SHEET_NAME),"Fails to colst Allocation");
		  WebElementOperations.click(getDriver(),CreateRequistionWebelements.workflow);
		  WebElementOperations.executeJS(getDriver(), FanniemaeConstants.JS_CLICK_SCRIPT, CreateRequistionWebelements.submitForApproval);
		  WebElementOperations.acceptAlert(getDriver());
		  WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName); 
		  Assert.assertTrue(CreateRequistionWebelements.saveButtonMark.isDisplayed());
		  WebElementOperations.click(getDriver(), CreateRequistionWebelements.saveButtonMark);
		  WebElementOperations.click(getDriver(), CreateRequistionWebelements.workflow);
		  HOMEPAGE_ACTIONS.logout(testCaseName);
		  LOG.info("Basket Number:"+basketNo);
		  addPassedTestCaseResult(testCaseName);
	  } catch (Exception e) {
		  performPostExceptionProcess(testCaseName, serialNo, "Failed to Create Requisitions", e, sheetname);
	  } 
  }

	@Test(priority = 2) 
	public void commodityApprovalforSubmittedRequest(){
	  String testCaseName = "CommodityApprovalforSubmittedRequest";
	  String serialNo = "2"; 
	  try {
		  if(basketNo==null)
		  {
			  Assert.assertTrue(false,"Fails to Create Requistion successfully, Sorry! skipping the approval flow"); 
		  }
		  Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo,landingPageTitle, DEFAULT_SHEET_NAME))); 
		  WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
		  HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userNameCommodity, DEFAULT_SHEET_NAME),  REPOSITORY.getCellDataOnTestCase(serialNo, passwordCommodity, DEFAULT_SHEET_NAME),REPOSITORY.getCellDataOnTestCase(serialNo, corporateHomePageTitle, DEFAULT_SHEET_NAME));
		  WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
		  Assert.assertTrue(CreateRequistionWebelements.loginMenu.isDisplayed());
		  WebElementOperations.click(getDriver(),CreateRequistionWebelements.loginMenu);
		  Assert.assertTrue(CreateRequistionWebelements.myOpenWorkflowTasks.isEnabled());
		  WebElementOperations.click(getDriver(), CreateRequistionWebelements.myOpenWorkflowTasks);
		  waitForPageLoad(getDriver(),15);
		  WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
		  park(2);
		  waitForPageLoad(getDriver(),15);
		  dropDownByTextVisibility(getDriver(), CreateRequistionWebelements.status,REPOSITORY.getCellDataOnTestCase(serialNo,status, DEFAULT_SHEET_NAME));
		  park(2);
		  waitForPageLoad(getDriver(),15);
		  Assert.assertTrue(CreateRequistionWebelements.statusButton.isDisplayed());
		  WebElementOperations.click(getDriver(),CreateRequistionWebelements.statusButton);
		  park(2);
		  waitForPageLoad(getDriver(),15);
		//  WebElementOperations.validateGivenDataFromTable(getDriver(), getWebElementFactory().createRequistion.allLables, basketNo);
//		  park(2);
//		  waitForPageLoad(getDriver(),15);
//		  Assert.assertTrue(CreateRequistionWebelements.workflow.isDisplayed());
//		  WebElementOperations.click(getDriver(), CreateRequistionWebelements.workflow);
//		  park(2);
//		  waitForPageLoad(getDriver(),15);
//		  Assert.assertTrue(CreateRequistionWebelements.approveButton.isDisplayed());
//		  WebElementOperations.click(getDriver(), CreateRequistionWebelements.approveButton);
//		  park(2);
//		  waitForPageLoad(getDriver(),15);
//		  Assert.assertTrue(CreateRequistionWebelements.saveButtonMarkC.isDisplayed());
//		  WebElementOperations.click(getDriver(), CreateRequistionWebelements.saveButtonMarkC);
//		  park(2);
//		  waitForPageLoad(getDriver(),15);
//		  Assert.assertTrue(CreateRequistionWebelements.workflow.isDisplayed());
//		  WebElementOperations.click(getDriver(), CreateRequistionWebelements.workflow);
//		  park(2);
		  waitForPageLoad(getDriver(),15);
		  HOMEPAGE_ACTIONS.logout(testCaseName);
		  waitForPageLoad(getDriver(),15);
		  addPassedTestCaseResult(testCaseName);
	  } catch(Exception e) {
		  performPostExceptionProcess(testCaseName, serialNo, "Failed to commodityApprovalforSubmittedRequest", e, sheetname);
		}
	}
	
}