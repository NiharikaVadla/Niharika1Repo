package com.vtiger.genericUtility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	public String readDataFileFromExcel(String sheetname,int rownum,int cellnum) throws Throwable{
		//FileInputStream fis =new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\Framework\\src\\test\\resources\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(Iconstantpaths.filepath);
		Workbook wb = WorkbookFactory.create(fis);
		 return wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	}
}
