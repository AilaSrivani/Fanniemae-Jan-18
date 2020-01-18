package com.fanniemae.automation.scheduledManagementTest.model;

import com.fanniemae.automation.scheduledManagementTest.model.ScheduledProcessManagementWebelements;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class ScheduledManagementTest {

	public ScheduledProcessManagementWebelements scheduledProcessManagementWebelements;

	public ScheduledProcessManagementWebelements getScheduledProcessManagementWebelements() {
		return scheduledProcessManagementWebelements;
	}

	public void setScheduledProcessManagementWebelements(
			ScheduledProcessManagementWebelements scheduledProcessManagementWebelements) {
		this.scheduledProcessManagementWebelements = scheduledProcessManagementWebelements;
	}

	public void init(WebDriver driver) {
		scheduledProcessManagementWebelements = PageFactory.initElements(driver,
				ScheduledProcessManagementWebelements.class);
	}
}