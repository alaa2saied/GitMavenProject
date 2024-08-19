package org.example.pages;

import io.cucumber.java.en.Given;
import org.example.sepDefs.Hocks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Hocks.driver,this);
    }
    @FindBy(xpath = "//input[@class=\"ng-untouched ng-pristine ng-valid\"]")
    public WebElement going;
    @FindBy(xpath = "//ngb-typeahead-window[@class=\"dropdown-menu show ng-star-inserted\"] /button[1]")
    public WebElement goingLocation;
    @FindBy(xpath = "//div[@class=\"search__calendar\"] //div[@class=\"almatar-calendar__input almatar-calendar__input--departure ng-star-inserted\"]")
    public WebElement calender;
    @FindBy(xpath = "//tr[@class=\"ng-tns-c94-1 ng-star-inserted\"][2] //td[@class=\"ng-tns-c94-1 ng-star-inserted\"][2] //span[@class=\"p-ripple p-element ng-tns-c94-1 ng-star-inserted\"]")
    public WebElement num9;
    @FindBy(xpath = "//tr[@class=\"ng-tns-c94-1 ng-star-inserted\"][3] //td[@class=\"ng-tns-c94-1 ng-star-inserted\"][4] //span[@class=\"p-ripple p-element ng-tns-c94-1 ng-star-inserted\"]")
    public WebElement num18;
    @FindBy(xpath = "//svg-icon[@class=\"almatar-icon chevron-down ng-star-inserted\"]")
    public WebElement icon;
    @FindBy(xpath = "//div[@class=\"room-row_item ng-star-inserted\"][1] //svg-icon[@class=\"almatar-icon plus ng-star-inserted\"]")
    public WebElement adult;
    @FindBy(xpath = "//div[@class=\"room-row_item ng-star-inserted\"][2] //svg-icon[@class=\"almatar-icon plus ng-star-inserted\"]")
    public WebElement child;
    @FindBy(xpath = "//div[@class=\"ng-dropdown-panel-items scroll-host\"] /div[2] /div[2]")
    public WebElement child1;
    @FindBy(xpath = "//div[@class=\"children-age__container\"] /div[1] //div[@class=\"ng-input\"]")
    public WebElement menuChild1;
    @FindBy(xpath = "//div[@class=\"children-age__container\"] /div[2] //div[@class=\"ng-input\"]")
    public WebElement menuChild2;
    @FindBy(xpath = "//div[@class=\"ng-dropdown-panel-items scroll-host\"] /div[2] /div[2]")
    public WebElement child2;
    @FindBy(xpath = "//div[@class=\"edit-search-sheet__action\"] //button[@type=\"button\"]")
    public WebElement applyButton;
    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement searchButton;
}
