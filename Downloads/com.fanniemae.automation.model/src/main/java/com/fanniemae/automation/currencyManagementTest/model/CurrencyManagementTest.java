package com.fanniemae.automation.currencyManagementTest.model;

import com.fanniemae.automation.currencyManagementTest.model.CurrencyManagementWebelements;
import com.fanniemae.automation.currencyManagementTest.model.CurrencyConversion;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class CurrencyManagementTest {

	public CurrencyManagementWebelements currencyManagementWebelements;
	public CurrencyConversion currencyConversion;

	public CurrencyManagementWebelements getCurrencyManagementWebelements() {
		return currencyManagementWebelements;
	}

	public void setCurrencyManagementWebelements(CurrencyManagementWebelements currencyManagementWebelements) {
		this.currencyManagementWebelements = currencyManagementWebelements;
	}

	public CurrencyConversion getCurrencyConversion() {
		return currencyConversion;
	}

	public void setCurrencyConversion(CurrencyConversion currencyConversion) {
		this.currencyConversion = currencyConversion;
	}

	public void init(WebDriver driver) {
		currencyManagementWebelements = PageFactory.initElements(driver, CurrencyManagementWebelements.class);
		currencyConversion = PageFactory.initElements(driver, CurrencyConversion.class);
	}
}