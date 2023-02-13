package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{
	public static String readExcel() throws IOException 
	{
		//Getting the Relative path for excel from Source Excel folder
		String filePath = "C:\\Users\\likit\\eclipse-workspace\\E Commerce Automation\\Excel\\flipkart.xlsx";
		FileInputStream file = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet ws = wb.getSheetAt(0);
		String testData = String.valueOf(ws.getRow(0).getCell(0));
		wb.close();
		return testData;
	}
}

