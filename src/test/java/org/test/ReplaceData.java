package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReplaceData {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\SampleFirst\\src\\test\\resources\\bilal.xlsx");
		FileInputStream fin = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fin);
	Sheet s = w.getSheet("test");
Row r = s.getRow(3);
	Cell c = r.getCell(0);
	String name = c.getStringCellValue();
if(name.equals("abcd")) {
	c.setCellValue("Gokila");
}
FileOutputStream fout = new FileOutputStream(f);
w.write(fout);
System.out.println("Saved");
	}
}
