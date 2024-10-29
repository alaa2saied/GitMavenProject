package Tests;

import org.testng.annotations.Test;

public class CartTest extends BaseTest{



    @Test
    public void increaseNumberOfQuantityInCart(){
        loginPage.setCredentials("standard_user","secret_sauce");
        productPage.clickOnAddShirtToCart();
        productPage.clickOnCartButton();
        //Not pass
        cartPage.setNumberOfQuantity("2");

    }

    @Test
    public void removeElementFromCart(){
        loginPage.setCredentials("standard_user","secret_sauce");
        productPage.clickOnAddShirtToCart();
        productPage.clickOnCartButton();
        cartPage.clickOnRemoveButton();
    }
    @Test
    public void continueShopping(){
        loginPage.setCredentials("standard_user","secret_sauce");
        productPage.clickOnAddShirtToCart();
        productPage.clickOnCartButton();
        cartPage.ClickOnContinueButton();
    }
    @Test
    public void AddToCartAfterContinue(){
        loginPage.setCredentials("standard_user","secret_sauce");
        productPage.clickOnAddShirtToCart();
        productPage.clickOnCartButton();
        cartPage.ClickOnContinueButton();
        productPage.AddProductToCartAfterRedirectToCart();
        productPage.clickOnCartButton();
    }
    @Test
    public void clickOnCheckOutButton(){
        loginPage.setCredentials("standard_user","secret_sauce");
        productPage.clickOnAddShirtToCart();
        productPage.clickOnCartButton();
        cartPage.ClickOnContinueButton();
        productPage.AddProductToCartAfterRedirectToCart();
        productPage.clickOnCartButton();
        cartPage.clickOnCheckOutButton();
    }









}
