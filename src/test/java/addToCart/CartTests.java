package addToCart;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.CartPage;
import page.ProductPage;

public class CartTests extends BaseTests {


    @Test
    public void test2TotalPriceTest() {
        ProductPage productPage = homePage.clickProductByName("Iphone 6 32gb");
        productPage.clickAddToCart();
        Assert.assertEquals(productPage.getAlertText(), "Product added", "wrong alert text");
        productPage.acceptAlert();
        CartPage cartPage = navigator.clickCartButton();
        Assert.assertEquals(cartPage.getTotalPrice(), "1610", "This price is good");

    }
    @Test
    public void removeItemFromCartTest() {
        ProductPage productPage = homePage.clickProductByName("Iphone 6 32gb");
        productPage.clickAddToCart();
        Assert.assertEquals(productPage.getAlertText(), "Product added", "wrong alert text");
        productPage.acceptAlert();
        CartPage cartPage = navigator.clickCartButton();
        cartPage.deleteItemFromCart(0);
        Assert.assertEquals(cartPage.productCount(),0,"Removing product didn't work");
    }

}
