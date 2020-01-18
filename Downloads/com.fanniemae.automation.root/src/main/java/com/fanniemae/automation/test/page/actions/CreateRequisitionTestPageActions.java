package com.fanniemae.automation.test.page.actions;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.captureScreenShotOnPass;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.dropDownByTextVisibility;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.getAttributeValue;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.getText;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.sendKeys;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToDefaultContentFrame;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToFrame;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForElementClickable;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForPageLoad;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.createRequisitionTest.model.CreateRequisitionTest;
import com.fanniemae.automation.createRequisitionTest.model.CreateRequistionWebelements;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.util.Assert;
import com.fanniemae.automation.util.PathProvider;

public class CreateRequisitionTestPageActions {
	
     private static final Logger LOG = Logger.getLogger(HomePageActions.class.getName());
		public static final String ADD_FILES_EXE = PathProvider.getForTestData()+"/AddFiles.exe";
		private WebDriver driver = null;
		private CreateRequisitionTest createRequisitionTest;
		
		public CreateRequisitionTestPageActions(CreateRequisitionTest createRequisitionTest, WebDriver driver) {
			super();
			this.createRequisitionTest = createRequisitionTest;
			this.driver = driver;
		}
		
		private static int pRWatchers = FanniemaeConstants.C;
		private static int itemDescription = FanniemaeConstants.M;
		private static int itemPrice = FanniemaeConstants.N;
		private static int itemQuantity = FanniemaeConstants.O;
		private static int gLAccount = FanniemaeConstants.P;
		private static int costCentre = FanniemaeConstants.Q;
		private static int requisitionName = FanniemaeConstants.R;
		private static int justification = FanniemaeConstants.S;
		private static int unitOfMeasure = FanniemaeConstants.W;
		private static int peopleSoftProjectID = FanniemaeConstants.AC;

		
		
		public String[] createRequisition(String method,String serialNo, String sheetName){
			try {
				driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
				park(3);
				Assert.assertTrue(CreateRequistionWebelements.procurement.isDisplayed());
				click(driver,CreateRequistionWebelements.procurement);
				park(2);
				Assert.assertTrue(CreateRequistionWebelements.createRequisition.isDisplayed());
				click(driver, CreateRequistionWebelements.createRequisition);
				captureScreenShotOnPass(driver, method);
				park(2);
				waitForPageLoad(driver, 15);
				sendKeys(driver, CreateRequistionWebelements.requisitionName, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo,requisitionName, sheetName));
				String requester = getAttributeValue(driver, CreateRequistionWebelements.headerInformationRequester);
				park(2);
				sendKeys(driver, CreateRequistionWebelements.headerInformationPRWatchers,  AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo,pRWatchers, sheetName));
				park(2);
				sendKeys(driver, CreateRequistionWebelements.justification, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo,justification, sheetName));
				//park(5);
				waitForElementClickable(driver, 10, CreateRequistionWebelements.costCentreList);
				click(driver,CreateRequistionWebelements.costCentreList);
				//Attaching documents
				try {
				if(CreateRequistionWebelements.clickDragToAddFiles.isDisplayed());
				click(driver, CreateRequistionWebelements.clickDragToAddFiles);
				captureScreenShotOnPass(driver, method);
				park(2);
				Runtime.getRuntime().exec(ADD_FILES_EXE);
				park(4);
				}
				catch(Exception e) {
					LOG.error("Failed to Upload(Add) files",e);
				}
				
				click(driver, CreateRequistionWebelements.saveButton);
				park(2);
				Assert.assertTrue(CreateRequistionWebelements.backToCatalog.isDisplayed());
				Assert.assertTrue(CreateRequistionWebelements.otherOptions.isDisplayed());
				click(driver,CreateRequistionWebelements.otherOptions);
				Assert.assertTrue(CreateRequistionWebelements.duplicatePR.isDisplayed());
				Assert.assertTrue(CreateRequistionWebelements.exportItem.isDisplayed());
				Assert.assertTrue(CreateRequistionWebelements.importItems.isDisplayed());
				Assert.assertTrue(CreateRequistionWebelements.cancelRequisition.isDisplayed());
				return new String[]{getText(driver, CreateRequistionWebelements.basketNo) , requester};	
			} catch (Exception e) {
				LOG.error("Failed to create Requisition ",e);
				return new String[] {null};
			}
		}
		
		public boolean addItemDetails(String method,String serialNo,String requester, String sheetName){
			try {
				park(2);
				Assert.assertTrue(CreateRequistionWebelements.addItem.isEnabled());
				click(driver, CreateRequistionWebelements.addItem);
				park(2);
				captureScreenShotOnPass(driver, method);
				switchToFrame(driver, 0);
				//Validations
				Assert.assertTrue(CreateRequistionWebelements.saveButton.isEnabled());
				Assert.assertTrue(CreateRequistionWebelements.saveAndNew.isDisplayed());
				Assert.assertTrue(CreateRequistionWebelements.saveandCloseButton.isEnabled());
				Assert.assertTrue(CreateRequistionWebelements.saveButton.isDisplayed());
				Assert.assertTrue(CreateRequistionWebelements.reset.isEnabled());
				Assert.assertTrue(CreateRequistionWebelements.closeButton.isDisplayed());
				sendKeys(driver, CreateRequistionWebelements.itemDescription, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, itemDescription, sheetName));
				park(2);
				sendKeys(driver, CreateRequistionWebelements.itemPrice, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, itemPrice, sheetName));
				park(2);
				sendKeys(driver, CreateRequistionWebelements.itemQuantity, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, itemQuantity, sheetName));
				park(2);
				dropDownByTextVisibility(driver, CreateRequistionWebelements.unitOfMeasure, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, unitOfMeasure, sheetName));
				park(2);
				click(driver, CreateRequistionWebelements.categoryButton);
				park(2);
				captureScreenShotOnPass(driver, method);
				switchToDefaultContentFrame(driver);
				switchToFrame(driver, 1);
				click(driver, CreateRequistionWebelements.labelIcon);
				park(2);
				switchToDefaultContentFrame(driver);
				switchToFrame(driver, 0);
				park(2);
				captureScreenShotOnPass(driver, method);
				return true;
			} catch (Exception e) {
				LOG.info("Fails to add item details");
				return false;
			}
		}
		
		public boolean costAllocationAndCommentUpdate(String method,String serialNo, String sheetName){
			try {
				click(driver, CreateRequistionWebelements.labelSaveButton);
				park(3);
				waitForPageLoad(driver,10);
				switchToDefaultContentFrame(driver);
				switchToFrame(driver, 0);
				captureScreenShotOnPass(driver, method);
				//Validate reset allocation button will appear in the top after clicking on save button
				Assert.assertTrue(CreateRequistionWebelements.glAccountButton.isDisplayed());
				click(driver, CreateRequistionWebelements.glAccountButton);
				park(2);
				switchToDefaultContentFrame(driver);
				park(2);
				switchToFrame(driver, 1);
				park(2);
				captureScreenShotOnPass(driver, method);
				park(2);
				sendKeys(driver, CreateRequistionWebelements.accountSelectionKeyWords, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, gLAccount, sheetName));
				park(2);
			    click(driver, CreateRequistionWebelements.accountSelectionSearch);
				captureScreenShotOnPass(driver, method);
				park(4);
				click(driver, CreateRequistionWebelements.accountSelectionLabelIcon);
				park(4);
				switchToDefaultContentFrame(driver);
				park(2);
				switchToFrame(driver, 0);
				park(2);
				Assert.assertTrue(CreateRequistionWebelements.resetAllocation.isDisplayed());
				sendKeys(driver, CreateRequistionWebelements.costCenter, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, costCentre, sheetName));
				//park(4);
				waitForElementClickable(driver, 15, CreateRequistionWebelements.costCentreList);
				park(2);
				Assert.assertTrue(CreateRequistionWebelements.costCentreList.isDisplayed());
				click(driver, CreateRequistionWebelements.costCentreList);
				waitForPageLoad(driver,10);
				park(4);
				sendKeys(driver, CreateRequistionWebelements.peopleSoftProjectID, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, peopleSoftProjectID, sheetName));
				//park(4);
				waitForElementClickable(driver, 15, CreateRequistionWebelements.costCentreList);
				park(2);
				click(driver, CreateRequistionWebelements.costCentreList);
				waitForPageLoad(driver,10);
				park(2);
				captureScreenShotOnPass(driver, method);
				park(4);
				click(driver, CreateRequistionWebelements.saveandCloseButton);
				park(4);
				waitForPageLoad(driver,10);
				captureScreenShotOnPass(driver, method);
				park(2);
				switchToDefaultContentFrame(driver);
				return true;
			} catch (Exception e) {
				LOG.error("Fails to add comment or Cost Allocation");
				return false;
			}
		}

	

}
