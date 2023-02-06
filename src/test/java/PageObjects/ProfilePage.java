package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class ProfilePage {
    WebDriver driver;

    By txt_firstName = By.name("firstname");
    By txt_lastName = By.name("lastname");
    By txt_phone = By.name("phone");
    By txt_email = By.name("email");
    By txt_password = By.name("password");
    WebElement dropdownCountry;
    By txt_state = By.name("state");
    By txt_city = By.name("city");
    By txt_fax = By.name("fax");
    By txt_postalCode = By.name("zip");
    By txt_address1 = By.name("address1");
    By txt_address2 = By.name("address2");
    By btn_update = RelativeLocator.with(By.tagName("button")).below(txt_address2);

    public ProfilePage(WebDriver driver){
        this.driver = driver;
    }

    public void enter_firstName(String firstName){
        driver.findElement(txt_firstName).clear();
        driver.findElement(txt_firstName).sendKeys(firstName);
    }

    public void enter_lastName(String lastName){
        driver.findElement(txt_lastName).clear();
        driver.findElement(txt_lastName).sendKeys(lastName);
    }

    public void enter_email(String email){
        driver.findElement(txt_email).clear();
        driver.findElement(txt_email).sendKeys(email);
    }

    public void enter_password(String password){
        driver.findElement(txt_password).clear();
        driver.findElement(txt_password).sendKeys(password);
    }

    public void enter_phone(String phone){
        driver.findElement(txt_phone).clear();
        driver.findElement(txt_phone).sendKeys(phone);
    }

    public void enter_state(String state){
        driver.findElement(txt_state).clear();
        driver.findElement(txt_state).sendKeys(state);
    }

    public void enter_city(String city){
        driver.findElement(txt_city).clear();
        driver.findElement(txt_city).sendKeys(city);
    }

    public void enter_fax(String fax){
        driver.findElement(txt_fax).clear();
        driver.findElement(txt_fax).sendKeys(fax);
    }

    public void enter_postalCode(String postalCode){
        driver.findElement(txt_postalCode).clear();
        driver.findElement(txt_postalCode).sendKeys(postalCode);
    }

    public void enter_address1(String address1){
        driver.findElement(txt_address1).clear();
        driver.findElement(txt_address1).sendKeys(address1);
    }

    public void enter_address2(String address2){
        driver.findElement(txt_address2).clear();
        driver.findElement(txt_address2).sendKeys(address2);
    }

    public void selectCountry(String country){
        dropdownCountry = driver.findElement(By.name("country"));
        Select selectCountry = new Select(dropdownCountry);

        selectCountry.selectByVisibleText(country);
    }

    public void clickUpdate (){
        driver.findElement(btn_update).submit();
    }

    public void fillProfile (){
        enter_firstName("Nugi");
        enter_lastName("Hermawan");
        enter_phone("01923801263");
        enter_email("ddd@gmail.com");
        enter_password("123");
        selectCountry("Indonesia");
        enter_state("Jawa Tengah");
        enter_city("Salatiga");
        enter_postalCode("79213");
        enter_fax("02319823");
        enter_address1("Jl. Abdul dul");
        enter_address2("Jl. Pungsa");
    }
}
