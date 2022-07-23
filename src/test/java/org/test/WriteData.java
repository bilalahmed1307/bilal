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

public class WriteData {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\SampleFirst\\src\\test\\resources\\bilal1.xlsx");
	Workbook w = new XSSFWorkbook();
Sheet s =w.createSheet("Bilal");	
Row r = s.createRow(0);
Cell c = r.createCell(1);	
	c.setCellValue("Bilal ahmed");
	//to save the file
	FileOutputStream fout = new FileOutputStream(f);
	w.write(fout);
	System.out.println("Saved");
	}
}