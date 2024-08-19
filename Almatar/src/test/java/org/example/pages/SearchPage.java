package org.example.pages;

import org.example.stepDefs.Hocks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage {

    public SearchPage(){
        PageFactory.initElements(Hocks.driver,this);
    }

    //locators
    @FindBy(xpath = "//input[@class=\"ng-untouched ng-pristine ng-valid\"]")
    public WebElement destinationSearch;
    @FindBy(xpath = "//ngb-typeahead-window[@class=\"dropdown-menu show ng-star-inserted\"]/button[1]")
    public WebElement location;

    @FindBy(xpath = "//div[@class=\"almatar-calendar almatar-calendar--home almatar-calendar--range almatar-calendar--nights\"]/div[1]/div[1]/div[2]")
    public WebElement date;
    @FindBy(xpath = "//div[@class=\"p-datepicker-group-container ng-tns-c94-1 ng-star-inserted\"]/div[2]/div[2]/table/tbody/tr[5]/td[2]")
    public WebElement date30;
    @FindBy(xpath = "//div[@class=\"p-datepicker-group-container ng-tns-c94-1 ng-star-inserted\"]/div[2]/div[1]/button")
    public WebElement buttonNavigateDate;
    @FindBy(xpath = "//div[@class=\"p-datepicker-group-container ng-tns-c94-1 ng-star-inserted\"]/div[2]/div[2]/table/tbody/tr[1]/td[7]")
    public WebElement date5;

    @FindBy(xpath = "//div[@class=\"dropdown__item panel-mobile-overlay\"]")
    public WebElement room;
    @FindBy(xpath = "//div[@class=\"room-row\"]/div[1]/div[2]/ol/li[3]/button")
    public WebElement adultIncrease;
    @FindBy(xpath = "//div[@class=\"room-row\"]/div[2]/div[2]/ol/li[3]/button")
    public WebElement childIncrease;
    @FindBy(xpath = "//div[@class=\"children-age__container\"]/div[1]/div/ng-select/div/span")
    public WebElement child1Menu;
    @FindBy(xpath = "//div[@class=\"ng-dropdown-panel-items scroll-host\"]/div[2]/div[5]")
    public WebElement child1Year;
    @FindBy(xpath = "//div[@class=\"children-age__container\"]/div[2]/div/ng-select/div/span")
    public WebElement child2Menu;
    @FindBy(xpath = "//div[@class=\"ng-dropdown-panel-items scroll-host\"]/div[2]/div[5]")
    public WebElement child2Year;

    @FindBy(xpath = "//div[@class=\"edit-search-sheet__action\"] /button")
    public WebElement applyButton;

    @FindBy(xpath = "//button[@class=\"search__action\"]")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class=\"price\"]/nouislider/div/div/div[3]/div")
    public WebElement slider1;
    @FindBy(xpath = "//div[@class=\"rating ng-star-inserted\"]/div/div[1]/label/span[2]")
    public WebElement fiveStars;

    @FindBy(xpath = "//div[@class=\"pt-4 col-lg-9 col-md-8 col-sm-12 col-12 all-hotels ng-star-inserted\"]/div/app-hotel-list-result/a/div[2]/div[1]/div[1]/h3")
    public List<WebElement> hotels;

    @FindBy(xpath = "//div[@class=\"pt-4 col-lg-9 col-md-8 col-sm-12 col-12 all-hotels ng-star-inserted\"]/div/app-hotel-list-result/a/div[2]/div[2]/div[2]/div[2]/p[2]")
    public List<WebElement> prices;

}
