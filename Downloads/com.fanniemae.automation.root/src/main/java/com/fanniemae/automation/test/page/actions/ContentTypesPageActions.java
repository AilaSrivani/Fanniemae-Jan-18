package com.fanniemae.automation.test.page.actions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;


import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.contentTypesTest.model.ContentTypesTest;
import com.fanniemae.automation.contentTypesTest.model.ContentTypesWebelements;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.util.PathProvider;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.sendKeys;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.dropDownByTextVisibility;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.enterByRobot;


public class ContentTypesPageActions {
	
	private static Logger LOG=Logger.getLogger(ContentTypesPageActions.class.getName());
	 private WebDriver driver;
	    private ContentTypesTest contentTypesTest;
	    
		public ContentTypesPageActions(ContentTypesTest contentTypesTest, WebDriver driver){
			super();
			this.driver = driver;
			this.contentTypesTest=contentTypesTest;
		}
		public static final String ADD_FILES_EXE = PathProvider.getForTestData()+"/AddFiles.exe";
		private int keywords=FanniemaeConstants.F;		
		private int RelationType=FanniemaeConstants.G;
		private int code=FanniemaeConstants.U;
		private int label=FanniemaeConstants.V;
		private int defaultValidityPeriod=FanniemaeConstants.W;
		private int defaultExpirationNotice=FanniemaeConstants.X;
		
		private int creationEditionAuthorization =FanniemaeConstants.Y;
		private int visualizationAuthorization =FanniemaeConstants.Z;
		private int administrationAuthorization =FanniemaeConstants.AA;
		public void contentTypes(String method,String serialNo, String sheetName) {
		      try {
		    	click(driver, ContentTypesWebelements.administration);
					park(2);
					click(driver, ContentTypesWebelements.contentTypeHeader);
					park(2);
					sendKeys(driver, ContentTypesWebelements.keywordsBox,AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, keywords, sheetName));
					park(2);
					dropDownByTextVisibility(driver, ContentTypesWebelements.relationType, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, RelationType, sheetName));
					park(2);
				   click(driver, ContentTypesWebelements.onlyTemplates);
				  park(2);
				  click(driver, ContentTypesWebelements.resetBox);
				  park(2);
				   click(driver, ContentTypesWebelements.searchBox);
				   park(2);
		      }
				catch (Exception e) {
					LOG.error("Failed to search documents in content types ",e);
					}
				}
		public void addADocumentInContentTypes(String method,String serialNo, String sheetName) {
			try {
			click(driver, ContentTypesWebelements.addANewDocumentType);
			  park(2);
			   sendKeys(driver, ContentTypesWebelements.code, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, code, sheetName));
			  park(2);
			   sendKeys(driver, ContentTypesWebelements.label, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, label, sheetName));
			   park(2);
			   sendKeys(driver, ContentTypesWebelements.defaultValidityPeriod, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, defaultValidityPeriod, sheetName));
			   park(2);
			   sendKeys(driver, ContentTypesWebelements.defaultExpirationNotice, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, defaultExpirationNotice, sheetName));
			  park(2);
			  sendKeys(driver, ContentTypesWebelements.creationEditionAuthorisation, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, creationEditionAuthorization, sheetName));
			  enterByRobot();
			  park(2);
			  sendKeys(driver, ContentTypesWebelements.visualAuthorisation, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, visualizationAuthorization, sheetName));
			  enterByRobot();
			  park(2);
			  sendKeys(driver, ContentTypesWebelements.administrationAuthorisation, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, administrationAuthorization, sheetName));
			  enterByRobot();
			 park(2);
			  click(driver, ContentTypesWebelements.versionisedCheckBox);
			  park(2);
			  click(driver, ContentTypesWebelements.detailedSetUpCheckBox);
			  park(2);
			 click(driver, ContentTypesWebelements.logHitsCheckBox);
			  park(2);
			 click(driver, ContentTypesWebelements.templateCheckBox);
			  park(2);
			  click(driver, ContentTypesWebelements.sharedDraftCheckBox);
			  WebElementOperations.park(2);
			  WebElementOperations.click(driver, ContentTypesWebelements.displayOnLoginScreenCheckBox);
			  WebElementOperations.park(2);
			 // WebElementOperations.click(getDriver(), ContentTypesWebelements.save);
			  WebElementOperations.click(driver, ContentTypesWebelements.exit);
		}
		catch (Exception e) {
			LOG.error("Failed to add a documents in content types ",e);
			}
		}
		}
		      
	
	

