package PageObjects;

public class Setup {
	public static void DefaultSetup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium/chromedriver.exe");
	
		System.setProperty("webdriver.chrome.args", "--disable-logging");
        System.setProperty("webdriver.chrome.silentOutput", "true");
	}
}

