package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DateRead {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\SampleFirst\\src\\test\\resources\\bilal.xlsx");
		FileInputStream fin = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fin);
	Sheet s = w.getSheet("test");
for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
	Row r = s.getRow(i);
	for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
		Cell c = r.getCell(j);
	//0--> numeric cell, 1-->String cell
		int type = c.getCellType();
	if(type==1) {
	String str = c.getStringCellValue();
	System.out.println(str);
	}if(type==0) {
		boolean b = DateUtil.isCellDateFormatted(c);
		if(b==true) {
			Date date = c.getDateCellValue();
			SimpleDateFormat fr = new SimpleDateFormat("dd-MMM-yyyy");
		String date1 = fr.format(date);
		System.out.println(date1);
		}else {
			double dou = c.getNumericCellValue();
		long l = (long) dou;
		String phno = String.valueOf(l);
		System.out.println(phno);
		}
	}
}	
}
}
}
