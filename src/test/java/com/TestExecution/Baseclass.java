package com.TestExecution;

import org.testng.annotations.BeforeSuite;

import com.ReusabilityMethods.Screenshotsonwebpages;
import com.ReusabilityMethods.TestDatareader;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Baseclass {
	public static TestDatareader excel;
	public Screenshotsonwebpages screen;
	public ExtentHtmlReporter extent;
	public ExtentReports report;
	
	@BeforeSuite
	public void firstexecution() {
		excel = new TestDatareader();
		screen = new Screenshotsonwebpages();
		extent = new ExtentHtmlReporter("C:\\Users\\Pinaj\\Eclipse Project\\HRMAutomation\\Reports"+screen.getsystemdate()+".HTML");
		report = new ExtentReports();
		report.attachReporter(extent);
		System.out.println(" pull test on git");
	}

	
}
