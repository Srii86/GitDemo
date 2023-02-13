package browser;
import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser 
{
	public static WebDriver driver;
	
	public static WebDriver setDriver()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Which browser would you like to execute the script on? \n" 
				+ "1. Google Chrome \n"
				+ "2. Internet Explorer");
		int browser_choice=sc.nextInt();
		if(browser_choice==1)
		{
			driver=setChromeDriver();
		}
		else if(browser_choice==2)
		{
			driver=setIEDriver();
		}
		else
		{
			System.out.println("Please choose valid option");
		}
		sc.close();
		return driver;
	}
	public static WebDriver setChromeDriver()
	{
		String driverPath = "C:\\Users\\likit\\eclipse-workspace\\E Commerce Automation\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		return driver;
	}
	
	public static WebDriver setIEDriver() 
	{
		String driverPath = "C:\\Users\\likit\\eclipse-workspace\\E Commerce Automation\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", driverPath);
		driver = new InternetExplorerDriver();
		return driver;
	}
	
	public static void getUrl() throws Exception
	{
		String filelocation = "C:\\Users\\likit\\eclipse-workspace\\E Commerce Automation\\ApplicationProperty\\Configure.properties";
		File file = new File(filelocation);
		FileInputStream fileinput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileinput);
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public static void closeBrowser() 
	{
		driver.quit();
	}

}
