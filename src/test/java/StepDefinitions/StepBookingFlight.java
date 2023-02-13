package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Driver.Driver;
import PageObjects.BookingPage;
import PageObjects.FlightPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class StepBookingFlight {
    WebDriver driver = Driver.getDriver();
    BookingPage bookingPage = new BookingPage();
    FlightPage flightPage = new FlightPage(driver);

    @And("user choose {string} airlines")
    public void user_choose_airlines(String string) {
        System.out.println("Inside Step - user choose " + string + " airlines  to book");

        flightPage.chooseAirlines(string);
    }

    @Then("user choose {string} flight id to book")
    public void user_choose_flight_id_to_book(String string) {
        System.out.println("Inside Step - user choose " + string + " as flight id to book");

        flightPage.chooseFlightID(string);
    }

    @And("user fill travellers information on {string} Age\\/Title {string} as {string}")
    public void user_fill_travellers_information_on_age_title_as(String string, String string2, String string3) {
        System.out.println("Inside Step - user select " + string + "as " + string2 + " " + string3 + "");

        bookingPage.selectDropdownTravellerInformationTitleAndNationality(string, string2, string3);
    }

    @Then("user fill travellers information on {string} Nationality {string} as {string}")
    public void user_fill_travellers_information_on_nationality_as(String string, String string2, String string3) {
        System.out.println("Inside Step - user select " + string + "as " + string2 + " " + string3 + "");

        bookingPage.selectDropdownTravellerInformationTitleAndNationality(string, string2, string3);
    }

    @Then("user fill travellers information on {string} Date of Birth {string} as {string}")
    public void user_fill_travellers_information_on_date_of_birth_as(String string, String string2, String string3) {
        System.out.println("Inside Step - user select DOB " + string + "as " + string2 + " " + string3 + "");

        bookingPage.selectDropdownTravellerInformationDOB(string, string2, string3);
    }

    @Then("user fill travellers information on {string} Passport Issuance Date {string} as {string}")
    public void user_fill_travellers_information_on_passport_issuance_date_as(String string, String string2,
            String string3) {
        System.out.println("Inside Step - user select PID " + string + "as " + string2 + " " + string3 + "");

        bookingPage.selectDropdownTravellerInformationPID(string, string2, string3);
    }

    @Then("user fill travellers information on {string} Passport Expiry Date {string} as {string}")
    public void user_fill_travellers_information_on_passport_expiry_date_as(String string, String string2,
            String string3) {
        System.out.println("Inside Step - user select PED " + string + "as " + string2 + " " + string3 + "");

        bookingPage.selectDropdownTravellerInformationPED(string, string2, string3);
    }

}
