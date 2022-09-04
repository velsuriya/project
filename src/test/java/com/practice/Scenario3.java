package com.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Scenario3 {

	public static void main(String[] args) throws IOException {
	File file = new File("C:\\Users\\ELCOT\\Eclipse\\Framework\\Excel Folder\\scenario.xlsx");	
	Workbook workbook = new XSSFWorkbook();	
	Sheet sheet = workbook.createSheet("Datas");
	Row row = sheet.createRow(12);
	Cell cell = row.createCell(0);
	cell.setCellValue("API");
	FileOutputStream out = new FileOutputStream(file);	
	workbook.write(out);	
		
		
		
		
		
		
		
		
		

	}

}
