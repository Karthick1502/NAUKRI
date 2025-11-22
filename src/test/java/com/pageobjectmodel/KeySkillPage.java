package com.pageobjectmodel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.interfaceelements.KeySkillsInterfaceElements;

public class KeySkillPage extends BaseClass implements KeySkillsInterfaceElements{
	
	
	@FindBy (xpath = keySkillBtn_xpath)
	WebElement keySkillBtn ;
	
	@FindBy(xpath = editIcon_xpath)
	WebElement editIcon;
	
	@FindBy(name = addSkillsInput_name)
	WebElement addSkillsInput;
	
	@FindBy(id = Savebtn_id)
	WebElement Savebtn;
	

	public KeySkillPage() {
	PageFactory.initElements(driver, this);
	
	}
	
	public void keySkill() throws InterruptedException, AWTException {
		
		Thread.sleep(3000);
		click(keySkillBtn);
		waitImplicitly(30);
		Thread.sleep(3000);
		click(editIcon);
		Thread.sleep(3000);
		sendInput(addSkillsInput, "Smoke testing");
		Thread.sleep(3000);
		robotActions("down");		
		robotActions("down");
		robotActions("enter");
		Thread.sleep(3000);
		click(Savebtn);
		
	}

}
