package com.fanniemae.automation.currencyManagementTest.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CurrencyConversion {

	@FindBy(id = "link_ivmenu00_menu_8_sub6_sub0")
	public static WebElement currencyConversionHeader;
	@FindBy(id = "ddlbody_x_selCurrency_x")
	public static WebElement targetCurrency;
	@FindBy(id = "ddlbody_x_selYear_x")
	public static WebElement year;
	@FindBy(id = "ddlbody_x_selPeriod_x")
	public static WebElement period;
	@FindBy(id = "body_x_chkFilled_x0")
	public static WebElement filledxRatesOnly;
	@FindBy(id = "body_x_chkNotFilled_x0")
	public static WebElement notFilledxRatesOnly;
}