package Ex;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;

import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;

@Listeners({ATUReportsListener.class, ConfigurationListener.class,MethodListener.class })

public class Compose_g
{
	WebDriver driver;
	{
 		System.setProperty("atu.reporter.config","E:\\selenium\\maven1_prg\\atu.properties");
    }
			
	Compose_g(WebDriver driver)
	{
		this.driver=driver;
	}
	public void signin() throws Exception
	{
		Home_g x=new Home_g(driver); 
	      x.open();
	      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("Email")).sendKeys("**************");
		driver.findElement(By.id("next")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("Passwd")).sendKeys("*****************");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(4000);
		
	}
	public void sentmail() throws Exception
	{
      driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
      Thread.sleep(4000);
      driver.findElement(By.name("to")).sendKeys("srinivaskashireddy1992@gmail.com");
      driver.findElement(By.name("subjectbox")).sendKeys("empty message from nani");
      driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']")).sendKeys("hiiiii how ar u nani wat r u doing how is ur preperations going on how about your family");
      driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO T-I-atl L3']")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("//span[@class='gb_1a gbii']")).click();
      driver.findElement(By.linkText("Sign out")).click();
      driver.close();
      
	}

}
