package StepDefinition;		
import org.openqa.selenium.By;

import PageObjects.HomePage;
import PageObjects.Register;
import PageObjects.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static PageObjects.Setup.driver;
import static PageObjects.Setup.objHomePage;
import static PageObjects.Setup.objRegister;

public class LoginSteps {

    @Given("^Open the Chrome and launch the application$")					
    public void open_the_chrome_and_launch_the_application()
    {	
    	Setup.DefaultSetup();
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
    	objRegister.doRegister(name, lastname, email, phone, skills, country, year, month, day, password);    	
    }

    @Then("^Register new User$")					
    public void	Register_new_user()
    {		
       driver.findElement(By.id("submitbtn")).click();					
    }		
}		