package com.fanniemae.automation.Administration.model;

import com.fanniemae.automation.Administration.model.TimeManagementsWebelements;
import com.fanniemae.automation.Administration.model.ContentRepositoryWebelements;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class Administration {

	public TimeManagementsWebelements timeManagementsWebelements;
	public ContentRepositoryWebelements contentRepositoryWebelements;

	public TimeManagementsWebelements getTimeManagementsWebelements() {
		return timeManagementsWebelements;
	}

	public void setTimeManagementsWebelements(TimeManagementsWebelements timeManagementsWebelements) {
		this.timeManagementsWebelements = timeManagementsWebelements;
	}

	public ContentRepositoryWebelements getContentRepositoryWebelements() {
		return contentRepositoryWebelements;
	}

	public void setContentRepositoryWebelements(ContentRepositoryWebelements contentRepositoryWebelements) {
		this.contentRepositoryWebelements = contentRepositoryWebelements;
	}

	public void init(WebDriver driver) {
		timeManagementsWebelements = PageFactory.initElements(driver, TimeManagementsWebelements.class);
		contentRepositoryWebelements = PageFactory.initElements(driver, ContentRepositoryWebelements.class);
	}
}