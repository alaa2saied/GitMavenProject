package org.example.pages;

import org.example.sepDefs.Hocks;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class Register {
    public Register(){
        PageFactory.initElements(Hocks.driver,this);
    }
    //locator
    protected final By loginButton = By.cssSelector("a[href=\"/login\"]");
    protected final By nameLocator = By.cssSelector("input[data-qa=\"signup-name\"]");
    protected final By emailLocator = By.cssSelector("input[data-qa=\"signup-email\"]");
    protected final By signButtonLocator = By.cssSelector("button[data-qa=\"signup-button\"]");

    public void clickOnLogin(){
        Hocks.driver.findElement(loginButton).click();
    }
    public void enterEmail(String name , String email){
        Hocks.driver.findElement(nameLocator).sendKeys(name);
        Hocks.driver.findElement(emailLocator).sendKeys(email);

    }
    public void clickOnSignUpButton(){
        Hocks.driver.findElement(signButtonLocator).click();
    }

}
