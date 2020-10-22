package com.samrat.OrangeHRMAutomation.Utils;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.samrat.OrangeHRMAutomation.DTO.AssignLeaveDTO;
import com.samrat.OrangeHRMAutomation.DTO.LoginDTO;

public class ExcelUtils {
	private static FileInputStream inputStream = null;
	private static Workbook workbook = null;
	
	private static Sheet getsheet (int sheetNo) throws IOException {
		//Create an object of File class to open xlsx file
		//File excelFile = new File("G:\\Software Testing With Selenium BITM\\Selenium Files\\HRMDataFile.xlsx");
		//Create an object of FileInputStream class to read excel file
		//inputStream = new FileInputStream(excelFile);
		// File is in project folder
		File excel = new File("src/main/java");
		File dirExcel = new File(excel, "HRMDataFile.xlsx");
		inputStream = new FileInputStream(new File(dirExcel.getAbsolutePath()));
		
		//create object of XSSFWorkbook class. Get WorkBook
		workbook = new XSSFWorkbook(inputStream);
		//Read sheet inside the workbook by its index
		Sheet sheet = workbook.getSheetAt(sheetNo);
		return sheet;
	}
	// Data Driven Login Test
	public static List<LoginDTO> getLoginData () throws IOException{
		
		List<LoginDTO> loginData = new ArrayList<LoginDTO>();
		DataFormatter formater = new DataFormatter();
		
		Iterator<Row> rowiterator = ExcelUtils.getsheet(0).iterator();
		
		while (rowiterator.hasNext()) {
			Row row = rowiterator.next();
			
			Iterator<Cell> celliterator = row.cellIterator();
			LoginDTO logdata = new LoginDTO();
			byte cellcounter = 0;
			while (celliterator.hasNext()) {
				Cell cell = celliterator.next();
				
				switch (cellcounter) {
				case 0:
					logdata.setUsername(formater.formatCellValue(cell));
					cellcounter++;
					break;
				case 1:
					logdata.setPassword(formater.formatCellValue(cell));
					cellcounter++;
					break;
				case 2:
					logdata.setUsername(formater.formatCellValue(cell));
					cellcounter++;
					break;
				case 3:
					logdata.setPassword(formater.formatCellValue(cell));
					break;
				}
				
			}
			loginData.add(logdata);
		}
		close();
		return loginData;
	}
	
	
	// Data Driven Assign Leave Test
	public static List<AssignLeaveDTO> getAssignLeaveData () throws IOException {
		List<AssignLeaveDTO> assignLeaveData = new ArrayList<AssignLeaveDTO>();
		DataFormatter leaveformatter = new DataFormatter();
		
		Iterator<Row> leaveRowIterator = ExcelUtils.getsheet(1).iterator();
		while (leaveRowIterator.hasNext()) {
			Row row = leaveRowIterator.next();
			Iterator<Cell> leaveCellIterator = row.cellIterator();
			AssignLeaveDTO leavedto = new AssignLeaveDTO();
			byte cellcounter = 0;
			while (leaveCellIterator.hasNext()) {
				Cell cell = leaveCellIterator.next();
				switch (cellcounter) {
				case 0:
					leavedto.setEmployeeNmae(leaveformatter.formatCellValue(cell));
					cellcounter++;
					break;
				case 1:
					leavedto.setLeaveType(leaveformatter.formatCellValue(cell));
					cellcounter++;
					break;
				case 2:
					leavedto.setFdMonth(leaveformatter.formatCellValue(cell));
					cellcounter++;
					break;
				case 3:
					leavedto.setFdYear(leaveformatter.formatCellValue(cell));
					cellcounter++;
					break;
				case 4:
					leavedto.setFdDay(leaveformatter.formatCellValue(cell));
					cellcounter++;
					break;
				case 5:
					leavedto.setTdMonth(leaveformatter.formatCellValue(cell));
					cellcounter++;
					break;
				case 6:
					leavedto.setTdYear(leaveformatter.formatCellValue(cell));
					cellcounter++;
					break;
				case 7:
					leavedto.setTdDay(leaveformatter.formatCellValue(cell));
					cellcounter++;
					break;
				case 8:
					leavedto.setComment(leaveformatter.formatCellValue(cell));
					cellcounter++;
					break;
				case 9:
					leavedto.setEmployeeNmae(leaveformatter.formatCellValue(cell));
					cellcounter++;
					break;
				case 10:
					leavedto.setLeaveType(leaveformatter.formatCellValue(cell));
					cellcounter++;
					break;
				case 11:
					leavedto.setFdMonth(leaveformatter.formatCellValue(cell));
					cellcounter++;
					break;
				case 12:
					leavedto.setFdYear(leaveformatter.formatCellValue(cell));
					cellcounter++;
					break;
				case 13:
					leavedto.setFdDay(leaveformatter.formatCellValue(cell));
					cellcounter++;
					break;
				case 14:
					leavedto.setTdMonth(leaveformatter.formatCellValue(cell));
					cellcounter++;
					break;
				case 15:
					leavedto.setTdYear(leaveformatter.formatCellValue(cell));
					cellcounter++;
					break;
				case 16:
					leavedto.setTdDay(leaveformatter.formatCellValue(cell));
					cellcounter++;
					break;
				case 17:
					leavedto.setComment(leaveformatter.formatCellValue(cell));
					break;
				}
				
			}
			assignLeaveData.add(leavedto);
			
		}
		close();
		return assignLeaveData;
		
	}
	
	private static void close() throws IOException {
		workbook.close();
		inputStream.close();
		
	}

}
