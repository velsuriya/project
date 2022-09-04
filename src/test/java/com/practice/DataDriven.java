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

public class DataDriven {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\ELCOT\\Eclipse\\Framework\\Excel Folder\\Datas.xlsx");
        FileInputStream stream = new  FileInputStream(file);
        Workbook workbook = new XSSFWorkbook(stream);
        Sheet sheet = workbook.getSheet("Data");
        
        // ROWS COUNT
       // int count = sheet.getPhysicalNumberOfRows();
       // System.out.println(count);
        
        // get the particular row to count the cell
        //Row row = sheet.getRow(4);
       
        // cell count 
        
       // int count1 = row.getPhysicalNumberOfCells();
       // System.out.println(count1);
        
        // In particular row how many no of cell
       // Row row2 = sheet.getRow(4);
        
       // for (int i = 0; i < row2.getPhysicalNumberOfCells(); i++) {
		//	Cell cell = row2.getCell(i);
			//System.out.println(cell);
		
        //5.) Iterate the all rows 
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
        //5.1) Get the each row 
        	Row row = sheet.getRow(i);
        //5.2) Iterate the all cells 
        	for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
        //5.2.1) Get the each cell
        		Cell cell = row.getCell(j);
        		System.out.println(cell);
				
			}
			
		
			
			
			
	}
        
        
  }		

}

