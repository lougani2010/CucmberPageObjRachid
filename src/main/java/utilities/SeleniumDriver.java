package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriver {
	
	public static  SeleniumDriver seleniumDriver;
	private static WebDriver driver;
	public static WebDriverWait driverWait;
	public final static int TIMEOUT=30;
	public final static int PAGE_LOAD_TIMEOUT=50;
	
	//Constructor to initialize the driver
	private SeleniumDriver() {
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	}
	
	//get the URL
	
	public static void getURL(String url) {
		
		driver.get(url);
	}
	
	//method to return the Webdriver type
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	//method to set the WebDriver
	
	public static void setUpDriver() {
		
		if(seleniumDriver==null) {
			
			seleniumDriver=new SeleniumDriver();
			
		}
	}
	
	//close the browser
	
	public static void  tearDown() {
		if(driver!=null) {
			
			driver.close();
			driver.quit();
		}
		
	}
	
	

}
