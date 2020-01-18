package com.fanniemae.automation.profileToHomepageMappingTest.model;

import com.fanniemae.automation.profileToHomepageMappingTest.model.ProfileToHomepageWebelements;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class ProfileToHomepageMappingTest {

	public ProfileToHomepageWebelements profileToHomepageWebelements;

	public ProfileToHomepageWebelements getProfileToHomepageWebelements() {
		return profileToHomepageWebelements;
	}

	public void setProfileToHomepageWebelements(ProfileToHomepageWebelements profileToHomepageWebelements) {
		this.profileToHomepageWebelements = profileToHomepageWebelements;
	}

	public void init(WebDriver driver) {
		profileToHomepageWebelements = PageFactory.initElements(driver, ProfileToHomepageWebelements.class);
	}
}