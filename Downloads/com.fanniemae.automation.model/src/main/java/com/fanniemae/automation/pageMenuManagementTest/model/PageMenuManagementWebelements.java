package com.fanniemae.automation.pageMenuManagementTest.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageMenuManagementWebelements {

	@FindBy(id = "link_ivmenu00_menu_8")
	public static WebElement administration;
	@FindBy(id = "body_x_txtQuery_x_x")
	public static WebElement keywordsBox;
	@FindBy(id = "body_x_prxFilterBar_x_cmdSearchBtn_btn2")
	public static WebElement searchBox;
	@FindBy(id = "body_x_prxFilterBar_x_cmdRazBtn_btn2")
	public static WebElement resetBox;
	@FindBy(id = "link_ivmenu00_menu_8_sub4")
	public static WebElement pageAndMenuManagementHeader;
	@FindBy(id = "body_x_ddlModule_x")
	public static WebElement module;
	@FindBy(id = "body_x_selPageParent_x_txtselPageParent_x_x")
	public static WebElement parentPage;
	@FindBy(id = "body_x_chkNotSecure_x0")
	public static WebElement nonSecuredPages;
	@FindBy(id = "body_x_chkDisplay_x0")
	public static WebElement navigationPages;
	@FindBy(id = "body_x_chkNotExist_x0")
	public static WebElement filesDonotExist;
	@FindBy(id = "body_x_chkWebpart_x0")
	public static WebElement usePageAsWebpart;
	@FindBy(id = "body_x_selAuth_x_txtselAuth_x_x")
	public static WebElement authorisation;
	@FindBy(id = "proxyActionBar_x__cmdNew_btn2")
	public static WebElement createPage;
	@FindBy(id = "body_x_txtPageUrl_x_x")
	public static WebElement uRL;
	@FindBy(id = "body_x_ddlModule_x")
	public static WebElement moduleInCreatePage;
	@FindBy(id = "body_x_selObjectType_x_txtselObjectType_x_x")
	public static WebElement objectType;
	@FindBy(id = "ddlbody_x_selPageType_x")
	public static WebElement pageType;
	@FindBy(id = "ddlbody_x_selAccessType_x")
	public static WebElement accessType;
	@FindBy(id = "body_x_cbMobile_x0")
	public static WebElement mobilePage;
	@FindBy(id = "body_x_selPageUrlRedirectExtranet_x_txtselPageUrlRedirectExtranet_x_x")
	public static WebElement redirectToExternalPage;
	@FindBy(id = "body_x_selPageUrlRedirectMobile_x_txtselPageUrlRedirectMobile_x_x")
	public static WebElement redirectToMobilePage;
	@FindBy(id = "body_x_txtPageTitle_x_txtPageTitleen")
	public static WebElement title;
	@FindBy(id = "body_x_txtPageTitleMenu_x_txtPageTitleMenuen")
	public static WebElement mainMenuTitle;
	@FindBy(id = "body_x_txtTitleFavorite_x_txtTitleFavoriteen")
	public static WebElement favoriteTitle;
	@FindBy(id = "body_x_selPage_x_txtselPage_x_x")
	public static WebElement parentPageInCreatePage;
	@FindBy(id = "body_x_chkPageDisplay_x0")
	public static WebElement showInNavigation;
	@FindBy(id = "body_x_txtPageOrder_x_x")
	public static WebElement displayOrder;
	@FindBy(id = "body_x_selAuthCode_x_txtselAuthCode_x_x")
	public static WebElement viewAuthorisation;
	@FindBy(id = "body_x_selAuthWrite_x_txtselAuthWrite_x_x")
	public static WebElement editAuthorisation;
	@FindBy(id = "body_x_chkWebPart_x0")
	public static WebElement isAWebpart;
	@FindBy(id = "body_x_txtWebPartCols_x_x")
	public static WebElement numberOfColumns;
	@FindBy(id = "body_x_txtWebPartRows_x_x")
	public static WebElement numberOfRows;
	@FindBy(id = "//*[@id='body_x_phcPageFunctional']/tbody/tr[12]/td[1]")
	public static WebElement description;
	@FindBy(id = "ddlbody_x_selWorkflowTriggerMode_x")
	public static WebElement workflowLunchMode;
	@FindBy(id = "body_x_chkIsControl_x0")
	public static WebElement pageUsedOnlyAsAControl;
	@FindBy(id = "body_x_tbPartHeight_x_x")
	public static WebElement defaultWebpartHeight;
	@FindBy(id = "body_x_chkRole_x0")
	public static WebElement enableAuthorisationOnObjects;
	@FindBy(id = "body_x_cbLayout_x0")
	public static WebElement customizablePage;
	@FindBy(id = "body_x_chkLogAccess_x0")
	public static WebElement activateAccessLogs;
	@FindBy(id = "proxyActionBar_x_btnScript_btn2")
	public static WebElement script;
	@FindBy(id = "proxyActionBar_x__cmdSave_btn2")
	public static WebElement save;
	@FindBy(id = "proxyActionBar_x__cmdEnd_btn2")
	public static WebElement exit;
}