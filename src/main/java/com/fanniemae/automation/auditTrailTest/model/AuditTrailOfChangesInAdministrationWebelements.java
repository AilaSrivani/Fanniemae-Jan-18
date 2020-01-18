package com.fanniemae.automation.auditTrailTest.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuditTrailOfChangesInAdministrationWebelements {

	@FindBy(id = "link_ivmenu00_menu_8")
	public static WebElement administration;
	@FindBy(id = "body_x_txtQuery_x_x")
	public static WebElement keywordsBox;
	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	public static WebElement searchBox;
	@FindBy(id = "body_x_prxFilterBar_x_cmdRazBtn_btn2")
	public static WebElement resetBox;
	@FindBy(id = "link_ivmenu00_menu_8_sub10")
	public static WebElement auditTrailOfChangesHeader;
	@FindBy(id = "body_x_selTable_x_txtselTable_x_x")
	public static WebElement table;
	@FindBy(id = "body_x_ddlContact_x_txtddlContact_x_x")
	public static WebElement user;
	@FindBy(id = "body_x_ddlType_x")
	public static WebElement action;
	@FindBy(id = "body_x_txtRequest_x_x")
	public static WebElement request;
	@FindBy(id = "body_x_txtDate_x_x")
	public static WebElement dateFrom;
	@FindBy(id = "body_x_txtDate_x_x")
	public static WebElement dateTo;
}