package DataDrivenTesing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {

	public static void main(String[] args) throws Throwable {
		//read the data
		FileInputStream a=new FileInputStream(".\\src\\test\\resources\\TestData\\Standup agenda.xlsx");
		
		//create an workbookfactory
		Workbook b = WorkbookFactory.create(a);
		
		//store the file in the variable
		String c = b.getSheet("Sheet1").getRow(3).getCell(2).getStringCellValue();
		
		System.out.println(c);

	}

}
