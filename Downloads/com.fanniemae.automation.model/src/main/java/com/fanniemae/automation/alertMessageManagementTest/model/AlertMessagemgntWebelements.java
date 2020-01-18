package com.fanniemae.automation.alertMessageManagementTest.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertMessagemgntWebelements {

	@FindBy(id = "link_ivmenu00_menu_8")
	public static WebElement administration;
	@FindBy(id = "body_x_txtQuery_x_x")
	public static WebElement keywordsBox;
	@FindBy(id = "link_ivmenu00_menu_8_sub2")
	public static WebElement alertMessageMgntHeader;
	@FindBy(id = "ddlbody_x_selOtypeCode_x")
	public static WebElement objectTypes;
	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	public static WebElement searchBox;
	@FindBy(id = "body_x_prxFilterBar_x_cmdRazBtn_btn2")
	public static WebElement resetBox;
	@FindBy(id = "ddlbody_x_selPriority_x")
	public static WebElement priority;
	@FindBy(id = "ddlbody_x_chkAutomatic_x")
	public static WebElement automatic;
	@FindBy(id = "ddlbody_x_chkBlocking_x")
	public static WebElement blocking;
	@FindBy(id = "proxyActionBar_x_create_anomaly_btn2")
	public static WebElement createAnAlert;
	@FindBy(id = "body_x_txtErrorCode_x_x")
	public static WebElement errorCode;
	@FindBy(id = "body_x_txtErrorLabel_x_txtErrorLabelen")
	public static WebElement name;
	@FindBy(id = "body_x_chErrorAuto_x0")
	public static WebElement automaticCheckBox;
	@FindBy(id = "body_x_txtReq_x_x")
	public static WebElement sqlQuery;
	@FindBy(id = "ddlbody_x_selErrorAlgo_x")
	public static WebElement algorithm;
	@FindBy(id = "body_x_txtErrorParam_x_x")
	public static WebElement algorithmParameters;
	@FindBy(id = "body_x_selErrorAutoriz_x_txtselErrorAutoriz_x_x")
	public static WebElement authorisation;
	@FindBy(id = "body_x_selErrorOType_x_txtselErrorOType_x_x")
	public static WebElement objectTypeInAlert;
	@FindBy(id = "body_x_chErrorBlq_x0")
	public static WebElement blockingCheckBox;
	@FindBy(id = "body_x_txtErrorCustomLabel_x_txtErrorCustomLabelen")
	public static WebElement customisedLabel;
	@FindBy(id = "ddlbody_x_selPriority_x")
	public static WebElement priorityInAlert;
	@FindBy(id = "body_x_txtErrorDesc_x_txtErrorDescen")
	public static WebElement description;
	@FindBy(id = "proxyActionBar_x__cmdSave_btn2")
	public static WebElement save;
}