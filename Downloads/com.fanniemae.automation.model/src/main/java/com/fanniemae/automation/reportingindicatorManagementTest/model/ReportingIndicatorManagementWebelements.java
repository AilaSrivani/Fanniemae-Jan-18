package com.fanniemae.automation.reportingindicatorManagementTest.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportingIndicatorManagementWebelements {

	@FindBy(id = "link_ivmenu00_menu_8")
	public static WebElement administration;
	@FindBy(id = "body_x_txtQuery_x_x")
	public static WebElement keywordsBox;
	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	public static WebElement searchBox;
	@FindBy(id = "body_x_prxFilterBar_x_cmdRazBtn_btn2")
	public static WebElement resetBox;
	@FindBy(id = "link_ivmenu00_menu_8_sub7")
	public static WebElement reportingIndicatorManagementHeader;
	@FindBy(id = "body_x_selDomain_x_txtselDomain_x_x")
	public static WebElement domain;
	@FindBy(id = "ddlbody_x_selModule_x")
	public static WebElement module;
	@FindBy(id = "proxyActionBar_x_add_new_indicator_btn2")
	public static WebElement addANewIndicator;
	@FindBy(id = "body_x_txtIndicCalc_x_x")
	public static WebElement calculateFormula;
	@FindBy(id = "body_x_selIndicFormula_x_txtselIndicFormula_x_x")
	public static WebElement calculateFormulaBox;
	@FindBy(id = "ddlbody_x_selIndType_x")
	public static WebElement type;
	@FindBy(id = "body_x_txtIndicOrder_x_x")
	public static WebElement order;
	@FindBy(id = "body_x_selAuthCodeView_x_txtselAuthCodeView_x_x")
	public static WebElement viewAuthorisation;
}