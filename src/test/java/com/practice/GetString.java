package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetString {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\ELCOT\\Eclipse\\Framework\\Excel Folder\\Datas.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Data");
		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				CellType type = cell.getCellType();
				switch (type) {
				case STRING:
					String name = cell.getStringCellValue();
					System.out.println(name);
					break;
				case NUMERIC:
					double d = cell.getNumericCellValue();
					BigDecimal b = BigDecimal.valueOf(d);
					String num = b.toString();
					System.out.println(num);

				default:
					break;
				}

			}

		}

	}

}
