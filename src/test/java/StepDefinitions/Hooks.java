package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    WebDriver driver;

    public Hooks(WebDriver driver){
        this.driver = driver;
    }
    
    // @Before
    // public void browserSetup(){
    //     System.out.println("Inside Step - browser is open");
    //     driver = Driver.getDriver();
    // }

    // @After
    // public void teardown() {
    //     driver.close();
    //     driver.quit();
    // }
}
