package com.samrat.OrangeHRMAutomation.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	//set property can't be used without main or static method
	static {
		System.setProperty("webdriver.chrome.driver", "G:\\Software Testing With Selenium BITM\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
	}
	public static WebDriver chromedriver = new ChromeDriver();
	
	//Constructor created
	private DriverManager() {
		
	}

}
