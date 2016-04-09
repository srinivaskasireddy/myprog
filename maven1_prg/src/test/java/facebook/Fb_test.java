package facebook;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;

import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;
import jxl.Sheet;
import jxl.Workbook;
@Listeners({ATUReportsListener.class, ConfigurationListener.class,MethodListener.class })
public class Fb_test
{
	WebDriver driver;
	{
 		System.setProperty("atu.reporter.config","E:\\selenium\\maven1_prg\\src\\test\\java\\facebook\\atu.properties");
    }
	
	Fb_test(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void open() throws Exception
	{
		FileInputStream fs=new FileInputStream("E:\\Book1.xls");
		Workbook wb=Workbook.getWorkbook(fs);
		Sheet ws=wb.getSheet("Sheet1");
		for(int r=1;r<ws.getRows();r++)
		{
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http:/www.facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys(ws.getCell(0,r).getContents());
		driver.findElement(By.id("pass")).sendKeys(ws.getCell(1,r).getContents());
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(5000);
		}
		driver.findElement(By.id("userNavigationLabel")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log Out")).click();
		}
	}

