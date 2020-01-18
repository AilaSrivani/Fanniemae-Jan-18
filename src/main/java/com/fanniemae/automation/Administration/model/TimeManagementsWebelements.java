package com.fanniemae.automation.Administration.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TimeManagementsWebelements {

	@FindBy(id = "link_ivmenu00_menu_8")
	public static WebElement administration;
	@FindBy(id = "link_ivmenu00_menu_8_sub0")
	public static WebElement timeManagement;
	@FindBy(id = "body_x_txtQuery_x_x")
	public static WebElement keywordsBox;
	@FindBy(id = "body_x_ddlModule_x")
	public static WebElement moduleDropDown;
	@FindBy(id = "body_x_ddlTableType_x")
	public static WebElement tableType;
	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	public static WebElement searchBox;
	@FindBy(id = "body_x_prxFilterBar_x_cmdRazBtn_btn2")
	public static WebElement resetBox;
}