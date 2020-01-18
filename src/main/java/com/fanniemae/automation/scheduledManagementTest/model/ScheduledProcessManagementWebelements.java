package com.fanniemae.automation.scheduledManagementTest.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScheduledProcessManagementWebelements {

	@FindBy(id = "link_ivmenu00_menu_8")
	public static WebElement administration;
	@FindBy(id = "body_x_txtQuery_x_x")
	public static WebElement keywordsBox;
	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	public static WebElement searchBox;
	@FindBy(id = "body_x_prxFilterBar_x_cmdRazBtn_btn2")
	public static WebElement resetBox;
	@FindBy(id = "link_ivmenu00_menu_8_sub9")
	public static WebElement scheduledProcessManagementHeader;
	@FindBy(id = "ddlbody_x_selExecType_x")
	public static WebElement executionType;
	@FindBy(id = "ddlbody_x_selstatus_x")
	public static WebElement status;
	@FindBy(id = "proxyActionBar_x_add_task_btn2")
	public static WebElement addATask;
	@FindBy(id = "body_x_txtPageUrl_x_x")
	public static WebElement page;
	@FindBy(id = "body_x_txtTaskLabel_x_txtTaskLabelen")
	public static WebElement label;
	@FindBy(id = "body_x_txtTaskCode_x_x")
	public static WebElement code;
	@FindBy(id = "ddlbody_x_selExecType_x")
	public static WebElement executionTypeInAddATask;
	@FindBy(id = "body_x_txtTaskTrigger_x_x")
	public static WebElement releaseMechanismsBatch;
	@FindBy(id = "ddlbody_x_selMDesc_x")
	public static WebElement module;
	@FindBy(id = "body_x_txtTaskInterval_x_x")
	public static WebElement executionIntervalFrom;
	@FindBy(id = "body_x_txtTaskInterval_ddlIntervalType_x")
	public static WebElement executionIntervalTime;
	@FindBy(id = "body_x_selTTBegin_x_txtselTTBegin_x_x")
	public static WebElement ValidityStartTime;
	@FindBy(id = "body_x_txtEndDate_x_x")
	public static WebElement ValidityEnddate;
	@FindBy(id = "proxyActionBar_x__cmdSave_btn2")
	public static WebElement save;
	@FindBy(id = "proxyActionBar_x__cmdEnd_btn2")
	public static WebElement exit;
}