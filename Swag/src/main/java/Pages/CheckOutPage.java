package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckOutPage extends BasePage{

    //Locators
    private final By firstNameLocator = By.id("first-name");
    private final By lastNameLocator = By.id("last-name");
    private final By zipCodeLocator = By.id("postal-code");
    private final By continueButtonLocator = By.id("continue");
    private final By checkOutOverLocator = By.cssSelector("span[data-test=\"title\"]");
    private final By cancelButtonLocator = By.id("cancel");
    private final By logOutButtonLocator = By.id("logout_sidebar_link");
    private final By finishButtonLocator = By.id("finish");
    private final By backToHomeButtonLocator = By.name("back-to-products");





    //Methods
    public void setFirstName(String firstName){
        write(firstNameLocator,firstName);
    }
    public void setLastName(String lastName){
        write(lastNameLocator,lastName);
    }
    public void setZipCode(String zipCode){
        write(zipCodeLocator,zipCode);
    }
    public void clickOnContinueButton(){
        clickFeature(continueButtonLocator);
    }
    public WebElement getTextCheckOut(){
        return returnMessage(checkOutOverLocator);
    }
    public void clickOnCancelButton(){
        clickFeature(cancelButtonLocator);
    }
    public void clickOnLogOut(){
        clickFeature(logOutButtonLocator);
    }
    public void clickOnFinishButton(){
        clickFeature(finishButtonLocator);
    }











}
