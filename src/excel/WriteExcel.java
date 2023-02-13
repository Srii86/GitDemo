package excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import browser.Browser;
import locators.Locators;
public class WriteExcel extends Browser
{
	public static void write() throws Exception 
	{
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("SampleSheet");
		//TabTitleVerifying
		String title=Locators.verifyTitle(driver);
		if(title.equals("Mobiles- Buy Products Online at Best Price in India - All Categories | Flipkart.com"))
		{
			sheet.createRow(0);
			sheet.getRow(0).createCell(0).setCellValue("Title is Matched (Mobiles- Buy Products Online at Best Price in India - All Categories | Flipkart.com)");
		}
		else
		{
			sheet.createRow(0);
			sheet.getRow(0).createCell(0).setCellValue("Title is NOT Matched");
		}
		//Heading
		sheet.createRow(2);
		sheet.getRow(2).createCell(0).setCellValue("Mobile");
		sheet.getRow(2).createCell(1).setCellValue("Price");
		//Mobile 1
		sheet.createRow(3);
		String mobile_name1 = Locators.firstMobile().getText();
		sheet.getRow(3).createCell(0).setCellValue(mobile_name1);
		String price1 = Locators.firstMobilePrice().getText();
		sheet.getRow(3).createCell(1).setCellValue(price1);
		//Mobile2
		sheet.createRow(4);
		String mobile_name2 = Locators.secondMobile().getText();
		sheet.getRow(4).createCell(0).setCellValue(mobile_name2);
		String price2 = Locators.secondMobilePrice().getText();
		sheet.getRow(4).createCell(1).setCellValue(price2);
		//Mobile3
		sheet.createRow(5);
		String mobile_name3 = Locators.thirdMobile().getText();
		sheet.getRow(5).createCell(0).setCellValue(mobile_name3);
		String price3 = Locators.thirdMobilePrice().getText();
		sheet.getRow(5).createCell(1).setCellValue(price3);
		//Mobile4
		sheet.createRow(6);
		String mobile_name4 = Locators.fourthMobile().getText();
		sheet.getRow(6).createCell(0).setCellValue(mobile_name4);
		String price4 = Locators.fourthMobilePrice().getText();
		sheet.getRow(6).createCell(1).setCellValue(price4);
		//Mobile5
		sheet.createRow(7);
		String mobile_name5 = Locators.fifthMobile().getText();
		sheet.getRow(7).createCell(0).setCellValue(mobile_name5);
		String price5 = Locators.fifthMobilePrice().getText();
		sheet.getRow(7).createCell(1).setCellValue(price5);
		//less than 30000
		String price=Locators.firstMobilePrice().getText();
		String pr=price.substring(1).replace(",", "");
		int cost=Integer.parseInt(pr);
		if(cost<30000)
		{
			sheet.createRow(9);
			sheet.getRow(9).createCell(0).setCellValue("Price of the First Mobile is 'Less Than 30000'");
		}
		else
		{
			sheet.createRow(9);
			sheet.getRow(9).createCell(0).setCellValue("Price of the First Mobile is 'Not Less Than 30000'");
		}
		try
		{
			FileOutputStream writefile=new FileOutputStream("C:\\Users\\likit\\eclipse-workspace\\E Commerce Automation\\Excel\\EAutomationResult.xlsx");
			workbook.write(writefile);
			writefile.close();
			workbook.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		workbook.close();
		
	}
	
}
