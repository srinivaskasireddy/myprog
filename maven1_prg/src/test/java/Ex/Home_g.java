package Ex;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;

import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;

@Listeners({ATUReportsListener.class, ConfigurationListener.class,MethodListener.class })

public class Home_g 
{  
	WebDriver driver;
	{
 		System.setProperty("atu.reporter.config","E:\\selenium\\maven1_prg\\atu.properties");
    }
		public Home_g(WebDriver driver)
	{
		this.driver=driver;
	}
	public void open() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
	}
	public void creac() throws Exception
	{
	  driver.findElement(By.linkText("Create account")).click();
	  driver.findElement(By.id("FirstName")).sendKeys("abcde");
	  driver.findElement(By.id("LastName")).sendKeys("xyz");
	  driver.findElement(By.id("GmailAddress")).sendKeys("xyz1111");
	  driver.findElement(By.id("Passwd")).sendKeys("qwerty");
	  driver.findElement(By.id("PasswdAgain")).sendKeys("qwerty");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//label[@id='month-label']/span/div/div")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//label[@id='month-label']/span/div[2]/div[@id=':5']")).click();
	  driver.findElement(By.id("BirthDay")).sendKeys("06");
	  driver.findElement(By.id("BirthYear")).sendKeys("1992");
	  driver.findElement(By.xpath("//label[@id='gender-label']/div/div")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id(":f")).click();
	  
	}

}
