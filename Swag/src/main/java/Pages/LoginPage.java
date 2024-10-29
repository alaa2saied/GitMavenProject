package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

//    public LoginPage(WebDriver driver){
//        super(driver);
//    }

    //Locators

    private final By userNameLocator = By.id("user-name");
    private final By passwordLocator = By.id("password");
    private final By loginButtonLocator =By.id("login-button");
    private final By messageLocator = By.cssSelector("div[class=\"error-message-container error\"] h3");


    //Methods

    public void setUserName(String userName){
        write(userNameLocator, userName);
    }

    public void setPassword(String password){
        write(passwordLocator,password);
    }

    public ProductPage clickOnLoginButton(){
        clickFeature(loginButtonLocator);
        return new ProductPage();
    }

    public ProductPage setCredentials(String userName, String password){
        setUserName(userName);
        setPassword(password);
        return clickOnLoginButton();
    }

    public String getErrorMessage(){
        return returnMessage(messageLocator).getText();
    }



}
