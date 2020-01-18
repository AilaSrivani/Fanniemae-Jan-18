package com.fanniemae.automation.createRequisitionTest.model;

import com.fanniemae.automation.createRequisitionTest.model.CreateRequistionWebelements;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class CreateRequisitionTest {

	public CreateRequistionWebelements createRequistionWebelements;

	public CreateRequistionWebelements getCreateRequistionWebelements() {
		return createRequistionWebelements;
	}

	public void setCreateRequistionWebelements(CreateRequistionWebelements createRequistionWebelements) {
		this.createRequistionWebelements = createRequistionWebelements;
	}

	public void init(WebDriver driver) {
		createRequistionWebelements = PageFactory.initElements(driver, CreateRequistionWebelements.class);
	}
}