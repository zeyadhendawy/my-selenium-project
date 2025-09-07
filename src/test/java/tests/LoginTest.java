package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ConfigReader;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(ConfigReader.get("username"), ConfigReader.get("password"));

        WebElement home = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/nav/ul/li[1]/a"));
        Assert.assertTrue(home.isDisplayed(), "Home link is not displayed.");

    }
}
