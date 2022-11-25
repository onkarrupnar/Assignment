package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	
	
	public static ExtentReports get_Report() {
		
		String path="D:\\Demo Workspace\\Assignment\\Reports";
		ExtentSparkReporter report=new ExtentSparkReporter(path);
		report.config().setDocumentTitle("Automation Test Report");
		report.config().setReportName("Assignment");
		report.config().setTheme(Theme.DARK);
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("O.S","Windows");
		extent.setSystemInfo("Tool","SeleniumWebdriver");
		extent.setSystemInfo("QA","Onkar");
		return extent;
	}

}
