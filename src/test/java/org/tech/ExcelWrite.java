package org.tech;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
public static void main(String[] args) throws IOException {
	 
	File loc = new File("C:\\Users\\Venkat\\eclipse-workspace\\FrameWorkSAmple\\ExcelData\\New.xlsx");
		
	Workbook w = new XSSFWorkbook();
	
	Sheet sht = w.createSheet();
	
	Map<String, Object[]> data = new TreeMap<String, Object[]>();
    data.put("1", new Object[] {"ID", "NAME", "LASTNAME"});
    data.put("2", new Object[] {1, "Amit", "Shukla"});
    data.put("3", new Object[] {2, "Lokesh", "Gupta"});
    data.put("4", new Object[] {3, "John", "Adwards"});
    data.put("5", new Object[] {4, "Brian", "Schultz"});
	for (Row d : sht) {
		System.out.println(d);
	}
	
	FileOutputStream fout = new FileOutputStream(loc);
	w.write(fout);
	
	System.out.println("Updated Done");
	

}
	
	
	
	
	
}
