package com.fanniemae.automation.contentTypesTest.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContentTypesWebelements {

	@FindBy(id = "link_ivmenu00_menu_8_sub1_sub0")
	public static WebElement contentTypeHeader;
	@FindBy(id = "link_ivmenu00_menu_8")
	public static WebElement administration;
	@FindBy(id = "body_x_txtQuery_x_x")
	public static WebElement keywordsBox;
	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	public static WebElement searchBox;
	@FindBy(id = "body_x_prxFilterBar_x_cmdRazBtn_btn2")
	public static WebElement resetBox;
	@FindBy(id = "body_x_ddlRelType_x")
	public static WebElement relationType;
	@FindBy(id = "body_x_chkTemplate_x0")
	public static WebElement onlyTemplates;
	@FindBy(id = "proxyActionBar_x_add_new_content_type_btn2")
	public static WebElement addANewDocumentType;
	@FindBy(id = "body_x_txtCttCode_x_txtCttCode")
	public static WebElement code;
	@FindBy(id = "body_x_txtCttLabel_x_txtCttLabelen")
	public static WebElement label;
	@FindBy(id = "body_x_txtDelayValidity_x_x")
	public static WebElement defaultValidityPeriod;
	@FindBy(id = "body_x_txtDelayExpirationAlert_x_x")
	public static WebElement defaultExpirationNotice;
	@FindBy(id = "body_x_ddlAuthLabelEdit_x_txtddlAuthLabelEdit_x_x")
	public static WebElement creationEditionAuthorisation;
	@FindBy(id = "body_x_ddlAuthLabelDisplay_x_txtddlAuthLabelDisplay_x_x")
	public static WebElement visualAuthorisation;
	@FindBy(id = "body_x_ddlAuthAdminAll_x_txtddlAuthAdminAll_x_x")
	public static WebElement administrationAuthorisation;
	@FindBy(id = "body_x_chkVersion_x0")
	public static WebElement versionisedCheckBox;
	@FindBy(id = "body_x_chkDetailed_x0")
	public static WebElement detailedSetUpCheckBox;
	@FindBy(id = "body_x_chkTrackHit_x0")
	public static WebElement logHitsCheckBox;
	@FindBy(id = "body_x_chkTemplate_x0")
	public static WebElement templateCheckBox;
	@FindBy(id = "body_x_chkPublicAccess_x0")
	public static WebElement sharedDraftCheckBox;
	@FindBy(id = "body_x_chkLoginDisplay_x0")
	public static WebElement displayOnLoginScreenCheckBox;
	@FindBy(id = "proxyActionBar_x__cmdSave_btn2")
	public static WebElement save;
	@FindBy(id = "proxyActionBar_x__cmdEnd_btn2")
	public static WebElement exit;
	@FindBy(id = "proxyActionBar_x__cmdEnd_btn2")
	public static WebElement exit1;
}