package com.fanniemae.automation.jobLevelBrowseManagementTest.model;

import com.fanniemae.automation.jobLevelBrowseManagementTest.model.JobLevelBrowseManagementWebelements;
import com.fanniemae.automation.jobLevelBrowseManagementTest.model.statusupdate;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class JobLevelBrowseManagementTest {

	public JobLevelBrowseManagementWebelements jobLevelBrowseManagementWebelements;
	public statusupdate statusupdate;

	public JobLevelBrowseManagementWebelements getJobLevelBrowseManagementWebelements() {
		return jobLevelBrowseManagementWebelements;
	}

	public void setJobLevelBrowseManagementWebelements(
			JobLevelBrowseManagementWebelements jobLevelBrowseManagementWebelements) {
		this.jobLevelBrowseManagementWebelements = jobLevelBrowseManagementWebelements;
	}

	public statusupdate getStatusupdate() {
		return statusupdate;
	}

	public void setStatusupdate(statusupdate statusupdate) {
		this.statusupdate = statusupdate;
	}

	public void init(WebDriver driver) {
		jobLevelBrowseManagementWebelements = PageFactory.initElements(driver,
				JobLevelBrowseManagementWebelements.class);
		statusupdate = PageFactory.initElements(driver, statusupdate.class);
	}
}