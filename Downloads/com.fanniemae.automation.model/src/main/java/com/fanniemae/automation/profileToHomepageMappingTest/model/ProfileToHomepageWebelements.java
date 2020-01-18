package com.fanniemae.automation.profileToHomepageMappingTest.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileToHomepageWebelements {

	@FindBy(id = "link_ivmenu00_menu_8")
	public static WebElement administration;
	@FindBy(id = "body_x_txtQuery_x_x")
	public static WebElement keywordsBox;
	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	public static WebElement searchBox;
	@FindBy(id = "body_x_prxFilterBar_x_cmdRazBtn_btn2")
	public static WebElement resetBox;
	@FindBy(id = "link_ivmenu00_menu_8_sub4_sub0")
	public static WebElement profileToHomepageMappingHeader;
	@FindBy(id = "body_x_ddlHomepageCode_x")
	public static WebElement homePageCodeDropDown;
	@FindBy(id = "body_x_ddlProfil_x")
	public static WebElement profileDropDown;
	@FindBy(id = "proxyActionBar_x__cmdSave_btn2")
	public static WebElement save;
	@FindBy(id = "link_ivmenu00_menu_8_sub4_sub1")
	public static WebElement pageMassEdit;
	@FindBy(id = "body_x_selPage_x_txtselPage_x_x")
	public static WebElement txtSelPage;
	@FindBy(id = "proxyActionBar_x_btnActivate_btn2")
	public static WebElement activate;
	@FindBy(id = "proxyActionBar_x_btnDeactivate_btn2")
	public static WebElement deactivate;
}