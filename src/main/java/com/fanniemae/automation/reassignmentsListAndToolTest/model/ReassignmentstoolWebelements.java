package com.fanniemae.automation.reassignmentsListAndToolTest.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReassignmentstoolWebelements {

	@FindBy(id = "link_ivmenu00_menu_8_sub8_sub0")
	public static WebElement reassignmentsToolHeader;
	@FindBy(xpath = "//*[@id='content']/table/tbody/tr[2]/td/a")
	public static WebElement login;
	@FindBy(id = "ddlbody_x_AdvancedFilters_x")
	public static WebElement advancedSearchRule;
	@FindBy(id = "ddlbody_x_AdvancedDataFilters_x")
	public static WebElement filterOnRules;
	@FindBy(id = "ddlbody_x_AdvancedDataFilters_x")
	public static WebElement filterOnData;
	@FindBy(id = "body_x_selLeft_x_txtselLeft_x_x")
	public static WebElement selectLeftData;
	@FindBy(id = "body_x_selRight_x_txtselRight_x_x")
	public static WebElement selectRightData;
	@FindBy(id = "body_x_chkScript_x0")
	public static WebElement generateScript;
	@FindBy(xpath = "//*[@id='headerContainer']/table/tbody/tr[2]/td/table/tbody/tr/td[1]/table/tbody/tr/td[1]/div/a[1]/i")
	public static WebElement backButton;
	@FindBy(xpath = "//*[@id='content']/table/tbody/tr[3]/td/a")
	public static WebElement community;
	@FindBy(id = "body_x_selLeft_x_txtselLeft_x_x")
	public static WebElement simulationLeftData;
	@FindBy(id = "body_x_selRight_x_txtselRight_x_x")
	public static WebElement simulationRightData;
	@FindBy(xpath = "//*[@id='content']/table/tbody/tr[4]/td/a")
	public static WebElement organisation;
}