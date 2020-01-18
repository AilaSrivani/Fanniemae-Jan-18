package com.fanniemae.automation.workflowManagementTest.model;

import com.fanniemae.automation.workflowManagementTest.model.WorkflowManagementWebelements;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class WorkflowManagementTest {

	public WorkflowManagementWebelements workflowManagementWebelements;

	public WorkflowManagementWebelements getWorkflowManagementWebelements() {
		return workflowManagementWebelements;
	}

	public void setWorkflowManagementWebelements(WorkflowManagementWebelements workflowManagementWebelements) {
		this.workflowManagementWebelements = workflowManagementWebelements;
	}

	public void init(WebDriver driver) {
		workflowManagementWebelements = PageFactory.initElements(driver, WorkflowManagementWebelements.class);
	}
}