package com.fanniemae.automation.alertMessageManagementTest.model;

import com.fanniemae.automation.alertMessageManagementTest.model.AlertMessagemgntWebelements;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class AlertMessageManagementTest {

	public AlertMessagemgntWebelements alertMessagemgntWebelements;

	public AlertMessagemgntWebelements getAlertMessagemgntWebelements() {
		return alertMessagemgntWebelements;
	}

	public void setAlertMessagemgntWebelements(AlertMessagemgntWebelements alertMessagemgntWebelements) {
		this.alertMessagemgntWebelements = alertMessagemgntWebelements;
	}

	public void init(WebDriver driver) {
		alertMessagemgntWebelements = PageFactory.initElements(driver, AlertMessagemgntWebelements.class);
	}
}