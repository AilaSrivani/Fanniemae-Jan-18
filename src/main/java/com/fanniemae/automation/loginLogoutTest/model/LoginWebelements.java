package com.fanniemae.automation.loginLogoutTest.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginWebelements {

	@FindBy(id = "body_x_txtLogin_x_x")
	public static WebElement usernameProcureOne;
	@FindBy(id = "body_x_txtPass_x_x")
	public static WebElement passwordProcureOne;
	@FindBy(xpath = "//input[@name='body:x:btnLogin_btn2']")
	public static WebElement loginProcureOne;
	@FindBy(xpath = "//div[@role='menuitem']/div")
	public static WebElement costCentreList;
}