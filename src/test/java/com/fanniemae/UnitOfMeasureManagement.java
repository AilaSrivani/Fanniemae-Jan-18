package com.fanniemae;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.jboss.forge.roaster._shade.org.eclipse.jdt.core.dom.rewrite.ITrackedNodePosition;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.loginLogoutTest.model.LoginLogoutTest;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.fanniemae.automation.unitmeasureTest.model.UnitMeasureManagementWebelements;
import com.fanniemae.automation.unitmeasureTest.model.UnitmeasureTest;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class UnitOfMeasureManagement extends AbstractTest {
	private Logger LOG=Logger.getLogger(ThresholdManagement.class.getName());
	private int userName=FanniemaeConstants.C;
	private int passWord=FanniemaeConstants.D;
	private int landingPageTitle=FanniemaeConstants.E;
	private int keywords=FanniemaeConstants.F;
	private int basicUnit=FanniemaeConstants.G;
	private int status=FanniemaeConstants.I;
	private int order=FanniemaeConstants.Q;
	private int code=FanniemaeConstants.U;
	private int label=FanniemaeConstants.V;
	private int name=FanniemaeConstants.AF;
	private int coefValue=FanniemaeConstants.BL;
	
	static{
		LoginLogoutTest loginLogout=new LoginLogoutTest();
		loginLogout.init(DRIVER);
		
		UnitmeasureTest unitmeasureTest=new UnitmeasureTest();
		unitmeasureTest.init(DRIVER);
		
		HOMEPAGE_ACTIONS=new HomePageActions(loginLogout, DRIVER);
	      }
	
	@Test
	public void mainFunction() throws IOException, Exception {
		String testCaseName="Unit of measure management";
		String serialNo="10";
		try {
			getFannieMaePage();
			Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
			WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
			HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, passWord, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
			WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), UnitMeasureManagementWebelements.administration);
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), UnitMeasureManagementWebelements.unitMeasureManagementHeader);
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), UnitMeasureManagementWebelements.keywordsBox, REPOSITORY.getCellDataOnTestCase(serialNo, keywords, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.dropDownByTextVisibility(getDriver(), UnitMeasureManagementWebelements.basicUnit, REPOSITORY.getCellDataOnTestCase(serialNo, basicUnit, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.dropDownByTextVisibility(getDriver(), UnitMeasureManagementWebelements.status, REPOSITORY.getCellDataOnTestCase(serialNo, status, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), UnitMeasureManagementWebelements.searchBox);
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), UnitMeasureManagementWebelements.resetBox);
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), UnitMeasureManagementWebelements.addAUnit);
			WebElementOperations.park(2);
			
			Set<String>allwindows=DRIVER.getWindowHandles();
			int windowscount=allwindows.size();
			
			System.out.println("CountWindows:=="+windowscount);
			
			//By Using Iterator
			Iterator<String>itr=allwindows.iterator();
			
			 String mainwindow=itr.next();
			 String nextwindow=itr.next();
			 
			 //switch window
			 DRIVER.switchTo().window(nextwindow);
			 WebElementOperations.park(2);
			 WebElementOperations.sendKeys(getDriver(), UnitMeasureManagementWebelements.code, REPOSITORY.getCellDataOnTestCase(serialNo, code, DEFAULT_SHEET_NAME));
			 WebElementOperations.park(2);
			 WebElementOperations.sendKeys(getDriver(), UnitMeasureManagementWebelements.name, REPOSITORY.getCellDataOnTestCase(serialNo, name, DEFAULT_SHEET_NAME));
			 WebElementOperations.park(2);
			 WebElementOperations.sendKeys(getDriver(), UnitMeasureManagementWebelements.shortTable, REPOSITORY.getCellDataOnTestCase(serialNo, label, DEFAULT_SHEET_NAME));
			 WebElementOperations.park(2);
			 WebElementOperations.click(getDriver(), UnitMeasureManagementWebelements.reference);
			 WebElementOperations.park(2);
			 WebElementOperations.sendKeys(getDriver(), UnitMeasureManagementWebelements.coefValue, REPOSITORY.getCellDataOnTestCase(serialNo, coefValue, DEFAULT_SHEET_NAME));
			 WebElementOperations.park(2);
			 WebElementOperations.dropDownByTextVisibility(getDriver(), UnitMeasureManagementWebelements.basicUnitInAddAUnit, REPOSITORY.getCellDataOnTestCase(serialNo, basicUnit, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.dropDownByTextVisibility(getDriver(), UnitMeasureManagementWebelements.statusInAddAUnit, REPOSITORY.getCellDataOnTestCase(serialNo, status, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), UnitMeasureManagementWebelements.other, REPOSITORY.getCellDataOnTestCase(serialNo, order, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			//WebElementOperations.click(getDriver(), UnitMeasureManagementWebelements.save);
			DRIVER.close();
			 DRIVER.switchTo().window(mainwindow);
			
			HOMEPAGE_ACTIONS.logout(testCaseName);
		}
		catch(Exception e) {
			performPostExceptionProcess(testCaseName, serialNo, "Unit of measure management is failed", e, DEFAULT_SHEET_NAME);
			
		}
	}

}
