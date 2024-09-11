package org.example.pages;

import org.example.StepDefs.Hocks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProductPage {
    public ProductPage(){

        PageFactory.initElements(Hocks.driver,this);
    }

    //Locators
    @FindBy(xpath = "//div[@class=\"hnf-header__container hnf-page-container__main\"]/ul/li[3]/a[1]")
    public WebElement signUpButton;

    @FindBy(xpath = "//form/button[2]/span/span")
    public WebElement createAccountButton;

    @FindBy(xpath = "//input[@id=\"first-name\"]")
    public WebElement firstName;

    @FindBy(xpath = "//div[@id=\"onetrust-button-group\"]/button[2]")
    public WebElement acceptCookies;

    @FindBy(xpath = "//input[@id=\"last-name\"]")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id=\"email\"]")
    public WebElement email;

    @FindBy(xpath = "//input[@id=\"password\"]")
    public WebElement password;

    @FindBy(xpath = "//div[@class=\"pp-skapa__form-field\"]/span/input")
    public WebElement checkBox;

    @FindBy(xpath = "//form/button")
    public WebElement createButton;

    @FindBy(xpath = "//p[@class=\"skapa-mvagent-wrapper-prefix-toast__text\"]")
    public WebElement successMessage;

    @FindBy(xpath = "//div[@class=\"gd8xc1c vdrm3z7 v18by0fb\"]/article/section[3]/div/div/section/div/div/div/div/div/div[1]/div/div/div/div[1]/div/div/div/a")
    public WebElement sofasButton;

    @FindBy(xpath = "//div[@class=\"plp-filter-bar__options\"]/button[1]")
    public WebElement sortButton;

    @FindBy(xpath = "//div[@class=\"plp-drop-down\"]/fieldset/label[3]/span[2]")
    public WebElement highToLowSelect;

    @FindBy(xpath = "//div[@class=\"plp-product-list__products \"]/div/div/div[4]/div/button[1]/span")
    public List<WebElement> productToAddToCart;

    @FindBy(xpath = "//div[@class=\"plp-catalog-product-list\"]/section/div[2]/div/div/div[3]/a/div/div[1]/h3/span[2]")
    public List<WebElement> productName;

    @FindBy(xpath = "//div[@class=\"plp-catalog-product-list\"]/section/div[2]/div/div/div[3]/a/div/div[2]/div/span/span[1]/span/span[2]")
    public List<WebElement> productPrice;

    @FindBy(xpath = "//div[@class=\"skapa-mvagent-wrapper-prefix-toast__action\"]/button/span[1]")
    public WebElement cartButton;

    @FindBy(xpath = "//div[@class=\"CartPage_cartListWrapper__z3xQC\"]/div/div/div/div/div/div[1]/div[1]/div[2]/span[2]/div[1]")
    public List<WebElement> productInCartName;

    @FindBy(xpath = "//div[@class=\"CartList_cartList__pA6bB\"]/div/div/div/div/div[1]/div[2]/div[1]/span/span[1]/span/span[2]")
    public List<WebElement> productInCartPrice;

    @FindBy(xpath = "//div[@class=\"Summary_receipt__d7Qzo\"]/div[2]/span[2]/span[1]/span/span[2]")
    public WebElement totalPrice;

    @FindBy(xpath = "//div[@class=\"CartList_cartList__pA6bB\"]/div[2]/div/div/div/div[2]/button[2]/span")
    public WebElement moveToFavourite;

    @FindBy(xpath = "//div[@class=\"CartList_cartList__pA6bB\"]/div[3]/div/div/div/div[2]/button[1]/span")
    public WebElement removeThirdElement;

    @FindBy(xpath = "//div[@class=\"Summary_summary__CDtd0\"]/span[2]/button/span/span")
    public WebElement checkOutButton;

    @FindBy(xpath = "//div[@class=\"col-md-offset-3 col-md-6 col-xs-12\"]/div[1]/input[1]")
    public WebElement fullNameCheckOut;

    @FindBy(xpath = "//div[@id=\"div-area-dropdown\"]/select")
    public WebElement governorate ;

    @FindBy(xpath = "//div[@id=\"div-city-drop-down\"]/select")
    public WebElement city;

    @FindBy(xpath = "//div[@class=\"col-md-offset-3 col-md-6 col-xs-12\"]/div[7]/input[1]")
    public WebElement emailCheckOut;

    @FindBy(xpath = "//div[@class=\"col-md-offset-3 col-md-6 col-xs-12\"]/div[9]/div/input")
    public WebElement phoneNumber;

    @FindBy(xpath = "//div[@class=\"col-md-offset-3 col-md-6 col-xs-12\"]/div[10]/input[1]")
    public WebElement address;

    @FindBy(xpath = "//div[@class=\"col-md-offset-3 col-md-6 col-xs-12\"]/div[11]/input[1]")
    public WebElement building;

    @FindBy(xpath = "//div[@id=\"billing-buttons-container\"]/div[2]/div/button")
    public WebElement continueButton;

    @FindBy(xpath = "//div[@id=\"deliveryandassembly-buttons-container\"]/div[3]/div/button")
    public WebElement continueCheckOut;



}
