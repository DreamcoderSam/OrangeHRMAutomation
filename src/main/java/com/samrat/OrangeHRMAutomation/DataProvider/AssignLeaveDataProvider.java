package com.samrat.OrangeHRMAutomation.DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.samrat.OrangeHRMAutomation.Utils.ExcelUtils;

public class AssignLeaveDataProvider {
	@DataProvider(name = "leaveDataProvider")
	public static Object[][] getAssignLeaveData(){
		try {
			return new Object[][] {
				{
					ExcelUtils.getAssignLeaveData()
				},
			};
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
