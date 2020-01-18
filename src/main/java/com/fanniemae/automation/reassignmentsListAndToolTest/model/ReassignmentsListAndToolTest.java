package com.fanniemae.automation.reassignmentsListAndToolTest.model;

import com.fanniemae.automation.reassignmentsListAndToolTest.model.ReassignmentsListManagementWebelements;
import com.fanniemae.automation.reassignmentsListAndToolTest.model.ReassignmentstoolWebelements;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class ReassignmentsListAndToolTest {

	public ReassignmentsListManagementWebelements reassignmentsListManagementWebelements;
	public ReassignmentstoolWebelements reassignmentstoolWebelements;

	public ReassignmentsListManagementWebelements getReassignmentsListManagementWebelements() {
		return reassignmentsListManagementWebelements;
	}

	public void setReassignmentsListManagementWebelements(
			ReassignmentsListManagementWebelements reassignmentsListManagementWebelements) {
		this.reassignmentsListManagementWebelements = reassignmentsListManagementWebelements;
	}

	public ReassignmentstoolWebelements getReassignmentstoolWebelements() {
		return reassignmentstoolWebelements;
	}

	public void setReassignmentstoolWebelements(ReassignmentstoolWebelements reassignmentstoolWebelements) {
		this.reassignmentstoolWebelements = reassignmentstoolWebelements;
	}

	public void init(WebDriver driver) {
		reassignmentsListManagementWebelements = PageFactory.initElements(driver,
				ReassignmentsListManagementWebelements.class);
		reassignmentstoolWebelements = PageFactory.initElements(driver, ReassignmentstoolWebelements.class);
	}
}