package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\SampleFirst\\src\\test\\resources\\bilal.xlsx");
	FileInputStream fin = new FileInputStream(f);
Workbook w = new XSSFWorkbook(fin);
Sheet s = w.getSheet("test");
//to iterate the sheet
for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
	Row r = s.getRow(i);
	//to iterate the rows
	for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
		Cell c = r.getCell(j);
		System.out.println(c);
	}
}
}
}
