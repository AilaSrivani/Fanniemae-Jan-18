package com.fanniemae.automation.jobLevelBrowseManagementTest.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class statusupdate {

	@FindBy(id = "link_ivmenu00_menu_8")
	public static WebElement administration;
	@FindBy(id = "link_ivmenu00_menu_8_sub12")
	public static WebElement statusUpdateHeader;
	@FindBy(id = "body_x_txtCtrId_x_x")
	public static WebElement contractID;
	@FindBy(id = "body_x_selCtrStatus_x")
	public static WebElement contractNewStatus;
}