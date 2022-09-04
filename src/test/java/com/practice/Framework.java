package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Framework {

	public static void main(String[] args) throws IOException {
		
		//1.) Mention the path of excel sheet 
		File file = new File("C:\\Users\\ELCOT\\Eclipse\\Framework\\Excel Folder\\Book1.xlsx");
		
		//2.) Get the object/bytes from file 
		FileInputStream stream = new FileInputStream(file);
		
		//3.) Create the book...> collection of sheet 
		Workbook workbook = new XSSFWorkbook(stream);
		
		//4.) Get the sheet name
		Sheet sheet = workbook.getSheet("Sheet1");
		
		Row row = sheet.getRow(0);
		
		Cell cell = row.getCell(0);
		System.out.println(cell);
		
		
		
		
	}
	
	
	
}
