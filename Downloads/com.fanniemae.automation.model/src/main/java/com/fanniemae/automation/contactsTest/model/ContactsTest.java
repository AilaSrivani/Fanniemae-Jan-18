package com.fanniemae.automation.contactsTest.model;

import com.fanniemae.automation.contactsTest.model.ContactsWebelements;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class ContactsTest {

	public ContactsWebelements contactsWebelements;

	public ContactsWebelements getContactsWebelements() {
		return contactsWebelements;
	}

	public void setContactsWebelements(ContactsWebelements contactsWebelements) {
		this.contactsWebelements = contactsWebelements;
	}

	public void init(WebDriver driver) {
		contactsWebelements = PageFactory.initElements(driver, ContactsWebelements.class);
	}
}