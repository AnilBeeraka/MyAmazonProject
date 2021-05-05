package com.qa.testscripts;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.qa.testpages.AmazonPages;
public class TestBase {
	WebDriver driver;
	AmazonPages amzn;
	Actions act;
	JavascriptExecutor js;
	@Parameters({"Browser","Url"})
	@BeforeClass
	public void setup(String Browser,String Url)
	{
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Anil\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
			driver=new ChromeDriver();
			js=(JavascriptExecutor) driver;
			driver.manage().window().maximize();
		}
		if(Browser.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "S:\\Virtusa\\Softwares\\Drivers\\edgedriver_win64_2\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		//open chrome driver where you downloaded
		//scroll=new CS8_ScrollDownAmaznPages(driver);
		//amznCountry=new CS7_AmazonFooterCountriesPages(driver);
		//cBank=new CityBankPages(driver);
		amzn=new AmazonPages(driver);
		act=new Actions(driver);
		//GoogleOr=new GooglePages(driver);
		//driver.get("https://www.amazon.in/");
		driver.get(Url);
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}
}
