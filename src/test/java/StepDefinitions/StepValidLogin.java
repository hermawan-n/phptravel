package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Driver.Driver;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;

public class StepValidLogin {
    WebDriver driver = null;

    @Given("user is on php travel page")
    public void user_is_in_php_travel_page(){
        System.out.println("Inside Step - user is on php travel page");
        driver = Driver.getDriver();
        driver.navigate().to("https://phptravels.net");
    }

    @Then("user click drop down account and choose customer login")
    public void user_click_drop_down_account_and_choose_customer_login(){
        System.out.println("Inside Step - user click dropdown and choose customer login");
        
        HomePage homePage = new HomePage(driver);
        homePage.selectLogin();
        // WebElement btn_account = driver.findElement(By.id("ACCOUNT"));
        // WebElement btn_loginPage = driver.findElement(By.xpath("//*[text()='Customer Login']"));

        // btn_account.click();
        // btn_loginPage.click();
    }
    
    @When("user enters email and password with the correct credentials then click login button")
    public void user_enters_blank_email_and_password_then_click_login_button(){
        System.out.println("Inside Step - user attempt to login with correct credentials");
        
        
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
    }

    @Then("user login successfully")
    public void user_login_successfully(){
        System.out.println("Inside Step - user login successfully");
        driver.getPageSource().contains("Dashboard");
    }
}
