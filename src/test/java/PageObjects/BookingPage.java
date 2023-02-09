package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Driver.Driver;
import Utilities.Utilities;

public class BookingPage {
    WebDriver driver = Driver.getDriver();
    Utilities util = new Utilities();

    By btn_confirmBooking = By.id("booking");

    public void selectTitle(String title) {
        util.findSelectwithName("title_1").selectByVisibleText(title);
    }

    public void fillPersonalInformation() {
        util.findTxtByName("firstname").sendKeys("Nugi");
        util.findTxtByName("lastname").sendKeys("Hermawan");
        util.findTxtByName("email").sendKeys("aaa@gmail.com");
        util.findTxtByName("phone").sendKeys("01298301823");
        util.findTxtByName("address").sendKeys("JL. idul kidul");

        util.findSelectwithName("country_code").selectByVisibleText("Indonesia");
        util.findSelectwithName("nationality").selectByVisibleText("Indonesia");
    }

    public void fillTrevelInfo() {
        selectTitle("MR");
        util.findTxtByName("firstname_1").sendKeys("Martin");
        util.findTxtByName("lastname_1").sendKeys("Aurelian");

        util.findSelectwithName("title_2").selectByVisibleText("MISS");
        util.findTxtByName("firstname_2").sendKeys("Nolwenn");
        util.findTxtByName("lastname_2").sendKeys("Nestan");

        util.findSelectwithName("child_age_1").selectByVisibleText("13");
        util.findTxtByName("child_firstname_1").sendKeys("Mei");
        util.findTxtByName("child_lastname_1").sendKeys("Mel");

        util.findSelectwithName("child_age_2").selectByVisibleText("12");
        util.findTxtByName("child_firstname_2").sendKeys("April");
        util.findTxtByName("child_lastname_2").sendKeys("Lia");
    }

    public void choosePaymentMethod(String paymentMethod) {
        paymentMethod = paymentMethod.toLowerCase();
        paymentMethod = paymentMethod.replace(" ", "-");

        WebElement radioPayment = driver
                .findElement(By.xpath("//input[@type='radio'][@value='" + paymentMethod +
                        "']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radioPayment);
    }

    public void agreeTnS() {
        WebElement comboBox = driver.findElement(By.id("agreechb"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", comboBox);
    }

    public void click_confirmBooking() {
        driver.findElement(btn_confirmBooking).submit();
    }

    public void fillTravelInformationFlight() {
        selectTitle("MR");
        util.findTxtByName("firstname_1").sendKeys("Martin");
        util.findTxtByName("lastname_1").sendKeys("Aurelian");

        util.findSelectwithName("country_code").selectByVisibleText("Indonesia");
        util.findSelectwithName("nationality_1").selectByVisibleText("Indonesia");

        util.findSelectwithName("dob_month_1").selectByVisibleText("06 June");
        util.findSelectwithName("dob_day_1").selectByVisibleText("2");
        util.findSelectwithName("dob_year_1").selectByVisibleText("1984");

        util.findTxtByName("passport_1").sendKeys("0192890831");

        util.findSelectwithName("passport_issuance_month_1").selectByVisibleText("06 June");
        util.findSelectwithName("passport_issuance_day_1").selectByVisibleText("2");
        util.findSelectwithName("passport_issuance_year_1").selectByVisibleText("2019");

        util.findSelectwithName("passport_month_1").selectByVisibleText("06 June");
        util.findSelectwithName("passport_day_1").selectByVisibleText("2");
        util.findSelectwithName("passport_year_1").selectByVisibleText("2024");
    }
}
