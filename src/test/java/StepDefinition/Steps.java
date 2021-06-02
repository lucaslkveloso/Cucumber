package StepDefinition;		

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.HomePage;
import PageObjects.Register;
import PageObjects.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {				

    WebDriver driver;	
	HomePage objHomePage;
	Register objRegister;
   		
    @Given("^Open the Chrome and launch the application$")					
    public void open_the_chrome_and_launch_the_application()
    {	
    	Setup.DefaultSetup();
    	driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/");
		driver.manage().window().maximize();
    }	
    @When("^Navigation to register page$")		
    public void navigation_to_register_page()
    {	
    	objHomePage = new HomePage(driver);
    	objHomePage.ClickFirstProduct();
    }
    @When("^Enter the Name \"(.*?)\", LastName \"(.*?)\", Email \"(.*?)\", Phone \"(.*?)\", Skills \"(.*?)\", Country \"(.*?)\", Year \"(.*?)\", Month \"(.*?)\", Day \"(.*?)\" And Password \"(.*?)\"$")
    public void enter_the_Name_LastName_Email_Phone_Skills_Country_Year_Month_Day_And_Password(String name, String lastname, String email, String phone, String skills, String country, String year, String month, String day, String password)
    {
    	objRegister = new Register(driver);
    	//Verify login page title
    	//login to application
    	objRegister.doRegister(name, lastname, email, phone, skills, country, year, month, day, password);    	
    }

    @Then("^Register new User$")					
    public void	Register_new_user()
    {		
       driver.findElement(By.id("submitbtn")).click();					
    }		
}		