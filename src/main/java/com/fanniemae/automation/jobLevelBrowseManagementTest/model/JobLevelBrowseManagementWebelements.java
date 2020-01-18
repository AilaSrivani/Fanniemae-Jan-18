package com.fanniemae.automation.jobLevelBrowseManagementTest.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobLevelBrowseManagementWebelements {

	@FindBy(id = "link_ivmenu00_menu_8")
	public static WebElement administration;
	@FindBy(id = "body_x_txtQuery_x_x")
	public static WebElement keywordsBox;
	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	public static WebElement searchBox;
	@FindBy(id = "body_x_prxFilterBar_x_cmdRazBtn_btn2")
	public static WebElement resetBox;
	@FindBy(id = "body_x_txtReq_x_x")
	public static WebElement pRID;
	@FindBy(id = "body_x_txtContact_x_x")
	public static WebElement loginName;
}