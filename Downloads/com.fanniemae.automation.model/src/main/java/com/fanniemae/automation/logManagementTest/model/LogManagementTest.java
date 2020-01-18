package com.fanniemae.automation.logManagementTest.model;

import com.fanniemae.automation.logManagementTest.model.LogManagementWebelements;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class LogManagementTest {

	public LogManagementWebelements logManagementWebelements;

	public LogManagementWebelements getLogManagementWebelements() {
		return logManagementWebelements;
	}

	public void setLogManagementWebelements(LogManagementWebelements logManagementWebelements) {
		this.logManagementWebelements = logManagementWebelements;
	}

	public void init(WebDriver driver) {
		logManagementWebelements = PageFactory.initElements(driver, LogManagementWebelements.class);
	}
}