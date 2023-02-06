package StepDefinitions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    WebDriver driver;
    
    @Before
    public void browserSetup(){
        System.out.println("Inside Step - browser is open");
        driver = Driver.getDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenshotFile = scenario.getName() + ".png";
            TakesScreenshot screenshotTaker = (TakesScreenshot) Driver.getDriver();
            File screenshot = screenshotTaker.getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenshot, new File("target/screenshots/" + screenshotFile));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Driver.getDriver().quit();
     }
}
