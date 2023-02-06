package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Driver.Driver;
import PageObjects.DashboardPage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.ProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class StepUpdateProfile {
    WebDriver driver;

    @Then("user login")
    public void user_login(){
        System.out.println("Inside Step - successfully login into phptravel");
        driver = Driver.getDriver();

        HomePage homePage = new HomePage(driver);
        homePage.selectLogin();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
    }

    @And("user go to profile page")
    public void user_go_to_profile_page(){
        System.out.println("Inside Step - user redirect to profile page");

        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.goTo_ProfilePage();
    }

    @And("user updates their profile info")
    public void user_updates_their_profile_info(){
        System.out.println("Inside Step - user updating their profile info");

        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.fillProfile();
        profilePage.clickUpdate();
    }

    @Then("profile successfully updated")
    public void profile_successfully_updated(){
        System.out.println("Inside Step - user successfully updated their profile");

        driver.getPageSource().contains("Profile updated successfully.");
    }
}
