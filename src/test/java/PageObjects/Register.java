package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {
	WebDriver driver;
	By Name = By.xpath("//form[@id='basicBootstrapForm']/div/div/input");
	By LastName = By.xpath("//form[@id='basicBootstrapForm']/div/div[2]/input");
	By Email = By.xpath("//input[@type='email']");
	By Phone = By.xpath("//input[@type='tel']");
	By Gender = By.name("radiooptions");
	By Skills = By.id("Skills");
	By Countries = By.id("countries");
	
	public Register(WebDriver driver){
		this.driver = driver;
	}
	//Set user name in textbox
	public void setUserName(String strUserName){
		driver.findElement(Name).sendKeys(strUserName);
	}
	
	//Set password in password textbox
	public void setPassword(String strPassword){
		 driver.findElement(LastName).sendKeys(strPassword);
	}

	public void setEmail(String strEmail){
		 driver.findElement(Email).sendKeys(strEmail);
	}
	public void setPhone(String strPhone){
		 driver.findElement(Phone).sendKeys(strPhone);
	}
	public void setGender(){
		 driver.findElement(Gender).click();
	}
	public void setSkills(String strSkills){
		Select selSkills = new Select(driver.findElement(Skills));
		selSkills.selectByValue(strSkills);
	}
	public void setCountry(String strCountry){
		Select selCountry = new Select(driver.findElement(Countries));
		selCountry.selectByValue(strCountry);
	}
	
	
	public void doRegister(String Name,String LastName, String Email, String Phone, String Skills, String Country){
		//Fill user name
		this.setUserName(Name);
		//Fill password
		this.setPassword(LastName);		
		//Fill email
		this.setEmail(Email);
		this.setPhone(Phone);
		this.setGender();
		this.setSkills(Skills);
		this.setCountry(Country);
		
	}

}
