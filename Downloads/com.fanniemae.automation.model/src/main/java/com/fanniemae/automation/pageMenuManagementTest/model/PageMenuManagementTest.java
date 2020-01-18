package com.fanniemae.automation.pageMenuManagementTest.model;

import com.fanniemae.automation.pageMenuManagementTest.model.PageMenuManagementWebelements;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class PageMenuManagementTest {

	public PageMenuManagementWebelements pageMenuManagementWebelements;

	public PageMenuManagementWebelements getPageMenuManagementWebelements() {
		return pageMenuManagementWebelements;
	}

	public void setPageMenuManagementWebelements(PageMenuManagementWebelements pageMenuManagementWebelements) {
		this.pageMenuManagementWebelements = pageMenuManagementWebelements;
	}

	public void init(WebDriver driver) {
		pageMenuManagementWebelements = PageFactory.initElements(driver, PageMenuManagementWebelements.class);
	}
}