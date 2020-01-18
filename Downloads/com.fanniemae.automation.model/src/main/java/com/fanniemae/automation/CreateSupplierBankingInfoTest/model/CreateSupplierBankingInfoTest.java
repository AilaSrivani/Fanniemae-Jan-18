package com.fanniemae.automation.CreateSupplierBankingInfoTest.model;

import com.fanniemae.automation.CreateSupplierBankingInfoTest.model.CreateSupplierBankingInfoWebelements;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class CreateSupplierBankingInfoTest {

	public CreateSupplierBankingInfoWebelements createSupplierBankingInfoWebelements;

	public CreateSupplierBankingInfoWebelements getCreateSupplierBankingInfoWebelements() {
		return createSupplierBankingInfoWebelements;
	}

	public void setCreateSupplierBankingInfoWebelements(
			CreateSupplierBankingInfoWebelements createSupplierBankingInfoWebelements) {
		this.createSupplierBankingInfoWebelements = createSupplierBankingInfoWebelements;
	}

	public void init(WebDriver driver) {
		createSupplierBankingInfoWebelements = PageFactory.initElements(driver,
				CreateSupplierBankingInfoWebelements.class);
	}
}