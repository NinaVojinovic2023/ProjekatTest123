package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.CartPage;
import page.HomePage;

public class Navigator {
    private WebDriver driver;
    private By homeLink = By.partialLinkText("Home");
    private By cartLink = By.linkText("Cart");
    public Navigator(WebDriver driver){
        this.driver = driver;

    }

    public HomePage returnToHomePage() {
        driver.findElement(homeLink).click();
        return new HomePage(driver);

    }

    public CartPage clickCartButton() {
        driver.findElement(cartLink).click();
        return new CartPage(driver);
    }



}
