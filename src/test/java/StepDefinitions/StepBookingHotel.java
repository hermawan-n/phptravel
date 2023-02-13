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

        // hotelPage.checkDisplay(string);
        hotelPage.chooseHotel(string);
    }

    @Then("user choose a {string} to book")
    public void user_choose_a_room_to_book(String string) {
        System.out.println("Inside Step - user choose room book");

        hotelPage.chooseRoom(string);
    }

    @Then("user fill personal information textbox {string} as {string}")
    public void user_fill_personal_information_textbox_as(String string, String string2) {
        System.out.println("Inside Step - user fill " + string + "as " + string2 + "");

        bookingPage.fillPersonalInformationTextBox(string, string2);
    }

    @Then("user fill personal information select {string} as {string}")
    public void user_fill_personal_information_select_as(String string, String string2) {
        System.out.println("Inside Step - user select " + string + "as " + string2 +
                "");

        bookingPage.selectDropdownPersonalInformationxpath(string, string2);
    }

    // @Then("user fill travellers information on {string} select {string} as
    // {string}")
    // public void user_fill_travellers_information_on_select_as(String string,
    // String string2, String string3) {
    // System.out.println("Inside Step - user fill " + string + "info " + string2 +
    // "as " + string3 + "");

    // bookingPage.selectDropdownTravellerInformationTitleAndNationality(string2,
    // string3);
    // }

    @And("user fill travellers information on {string} select Age\\/Title {string} as {string}")
    public void user_fill_travellers_information_on_select_age_title_as(String string, String string2, String string3) {
        System.out.println("Inside Step - user select " + string + "as " + string2 + " " + string3 + "");

        bookingPage.selectDropdownTravellerInformationTitleAndNationality(string, string2, string3);
    }

    @Then("user fill travellers information on {string} textbox {string} as {string}")
    public void user_fill_travellers_information_on_textbox_as(String string, String string2, String string3) {
        System.out.println("Inside Step - user fill " + string + "info " + string2 + "as " + string3 + "");

        bookingPage.fillTravellerInformationTextBox(string, string2, string3);
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
