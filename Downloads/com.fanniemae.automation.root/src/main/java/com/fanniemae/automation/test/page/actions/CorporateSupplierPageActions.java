package com.fanniemae.automation.test.page.actions;

import static com.techouts.fanniemae.webelement.ops.WebElementOperations.captureScreenShotOnPass;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.dropDownByTextVisibility;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.sendKeys;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForPageLoad;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.searchAndVerifyTest.model.SearchAndVerifyTest;
import com.fanniemae.automation.searchAndVerifyTest.model.SearchAndVerifyWebelements;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.util.PathProvider;


public class CorporateSupplierPageActions {

private static final Logger LOG = Logger.getLogger(HomePageActions.class.getName());
public static final String ADD_FILES_EXE = PathProvider.getForTestData()+"/AddFiles.exe";
private SearchAndVerifyTest searchAndVerifyTest;
private WebDriver driver = null;

public CorporateSupplierPageActions(SearchAndVerifyTest searchAndVerifyTest, WebDriver driver) {
	super();
	this.searchAndVerifyTest = searchAndVerifyTest;
	this.driver = driver;
}
private static int supplierType = FanniemaeConstants.AD;

public boolean searchAndVerifyCreatedOne(String testCaseName,String testCaseNumber,String legalNameUpdate, String sheetName){
	try {
		park(3);
		waitForPageLoad(driver, 15);
		park(2);
		click(driver, SearchAndVerifyWebelements.createSupplierSupplierLink);
		park(0.5);
		click(driver, SearchAndVerifyWebelements.createSupplierBrowseSuppliers);
		park(2);
		captureScreenShotOnPass(driver, testCaseName);
		park(3);
		waitForPageLoad(driver, 15);
		park(2);
		click(driver, SearchAndVerifyWebelements.createSupplierStatusCroseMark);
		park(2);
		dropDownByTextVisibility(driver, SearchAndVerifyWebelements.searchSupplierSupplierType,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, supplierType, sheetName));
		sendKeys(driver, SearchAndVerifyWebelements.searchSupplierSearchKeyword, legalNameUpdate);
		park(2);
		click(driver, SearchAndVerifyWebelements.searchSupplierSearchButton);
		park(2);
		waitForPageLoad(driver, 15);
		captureScreenShotOnPass(driver, testCaseName);
		//Assert.assertTrue(corporaterSearch(driver, SearchAndVerifyWebelements.searchSupplierResultGridSupplierId, legalNameUpdate),"Search operation fails");
		park(3);
		waitForPageLoad(driver, 15);
		//click(driver, SearchAndVerifyWebelements.getCreateSupplierExitButton());
		return true;
	} catch (Exception e) {
		LOG.debug("search and verify failed");
		return false;
	}
}


}

