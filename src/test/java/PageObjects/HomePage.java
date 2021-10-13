package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	By firstProduct = By.id("btn2");
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}

		public void getFirstProduct(){
	        
			driver.findElement(firstProduct).click();
		}
		public void ClickFirstProduct(){
			this.getFirstProduct();
		}
}


