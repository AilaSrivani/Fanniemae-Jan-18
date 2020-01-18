package com.fanniemae.automation.loginLogoutTest.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutWebelements {

	@FindBy(id = "aLoginMenu")
	public static WebElement loginMenu;
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	public static WebElement logOutButton;
}