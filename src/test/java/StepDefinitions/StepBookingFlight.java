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

    @And("fill travel information for flight")
    public void fill_travel_information_for_flight() {
        bookingPage.fillTravelInformationFlight();
    }

}
