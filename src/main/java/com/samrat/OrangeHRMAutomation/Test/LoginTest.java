package com.samrat.OrangeHRMAutomation.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.samrat.OrangeHRMAutomation.DTO.LoginDTO;
import com.samrat.OrangeHRMAutomation.DataProvider.LoginDataProvider;
import com.samrat.OrangeHRMAutomation.Utils.DriverManager;
import com.samrat.OrangeHRMAutomation.Utils.TestNGReporting;
import com.samrat.OrangeHRMAutomation.Utils.UrlTextUtils;
import com.samrat.OrangeHRMAutomation.Utils.XpathUtils;
@Listeners(TestNGReporting.class)
public class LoginTest {
	private WebDriver cdriver = null;
	@Test
	public void checkLoginTitle () {
		cdriver = DriverManager.chromedriver;
		cdriver.get(UrlTextUtils.URL.BaseURL);
		Assert.assertEquals(cdriver.getTitle(), UrlTextUtils.Text.HomePageTitle);
		System.out.println("Login Page Title Verified!");
	}
	@Test(dependsOnMethods = "checkLoginTitle", dataProvider = "loginDataProvider", dataProviderClass = LoginDataProvider.class)
	public void loginTest(List<LoginDTO> logdata) {
		for(LoginDTO login:logdata) {
			cdriver.findElement(By.xpath(XpathUtils.LoginModule.username)).sendKeys(login.getUsername());
			cdriver.findElement(By.xpath(XpathUtils.LoginModule.password)).sendKeys(login.getPassword());
			cdriver.findElement(By.xpath(XpathUtils.LoginModule.loginButton)).click();
		}
		
	}

}
