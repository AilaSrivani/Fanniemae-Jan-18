package com.fanniemae.automation.objectMappingWFTest.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObjectmappingWorkflowWebelements {

	@FindBy(id = "link_ivmenu00_menu_8")
	public static WebElement administration;
	@FindBy(id = "body_x_txtQuery_x_x")
	public static WebElement keywordsBox;
	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	public static WebElement searchBox;
	@FindBy(id = "body_x_prxFilterBar_x_cmdRazBtn_btn2")
	public static WebElement resetBox;
	@FindBy(id = "link_ivmenu00_menu_8_sub3_sub0")
	public static WebElement objectMappingWorkflowHeader;
	@FindBy(id = "body_x_ddlModule_x")
	public static WebElement module;
	@FindBy(id = "body_x_ddlTable_x")
	public static WebElement table;
	@FindBy(id = "body_x_chkReviewTranslations_x0")
	public static WebElement reviewTranslation;
	@FindBy(id = "body_x_c_tdesc_name_x_txtc_tdesc_name_x_x")
	public static WebElement tableInFilterSection;
	@FindBy(id = "body_x_c_process_code_x_txtc_process_code_x_x")
	public static WebElement workFlow;
	@FindBy(id = "body_x_c_fam_level_fam_node_x_txtc_fam_level_fam_node_x_x")
	public static WebElement commodity;
	@FindBy(id = "body_x_c_orga_level_orga_node_x_txtc_orga_level_orga_node_x_x")
	public static WebElement organisation;
	@FindBy(id = "body_x_c_process_code_tdesc_name_fam_level_fam_node_orga_level_orga_node_px_type_x_txtc_process_code_tdesc_name_fam_level_fam_node_orga_level_orga_node_px_type_x_x")
	public static WebElement WorkfowToBeStartedObject;
	@FindBy(id = "proxyActionBar_x_btnScript_btn2")
	public static WebElement generateScript;
	@FindBy(id = "body_x_btnAdd_btn2")
	public static WebElement addRow;
	@FindBy(name = "proxyActionBar:x:BackAction_btn2")
	public static WebElement close;
	@FindBy(id = "body_x_c_fam_level_x_txtc_fam_level_x_x")
	public static WebElement commodityInAddrow;
	@FindBy(id = "body_x_c_orga_level_x_txtc_orga_level_x_x")
	public static WebElement organisationInAddrow;
	@FindBy(id = "//*[@id='body_x_c_px_type_x_x']")
	public static WebElement typeInAddrow;
	@FindBy(id = "proxyActionBar:x:_cmdEnd_btn2")
	public static WebElement saveAndClose;
	@FindBy(id = "link_ivmenu00_menu_8_sub3_sub1")
	public static WebElement thresholdManagementHeader;
	@FindBy(id = "proxyActionBar:x:_cmdNew_btn2")
	public static WebElement saveAndNew;
	@FindBy(id = "iv-modal-fa-icon iv-modal-fa-icon-close fa fa-times")
	public static WebElement tickMarkInAddrow;
	@FindBy(id = "body_x_txtScript_x_x")
	public static WebElement generateSQLData;
	@FindBy(xpath = "//*[@id='body_x_c_process_code_x_txtc_process_code_x_x']")
	public static WebElement workflowInAddRow;
	@FindBy(xpath = "//*[@id='body_x_c_tdesc_name_x_txtc_tdesc_name_x_x']")
	public static WebElement tableInAddRow;
}