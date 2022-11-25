package com.Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	public static XSSFWorkbook wb;
	
	ExcelDataProvider() throws Exception{
		
		String path="D:\\Demo Workspace\\Assignment\\Test_Data\\Data.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(file);	
	}
	
	public String Sheet_data(String sheetname,int row_num,int cell_num) {
		
		return wb.getSheet(sheetname).getRow(row_num).getCell(cell_num).getStringCellValue();
	}
	
}
