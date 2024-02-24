package com.utility;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader{
	
//	public static void main(String arg[]) {
//		
//		//getTestData();
//		
//		
//		
//	}

	public static Map<String, String> getTestData(String sheetName, int rowNumber) {
		
		Map<String, String> ioMap = new HashMap<>();
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(ExcelReader.class.getResourceAsStream("/SampleCode.xlsx"));
			XSSFSheet sheet = workbook.getSheet(sheetName);
			XSSFRow headerRow = sheet.getRow(0);
			
			String headerInput = headerRow.getCell(0).getStringCellValue();
			String headerOutput = headerRow.getCell(1).getStringCellValue();
			XSSFRow testRow = sheet.getRow(rowNumber);
			
			String pythonCode = testRow.getCell(0) != null ? testRow.getCell(0).getStringCellValue():"";
			String expectedOutput = testRow.getCell(1) != null ? testRow.getCell(1).getStringCellValue():"";
			
						
				ioMap.put(headerInput, pythonCode);
				ioMap.put(headerOutput, expectedOutput);
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return ioMap;
	}
	
	
}