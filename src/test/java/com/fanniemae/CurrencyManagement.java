package com.fanniemae;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.currencyManagementTest.model.CurrencyConversion;
import com.fanniemae.automation.currencyManagementTest.model.CurrencyManagementTest;
import com.fanniemae.automation.currencyManagementTest.model.CurrencyManagementWebelements;
import com.fanniemae.automation.loginLogoutTest.model.LoginLogoutTest;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.HomePageActions;


import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class CurrencyManagement extends AbstractTest {
	private Logger LOG=Logger.getLogger(ThresholdManagement.class.getName());
	private int userName=FanniemaeConstants.C;
	private int passWord=FanniemaeConstants.D;
	private int landingPageTitle=FanniemaeConstants.E;
	private int keywords=FanniemaeConstants.F;
	private int currency=FanniemaeConstants.G;
	private int status=FanniemaeConstants.I;
	private int order=FanniemaeConstants.Q;
	private int code=FanniemaeConstants.U;
	private int label=FanniemaeConstants.V;
	private int name=FanniemaeConstants.AF;
	private int coefValue=FanniemaeConstants.BL;
	private int targetCurrency=FanniemaeConstants.BM;
	private int year=FanniemaeConstants.BN;
	private int period=FanniemaeConstants.BO;
	
	
	
	
	static{
		LoginLogoutTest loginLogout=new LoginLogoutTest();
		loginLogout.init(DRIVER);
		
		CurrencyManagementTest currrencyManagementTest=new CurrencyManagementTest();
		currrencyManagementTest.init(DRIVER);
		
		HOMEPAGE_ACTIONS=new HomePageActions(loginLogout, DRIVER);
	      }
	
	
	String testCaseName="Currency Management and Currency Conversion";
	String serialNo="11";
	@Test
	public void mainFunction() throws IOException, Exception {
	  try {
			getFannieMaePage();
			Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
			WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
			HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, passWord, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
			WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), CurrencyManagementWebelements.administration);
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), CurrencyManagementWebelements.currencyManagementHeader);
			WebElementOperations.park(2);
			WebElementOperations.sendKeys(getDriver(), CurrencyManagementWebelements.keywordsBox, REPOSITORY.getCellDataOnTestCase(serialNo, keywords, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.dropDownByTextVisibility(getDriver(), CurrencyManagementWebelements.basicCurrency, REPOSITORY.getCellDataOnTestCase(serialNo, currency, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.dropDownByTextVisibility(getDriver(), CurrencyManagementWebelements.status, REPOSITORY.getCellDataOnTestCase(serialNo, status, DEFAULT_SHEET_NAME));
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), CurrencyManagementWebelements.searchBox);
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), CurrencyManagementWebelements.resetBox);
			WebElementOperations.park(2);
			WebElementOperations.click(getDriver(), CurrencyManagementWebelements.addACurrency);
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
			 WebElementOperations.sendKeys(getDriver(), CurrencyManagementWebelements.code, REPOSITORY.getCellDataOnTestCase(serialNo, code, DEFAULT_SHEET_NAME));
			 WebElementOperations.park(2);
			 WebElementOperations.sendKeys(getDriver(), CurrencyManagementWebelements.name, REPOSITORY.getCellDataOnTestCase(serialNo, name, DEFAULT_SHEET_NAME));
			 WebElementOperations.park(2);
			 WebElementOperations.sendKeys(getDriver(), CurrencyManagementWebelements.shortTable, REPOSITORY.getCellDataOnTestCase(serialNo, label, DEFAULT_SHEET_NAME));
			 WebElementOperations.park(2);
			 WebElementOperations.sendKeys(getDriver(), CurrencyManagementWebelements.coefValue, REPOSITORY.getCellDataOnTestCase(serialNo, coefValue, DEFAULT_SHEET_NAME));
			 WebElementOperations.park(2);
			 WebElementOperations.dropDownByTextVisibility(getDriver(), CurrencyManagementWebelements.basicCurrencyInAddACurrency, REPOSITORY.getCellDataOnTestCase(serialNo, currency, DEFAULT_SHEET_NAME));
			 WebElementOperations.park(2);
			 WebElementOperations.dropDownByTextVisibility(getDriver(), CurrencyManagementWebelements.statusInAddACurrency, REPOSITORY.getCellDataOnTestCase(serialNo, status, DEFAULT_SHEET_NAME));
			 WebElementOperations.park(2);
			 WebElementOperations.sendKeys(getDriver(), CurrencyManagementWebelements.order, REPOSITORY.getCellDataOnTestCase(serialNo, order, DEFAULT_SHEET_NAME));
			 WebElementOperations.park(2);
			  DRIVER.close();
			 DRIVER.switchTo().window(mainwindow);
			
			HOMEPAGE_ACTIONS.logout(testCaseName);
		}
		catch(Exception e) {
			performPostExceptionProcess(testCaseName, serialNo, "Currency management", e, DEFAULT_SHEET_NAME);
			}
	}
	@Test(priority=1)
	public void currencyConversion() {
		 try {
				getFannieMaePage();
				Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
				WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
				HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, passWord, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME));
				WebElementOperations.captureScreenShotOnPass(getDriver(), testCaseName);
				WebElementOperations.park(2);
				WebElementOperations.click(getDriver(), CurrencyManagementWebelements.administration);
				WebElementOperations.park(2);
				WebElementOperations.click(getDriver(), CurrencyConversion.currencyConversionHeader);
				WebElementOperations.sendKeys(getDriver(), CurrencyManagementWebelements.keywordsBox, REPOSITORY.getCellDataOnTestCase(serialNo, keywords, DEFAULT_SHEET_NAME));
				WebElementOperations.park(2);
				WebElementOperations.dropDownByTextVisibility(getDriver(), CurrencyConversion.targetCurrency, REPOSITORY.getCellDataOnTestCase(serialNo, targetCurrency, DEFAULT_SHEET_NAME));
				WebElementOperations.park(2);
				WebElementOperations.dropDownByTextVisibility(getDriver(), CurrencyConversion.year, REPOSITORY.getCellDataOnTestCase(serialNo, year, DEFAULT_SHEET_NAME));
				WebElementOperations.park(2);
				WebElementOperations.dropDownByTextVisibility(getDriver(), CurrencyConversion.period, REPOSITORY.getCellDataOnTestCase(serialNo, period, DEFAULT_SHEET_NAME));
				WebElementOperations.park(2);
				WebElementOperations.click(getDriver(), CurrencyConversion.filledxRatesOnly);
				WebElementOperations.park(2);
				WebElementOperations.click(getDriver(), CurrencyConversion.notFilledxRatesOnly);
				WebElementOperations.park(2);
				WebElementOperations.click(getDriver(), CurrencyManagementWebelements.searchBox);
				WebElementOperations.park(2);
				WebElementOperations.click(getDriver(), CurrencyManagementWebelements.resetBox);
				WebElementOperations.park(2);
				HOMEPAGE_ACTIONS.logout(testCaseName);
		 }catch(Exception e) {
			 performPostExceptionProcess(testCaseName, serialNo, "Currency management", e, DEFAULT_SHEET_NAME);
		 }
		
	}

}
