package com.runner;

import java.awt.AWTException;
import java.io.IOException;

import org.junit.Ignore;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.listener.ExtentReport_Test;
import com.listener.ITestListnerClass;
import com.pageobjectmanager.PageObjectManager;

@Listeners(ITestListnerClass.class)
public class NaukriRunner extends BaseClass {

	@BeforeTest
	private void setupProperty() throws IOException {
		launchBrowser(PageObjectManager.getPageObjectManager().getFileReaderManger().getDataProperty("browser"));
		launchUrl(PageObjectManager.getPageObjectManager().getFileReaderManger().getDataProperty("url"));
	}

	@Test(priority = 0, enabled = true)
	private void loginTest() throws IOException, InterruptedException {
		ExtentReport_Test.extentTest = extentReports
				.createTest("Naukri_application_Testing " + ": "
						+ Thread.currentThread().getStackTrace()[1].getMethodName().toString())
				.info("Valid Login Test");

		PageObjectManager.getPageObjectManager().getLoginPage().validLoginPage();

	}

	@Test(enabled = false)
	private void profileUpdatetest() throws InterruptedException {
		PageObjectManager.getPageObjectManager().getProfileUpdatePage().profileUpdate();
	}

	@Test(priority = 1, enabled = false)
	private void resumeHeaderLineTest() throws InterruptedException {
		PageObjectManager.getPageObjectManager().getResumeHeaderLinePage().resumeHeadineLine();
	}

	@Test(priority = 2, enabled = false)
	private void keySkillTest() throws InterruptedException, AWTException {
		PageObjectManager.getPageObjectManager().getKeySkillPage().keySkill();
	}
	
	@Test( priority = 3 , enabled = false)
	private void employmentTest() throws InterruptedException {
		PageObjectManager.getPageObjectManager().getEmployeementPage().employment();
	}

	@AfterTest(enabled = false)
	private void browserTermination() {
		quitBrowser();
	}

	@BeforeSuite
	private void reportStart() throws IOException {
		extentReportStart(
				PageObjectManager.getPageObjectManager().getFileReaderManger().getDataProperty("reportstart"));

	}

	@AfterSuite
	private void reportEnd() throws IOException {
		extentReportTearDown(
				PageObjectManager.getPageObjectManager().getFileReaderManger().getDataProperty("reportend"));
	}

}
