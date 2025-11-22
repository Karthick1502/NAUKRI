package com.pageobjectmodel;

import java.io.IOException;
import java.util.Base64;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.interfaceelements.LoginPageInterfaceElements;
import com.pageobjectmanager.PageObjectManager;
import com.utility.ExcelUtility;

public class LoginPage extends BaseClass implements LoginPageInterfaceElements {
	
	@FindBy(css = username_css)
	WebElement username;
	
	@FindBy(id = password_id)
	WebElement password;
	
	@FindBy(xpath = loginButton_xpath)
	WebElement loginButton;
	
	@FindBy(xpath = title_xpath)
	WebElement title;
	
	@FindBy(partialLinkText = completeProfile_partialLinkText)
	WebElement completeProfile;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void validLoginPage() throws IOException, InterruptedException {
		sendInput(username, PageObjectManager.getPageObjectManager().getFileReaderManger().getDataProperty("username"));
		sendInput(password, PageObjectManager.getPageObjectManager().getFileReaderManger().getDataProperty("password"));
		click(loginButton);
		Thread.sleep(4000);
		waitExplicitly(10, completeProfile, "clickable");
//		validation(title , ExcelUtility.getCellValue("DATA", "ID", "Title"));
		click(completeProfile);
		
	}

}
