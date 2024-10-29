package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProductPage extends BasePage{
//    public ProductPage(WebDriver driver){
//        super(driver);
//    }

    //Locators
    private final By linkedinLocator = By.cssSelector("a[data-test=\"social-linkedin\"]");
    private final By facebookLocator = By.cssSelector("a[data-test=\"social-facebook\"]");
    private final By twitterLocator = By.cssSelector("a[data-test=\"social-twitter\"]");
    private final By shirt_Locator = By.name("add-to-cart-test.allthethings()-t-shirt-(red)");
    private final By removeButton = By.name("remove-test.allthethings()-t-shirt-(red)");
    private final By selectFilterLocator = By.cssSelector("select[data-test=\"product-sort-container\"]");
    private final By productLocators = By.cssSelector("div[data-test=\"inventory-item-price\"]");
    private final By threeHyphenLocator = By.id("react-burger-menu-btn");
    private final By resetButtonLocator = By.id("reset_sidebar_link");
    private final By cartNumberLocator = By.className("shopping_cart_badge");
    private final By cartButtonLocators = By.className("shopping_cart_link");
    private final By backBagLocator = By.id("add-to-cart-sauce-labs-backpack");


    //Methods
    public void clickOnLinkedinIcon(){
        clickFeature(linkedinLocator);
    }
    public void clickOnFacebookIcon(){
        clickFeature(facebookLocator);
    }
    public void clickOnTwitterIcon(){
        clickFeature(twitterLocator);
    }
    public void clickOnAddShirtToCart(){
        clickFeature(shirt_Locator);
    }
    public String assertRemoveButtonAppear(){
        return returnMessage(removeButton).getText();
    }
    public void filterProduct(String filter){
        Select selectFilter = new Select(returnMessage(selectFilterLocator));
        selectFilter.selectByVisibleText(filter);
    }

    public List listOfProduct(){
        return getList(productLocators);
    }
    public void clickOnThreeHyphenMenu(){
        clickFeature(threeHyphenLocator);
    }
    public void clickOnResetButton(){
        clickFeature(resetButtonLocator);
    }
    public WebElement assertInvisibleOfNumber(){
        return returnMessage(cartNumberLocator);
    }
    public CartPage clickOnCartButton(){
        clickFeature(cartButtonLocators);
        return new CartPage();
    }
    public void AddProductToCartAfterRedirectToCart(){
        clickFeature(backBagLocator);
    }












}
