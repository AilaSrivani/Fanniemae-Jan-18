package com.fanniemae.automation.reportingindicatorManagementTest.model;

import com.fanniemae.automation.reportingindicatorManagementTest.model.ReportingIndicatorManagementWebelements;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class ReportingindicatorManagementTest {

	public ReportingIndicatorManagementWebelements reportingIndicatorManagementWebelements;

	public ReportingIndicatorManagementWebelements getReportingIndicatorManagementWebelements() {
		return reportingIndicatorManagementWebelements;
	}

	public void setReportingIndicatorManagementWebelements(
			ReportingIndicatorManagementWebelements reportingIndicatorManagementWebelements) {
		this.reportingIndicatorManagementWebelements = reportingIndicatorManagementWebelements;
	}

	public void init(WebDriver driver) {
		reportingIndicatorManagementWebelements = PageFactory.initElements(driver,
				ReportingIndicatorManagementWebelements.class);
	}
}