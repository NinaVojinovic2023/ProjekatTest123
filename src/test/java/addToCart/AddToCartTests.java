package addToCart;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.CartPage;
import page.ProductPage;

public class AddToCartTests extends BaseTests {
    @Test

    public void test1AddTwoItemsToCartTest() {
        ProductPage productPage = homePage.clickProductByName("Iphone 6 32gb");
        productPage.clickAddToCart();
        Assert.assertEquals(productPage.getAlertText(), "Product added", "wrong alert text");
        productPage.acceptAlert();
        homePage = navigator.returnToHomePage();
        productPage = homePage.clickProductByName("Nokia lumia 1520");
        productPage.clickAddToCart();
        productPage.acceptAlert();
        CartPage cartPage = navigator.clickCartButton();
        Assert.assertEquals(cartPage.productCount(), 2, "Product count is wrong");


    }


}
