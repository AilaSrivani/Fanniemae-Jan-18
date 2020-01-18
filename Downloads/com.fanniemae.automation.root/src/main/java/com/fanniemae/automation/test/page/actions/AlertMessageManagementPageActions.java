package com.fanniemae.automation.test.page.actions;

import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;

import com.fanniemae.automation.alertMessageManagementTest.model.AlertMessageManagementTest;
import com.fanniemae.automation.alertMessageManagementTest.model.AlertMessagemgntWebelements;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.dropDownByTextVisibility;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.sendKeys;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.enterByRobot;

public class AlertMessageManagementPageActions {
	private static final Logger LOG = Logger.getLogger(HomePageActions.class.getName());
    private WebDriver driver;
    private AlertMessageManagementTest alert;
    
	public AlertMessageManagementPageActions(AlertMessageManagementTest alert, WebDriver driver){
		super();
		this.driver = driver;
		this.alert=alert;
	}
	private int keywords=FanniemaeConstants.F;
	private int relationObjectType=FanniemaeConstants.G;
	private int priority=FanniemaeConstants.AB;
	private int automatic=FanniemaeConstants.AC;
	private int blocking=FanniemaeConstants.AD;
	private int errorCode=FanniemaeConstants.AE;
	private int name=FanniemaeConstants.AF;
	private int algorithmParameters=FanniemaeConstants.AI;
	private int authorisation=FanniemaeConstants.AJ;
	private int objectType=FanniemaeConstants.AK;
	private int description=FanniemaeConstants.AM;
	
	public void searchAlert(String testcaseName,String serialNo,String sheetName) {
		try {
			click(driver, AlertMessagemgntWebelements.administration);
			park(2);
			click(driver, AlertMessagemgntWebelements.alertMessageMgntHeader);
			park(2);
			sendKeys(driver, AlertMessagemgntWebelements.keywordsBox, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, keywords, sheetName));
			park(2);
			dropDownByTextVisibility(driver, AlertMessagemgntWebelements.objectTypes, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, relationObjectType, sheetName));
			park(2);
			dropDownByTextVisibility(driver, AlertMessagemgntWebelements.priority, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, priority, sheetName));
			park(2);
			dropDownByTextVisibility(driver, AlertMessagemgntWebelements.automatic, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, automatic, sheetName));
			park(2);
			dropDownByTextVisibility(driver, AlertMessagemgntWebelements.blocking, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, blocking, sheetName));
			park(2);
			click(driver, AlertMessagemgntWebelements.searchBox);
			park(2);
			click(driver, AlertMessagemgntWebelements.resetBox);
			park(2);
		}catch(Exception e) {
			LOG.error("Failed to search alert in Alert message management ",e);
		}
	}
	public void createAnAlert(String testcaseName,String serialNo,String sheetName) {
		try {
			click(driver, AlertMessagemgntWebelements.createAnAlert);
			park(2);
			sendKeys(driver, AlertMessagemgntWebelements.errorCode, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, errorCode, sheetName));
			park(2);
			sendKeys(driver, AlertMessagemgntWebelements.name, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, name, sheetName));
			park(2);
			click(driver, AlertMessagemgntWebelements.automaticCheckBox);
			park(2);
			sendKeys(driver, AlertMessagemgntWebelements.sqlQuery, sheetName);
			park(2);
			dropDownByTextVisibility(driver, AlertMessagemgntWebelements.algorithm, sheetName);
			park(4);
			sendKeys(driver, AlertMessagemgntWebelements.algorithmParameters, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, algorithmParameters, sheetName));
			park(2);
			sendKeys(driver, AlertMessagemgntWebelements.authorisation, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, authorisation, sheetName));
			enterByRobot();
			park(2);
			sendKeys(driver, AlertMessagemgntWebelements.objectTypeInAlert, sheetName);
			enterByRobot();
			park(2);
			click(driver, AlertMessagemgntWebelements.blockingCheckBox);
			park(2);
			sendKeys(driver, AlertMessagemgntWebelements.customisedLabel, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, objectType, sheetName));
			park(2);
			dropDownByTextVisibility(driver, AlertMessagemgntWebelements.priorityInAlert, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, priority, sheetName));
			park(2);
			sendKeys(driver, AlertMessagemgntWebelements.description, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, description, sheetName));
		}
		catch(Exception e) {
			LOG.error("Failed to create a alert ",e);
		}
	}
}
