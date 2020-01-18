package com.fanniemae.automation.loginLogoutTest.model;

import com.fanniemae.automation.loginLogoutTest.model.LogoutWebelements;
import com.fanniemae.automation.loginLogoutTest.model.LoginWebelements;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class LoginLogoutTest {

	public LogoutWebelements logoutWebelements;
	public LoginWebelements loginWebelements;

	public LogoutWebelements getLogoutWebelements() {
		return logoutWebelements;
	}

	public void setLogoutWebelements(LogoutWebelements logoutWebelements) {
		this.logoutWebelements = logoutWebelements;
	}

	public LoginWebelements getLoginWebelements() {
		return loginWebelements;
	}

	public void setLoginWebelements(LoginWebelements loginWebelements) {
		this.loginWebelements = loginWebelements;
	}

	public void init(WebDriver driver) {
		logoutWebelements = PageFactory.initElements(driver, LogoutWebelements.class);
		loginWebelements = PageFactory.initElements(driver, LoginWebelements.class);
	}
}