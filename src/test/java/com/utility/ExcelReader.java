package com.utility;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader{
	

	public static Map<String, String> getTestData(String sheetName, int rowNumber) {
		
		Map<String, String> ioMap = new HashMap<>();
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(ExcelReader.class.getResourceAsStream("/SampleCode.xlsx"));
			XSSFSheet sheet = workbook.getSheet(sheetName);
			XSSFRow headerRow = sheet.getRow(0);
			XSSFRow testRow = sheet.getRow(rowNumber);
			for(int i=0;i<headerRow.getLastCellNum();i++) {
			
				String colHeader = headerRow.getCell(i).getStringCellValue();
			
				String colValue = testRow.getCell(i) != null ? testRow.getCell(i).getStringCellValue():"";
			
				ioMap.put(colHeader, colValue);
			
			}			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return ioMap;
	}
	
	
}