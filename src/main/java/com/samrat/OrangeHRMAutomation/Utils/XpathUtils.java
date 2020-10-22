package com.samrat.OrangeHRMAutomation.Utils;

public class XpathUtils {
	public static class LoginModule {
		public static final String username = "//*[@id=\"txtUsername\"]";
		public static final String password = "//*[@id=\"txtPassword\"]";
		public static final String loginButton = "//*[@id=\"btnLogin\"]";
	}
	public static class AssignLeaveModule{
		public static final String assignLeave = "//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[1]/div/a";
		public static final String employeeName = "//*[@id=\"assignleave_txtEmployee_empName\"]";
		public static final String leaveType = "//*[@id=\"assignleave_txtLeaveType\"]";
		public static final String leaveBalance = "";
		public static final String fromDate = "//*[@id=\"assignleave_txtFromDate\"]";
		public static final String fromDateMonth = "//*[@id=\"ui-datepicker-div\"]/div/div/select[1]";
		public static final String fromDateYear = "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]";
		public static final String fromDateDay = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[2]/a";
		public static final String toDate = "//*[@id=\"assignleave_txtToDate\"]";
		public static final String toDateMonth = "//*[@id=\"ui-datepicker-div\"]/div/div/select[1]";
		public static final String toDateYear = "//*[@id=\"ui-datepicker-div\"]/div/div/select[2]";
		public static final String toDateDay = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[5]/a";
		public static final String comment = "//*[@id=\"assignleave_txtComment\"]";
		public static final String AssignButton = "/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/p/input";
		public static final String datePicker = "/html/body/div[3]/table";
	}

}