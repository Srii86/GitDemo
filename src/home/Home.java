package home;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import browser.Browser;
import excel.ReadExcel;
import excel.WriteExcel;
import locators.Locators;

public class Home extends Browser
{
	public void pop_up() throws Exception 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Locators.popUp().click();
	}
	
	public void search_box() throws IOException
	{
		String input_data_from_excel=ReadExcel.readExcel();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement input = Locators.inputBox();
		input.sendKeys(input_data_from_excel);
	}
	
	public void Search_click()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Locators.Search().click();
	}
	
	public void dropDownSelect()
	{
		WebElement dropdown=Locators.dropDown();
		//dropdown.click();
		Select se=new Select(dropdown);
		se.selectByValue("30000");
	}
	
	public void website_title()
	{
		String title=Locators.verifyTitle(driver);
		if(title.equals("Mobiles- Buy Products Online at Best Price in India - All Categories | Flipkart.com"))
		{
			System.out.println("Title is Matched (Mobiles- Buy Products Online at Best Price in India - All Categories | Flipkart.com)");
		}
		else
		{
			System.out.println("Title is NOT Matched");
		}
	}
	
	public void first_mobile()
	{
		String price=Locators.firstMobilePrice().getText();
		String pr=price.substring(1);
		System.out.println(Locators.firstMobile().getText()+":"+pr);
	}
	
	public void second_mobile()
	{
		String price=Locators.secondMobilePrice().getText();
		String pr=price.substring(1);
		System.out.println(Locators.secondMobile().getText()+":"+pr);
	}
	
	public void third_mobile()
	{ 	
		String price=Locators.thirdMobilePrice().getText();
		String pr=price.substring(1);
		System.out.println(Locators.thirdMobile().getText()+":"+pr);
	}
	
	public void fourth_mobile()
	{
		String price=Locators.fourthMobilePrice().getText();
		String pr=price.substring(1);
		System.out.println(Locators.fourthMobile().getText()+":"+pr);
	}
	
	public void fifth_mobile()
	{
		String price=Locators.fifthMobilePrice().getText();
		String pr=price.substring(1);
		System.out.println(Locators.fifthMobile().getText()+":"+pr);
	}
	
	/*public void cost_first_mobile()
	{
		String price=Locators.firstMobilePrice().getText();
		String pr=price.substring(1);
		System.out.println(pr);
	}
	
	public void cost_second_mobile()
	{
		String price=Locators.secondMobilePrice().getText();
		String pr=price.substring(1);
		System.out.println(pr);
	}
	
	public void cost_third_mobile()
	{
		String price=Locators.thirdMobilePrice().getText();
		String pr=price.substring(1);
		System.out.println(pr);
	}
	
	public void cost_fourth_mobile()
	{
		String price=Locators.fourthMobilePrice().getText();
		String pr=price.substring(1);
		System.out.println(pr);
	}
	
	public void cost_fifth_mobile()
	{
		String price=Locators.fifthMobilePrice().getText();
		String pr=price.substring(1);
		System.out.println(pr);
	}*/
	
	public void check_first_mobile_price()
	{
		String price=Locators.firstMobilePrice().getText();
		String pr=price.substring(1).replace(",", "");
		int price1=Integer.parseInt(pr);
		if(price1<30000)
		{
			System.out.println("Price of the First Mobile is 'Less Than 30000'");
		}
		else
		{
			System.out.println("Price of the First Mobile is 'Not Less Than 30000'");
		}
	}
	
	public static void main(String[] args) throws Exception 
	{
		Home obj = new Home();
		setDriver();
		getUrl();
		obj.pop_up();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		obj.search_box();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		obj.Search_click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		obj.dropDownSelect();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		obj.website_title();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		obj.first_mobile();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		obj.second_mobile();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		obj.third_mobile();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		obj.fourth_mobile();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		obj.fifth_mobile();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		obj.check_first_mobile_price();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WriteExcel.write();
		
		closeBrowser();
	}
	
	

}
