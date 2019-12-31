package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register {
	WebDriver driver;
	By Name = By.xpath("//form[@id='basicBootstrapForm']/div/div/input");
	By LastName = By.xpath("//form[@id='basicBootstrapForm']/div/div[2]/input");
	By Email = By.xpath("//input[@type='email']");
	
	public Register(WebDriver driver){
		this.driver = driver;
	}
	//Set user name in textbox
	public void setUserName(String strUserName){
		driver.findElement(Name).sendKeys(strUserName);;
	}
	
	//Set password in password textbox
	public void setPassword(String strPassword){
		 driver.findElement(LastName).sendKeys(strPassword);
	}
		//Set password in password textbox
	public void setEmail(String strEmail){
		 driver.findElement(Email).sendKeys(strEmail);
	}
	
	public void doRegister(String Name,String LastName, String Email){
		//Fill user name
		this.setUserName(Name);
		//Fill password
		this.setPassword(LastName);
		
		//Fill email
		this.setEmail(Email);
	}

}
