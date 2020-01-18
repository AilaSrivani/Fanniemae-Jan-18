package com.fanniemae.automation.unitmeasureTest.model;

import com.fanniemae.automation.unitmeasureTest.model.UnitMeasureManagementWebelements;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class UnitmeasureTest {

	public UnitMeasureManagementWebelements unitMeasureManagementWebelements;

	public UnitMeasureManagementWebelements getUnitMeasureManagementWebelements() {
		return unitMeasureManagementWebelements;
	}

	public void setUnitMeasureManagementWebelements(UnitMeasureManagementWebelements unitMeasureManagementWebelements) {
		this.unitMeasureManagementWebelements = unitMeasureManagementWebelements;
	}

	public void init(WebDriver driver) {
		unitMeasureManagementWebelements = PageFactory.initElements(driver, UnitMeasureManagementWebelements.class);
	}
}