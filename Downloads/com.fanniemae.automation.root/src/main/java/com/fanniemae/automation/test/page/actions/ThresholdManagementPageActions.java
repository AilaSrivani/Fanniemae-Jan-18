package com.fanniemae.automation.test.page.actions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.objectMappingWFTest.model.ObjectMappingWFTest;
import com.fanniemae.automation.objectMappingWFTest.model.ObjectmappingWorkflowWebelements;
import com.fanniemae.automation.test.AbstractTest;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.dropDownByTextVisibility;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.sendKeys;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.enterByRobot;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToFrame;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToDefaultContentFrame;



public class ThresholdManagementPageActions {
	private static final Logger LOG = Logger.getLogger(HomePageActions.class.getName());
    private WebDriver driver;
    private ObjectMappingWFTest objectMappingWFTest;
    
	public ThresholdManagementPageActions(ObjectMappingWFTest objectMappingWFTest, WebDriver driver){
		super();
		this.driver = driver;
		this.objectMappingWFTest=objectMappingWFTest;
	}
	private int keywords=FanniemaeConstants.F;
	private int moduleType=FanniemaeConstants.G;
	private int tableType=FanniemaeConstants.H;
	private int table=FanniemaeConstants.AR;
	private int workflow=FanniemaeConstants.AS;
	private int commodity=FanniemaeConstants.AT;
	private int organisation=FanniemaeConstants.AU;
	private int workflowToBeStarted=FanniemaeConstants.AV;
	private int generateSQL=FanniemaeConstants.AW;

	public void thresholdManagement(String testCaseName,String serialNo,String sheetName) {
		try {
			click(driver, ObjectmappingWorkflowWebelements.administration);
			park(2);
			click(driver, ObjectmappingWorkflowWebelements.thresholdManagementHeader);
			park(2);
			dropDownByTextVisibility(driver, ObjectmappingWorkflowWebelements.module, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, moduleType, sheetName));
			park(2);
			dropDownByTextVisibility(driver, ObjectmappingWorkflowWebelements.table, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, tableType, sheetName));
			park(2);
			click(driver, ObjectmappingWorkflowWebelements.reviewTranslation);
			park(2);
			sendKeys(driver, ObjectmappingWorkflowWebelements.keywordsBox, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, keywords, sheetName));
			park(2);
			sendKeys(driver, ObjectmappingWorkflowWebelements.tableInFilterSection, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, table, sheetName));
			enterByRobot();
			park(2);
			sendKeys(driver, ObjectmappingWorkflowWebelements.workFlow, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, workflow, sheetName));
			enterByRobot();
			park(2);
			sendKeys(driver, ObjectmappingWorkflowWebelements.commodity, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, commodity, sheetName));
			park(2);
			park(2);
			sendKeys(driver, ObjectmappingWorkflowWebelements.organisation, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, organisation, sheetName));
			enterByRobot();
			park(2);
			sendKeys(driver, ObjectmappingWorkflowWebelements.WorkfowToBeStartedObject, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, workflowToBeStarted, sheetName));
            enterByRobot();
			park(2);
			click(driver, ObjectmappingWorkflowWebelements.searchBox);
			park(2);
			click(driver, ObjectmappingWorkflowWebelements.resetBox);
			park(2);
		}catch(Exception e) {
			LOG.error("Failed threshold management ",e);	
		}
	}
	public void generateScriptInObjectMappingWorkflow(String testCaseName, String serialNo, String sheetName) {
		try {
			click(driver, ObjectmappingWorkflowWebelements.generateScript);
			park(2);
			switchToFrame(driver, 0);
			sendKeys(driver, ObjectmappingWorkflowWebelements.generateSQLData, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, generateSQL, sheetName));
			park(2);
			click(driver, ObjectmappingWorkflowWebelements.close);
			park(2);
			switchToDefaultContentFrame(driver);
			park(2);
			click(driver, ObjectmappingWorkflowWebelements.addRow);
			park(2);
			switchToFrame(driver, 0);
			park(2);
			sendKeys(driver, ObjectmappingWorkflowWebelements.workflowInAddRow, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, workflow, sheetName));
			park(2);
//			WebElementOperations.sendKeys(driver, ObjectmappingWorkflowWebelements.tableInAddRow, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, table, sheetName));
//			WebElementOperations.enterByRobot();
//			WebElementOperations.park(2);
			sendKeys(driver, ObjectmappingWorkflowWebelements.organisationInAddrow, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, organisation, sheetName));
			enterByRobot();
			park(2);
			sendKeys(driver, ObjectmappingWorkflowWebelements.commodityInAddrow, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, commodity, sheetName));
			enterByRobot();
			park(2);
		   sendKeys(driver, ObjectmappingWorkflowWebelements.typeInAddrow, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, tableType, sheetName));
			park(2);
			switchToDefaultContentFrame(driver);
			park(2);	
		}
		catch(Exception e){
			LOG.error("Failed to generate script ",e);
		}
}
}