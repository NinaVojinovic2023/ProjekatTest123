package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CartPage {

    private  WebDriver driver;
    private By placeOrderButton = By.cssSelector(".btn.btn-success");

//
//    private By nameField = By.id("name");
//    private By countryField = By.id("country");
//    private By cityField = By.id("city");
//    private By creditCardField = By.id("card");
//    private By monthField = By.id("month");
//    private By yearField = By.id("year");
    private By closeButton = By.cssSelector("#orderModal btn.btn-secondary");
    private By purchaseButton = By.cssSelector("#orderModal btn.btn-primary");

    private By allRowsSelector = By.cssSelector("tbody tr");

    private By totalPrice = By.id("totalp");

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickPlaceOrder(){
        driver.findElement(placeOrderButton).click();
    }

        public void setValueByName(String fieldName, String value) {
        driver.findElement(By.id(fieldName.toLowerCase())).sendKeys(value);
        }

        public void clickPurchaseButton(){
        driver.findElement(purchaseButton).click();
        }

        public void clickCloseButton() {
        driver.findElement(closeButton).click();
        }


    public int productCount() {
        var allRows = rowsCollection();
        return allRows.size();
    }

    public String getTotalPrice() {
        return driver.findElement(totalPrice).getText();
    }

    public void deleteItemFromCart(int itemIndex) {
     var allRows = rowsCollection();
     allRows.get(itemIndex).findElement(By.linkText("Delete")).click();
    }

    private List<WebElement> rowsCollection() {
        return driver.findElements(totalPrice);
    }



}
