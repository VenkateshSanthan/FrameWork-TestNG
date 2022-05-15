package org.tech;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excel {
public static void main(String[] args) throws IOException {

	 File loc = new File("C:\\Users\\Venkat\\eclipse-workspace\\FrameWorkSAmple\\ExcelData\\Book1.xlsx");
	
	 FileInputStream fin = new FileInputStream(loc);
	 Workbook w = new XSSFWorkbook(fin);
	 
	 Sheet sht = w.getSheet("Sheet1");
	
	 
		Row r = sht.getRow(5);
		Cell c = r.getCell(1);
			String value = c.getStringCellValue();
			if (value.contains("Hotel Sunshine"))
			{
				c.setCellValue("Hotel Creek");
			}
			FileOutputStream fo = new FileOutputStream(loc);
			w.write(fo);
			
			System.out.print("Update Done");
		}
	 
	}
	
	
	


