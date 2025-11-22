package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.interfaceelements.ResumeHeaderLineInterfaceElements;

public class ResumeHeaderLinePage extends BaseClass implements ResumeHeaderLineInterfaceElements{
	
	

	@FindBy(partialLinkText = completeProfile_partialLinkText)
	WebElement complete;
	
	@FindBy (xpath = resumeheadlineButton_xpath )
	WebElement resumeElement;
	
	@FindBy( xpath = editIcon_xpath )
	WebElement editicon;
	
	@FindBy ( id = resumeHeadingInput_id)
	WebElement resumeHeadingInput;
	
	
	@FindBy ( xpath = submitbtn_xpath)
	WebElement submitbtn;
	
	
	public ResumeHeaderLinePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void resumeHeadineLine() throws InterruptedException {
		Thread.sleep(3000);
		waitImplicitly(20);
		waitExplicitly(20, complete, "clickable" );
		click(complete);
		Thread.sleep(3000);
		click(resumeElement);
		Thread.sleep(3000);
		click(editicon);
		Thread.sleep(3000);
		clearValue(resumeHeadingInput);
		Thread.sleep(3000);
		sendInput(resumeHeadingInput, "QA tester with key skills java , selenium , testNg");
		Thread.sleep(3000);
		click(submitbtn);
	}
}


