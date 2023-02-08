package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HotelPage {
    WebDriver driver;
    WebElement card_hotel;
    WebElement btn_chooseRoom;
    By txt_firstName = By.name("firstname");
    By txt_lastName = By.name("lastname");
    By txt_phone = By.name("phone");
    By txt_email = By.name("email");
    By txt_address = By.name("address");
    By txt_firstname1 = By.name("firstname_1");
    By txt_firstname2 = By.name("firstname_2");
    By txt_childFirstname1 = By.name("child_firstname_1");
    By txt_childFirstname2 = By.name("child_firstname_2");
    By txt_lastname1 = By.name("lastname_1");
    By txt_lastname2 = By.name("lastname_2");
    By txt_childLastname1 = By.name("child_lastname_1");
    By txt_childLastname2 = By.name("child_lastname_2");
    By cb_tns = By.id("agreechb");
    By btn_confirmBooking = By.id("booking");

    // WebElement dopdownTitle1;
    // WebElement dopdownTitle2;
    // WebElement dopdownAge1;
    // WebElement dopdownAge2;
    // WebElement dropdownCountry;
    // WebElement dropdownNationality;

    public HotelPage(WebDriver driver) {
        this.driver = driver;
    }

    // fill personal information
    public void chooseHotel(String hotel) {
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = driver.findElement(By.xpath("//strong[text()='Rendezvous Hotels']/../../../.."));
        element.click();
        // By img = RelativeLocator.with(By.tagName("a")).below(element);
        // driver.findElement(img).click();
    }

    public void chooseRoom(String room) {
        btn_chooseRoom = driver.findElement(
                By.xpath("//strong[text()='" + room
                        + "']/../../div[@class='card-body']/div/div[2]/form/div/div[4]/div/div/button"));
        btn_chooseRoom.submit();
    }

    public void enter_firstName(String firstName) {
        driver.findElement(txt_firstName).clear();
        driver.findElement(txt_firstName).sendKeys(firstName);
    }

    public void enter_lastName(String lastName) {
        driver.findElement(txt_lastName).clear();
        driver.findElement(txt_lastName).sendKeys(lastName);
    }

    public void enter_email(String email) {
        driver.findElement(txt_email).clear();
        driver.findElement(txt_email).sendKeys(email);
    }

    public void enter_phone(String phone) {
        driver.findElement(txt_phone).clear();
        driver.findElement(txt_phone).sendKeys(phone);
    }

    public void enter_address(String address) {
        driver.findElement(txt_address).clear();
        driver.findElement(txt_address).sendKeys(address);
    }

    public void selectCountry(String countryCode) {
        WebElement dropdownCountry = driver.findElement(By.name("country_code"));
        Select selectCountry = new Select(dropdownCountry);

        selectCountry.selectByVisibleText(countryCode);
    }

    public void selectNationality(String nationality) {
        WebElement dropdownNationality = driver.findElement(By.name("country_code"));
        Select selectCountry = new Select(dropdownNationality);

        selectCountry.selectByVisibleText(nationality);
    }

    public void fillPersonalInformation() {
        enter_firstName("Nugi");
        enter_lastName("hehe");
        enter_email("aaa@gmail.com");
        enter_phone("01298301823");
        enter_address("JL. idul kidul");

        selectCountry("Indonesia");
        selectCountry("Indonesia");
    }

    // fill travelers informations
    public void enter_adultFirstName1(String firstname1) {
        driver.findElement(txt_firstname1).clear();
        driver.findElement(txt_firstname1).sendKeys(firstname1);
    }

    public void enter_adultFirstName2(String firstname2) {
        driver.findElement(txt_firstname2).clear();
        driver.findElement(txt_firstname2).sendKeys(firstname2);
    }

    public void enter_adultLastName1(String lastname1) {
        driver.findElement(txt_lastname1).sendKeys(lastname1);
    }

    public void enter_adultLastName2(String lastname2) {
        driver.findElement(txt_lastname2).sendKeys(lastname2);
    }

    public void enter_childFirstName1(String childfirstname1) {
        driver.findElement(txt_childFirstname1).clear();
        driver.findElement(txt_childFirstname1).sendKeys(childfirstname1);
    }

    public void enter_childFirstName2(String childfirstname2) {
        driver.findElement(txt_childFirstname2).clear();
        driver.findElement(txt_childFirstname2).sendKeys(childfirstname2);
    }

    public void enter_childLastName1(String childLastname1) {
        driver.findElement(txt_childLastname1).sendKeys(childLastname1);
    }

    public void enter_childLastName2(String childLastname2) {
        driver.findElement(txt_childLastname2).sendKeys(childLastname2);
    }

    public void selectTitle1(String title1) {
        WebElement dropdown = driver.findElement(By.name("title_1"));
        Select selectTitle1 = new Select(dropdown);

        selectTitle1.selectByVisibleText(title1);
    }

    public void selectTitle2(String title2) {
        WebElement dropdown = driver.findElement(By.name("title_2"));
        Select selectTitle2 = new Select(dropdown);

        selectTitle2.selectByVisibleText(title2);
    }

    public void selectAge1(String age1) {
        WebElement dropdown = driver.findElement(By.name("child_age_1"));
        Select selectAge1 = new Select(dropdown);

        selectAge1.selectByVisibleText(age1);
    }

    public void selectAge2(String age2) {
        WebElement dropdown = driver.findElement(By.name("child_age_2"));
        Select selectAge2 = new Select(dropdown);

        selectAge2.selectByVisibleText(age2);
    }

    public void fillTrevelInfo() {
        selectTitle1("MR");
        enter_adultFirstName1("Martim");
        enter_adultLastName1("Aurelian");
        selectTitle2("MISS");
        enter_adultFirstName2("Nolwenn");
        enter_adultLastName2("Nestan");
        selectAge1("14");
        enter_childFirstName1("Lia");
        enter_childLastName1("Aprilia");
        selectAge2("13");
        enter_childFirstName2("Dwi");
        enter_childLastName2("Mei");
    }

    public void choosePaymentMethod(String paymentMethod) {
        paymentMethod = paymentMethod.toLowerCase();
        paymentMethod = paymentMethod.replace(" ", "-");

        // Select dropdown = new Select(
        // driver.findElement(By.id("myTab")));
        // dropdown.selectByVisibleText(paymentMethod);

        WebElement radioPayment = driver
                .findElement(By.xpath("//input[@type='radio'][@value='" + paymentMethod +
                        "']"));
        // radioPayment.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radioPayment);
    }

    public void agreeTnS() {
        WebElement comboBox = driver.findElement(cb_tns);
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", comboBox);
    }

    public void click_confirmBooking() {
        // WebDriverWait wait = new WebDriverWait(driver, 10);
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // WebElement element =
        // wait.until(ExpectedConditions.elementToBeClickable(btn_confirmBooking));
        // element.submit();
        driver.findElement(btn_confirmBooking).submit();
    }
}
