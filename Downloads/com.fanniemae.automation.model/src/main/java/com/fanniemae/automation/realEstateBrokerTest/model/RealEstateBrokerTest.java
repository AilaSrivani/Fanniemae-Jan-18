package com.fanniemae.automation.realEstateBrokerTest.model;

import com.fanniemae.automation.realEstateBrokerTest.model.RealEstateBrokerWebelements;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class RealEstateBrokerTest {

	public RealEstateBrokerWebelements realEstateBrokerWebelements;

	public RealEstateBrokerWebelements getRealEstateBrokerWebelements() {
		return realEstateBrokerWebelements;
	}

	public void setRealEstateBrokerWebelements(RealEstateBrokerWebelements realEstateBrokerWebelements) {
		this.realEstateBrokerWebelements = realEstateBrokerWebelements;
	}

	public void init(WebDriver driver) {
		realEstateBrokerWebelements = PageFactory.initElements(driver, RealEstateBrokerWebelements.class);
	}
}