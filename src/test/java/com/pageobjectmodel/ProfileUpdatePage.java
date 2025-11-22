package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.interfaceelements.ProfileUpdateInterfaceElements;

public class ProfileUpdatePage extends BaseClass implements ProfileUpdateInterfaceElements{

	@FindBy(partialLinkText = completeProfile_partialLinkText)
	WebElement complete;
	
	@FindBy(xpath = editor_xpath)
	WebElement editor;

	@FindBy(xpath = basicDetailTitle_xpath)
	WebElement basicDetailTitle;
	
	@FindBy(id = name_id)
	WebElement name;
	
	@FindBy(xpath = yearsDropDown_xpath)
	WebElement yearsDropDown;
	
	@FindBy(xpath = monthDropDown_xpath)
	WebElement monthDropDown;
	
	public ProfileUpdatePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void profileUpdate() throws InterruptedException {
		Thread.sleep(3000);
		click(complete);
		Thread.sleep(3000);
		click(editor);
		Thread.sleep(3000);
		clearValue(name);
		Thread.sleep(3000);
		sendInput(name, "Ponniyinselvam");
		Thread.sleep(3000);
		click(yearsDropDown);
		Thread.sleep(3000);
		click(monthDropDown);
		

		
	}
}
