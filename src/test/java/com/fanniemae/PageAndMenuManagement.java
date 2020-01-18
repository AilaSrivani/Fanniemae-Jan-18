package com.fanniemae;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.loginLogoutTest.model.LoginLogoutTest;
import com.fanniemae.automation.pageMenuManagementTest.model.PageMenuManagementTest;
import com.fanniemae.automation.pageMenuManagementTest.model.PageMenuManagementWebelements;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class PageAndMenuManagement extends AbstractTest{
	private Logger LOG=Logger.getLogger(PageAndMenuManagement.class.getName());
	private int userName=FanniemaeConstants.C;
	private int password=FanniemaeConstants.D;
	private int landingPageTitle=FanniemaeConstants.E;
	private int keywords=FanniemaeConstants.F;
	private int uRL=FanniemaeConstants.T;
	private int module=FanniemaeConstants.G;
	private int description=FanniemaeConstants.AM;
	private int parentPage=FanniemaeConstants.H;
	private int authorisation=FanniemaeConstants.R;
	private int editAuthorisation=FanniemaeConstants.Y;
	private int viewAuthorisation=FanniemaeConstants.Z;
	private int objectType=FanniemaeConstants.AX;
	private int accessType=FanniemaeConstants.AY;
	private int redirectToExternalPage=FanniemaeConstants.AZ;
	private int redirectToMobilePage=FanniemaeConstants.BA;
	private int title=FanniemaeConstants.BB;
	private int mainMenuTitle=FanniemaeConstants.BC;
	private int favoriteTitle=FanniemaeConstants.BD;
	private int displayOrder=FanniemaeConstants.BE;
	private int numberOfRows=FanniemaeConstants.BF;
	private int numbwerOfColumns=FanniemaeConstants.BG;
	private int workflowLaunchMode=FanniemaeConstants.BH;
	private int defaultHeight=FanniemaeConstants.BI;
	private int pageType=FanniemaeConstants.BJ;
	
	static {
		LoginLogoutTest loginLogout=new LoginLogoutTest();
		loginLogout.init(DRIVER);
		
		PageMenuManagementTest pageMenuManagementTest=new PageMenuManagementTest();
		pageMenuManagementTest.init(DRIVER);
		
		HOMEPAGE_ACTIONS=new HomePageActions(loginLogout, DRIVER);
	}
	@Test
	public void alertMsgManagement() {
		String testCaseName="Page and menu management";
		String serialNo="8";
		try {
			    getFannieMaePage();
				Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
				WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
				HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
				WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
				WebElementOperations.park(2);
				WebElementOperations.click(getDriver(), PageMenuManagementWebelements.administration);
				WebElementOperations.park(2);
				WebElementOperations.click(getDriver(), PageMenuManagementWebelements.pageAndMenuManagementHeader);
				WebElementOperations.park(2);
				WebElementOperations.sendKeys(getDriver(), PageMenuManagementWebelements.keywordsBox, REPOSITORY.getCellDataOnTestCase(serialNo, keywords, DEFAULT_SHEET_NAME));
				WebElementOperations.park(2);
				WebElementOperations.dropDownByTextVisibility(getDriver(), PageMenuManagementWebelements.module, REPOSITORY.getCellDataOnTestCase(serialNo, module, DEFAULT_SHEET_NAME));
				WebElementOperations.park(2);
				WebElementOperations.sendKeys(getDriver(), PageMenuManagementWebelements.parentPage, REPOSITORY.getCellDataOnTestCase(serialNo, parentPage, DEFAULT_SHEET_NAME));
				WebElementOperations.enterByRobot();
				WebElementOperations.park(2);
				WebElementOperations.click(getDriver(), PageMenuManagementWebelements.nonSecuredPages);
				WebElementOperations.park(2);
				WebElementOperations.click(getDriver(), PageMenuManagementWebelements.navigationPages);
				WebElementOperations.park(2);
				WebElementOperations.click(getDriver(), PageMenuManagementWebelements.filesDonotExist);
				WebElementOperations.park(2);
				WebElementOperations.sendKeys(getDriver(), PageMenuManagementWebelements.authorisation, REPOSITORY.getCellDataOnTestCase(serialNo, authorisation, DEFAULT_SHEET_NAME));
				WebElementOperations.enterByRobot();
				WebElementOperations.park(2);
				WebElementOperations.click(getDriver(), PageMenuManagementWebelements.searchBox);
				WebElementOperations.park(2);
				WebElementOperations.click(getDriver(), PageMenuManagementWebelements.resetBox);
				WebElementOperations.park(2);
				WebElementOperations.click(getDriver(), PageMenuManagementWebelements.createPage);
				WebElementOperations.park(2);
				WebElementOperations.sendKeys(getDriver(), PageMenuManagementWebelements.uRL, REPOSITORY.getCellDataOnTestCase(serialNo, uRL, DEFAULT_SHEET_NAME));
				WebElementOperations.park(2);
				WebElementOperations.dropDownByTextVisibility(getDriver(), PageMenuManagementWebelements.moduleInCreatePage, REPOSITORY.getCellDataOnTestCase(serialNo, module, DEFAULT_SHEET_NAME));
				WebElementOperations.park(2);
				WebElementOperations.sendKeys(getDriver(), PageMenuManagementWebelements.objectType, REPOSITORY.getCellDataOnTestCase(serialNo, objectType, DEFAULT_SHEET_NAME));
				WebElementOperations.enterByRobot();
				WebElementOperations.park(2);
				WebElementOperations.dropDownByTextVisibility(getDriver(), PageMenuManagementWebelements.pageType, REPOSITORY.getCellDataOnTestCase(serialNo, pageType, DEFAULT_SHEET_NAME));
				WebElementOperations.park(2);
				WebElementOperations.dropDownByTextVisibility(getDriver(), PageMenuManagementWebelements.accessType, REPOSITORY.getCellDataOnTestCase(serialNo, accessType, DEFAULT_SHEET_NAME));
				WebElementOperations.park(2);
				WebElementOperations.click(getDriver(), PageMenuManagementWebelements.mobilePage);
				WebElementOperations.park(2);
				WebElementOperations.sendKeys(getDriver(), PageMenuManagementWebelements.redirectToExternalPage, REPOSITORY.getCellDataOnTestCase(serialNo, redirectToExternalPage, DEFAULT_SHEET_NAME));
				WebElementOperations.enterByRobot();
				WebElementOperations.park(2);
				WebElementOperations.sendKeys(getDriver(), PageMenuManagementWebelements.redirectToMobilePage, REPOSITORY.getCellDataOnTestCase(serialNo, redirectToMobilePage, DEFAULT_SHEET_NAME));
				WebElementOperations.enterByRobot();
				WebElementOperations.park(2);
				WebElementOperations.sendKeys(getDriver(), PageMenuManagementWebelements.title, REPOSITORY.getCellDataOnTestCase(serialNo, title, DEFAULT_SHEET_NAME));
				WebElementOperations.park(2);
				WebElementOperations.sendKeys(getDriver(), PageMenuManagementWebelements.mainMenuTitle, REPOSITORY.getCellDataOnTestCase(serialNo, mainMenuTitle, DEFAULT_SHEET_NAME));
				WebElementOperations.park(2);
				WebElementOperations.sendKeys(getDriver(), PageMenuManagementWebelements.favoriteTitle, REPOSITORY.getCellDataOnTestCase(serialNo, favoriteTitle, DEFAULT_SHEET_NAME));
				WebElementOperations.park(2);
				WebElementOperations.sendKeys(getDriver(), PageMenuManagementWebelements.parentPageInCreatePage, REPOSITORY.getCellDataOnTestCase(serialNo, parentPage, DEFAULT_SHEET_NAME));
				WebElementOperations.enterByRobot();
				WebElementOperations.park(2);
				WebElementOperations.click(getDriver(), PageMenuManagementWebelements.showInNavigation);
				WebElementOperations.park(2);
				WebElementOperations.sendKeys(getDriver(), PageMenuManagementWebelements.displayOrder, REPOSITORY.getCellDataOnTestCase(serialNo, displayOrder, DEFAULT_SHEET_NAME));
				WebElementOperations.park(2);
				WebElementOperations.sendKeys(getDriver(), PageMenuManagementWebelements.viewAuthorisation, REPOSITORY.getCellDataOnTestCase(serialNo, viewAuthorisation, DEFAULT_SHEET_NAME));
				WebElementOperations.enterByRobot();
				WebElementOperations.park(2);
				WebElementOperations.sendKeys(getDriver(), PageMenuManagementWebelements.editAuthorisation, REPOSITORY.getCellDataOnTestCase(serialNo, editAuthorisation, DEFAULT_SHEET_NAME));
				WebElementOperations.enterByRobot();
				WebElementOperations.park(2);
				WebElementOperations.click(getDriver(), PageMenuManagementWebelements.isAWebpart);
				WebElementOperations.park(2);
				WebElementOperations.sendKeys(getDriver(), PageMenuManagementWebelements.numberOfColumns, REPOSITORY.getCellDataOnTestCase(serialNo, numbwerOfColumns, DEFAULT_SHEET_NAME));
				WebElementOperations.park(2);
				WebElementOperations.sendKeys(getDriver(), PageMenuManagementWebelements.numberOfRows, REPOSITORY.getCellDataOnTestCase(serialNo, numberOfRows, DEFAULT_SHEET_NAME));
				WebElementOperations.park(2);
				WebElementOperations.sendKeys(getDriver(), PageMenuManagementWebelements.description, REPOSITORY.getCellDataOnTestCase(serialNo, description, DEFAULT_SHEET_NAME));
				WebElementOperations.park(2);
				WebElementOperations.dropDownByTextVisibility(getDriver(), PageMenuManagementWebelements.workflowLunchMode, REPOSITORY.getCellDataOnTestCase(serialNo, workflowLaunchMode, DEFAULT_SHEET_NAME));
				WebElementOperations.park(2);
				WebElementOperations.click(getDriver(), PageMenuManagementWebelements.pageUsedOnlyAsAControl);
				WebElementOperations.park(2);
				WebElementOperations.sendKeys(getDriver(), PageMenuManagementWebelements.defaultWebpartHeight, REPOSITORY.getCellDataOnTestCase(serialNo, defaultHeight, DEFAULT_SHEET_NAME));
				WebElementOperations.park(2);
				WebElementOperations.click(getDriver(), PageMenuManagementWebelements.enableAuthorisationOnObjects);
				WebElementOperations.park(2);
				WebElementOperations.click(getDriver(), PageMenuManagementWebelements.customizablePage);
				WebElementOperations.park(2);
				WebElementOperations.click(getDriver(), PageMenuManagementWebelements.activateAccessLogs);
				WebElementOperations.park(2);
				WebElementOperations.click(getDriver(), PageMenuManagementWebelements.script);
				WebElementOperations.park(2);
				WebElementOperations.click(getDriver(), PageMenuManagementWebelements.exit);
				WebElementOperations.park(2);
				HOMEPAGE_ACTIONS.logout(testCaseName);
				
		}
		catch(Exception e){
			HOMEPAGE_ACTIONS.logout(testCaseName);
		}
		
	}

}
