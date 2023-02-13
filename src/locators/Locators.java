package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import browser.Browser;

public class Locators extends Browser 
{
	public Locators() throws Exception 
	{
		super();
	}
	
	public static WebElement popUp() throws Exception
	{
		WebElement popup = driver.findElement(By.className("_2doB4z")); //used second part of class name since there are number of elements with the same class name
		return popup;
	}
	
	public static WebElement inputBox()
	{
		WebElement input_box=driver.findElement(By.name("q"));
		return input_box; 
	}
	
	public static WebElement Search()
	{
		WebElement search=driver.findElement(By.className("L0Z3Pu"));
		return search; 
	}
	
	public static WebElement dropDown()
	{
		WebElement select=driver.findElement(By.xpath("//div[@class='_3uDYxP']/select")); 
		return select; 
	}
	
	public static String verifyTitle(WebDriver driver)
	{
		return driver.getTitle();
	}
	
	public static WebElement firstMobile()
	{
		return driver.findElement(By.xpath("//div[@class='_1YokD2 _2GoDe3']/div[2]/div[2]/div/div/div/a/div[2]/div/div[1]"));
	}
	
	public static WebElement secondMobile()
	{
		return driver.findElement(By.xpath("//div[@class='_1YokD2 _2GoDe3']/div[2]/div[3]/div/div/div/a/div[2]/div/div[1]"));
	}
	
	public static WebElement thirdMobile()
	{
		return driver.findElement(By.xpath("//div[@class='_1YokD2 _2GoDe3']/div[2]/div[4]/div/div/div/a/div[2]/div/div[1]"));
	}
	
	public static WebElement fourthMobile()
	{
		return driver.findElement(By.xpath("//div[@class='_1YokD2 _2GoDe3']/div[2]/div[5]/div/div/div/a/div[2]/div/div[1]"));
	}
	
	public static WebElement fifthMobile()
	{
		return driver.findElement(By.xpath("//div[@class='_1YokD2 _2GoDe3']/div[2]/div[6]/div/div/div/a/div[2]/div/div[1]"));
	}
	
	public static WebElement firstMobilePrice()
	{
		return driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[2]/div[1]/div[1]/div[1]"));
	}
	
	public static WebElement secondMobilePrice()
	{
		return driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[2]/div[1]/div[1]/div[1]"));
	}
	
	public static WebElement thirdMobilePrice()
	{
		return driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/a[1]/div[2]/div[2]/div[1]/div[1]/div[1]"));
	}
	
	public static WebElement fourthMobilePrice()
	{
		return driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/a[1]/div[2]/div[2]/div[1]/div[1]/div[1]"));
	}
	
	public static WebElement fifthMobilePrice()
	{
		return driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[6]/div[1]/div[1]/div[1]/a[1]/div[2]/div[2]/div[1]/div[1]/div[1]"));
	}
	
}
