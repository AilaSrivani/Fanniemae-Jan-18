package com.fanniemae.automation.unitmeasureTest.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UnitMeasureManagementWebelements {

	@FindBy(id = "link_ivmenu00_menu_8")
	public static WebElement administration;
	@FindBy(id = "body_x_txtQuery_x_x")
	public static WebElement keywordsBox;
	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	public static WebElement searchBox;
	@FindBy(id = "body_x_prxFilterBar_x_cmdRazBtn_btn2")
	public static WebElement resetBox;
	@FindBy(id = "link_ivmenu00_menu_8_sub5")
	public static WebElement unitMeasureManagementHeader;
	@FindBy(id = "body_x_ddlUnitBase_ddlUnitBase")
	public static WebElement basicUnit;
	@FindBy(id = "body_x_ddlStatus_x")
	public static WebElement status;
	@FindBy(id = "proxyActionBar_x_new_unit_0_btn2")
	public static WebElement addAUnit;
	@FindBy(id = "proxyActionBar_x__cmdSave_btn2")
	public static WebElement save;
	@FindBy(id = "body_x_txtCode_x_x")
	public static WebElement code;
	@FindBy(id = "body_x_txtLabel_x_txtLabelen")
	public static WebElement name;
	@FindBy(id = "body_x_txtShortLabel_x_txtShortLabelen")
	public static WebElement shortTable;
	@FindBy(id = "body_x_ckbIsReference_x0")
	public static WebElement reference;
	@FindBy(id = "body_x_txtCoeffValue_x_x")
	public static WebElement coefValue;
	@FindBy(id = "body_x_ddlUnitBase_x")
	public static WebElement basicUnitInAddAUnit;
	@FindBy(id = "body_x_ddlStatus_x")
	public static WebElement statusInAddAUnit;
	@FindBy(id = "body_x_txtOrder_x_x")
	public static WebElement other;
	@FindBy(id = "proxyActionBar_x__cmdEnd_btn2")
	public static WebElement saveAndClose;
	@FindBy(id = "proxyActionBar_x_BackAction_btn2")
	public static WebElement close;
}