package Ex;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;
import org.testng.annotations.Parameters;


@Listeners({ATUReportsListener.class, ConfigurationListener.class,MethodListener.class })
public class Test_ex
{
	WebDriver driver;
	{
 		System.setProperty("atu.reporter.config","E:\\selenium\\maven1_prg\\atu.properties");
    }
	@Test
	@Parameters({"browser"})
	public void test(String br) throws Exception
	{
		if(br.matches("firefox"))
		{
		driver=new FirefoxDriver();
		}
		if(br.matches("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","e:\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		Home_g g=new Home_g(driver);
		 g.open();
		g.creac();
		Compose_g c=new Compose_g(driver);
		c.signin();
		c.sentmail();
		  
	}

}
