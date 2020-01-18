package com.fanniemae.automation.workflowManagementTest.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorkflowManagementWebelements {

	@FindBy(id = "link_ivmenu00_menu_8")
	public static WebElement administration;
	@FindBy(id = "link_ivmenu00_menu_8_sub3")
	public static WebElement workflowManagementHeader;
	@FindBy(id = "body_x_selOtypeCode_x_txtselOtypeCode_x_x")
	public static WebElement objectType;
	@FindBy(id = "body_x_txtQuery_x_x")
	public static WebElement keywordsBox;
	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	public static WebElement searchBox;
	@FindBy(id = "body_x_prxFilterBar_x_cmdRazBtn_btn2")
	public static WebElement resetBox;
	@FindBy(id = "proxyActionBar_x_create_wfl_btn2")
	public static WebElement newWorkFlow;
	@FindBy(id = "body_x_txtProcessCode_x_x")
	public static WebElement workflowProcessCode;
	@FindBy(id = "body_x_chkFirstActAutoVal_x0")
	public static WebElement automaticValidationCheckBox;
	@FindBy(id = "body_x_txtProcessLabel_x_txtProcessLabelen")
	public static WebElement workflowLabel;
	@FindBy(id = "body_x_selOtypeCode_x_txtselOtypeCode_x_x")
	public static WebElement objectTypeInWorkflow;
	@FindBy(id = "proxyActionBar_x__cmdSave_btn2")
	public static WebElement save;
	@FindBy(id = "proxyActionBar_x__cmdEnd_btn2")
	public static WebElement exit;
}