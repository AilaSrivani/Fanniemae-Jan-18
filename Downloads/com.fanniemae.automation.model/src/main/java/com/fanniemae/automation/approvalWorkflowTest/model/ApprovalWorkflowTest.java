package com.fanniemae.automation.approvalWorkflowTest.model;

import com.fanniemae.automation.approvalWorkflowTest.model.ApprovalWorkFlowWebelements;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class ApprovalWorkflowTest {

	public ApprovalWorkFlowWebelements approvalWorkFlowWebelements;

	public ApprovalWorkFlowWebelements getApprovalWorkFlowWebelements() {
		return approvalWorkFlowWebelements;
	}

	public void setApprovalWorkFlowWebelements(ApprovalWorkFlowWebelements approvalWorkFlowWebelements) {
		this.approvalWorkFlowWebelements = approvalWorkFlowWebelements;
	}

	public void init(WebDriver driver) {
		approvalWorkFlowWebelements = PageFactory.initElements(driver, ApprovalWorkFlowWebelements.class);
	}
}