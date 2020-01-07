package PageObjects;

public class Setup {
	public static void DefaultSetup() {
		//Start Windows
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium/chromedriver.exe");
		
		//Start on Mac
		System.setProperty("webdriver.chrome.driver", "../../eclipseLib/chromedriver");
	
		System.setProperty("webdriver.chrome.args", "--disable-logging");
		System.setProperty("webdriver.chrome.args", "--disable-logging");
        System.setProperty("webdriver.chrome.silentOutput", "true");
	}
}
