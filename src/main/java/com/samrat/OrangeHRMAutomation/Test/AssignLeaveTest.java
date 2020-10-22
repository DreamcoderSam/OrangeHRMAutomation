package com.samrat.OrangeHRMAutomation.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.samrat.OrangeHRMAutomation.DTO.AssignLeaveDTO;
import com.samrat.OrangeHRMAutomation.DataProvider.AssignLeaveDataProvider;
import com.samrat.OrangeHRMAutomation.Utils.DriverManager;
import com.samrat.OrangeHRMAutomation.Utils.UrlTextUtils;
import com.samrat.OrangeHRMAutomation.Utils.XpathUtils;

public class AssignLeaveTest {
	private WebDriver cdriver=null;
	@Test
	public void clickAssignLeave() {
		cdriver = DriverManager.chromedriver;
		cdriver.get(UrlTextUtils.URL.DashboardURL);
		cdriver.findElement(By.xpath(XpathUtils.AssignLeaveModule.assignLeave)).click();
		//cdriver.findElement(By.xpath(XpathUtils.AssignLeaveModule.AssignButton)).click();
	}
	@Test(dependsOnMethods = "clickAssignLeave", dataProvider = "leaveDataProvider", dataProviderClass = AssignLeaveDataProvider.class)
	public void assignLeaveTest(List<AssignLeaveDTO> leaveData) {
		
		for(AssignLeaveDTO alData:leaveData) {
			cdriver.findElement(By.xpath(XpathUtils.AssignLeaveModule.employeeName)).sendKeys(alData.getEmployeeNmae());
			Select LeaveType = new Select(cdriver.findElement(By.xpath(XpathUtils.AssignLeaveModule.leaveType)));
			LeaveType.selectByVisibleText(alData.getLeaveType());
			
			cdriver.findElement(By.xpath(XpathUtils.AssignLeaveModule.fromDate)).click();
			Select fdMonth = new Select(cdriver.findElement(By.xpath(XpathUtils.AssignLeaveModule.fromDateMonth)));
			fdMonth.selectByVisibleText(alData.getFdMonth());
			Select fdYear = new Select(cdriver.findElement(By.xpath(XpathUtils.AssignLeaveModule.fromDateYear)));
			fdYear.selectByVisibleText(alData.getFdYear());
			WebElement datePicker = cdriver.findElement(By.xpath(XpathUtils.AssignLeaveModule.datePicker));
			List<WebElement> column = datePicker.findElements(By.tagName("td"));
			for (WebElement cell : column) {
				if(cell.getText().equals(alData.getFdDay())) {
					cell.findElement(By.linkText(alData.getFdDay())).click();
					break;
				}
				
			}
			
			cdriver.findElement(By.xpath(XpathUtils.AssignLeaveModule.toDate)).click();
			Select tdMonth = new Select(cdriver.findElement(By.xpath(XpathUtils.AssignLeaveModule.toDateMonth)));
			tdMonth.selectByVisibleText(alData.getTdMonth());
			Select tdYear = new Select(cdriver.findElement(By.xpath(XpathUtils.AssignLeaveModule.toDateYear)));
			tdYear.selectByVisibleText(alData.getTdYear());
			
			WebElement tddatePicker = cdriver.findElement(By.xpath(XpathUtils.AssignLeaveModule.datePicker));
			List<WebElement> tdcolumn = tddatePicker.findElements(By.tagName("td"));
			for (WebElement cell : tdcolumn) {
				if(cell.getText().equals(alData.getTdDay())) {
					cell.findElement(By.linkText(alData.getTdDay())).click();
					break;
				}
				
			}
			cdriver.findElement(By.xpath(XpathUtils.AssignLeaveModule.comment)).sendKeys(alData.getComment());
			//WebDriverWait waitForLeave = new WebDriverWait(cdriver, 10);
			//waitForLeave.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.AssignLeaveModule.AssignButton)));
			cdriver.findElement(By.xpath(XpathUtils.AssignLeaveModule.AssignButton)).click();
			
			/// Clear the input field
			
//			cdriver.findElement(By.xpath(XpathUtils.AssignLeaveModule.employeeName)).clear();
//			cdriver.findElement(By.xpath(XpathUtils.AssignLeaveModule.leaveType)).clear();
//			
//			cdriver.findElement(By.xpath(XpathUtils.AssignLeaveModule.fromDate)).clear();
//			
//			cdriver.findElement(By.xpath(XpathUtils.AssignLeaveModule.toDate)).clear();
//			
//			cdriver.findElement(By.xpath(XpathUtils.AssignLeaveModule.comment)).clear();
			
			
		}
		
	}

}
