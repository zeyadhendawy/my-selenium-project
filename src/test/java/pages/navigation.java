package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class navigation {
    private WebDriver driver;

    private By home = By.xpath("/html/body/div/div[1]/nav/ul/li[1]/a");
    private By library = By.xpath("//*[@id=\"root\"]/div[1]/nav/ul/li[2]/a");
    private By enviroanalysis = By.xpath("//*[@id=\"root\"]/div[1]/nav/ul/li[3]/a");
    private By floraCheck = By.xpath("//*[@id=\"root\"]/div[1]/nav/ul/li[4]/a");
    private By chatBot = By.xpath("//*[@id=\"root\"]/div[1]/nav/ul/li[5]/a");
    private By aboutUs = By.linkText("About Us");      // check exact text
    private By contactUs = By.linkText("Contact Us");  // check exact text

    public navigation(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo(String pageName) {
        By locator;

        switch (pageName.toLowerCase()) {
            case "home":
                locator = home;
                break;
            case "library":
                locator = library;
                break;
            case "enviroanalysis":
                locator = enviroanalysis;
                break;
            case "floracheck":
                locator = floraCheck;
                break;
            case "chatbot":
                locator = chatBot;
                break;
            case "aboutus":
                locator = aboutUs;
                break;
            case "contactus":
                locator = contactUs;
                break;
            default:
                throw new IllegalArgumentException("Page not found: " + pageName);
        }

        // ✅ Use explicit wait here
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(locator))
                .click();
    }
}

