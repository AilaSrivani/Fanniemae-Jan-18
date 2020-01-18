package com.fanniemae.automation.auditTrailTest.model;

import com.fanniemae.automation.auditTrailTest.model.AuditTrailOfChangesInAdministrationWebelements;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class AuditTrailTest {

	public AuditTrailOfChangesInAdministrationWebelements auditTrailOfChangesInAdministrationWebelements;

	public AuditTrailOfChangesInAdministrationWebelements getAuditTrailOfChangesInAdministrationWebelements() {
		return auditTrailOfChangesInAdministrationWebelements;
	}

	public void setAuditTrailOfChangesInAdministrationWebelements(
			AuditTrailOfChangesInAdministrationWebelements auditTrailOfChangesInAdministrationWebelements) {
		this.auditTrailOfChangesInAdministrationWebelements = auditTrailOfChangesInAdministrationWebelements;
	}

	public void init(WebDriver driver) {
		auditTrailOfChangesInAdministrationWebelements = PageFactory.initElements(driver,
				AuditTrailOfChangesInAdministrationWebelements.class);
	}
}