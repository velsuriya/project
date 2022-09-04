package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Scenario2 {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\ELCOT\\Eclipse\\Framework\\Excel Folder\\Datas.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Data");
		// Scenario 1
		// Row row = sheet.getRow(3);
		// Cell cell = row.createCell(12);
		// cell.setCellValue("surya");
		// Scenario 2
		Row row = sheet.createRow(11);
		Cell cell = row.createCell(0);
		cell.setCellValue("Frame");
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);

	}

}
