package com.fanniemae.automation.contentTypesTest.model;

import com.fanniemae.automation.contentTypesTest.model.ContentTypesWebelements;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class ContentTypesTest {

	public ContentTypesWebelements contentTypesWebelements;

	public ContentTypesWebelements getContentTypesWebelements() {
		return contentTypesWebelements;
	}

	public void setContentTypesWebelements(ContentTypesWebelements contentTypesWebelements) {
		this.contentTypesWebelements = contentTypesWebelements;
	}

	public void init(WebDriver driver) {
		contentTypesWebelements = PageFactory.initElements(driver, ContentTypesWebelements.class);
	}
}