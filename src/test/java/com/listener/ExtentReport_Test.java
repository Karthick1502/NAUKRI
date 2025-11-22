package com.listener;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentTest;
import com.base.BaseClass;
	
	public class ExtentReport_Test extends BaseClass{

		public static ExtentTest extentTest;
		
		@BeforeSuite
		public  void extentTestReportStartUp( ) {
			extentReportStart(null);
		}
		
		@AfterSuite
		public void extenReportEnd() {
			extentReportTearDown(null);
		}
	}
