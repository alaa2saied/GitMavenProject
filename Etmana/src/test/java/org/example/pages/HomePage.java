package org.example.pages;

import org.example.Tests.Hocks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Hocks.driver,this);
    }

    //locators
    @FindBy(xpath = "//button[@class=\"signup\"]")
    public WebElement signUp;

    @FindBy(xpath = "//form[@class=\"d-flex flex-column gap-2 ng-untouched ng-pristine ng-invalid\"]/div[1]/div[1]/input")
    public WebElement firstName;

    @FindBy(xpath = "//div[@class=\"body-content\"]/app-register/section/form/div[1]/div[2]/input")
    public WebElement lastName;

    @FindBy(xpath = "//div[@class=\"body-content\"]/app-register/section/form/div[2]/div/input")
    public WebElement phoneNumber;

    @FindBy(xpath = "//div[@class=\"body-content\"]/app-register/section/form/div[3]/input")
    public WebElement emailAddress;

    @FindBy(xpath = "//div[@class=\"body-content\"]/app-register/section/form/div[4]/input")
    public WebElement password;
    @FindBy(xpath = "//button[@class=\"et-btn et-btn-primary\"]")
    public WebElement createAccountButton;

    //locator about search box
    @FindBy(xpath = "//div[@class=\"search pointer ng-star-inserted\"]/span")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class=\"header-content pb-1\"]/input")
    public WebElement searchText;

    @FindBy(xpath = "//div[@class=\"brands\"] //a[@class=\"view-raw ng-star-inserted\"]")
    public WebElement searchBoxButton;

    @FindBy(xpath = "//div[@class=\"layout px-md-5 px-1\"]/div/div/app-product-card-v1/div/div[2]/h6")
    public List<WebElement> productSearched;

    @FindBy(xpath = "//div[@class=\"d-flex gap-3 categories block en ng-star-inserted\"]/div[1]/a")
    public WebElement womenCategory;

    @FindBy(xpath = "//div[@class=\"d-flex gap-3\"]/a[1]/div/a[1]")
    public WebElement tops_product;

    @FindBy(xpath = "//div[@class=\"layout px-md-5 px-1\"]/div/div/app-product-card-v1/div/div[2]/h6")
    public List<WebElement> topsProductPage;

    @FindBy(xpath = "//div[@class=\"d-flex gap-3\"]/a[2]/h6")
    public WebElement bagProduct;

    @FindBy(xpath = "//div[@class=\"layout px-md-5 px-1\"]/div[2]/div/app-product-card-v1/div/div[1]/div[2]/wishlist-icon/div/button")
    public WebElement productWishButton;

    @FindBy(xpath = "//div[@class=\"d-flex gap-2 align-items-center justify-content-end block\"]/a[1]")
    public WebElement wishListButton;

    @FindBy(xpath = "//div[@class=\"et-card-content\"]/h6")
    public WebElement backBag;

    @FindBy(xpath = "//div[@class=\"row\"]/div[1]/div/div[1]/a[3]/i")
    public WebElement facebookIcon;





}
