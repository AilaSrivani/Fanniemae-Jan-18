package com.fanniemae.automation.test.page.actions;

import static com.techouts.fanniemae.webelement.ops.WebElementOperations.captureScreenShotOnPass;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.sendKeys;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.verifyPageTitle;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForPageLoad;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fanniemae.automation.loginLogoutTest.model.LoginLogoutTest;
import com.fanniemae.automation.loginLogoutTest.model.LoginWebelements;
import com.fanniemae.automation.loginLogoutTest.model.LogoutWebelements;
import com.fanniemae.automation.util.Assert;
import com.fanniemae.automation.util.PathProvider;
import com.techouts.fanniemae.exceptions.FannieMaeBusinessException;



/**
 * 
 * @author TO-WVLD-12
 *
 */
public class HomePageActions {
	
	private static final Logger LOG = Logger.getLogger(HomePageActions.class.getName());
	public static final String ADD_FILES_EXE = PathProvider.getForTestData()+"/AddFiles.exe";
	private LoginLogoutTest loginLogout;
	private WebDriver driver;

	public HomePageActions(LoginLogoutTest loginLogout, WebDriver driver){
		super();
		this.loginLogout = loginLogout;
		this.driver = driver;
	}
	
	public boolean login(String username,String password,String pageTitle){
		try {
			sendKeys(driver, LoginWebelements.usernameProcureOne, username);
			park(0.5);
			sendKeys(driver, LoginWebelements.passwordProcureOne, password);
			park(0.5);
			click(driver, LoginWebelements.loginProcureOne);
			waitForPageLoad(driver,15);
			Assert.assertTrue(verifyPageTitle(driver, pageTitle),"Page title is not matched with expected title.");
			return true;
		} catch (Exception e) {
			LOG.error("Login failed");
			return false;
		}
	}
	
	public void autoSuggestionHandle(WebElement inputBox, String inputText ){
		try {
			sendKeys(driver, inputBox,inputText);
			park(2);
			click(driver, LoginWebelements.costCentreList);
		} catch (Exception e) {
			LOG.error("Failed to select a value from AutoFill suggestion");
		}
	}
	public boolean logout(String testCaseName){
		try {
			click(driver, LogoutWebelements.loginMenu);
			park(2);
			captureScreenShotOnPass(driver, testCaseName);
			click(driver, LogoutWebelements.logOutButton);
			park(2);
			waitForPageLoad(driver, 15);
			captureScreenShotOnPass(driver, testCaseName);
			return true;
		} catch (Exception e) {
			throw new FannieMaeBusinessException("unable to perform logout operation in TestCase["+testCaseName+"].");
		}
	}
	
	
	
	
}