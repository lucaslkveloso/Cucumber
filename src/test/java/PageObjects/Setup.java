package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Setup {
	public static WebDriver driver;
	public static HomePage objHomePage;
	public static Register objRegister;

	public static void DefaultSetup() {
		//Start Windows
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium/chromedriver.exe");
		
		//Start on Mac
		System.setProperty("webdriver.chrome.driver", "E:Java\\chromedriver.exe");
	
		System.setProperty("webdriver.chrome.args", "--disable-logging");
		System.setProperty("webdriver.chrome.args", "--disable-logging");
        System.setProperty("webdriver.chrome.silentOutput", "true");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/");
		driver.manage().window().maximize();
	}
}
