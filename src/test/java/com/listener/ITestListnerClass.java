package com.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.base.BaseClass;

public class ITestListnerClass extends BaseClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		try {
		ExtentReport_Test.extentTest.pass(result.getMethod().getMethodName() + " : "+ "Test Pass",
		MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
		} catch (Exception e ) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			ExtentReport_Test.extentTest.fail(result.getMethod().getMethodName() + " : "+ "Test fail",
			MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
			} catch (Exception e ) {
				e.printStackTrace();
			}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

	
	
	
}
