package com.fanniemae.automation.Administration.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContentRepositoryWebelements {

	@FindBy(id = "link_ivmenu00_menu_8_sub1")
	public static WebElement contentRepository;
	@FindBy(id = "ddlbody_x_ddlType_x")
	public static WebElement type;
	@FindBy(id = "body_x_ddlStatus_x")
	public static WebElement status1;
	@FindBy(id = "body_x_ddlAuthor_x_txtddlAuthor_x_x")
	public static WebElement author;
	@FindBy(id = "proxyActionBar_x_add_content_btn2")
	public static WebElement createNewDocument;
	@FindBy(id = "body_x_proxyEditHolder_x_txtTitle_x_txtTitleen")
	public static WebElement title;
	@FindBy(xpath = "//*[@id='body_x_proxyEditHolder_x_txtSummary_x_ptxtSummaryen']/tbody/tr/td[1]/div/div")
	public static WebElement summary;
	@FindBy(id = "body_x_proxyEditHolder_x_ddlStatus_x")
	public static WebElement status2;
	@FindBy(name = "body:x:proxyEditHolder:x:pxDocumentSelector:x:UploadButtonControl_btn2")
	public static WebElement documentsForDrag;
	@FindBy(xpath = "//*[@id='body_x_proxyEditHolder_x_Text_x_pTexten']/tbody/tr/td[1]/div/div")
	public static WebElement textBox;
	@FindBy(xpath = "//*[@id='body_x_proxyEditHolder_x_txtBeginDate_x_txtBeginDate']")
	public static WebElement validateFromDate;
	@FindBy(xpath = "//*[@id='body_x_proxyEditHolder_x_txtEndDate_x_txtEndDate']")
	public static WebElement validateToDate;
	@FindBy(xpath = "//*[@id='body_x_proxyEditHolder_x_txtDelayExpirationAlert_x_x']")
	public static WebElement expiredDelay;
	@FindBy(id = "body_x_proxyEditHolder_x_txtOrder_x_x")
	public static WebElement sortOrder;
	@FindBy(id = "body_x_proxyEditHolder_x_ddlAuth_x")
	public static WebElement authorisation;
	@FindBy(id = "body_x_proxyEditHolder_x_txtSource_x_x")
	public static WebElement reference;
	@FindBy(id = "body_x_proxyEditHolder_x_txtURL_x_x")
	public static WebElement url;
	@FindBy(id = "proxyActionBar_x__cmdSave_btn2")
	public static WebElement save;
	@FindBy(id = "proxyActionBar_x__cmdEnd_btn2")
	public static WebElement exit;
	@FindBy(id = "proxyActionBar_x__cmdVal_btn2")
	public static WebElement saveAndPreview;
	@FindBy(id = "proxyActionBar_x__cmdRef_btn2")
	public static WebElement delete;
}