package TestRunner;

import org.junit.runner.RunWith;		
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(features= "classpath:Features",glue={"StepDefinition"})						
public class Runner 				
{		

}