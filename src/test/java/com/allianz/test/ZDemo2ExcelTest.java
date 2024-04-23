package com.allianz.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ZDemo2ExcelTest 
{

	public static void main(String[] args) throws IOException 
	{
		
		FileInputStream file = new FileInputStream("src/test/resources/test_data/hrm_data.xlsx");
		
		XSSFWorkbook book=new XSSFWorkbook(file);
		
		XSSFSheet sheet= book.getSheet("invalidLoginTest");
		
		
		Object[][] data=new Object[2][3];
		
		//write a logic to print all cell values one by one
		//add the values to two dim Object[][]
		for(int r=1;r<3;r++)
		{
			for(int c=0;c<3;c++)
			{
				String value= sheet.getRow(r).getCell(c).getStringCellValue();
				System.out.println(value);
				data[0][0]=value;
			}
		}
		
		book.close();
		file.close();
	}

	}


