package com.samrat.OrangeHRMAutomation.DTO;

public class AssignLeaveDTO {
	private String employeeNmae;
	private String leaveType;
	private String fdMonth;
	private String fdYear;
	private String fdDay;
	private String tdMonth;
	private String tdYear;
	private String tdDay;
	private String comment;
	
	public String getEmployeeNmae() {
		return employeeNmae;
	}
	public void setEmployeeNmae(String employeeNmae) {
		this.employeeNmae = employeeNmae;
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public String getFdMonth() {
		return fdMonth;
	}
	public void setFdMonth(String fdMonth) {
		this.fdMonth = fdMonth;
	}
	public String getFdYear() {
		return fdYear;
	}
	public void setFdYear(String fdYear) {
		this.fdYear = fdYear;
	}
	public String getFdDay() {
		return fdDay;
	}
	public void setFdDay(String fdDay) {
		this.fdDay = fdDay;
	}
	public String getTdMonth() {
		return tdMonth;
	}
	public void setTdMonth(String tdMonth) {
		this.tdMonth = tdMonth;
	}
	public String getTdYear() {
		return tdYear;
	}
	public void setTdYear(String tdYear) {
		this.tdYear = tdYear;
	}
	public String getTdDay() {
		return tdDay;
	}
	public void setTdDay(String tdDay) {
		this.tdDay = tdDay;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "AssignLeaveDTO [employeeNmae=" + employeeNmae + ", leaveType=" + leaveType + ", fdMonth=" + fdMonth
				+ ", fdYear=" + fdYear + ", fdDay=" + fdDay + ", tdMonth=" + tdMonth + ", tdYear=" + tdYear + ", tdDay="
				+ tdDay + ", comment=" + comment + "]";
	}
	
	

}
