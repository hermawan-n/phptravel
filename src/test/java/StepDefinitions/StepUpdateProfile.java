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

    @Then("user login with email as {string} and password as {string}")
    public void user_login(String email, String password) {
        System.out.println("Inside Step - successfully login into phptravel");
        driver = Driver.getDriver();

        HomePage homePage = new HomePage();
        homePage.selectLogin();

        LoginPage loginPage = new LoginPage();
        loginPage.login(email, password);
    }

    @And("user go to profile page")
    public void user_go_to_profile_page() {
        System.out.println("Inside Step - user redirect to profile page");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.goTo_ProfilePage();
    }

    @And("user updates their profile info")
    public void user_updates_their_profile_info() {
        System.out.println("Inside Step - user updating their profile info");

        ProfilePage profilePage = new ProfilePage();
        profilePage.fillProfile();
        profilePage.clickUpdate();
    }

    @Then("profile successfully updated")
    public void profile_successfully_updated() {
        System.out.println("Inside Step - user successfully updated their profile");

        driver.getPageSource().contains("Profile updated successfully.");
    }
}
