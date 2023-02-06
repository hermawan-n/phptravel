package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Driver.Driver;
import PageObjects.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepInvalidLogin {
    WebDriver driver;

    @When("user enters blank email and password then click login button")
    public void user_enters_blank_email_and_password_then_click_login_button(){
        System.out.println("Inside Step - user do not input any credentials");

        driver = Driver.getDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enter();
    }

    @Then("user asked to enter credentials")
    public void user_asked_to_enter_credentials(){
        System.out.println("Inside Step - user failed to login and asked to enter account credentials");
        
        driver.getPageSource().contains("Please enter your account credentials below");
    }
}
