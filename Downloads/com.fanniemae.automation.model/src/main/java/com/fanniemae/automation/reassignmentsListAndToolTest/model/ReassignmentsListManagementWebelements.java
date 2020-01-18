package com.fanniemae.automation.reassignmentsListAndToolTest.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReassignmentsListManagementWebelements {

	@FindBy(id = "link_ivmenu00_menu_8")
	public static WebElement administration;
	@FindBy(id = "body_x_txtQuery_x_x")
	public static WebElement keywordsBox;
	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	public static WebElement searchBox;
	@FindBy(id = "body_x_prxFilterBar_x_cmdRazBtn_btn2")
	public static WebElement resetBox;
	@FindBy(id = "link_ivmenu00_menu_8_sub8")
	public static WebElement reassignmentsListHeader;
	@FindBy(id = "ddlbody_x_selReassignableTable_x")
	public static WebElement reassignedObjects;
	@FindBy(id = "body_x_chkSuccessOnly_x0")
	public static WebElement succesfulReassignmentsOnly;
	@FindBy(id = "body_x_chkIgnoreSimulation_x0")
	public static WebElement ignoreSimulatedReassignment;
	@FindBy(id = "body_x_selLogin_x_txtselLogin_x_x")
	public static WebElement user;
	@FindBy(id = "body_x_txtDateFrom_x_x")
	public static WebElement fromDate;
	@FindBy(id = "body_x_txtDateFrom_x_x")
	public static WebElement toDate;
}