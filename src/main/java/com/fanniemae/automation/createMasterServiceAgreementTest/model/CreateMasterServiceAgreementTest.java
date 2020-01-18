package com.fanniemae.automation.createMasterServiceAgreementTest.model;

import com.fanniemae.automation.createMasterServiceAgreementTest.model.CreateMasterServicesAgreementWebelements;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class CreateMasterServiceAgreementTest {

	public CreateMasterServicesAgreementWebelements createMasterServicesAgreementWebelements;

	public CreateMasterServicesAgreementWebelements getCreateMasterServicesAgreementWebelements() {
		return createMasterServicesAgreementWebelements;
	}

	public void setCreateMasterServicesAgreementWebelements(
			CreateMasterServicesAgreementWebelements createMasterServicesAgreementWebelements) {
		this.createMasterServicesAgreementWebelements = createMasterServicesAgreementWebelements;
	}

	public void init(WebDriver driver) {
		createMasterServicesAgreementWebelements = PageFactory.initElements(driver,
				CreateMasterServicesAgreementWebelements.class);
	}
}