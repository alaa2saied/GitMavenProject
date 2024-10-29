package Pages;

import org.openqa.selenium.By;

public class CartPage extends BasePage{


    //Locators
    private final By quantityLocator = By.cssSelector("div[data-test=\"item-quantity\"]");
    private final By removeButton = By.cssSelector("button[id=\"remove-test.allthethings()-t-shirt-(red)\"]");
    private final By continueShoppingLocator = By.id("continue-shopping");
    private final By checkOutButtonLocator = By.id("checkout");




    //Methods

    public void setNumberOfQuantity(String number){
        write(quantityLocator,number);
    }
    public void clickOnRemoveButton(){
        clickFeature(removeButton);
    }
    public void ClickOnContinueButton(){
        clickFeature(continueShoppingLocator);
    }
    public CheckOutPage clickOnCheckOutButton(){
        clickFeature(checkOutButtonLocator);
        return new CheckOutPage();
    }


}
