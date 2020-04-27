package com.ExcelReadWrite;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		
//		Blank workBook ............... 
		XSSFWorkbook workbook = new XSSFWorkbook();		
//		Create a blank work sheet ...............
		XSSFSheet sheet = workbook.createSheet("Student");	
//		Data .....................
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		
		data.put("1", new Object[] {"ID", "Name", "City"});
		data.put("2", new Object[] {"1", "Rahim", "Dhaka"});
		data.put("3", new Object[] {"2", "Karim", "Barisal"});
		data.put("4", new Object[] {"3", "Jabbar", "Khulna"});
		
//		Iterate over data and write to sheet 
		Set<String> keyset = data.keySet();
		int rownum = 0;
		for(String key:keyset)
		{
			Row row = sheet.createRow(rownum++);
			Object[] objarr = data.get(key);
			int cellnum = 0;	
			for (Object obj:objarr) 
			{
				Cell cell = row.createCell(cellnum++);
				
				if (obj instanceof String)
				    cell.setCellValue((String)obj);
				else if (obj instanceof Integer)
					cell.setCellValue((Integer)obj);
			}
		}
		FileOutputStream out = new FileOutputStream(new File(System.getProperty("user.dir")
				+"\\TestData\\MyCreate_Data.xlsx"));
		workbook.write(out);
		out.close();
		System.out.println("MyCreate_Data.xlsx written succesfully"); 

	}

}

