package StepDefinition;		

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.HomePage;
import PageObjects.Register;
import PageObjects.Setup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {				

    WebDriver driver;	
	HomePage objHomePage;
	Register objRegister;
   		
    @Given("^Open the Chrome and launch the application$")					
    public void open_the_chrome_and_launch_the_application() throws Throwable							
    {	
    	Setup.DefaultSetup();
    	driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/");
		driver.manage().window().maximize();
    }	
    @When("^Navigation to register page$")		
    public void navigation_to_register_page() throws Throwable 							
    {	
    	objHomePage = new HomePage(driver);
    	objHomePage.ClickFirstProduct();
    }
    @When("^Enter the Name \"(.*?)\", LastName \"(.*?)\"	and Email \"(.*?)\"$")
    public void enter_the_Name_LastName_and_Email(String name, String lastname, String email) throws Throwable
    {
    	objRegister = new Register(driver);
    	//Verify login page title
    	//login to application
    	objRegister.doRegister(name, lastname, email);    	
    }

    @Then("^Reset the credential$")					
    public void	Reset_the_credential() throws Throwable 							
    {		
       driver.findElement(By.name("btnReset")).click();					
    }		
}		