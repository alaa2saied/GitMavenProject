package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver){
        super(driver);
    }

    //Locator
    private final By searchBox = By.cssSelector("input[class=\"css-ukkbbr e1n2h7jb1\"]");
    private final By searchButton = By.cssSelector("button[class=\"css-11qi1o ezfki8j0\"]");
    private final By postButton = By.cssSelector("div[class=\"css-16dyq3s e1v1l3u10\"] div:nth-child(10)");
    private final By postWeekButton = By.cssSelector("div[class=\"css-16dyq3s e1v1l3u10\"] div:nth-child(10) div:nth-child(3)");
    private final By allJobSearched = By.xpath("//div[@class=\"css-9i2afk\"]/div[2]/div/div/div[1]/h2");
    private final By firstJob = By.xpath("//div[@class=\"css-9i2afk\"]/div[2]/div[1]/div/div[1]/h2/a");
    private final By applyButton = By.cssSelector("button[class=\"css-1m0yk35 ezfki8j0\"]");
    private final By firstNameLocator = By.xpath("//div[@class=\"react-tabs\"] /div[2]/div[1]/form/div[1]/div[1]/div[2]/input");
    private final By lastNameLocator = By.xpath("//div[@class=\"react-tabs\"] /div[2]/div[1]/form/div[1]/div[2]/div[2]/input");
    private final By emailLocator = By.xpath("//div[@class=\"react-tabs\"] /div[2]/div[1]/form/div[2]/div[2]/input");
    private final By passwordLocator = By.xpath("//div[@class=\"react-tabs\"] /div[2]/div[1]/form/div[3]/div[2]/div/div/input");
    private final By signUpButton = By.cssSelector("button[class=\"css-6lejne ezfki8j0\"]");



    //Methode
    public void writeSearchBox(String text){
        writeFeature(searchBox,text);
    }
    public void clickOnSearchButton(){
        clickFeature(searchButton);
    }
    public void clickOnPostButton(){
        clickFeature(postButton);
    }
    public WebElement assertFeature()
    {
        return forAssert(postButton);
    }
    public void clickOnPostWeek(){
        clickFeature(postWeekButton);
    }
    public List printAllJob(){
        return forPrintFeature(allJobSearched);
    }
    public void clickOnFirstJob(){
        clickFeature(firstJob);
    }
    public void clickOnApplyButton(){
        clickFeature(applyButton);
    }
    public void enterFirstName(String firstName){
        writeFeature(firstNameLocator,firstName);
    }
    public void enterLastName(String lastName){
        writeFeature(lastNameLocator,lastName);
    }
    public void enterEmail(String email){
        writeFeature(emailLocator,email);
    }
    public void enterPassword(String password){
        writeFeature(passwordLocator,password);
    }
    public void clickOnSignUpButton(){
        clickFeature(signUpButton);
    }
}
