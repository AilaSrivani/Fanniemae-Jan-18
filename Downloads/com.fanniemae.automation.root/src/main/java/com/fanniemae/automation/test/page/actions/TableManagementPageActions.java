package com.fanniemae.automation.test.page.actions;

import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.sendKeys;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;

import com.fanniemae.automation.Administration.model.Administration;
import com.fanniemae.automation.Administration.model.TimeManagementsWebelements;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.dropDownByTextVisibility;

public class TableManagementPageActions {
	private static final Logger LOG = Logger.getLogger(HomePageActions.class.getName());
	
	
	private Administration administration;
	private WebDriver driver;

	public TableManagementPageActions(Administration administration, WebDriver driver){
		super();
		this.administration = administration;
		this.driver = driver;
	}
	private int keywords=FanniemaeConstants.F;
	private int module=FanniemaeConstants.G;
	private int tableType=FanniemaeConstants.H;
	
	
	public void tableManagement(String method,String serialNo, String sheetName) {
      try {
    	  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			park(2);
			 click(driver,TimeManagementsWebelements.administration);
			  park(4);
			 click(driver, TimeManagementsWebelements.timeManagement);
			 park(4);
			sendKeys(driver, TimeManagementsWebelements.keywordsBox, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, keywords, sheetName));
			 park(4);
			  dropDownByTextVisibility(driver, TimeManagementsWebelements.moduleDropDown, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, module, sheetName));
			  park(4);
			  dropDownByTextVisibility(driver, TimeManagementsWebelements.tableType, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, tableType, sheetName));
			  park(4);
			  click(driver, TimeManagementsWebelements.searchBox);
			  park(4);
			 click(driver, TimeManagementsWebelements.resetBox);
			 park(4);
	     }
	catch (Exception e) {
		LOG.error("Failed tableManagement ",e);
		
	}
	}
}


