package com.fanniemae.automation.approvalTest.model;

import com.fanniemae.automation.approvalTest.model.ApprovalWebElements;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class ApprovalTest {

	public ApprovalWebElements approvalWebElements;

	public ApprovalWebElements getApprovalWebElements() {
		return approvalWebElements;
	}

	public void setApprovalWebElements(ApprovalWebElements approvalWebElements) {
		this.approvalWebElements = approvalWebElements;
	}

	public void init(WebDriver driver) {
		approvalWebElements = PageFactory.initElements(driver, ApprovalWebElements.class);
	}
}