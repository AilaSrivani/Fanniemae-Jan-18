package com.fanniemae.automation.test.page.actions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;


import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.workflowManagementTest.model.WorkflowManagementTest;
import com.fanniemae.automation.workflowManagementTest.model.WorkflowManagementWebelements;

import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.sendKeys;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.enterByRobot;

public class WorkflowManagementPageActions {
	private static final Logger LOG = Logger.getLogger(HomePageActions.class.getName());
    private WebDriver driver;
    private WorkflowManagementTest workflowManagementTest;
    
	public WorkflowManagementPageActions(WorkflowManagementTest workflowManagementTest, WebDriver driver){
		super();
		this.driver = driver;
		this.workflowManagementTest=workflowManagementTest;
	}
	private int keywords=FanniemaeConstants.F;
	 private int objectType=FanniemaeConstants.AK;
	 private int workflowProcessCode=FanniemaeConstants.AN;
	 private int workflowLabel=FanniemaeConstants.AO;
	
	
	public void workflowManagement(String testCaseName,String serialNo, String sheetName) {
		try {
			 click(driver,WorkflowManagementWebelements.administration);
			 park(2);
			 click(driver, WorkflowManagementWebelements.workflowManagementHeader);
			 park(2);
			 sendKeys(driver, WorkflowManagementWebelements.keywordsBox, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, keywords, sheetName));
			 park(2);
			sendKeys(driver, WorkflowManagementWebelements.objectType, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, objectType, sheetName));
			 enterByRobot();
			park(2);
			click(driver, WorkflowManagementWebelements.searchBox);
			park(2);
			click(driver, WorkflowManagementWebelements.resetBox);
			 park(2);
			click(driver, WorkflowManagementWebelements.newWorkFlow);
			 park(2);
			sendKeys(driver, WorkflowManagementWebelements.workflowProcessCode, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, workflowProcessCode, sheetName));
			park(2);
			 click(driver, WorkflowManagementWebelements.automaticValidationCheckBox);
			park(2);
			 sendKeys(driver, WorkflowManagementWebelements.workflowLabel, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, workflowLabel, sheetName));
			 park(2);
			sendKeys(driver, WorkflowManagementWebelements.objectTypeInWorkflow, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, objectType, sheetName));
			 enterByRobot();
			park(2);
			// WebElementOperations.click(getDriver(), WorkflowManagementWebelements.save);
			 park(2);
			click(driver, WorkflowManagementWebelements.exit);
			park(2);
		}catch(Exception e) {
			LOG.error("Failed workflow Management ",e);
		}
	}
}
