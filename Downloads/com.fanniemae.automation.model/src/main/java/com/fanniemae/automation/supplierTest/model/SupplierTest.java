package com.fanniemae.automation.supplierTest.model;

import com.fanniemae.automation.supplierTest.model.SupplierWebelements;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class SupplierTest {

	public SupplierWebelements supplierWebelements;

	public SupplierWebelements getSupplierWebelements() {
		return supplierWebelements;
	}

	public void setSupplierWebelements(SupplierWebelements supplierWebelements) {
		this.supplierWebelements = supplierWebelements;
	}

	public void init(WebDriver driver) {
		supplierWebelements = PageFactory.initElements(driver, SupplierWebelements.class);
	}
}