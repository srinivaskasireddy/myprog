package facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;

@Listeners({ATUReportsListener.class, ConfigurationListener.class,MethodListener.class })
public class Fb_data
{
	WebDriver driver;
	{
		System.setProperty("atu.reporter.config","E:\\selenium\\maven1_prg\\src\\test\\java\\facebook\\atu.properties");	   	
	}
	//hiii
    @Test
    @Parameters({"browser"})
	public void test(String br) throws Exception
	{
    	if(br.matches("firefox"))
    	{
    		driver= new FirefoxDriver();
    	}
    	if(br.matches("chrome"))
    	{
    		System.setProperty("webdriver.chrome.driver","e:\\chromedriver.exe");
    		driver=new ChromeDriver();
    	}
    	Fb_test f=new Fb_test(driver);
		f.open();
	}

}
