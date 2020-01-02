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
	By Register = By.id("submitbtn");
	By Year = By.id("yearbox");
	By Month = By.xpath("//form[@id='basicBootstrapForm']/div[11]/div[2]/select");
	By Day = By.id("daybox");
	By Password = By.id("firstpassword");
	By SecondPassword = By.id("secondpassword");
	
	
	
	
	public Register(WebDriver driver){
		this.driver = driver;
	}
	//Set user name in textbox
	public void setUserName(String strUserName){
		driver.findElement(Name).sendKeys(strUserName);
	}
	
	//Set password in password textbox
	public void setLastName(String strLastname){
		 driver.findElement(LastName).sendKeys(strLastname);
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
	public void setYear(String strYear){
		Select selYear = new Select(driver.findElement(Year));
		selYear.selectByValue(strYear);
	}
	public void setMonth(String strMonth){
		Select selMonth = new Select(driver.findElement(Month));
		selMonth.selectByValue(strMonth);
	}
	public void setDay(String strDay){
		Select selDay = new Select(driver.findElement(Day));
		selDay.selectByValue(strDay);
	}
	public void setPassword(String strPassword){
		driver.findElement(Password).sendKeys(strPassword);
	}
	
	public void setSecPassword(String strPassword){
		driver.findElement(SecondPassword).sendKeys(strPassword);
	}
	
	public void setRegister() {
		driver.findElement(Register).click();
	}
	
	public void doRegister(String Name,String LastName, String Email, String Phone, String Skills, String Country, String Year, String Month, String Day, String Password){
		//Fill user name
		this.setUserName(Name);
		//Fill password
		this.setLastName(LastName);		
		//Fill email
		this.setEmail(Email);
		//Fill phone
		this.setPhone(Phone);
		//Change gender
		this.setGender();
		//Change skills
		this.setSkills(Skills);
		//Select Country
		this.setCountry(Country);
		//Select Year of Birthday
		this.setYear(Year);
		//Select Month
		this.setMonth(Month);
		//Select Day
		this.setDay(Day);	
		this.setPassword(Password);	
		this.setSecPassword(Password);	
		//End Register
		this.setRegister();
		
	}

}
