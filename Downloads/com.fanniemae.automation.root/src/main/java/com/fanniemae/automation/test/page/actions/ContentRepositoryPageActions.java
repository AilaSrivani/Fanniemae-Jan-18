package com.fanniemae.automation.test.page.actions;

import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.dropDownByTextVisibility;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.sendKeys;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.enterByRobot;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.fanniemae.automation.Administration.model.Administration;
import com.fanniemae.automation.Administration.model.ContentRepositoryWebelements;
import com.fanniemae.automation.Administration.model.TimeManagementsWebelements;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.contentTypesTest.model.ContentTypesWebelements;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.util.PathProvider;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class ContentRepositoryPageActions {
	private static final Logger LOG = Logger.getLogger(HomePageActions.class.getName());
    private WebDriver driver;
    private Administration administration;
    
	public ContentRepositoryPageActions(Administration administration, WebDriver driver){
		super();
		this.driver = driver;
		this.administration=administration;
	}
	public static final String ADD_FILES_EXE = PathProvider.getForTestData()+"/AddFiles.exe";
	private int keywords=FanniemaeConstants.F;
	private int type=FanniemaeConstants.G;
	private int status=FanniemaeConstants.I;
	private int authour=FanniemaeConstants.J;
	private int title=FanniemaeConstants.K;
	private int summary=FanniemaeConstants.L;
	private int Status2=FanniemaeConstants.M;
	private int validateFromDate=FanniemaeConstants.N;
	private int validateToDate=FanniemaeConstants.O;
	private int expiredDelay=FanniemaeConstants.P;
	private int sortOrder=FanniemaeConstants.Q;
	private int authorisation=FanniemaeConstants.R;
	private int reference=FanniemaeConstants.S;
	private int url=FanniemaeConstants.T;
		
		public void SearchingDocumentsInContentRepositpry(String method,String serialNo, String sheetName) {
		      try {
		    	  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
					park(4);
					 click(driver,TimeManagementsWebelements.administration);
					  park(4);
					 click(driver, ContentRepositoryWebelements.contentRepository);
						WebElementOperations.park(2);
					sendKeys(driver, TimeManagementsWebelements.keywordsBox, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, keywords, sheetName));
						WebElementOperations.park(2);
						dropDownByTextVisibility(driver, ContentRepositoryWebelements.type, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, type, sheetName));
						WebElementOperations.park(2);
						dropDownByTextVisibility(driver, ContentRepositoryWebelements.status1, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, status, sheetName));
						WebElementOperations.park(2);
					sendKeys(driver, ContentRepositoryWebelements.author, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, authour, sheetName));
						WebElementOperations.enterByRobot();
					  click(driver, ContentTypesWebelements.searchBox);
					  park(4);
					 click(driver, ContentTypesWebelements.resetBox);
					 park(4);
			     }
			catch (Exception e) {
				LOG.error("Failed to search documents in content repository ",e);
				
			}
			}
		public void creatingNewDocument(String method,String serialNo, String sheetName) {
		      try {
		    	 click(driver, ContentRepositoryWebelements.createNewDocument);
					park(2);
					sendKeys(driver, ContentRepositoryWebelements.title, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, title, sheetName));
					park(2);
					sendKeys(driver, ContentRepositoryWebelements.summary,AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, summary, sheetName));
					park(2);
					dropDownByTextVisibility(driver, ContentRepositoryWebelements.status2, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, Status2, sheetName));
					park(2);
					click(driver, ContentRepositoryWebelements.documentsForDrag);
					park(2);
					Runtime.getRuntime().exec(ADD_FILES_EXE);
					park(2);
					sendKeys(driver, ContentRepositoryWebelements.textBox, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, type, sheetName));
					park(2);
					sendKeys(driver, ContentRepositoryWebelements.validateFromDate, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, validateFromDate, sheetName));
					enterByRobot();
					sendKeys(driver, ContentRepositoryWebelements.validateToDate, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, validateToDate, sheetName));
					enterByRobot();
					sendKeys(driver, ContentRepositoryWebelements.expiredDelay, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, expiredDelay, sheetName));
					park(2);
					sendKeys(driver, ContentRepositoryWebelements.sortOrder, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, sortOrder, sheetName));
					park(2);
					dropDownByTextVisibility(driver, ContentRepositoryWebelements.authorisation, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, authorisation, sheetName));
					park(2);
					sendKeys(driver, ContentRepositoryWebelements.reference, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, reference, sheetName));
					park(2);
					sendKeys(driver, ContentRepositoryWebelements.url, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, url, sheetName));
					park(2);
//					click(driver, ContentRepositoryWebelements.delete);
//					park(2);
//					click(driver, ContentRepositoryWebelements.save);
//					park(2);
//					click(driver, ContentRepositoryWebelements.saveAndPreview);
//					park(2);
//					click(driver, ContentRepositoryWebelements.exit);
		      }
				catch (Exception e) {
					LOG.error("Failed to search documents in content repository ",e);
					
				}
		      }
		
	}
	


