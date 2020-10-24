package com.samrat.OrangeHRMAutomation.Utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGReporting implements ITestListener {
	private WebDriver cdriver = null;

	public void onStart(ITestContext result) {
		System.out.println("Test Execution has been Started: " + result.getName());
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Test has been Started: " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test has been Successed: " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test has been Failed: " + result.getName());
		cdriver = DriverManager.chromedriver;
		String filename =  new SimpleDateFormat("yyyyMMddhhmmss'.txt'").format(new Date());
		File srcFile = ((TakesScreenshot)cdriver).getScreenshotAs(OutputType.FILE);
		
		File desFile = new File("G:\\Software Testing With Selenium BITM\\Selenium Files\\Screenshot\\"+filename+".png"); 
		try {
			FileHandler.copy(srcFile, desFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot hasbeen taken of failure Test");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test has been Skipped: " + result.getName());
	}

	public void onFinish(ITestContext result) {
		System.out.println("Test Execution has been Finished: " + result.getName());
	}
}
