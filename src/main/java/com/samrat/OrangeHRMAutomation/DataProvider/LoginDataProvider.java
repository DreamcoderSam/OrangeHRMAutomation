package com.samrat.OrangeHRMAutomation.DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.samrat.OrangeHRMAutomation.Utils.ExcelUtils;

public class LoginDataProvider {
	@DataProvider(name = "loginDataProvider")
	public static Object[][] getLoginData() {
		try {
			return new Object[][] { { ExcelUtils.getLoginData() },

			};
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

	}

}
