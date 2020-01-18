package com.fanniemae.automation.searchAndVerifyTest.model;

import com.fanniemae.automation.searchAndVerifyTest.model.SearchAndVerifyWebelements;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class SearchAndVerifyTest {

	public SearchAndVerifyWebelements searchAndVerifyWebelements;

	public SearchAndVerifyWebelements getSearchAndVerifyWebelements() {
		return searchAndVerifyWebelements;
	}

	public void setSearchAndVerifyWebelements(SearchAndVerifyWebelements searchAndVerifyWebelements) {
		this.searchAndVerifyWebelements = searchAndVerifyWebelements;
	}

	public void init(WebDriver driver) {
		searchAndVerifyWebelements = PageFactory.initElements(driver, SearchAndVerifyWebelements.class);
	}
}