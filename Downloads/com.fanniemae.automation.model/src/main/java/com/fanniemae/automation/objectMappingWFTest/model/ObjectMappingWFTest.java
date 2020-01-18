package com.fanniemae.automation.objectMappingWFTest.model;

import com.fanniemae.automation.objectMappingWFTest.model.ObjectmappingWorkflowWebelements;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class ObjectMappingWFTest {

	public ObjectmappingWorkflowWebelements objectmappingWorkflowWebelements;

	public ObjectmappingWorkflowWebelements getObjectmappingWorkflowWebelements() {
		return objectmappingWorkflowWebelements;
	}

	public void setObjectmappingWorkflowWebelements(ObjectmappingWorkflowWebelements objectmappingWorkflowWebelements) {
		this.objectmappingWorkflowWebelements = objectmappingWorkflowWebelements;
	}

	public void init(WebDriver driver) {
		objectmappingWorkflowWebelements = PageFactory.initElements(driver, ObjectmappingWorkflowWebelements.class);
	}
}