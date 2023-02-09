package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Driver.Driver;
import PageObjects.BookingPage;
import PageObjects.HomePage;
import PageObjects.HotelPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class StepBookingHotel {
    WebDriver driver = Driver.getDriver();
    HotelPage hotelPage = new HotelPage();
    BookingPage bookingPage = new BookingPage();
    HomePage homePage = new HomePage();

    @Then("user go to {string} page")
    public void user_go_to_page(String string) {
        System.out.println("Inside Step - clicks on navbar menu " + string + "");

        homePage.goTo_Page(string);
    }

    @And("user clicks on {string}")
    public void user_clicks_on(String string) {
        System.out.println("Inside Step - user choose " + string + " to book");

        hotelPage.checkDisplay(string);
        hotelPage.chooseHotel(string);
    }

    @Then("user choose a {string} to book")
    public void user_choose_a_room_to_book(String string) {
        System.out.println("Inside Step - user choose room book");

        hotelPage.chooseRoom(string);
    }

    @Then("user fill personal information for booking")
    public void user_fill_personal_information_for_booking() {
        System.out.println("Inside Step - user fill personal information");

        bookingPage.fillPersonalInformation();
    }

    @And("fill travel information")
    public void fill_travel_information() {
        System.out.println("Inside Step - user fill travel information");

        bookingPage.fillTrevelInfo();
    }

    @Then("user choose payment method as {string}")
    public void user_choose_payment_method_as(String string) {
        System.out.println("Inside Step - user choose payment method");

        bookingPage.choosePaymentMethod(string);
    }

    @And("agree to the terms and condition")
    public void agree_to_the_terms_and_condition() {
        System.out.println("Inside Step - user check the check box of Terms and Conditions");

        bookingPage.agreeTnS();
    }

    @Then("user confirm booking")
    public void user_confirm_booking() {
        System.out.println("Inside Step - user successfully booked a hotel");

        bookingPage.click_confirmBooking();
    }

}
