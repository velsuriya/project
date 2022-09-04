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

public class ValueInsert {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\ELCOT\\Eclipse\\Framework\\Excel Folder\\Datas.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Data");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(1);
		// Get the text from cell
		String value = cell.getStringCellValue();
		// verify the cell data is eqal to oracle
		if (value.equals("kumar")) {
			// insert value
			cell.setCellValue("java");

		}
		// objects to file (Excel)....> save
		FileOutputStream out = new FileOutputStream(file);
		// update / write in workbook
		workbook.write(out);

	}

}
