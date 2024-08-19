package org.example.pages;

import org.example.sepDefs.Hocks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
    public Register(){
        PageFactory.initElements(Hocks.driver,this);
    }
    //locator
    @FindBy(xpath = "//a[@href=\"/login\"]")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@data-qa=\"signup-name\"]")
    public WebElement nameInput;

    @FindBy(xpath = "//input[@data-qa=\"signup-email\"]")
    public WebElement emailInput;

    @FindBy(xpath = "//button[@data-qa=\"signup-button\"]")
    public WebElement signUpButton;






}
