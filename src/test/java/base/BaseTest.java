package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;
import utils.DriverFactory;

public class  BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        ConfigReader.loadProperties();
        driver = DriverFactory.getDriver();
        driver.get(ConfigReader.get("url"));
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
