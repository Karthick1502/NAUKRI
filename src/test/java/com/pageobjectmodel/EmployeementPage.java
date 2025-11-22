package com.pageobjectmodel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.interfaceelements.EmploymentInterfaceElements;

public class EmployeementPage extends BaseClass implements EmploymentInterfaceElements{
	
	@FindBy(xpath = addBtn_xpath)
	WebElement addbtn;
	
	@FindBy(id = yeardropDown_id)
	WebElement yeardropDown;
	
	@FindBy(id = monthDropDown_id)
	WebElement monthDropDown;
	
	@FindBy(xpath = fiveYearsDropDown_xpath)
	WebElement fiveYearsDropDown;
	
	@FindBy(xpath = twoMonthsDropDown_xpath)
	WebElement twoMonthsDropDown;
	
	@FindBy(id = currenCompanyInput_id)
	WebElement currenCompanyInput;
	
	@FindBy(css = deginationInput_css)
	WebElement deginationInput;
	
	@FindBy(id = joiningYearBtn_id)
	WebElement joiningYearBtn;
	
	@FindBy(xpath = joiningYear_xpath)
	WebElement joiningYear;
	
	@FindBy(id = joiningMonthBtn_id)
	WebElement joiningMonthBtn;
	
	@FindBy(xpath = joiningMonth_xpath)
	WebElement joiningMonth;
	
	@FindBy(id = currentSalary_id)
	WebElement currentSalary;
	
	@FindBy(id = salaryBreakDown_id)
	WebElement salaryBreakDown;
	
	@FindBy(name = skillsUsed_name)
	WebElement skillsUsed;
	
	@FindBy(css = jobProfile_css)
	WebElement jobProfile;
	
	@FindBy(id = noticePeriod_id)
	WebElement noticePeriod;
	
	@FindBy(id = savebtn_id)
	WebElement savebtn;
	
	public EmployeementPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void employment() throws InterruptedException {
		
		waitImplicitly(20);
		click(addbtn);
		Thread.sleep(3000);
		click(yeardropDown);
		click(fiveYearsDropDown);
		click(monthDropDown);
		click(twoMonthsDropDown);
		Thread.sleep(3000);
		sendInput(currenCompanyInput, "Access Healthcare");
		Thread.sleep(3000);
		robotActions("down");
		robotActions("down");
		robotActions("enter");
		Thread.sleep(3000);
		sendInput(deginationInput, "Senior AR Caller");
		Thread.sleep(3000);
		robotActions("down");
		robotActions("down");
		robotActions("enter");
		Thread.sleep(3000);
//		click(joiningYearBtn);
		Thread.sleep(3000);
//		sendInput(joiningYear, "2021");
//		javascriptSendkeys(joiningYear, "2021");
//		robotActions("enter");
		click(joiningYearBtn);
		javascriptSendkeys(joiningYear, "2021");
		actionKeyPress(Keys.ENTER);

		Thread.sleep(3000);
		click(joiningMonthBtn);
//		sendInput(joiningMonth, "Feb");
		javascriptSendkeys(joiningMonth, "Feb");
		robotActions("enter");
		clearValue(currentSalary);
		sendInput(currentSalary, "800000");
		click(salaryBreakDown);
		robotActions("down");
		robotActions("enter");
		sendInput(skillsUsed, "QA Testing");
		robotActions("down");
		robotActions("down");
		robotActions("enter");
		sendInput(jobProfile, "qa tester with java selenium experience ");
		sendInput(noticePeriod, "1 Month");
		robotActions("enter");
		click(savebtn);
		
	}
	
}
