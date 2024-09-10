package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        super(driver);
    }
    //locators
    private final By facebookIconLocator = By.cssSelector("a[href=\"https://www.facebook.com/zamzamtrips\"]");
    private final By twitterIconLocator = By.cssSelector("a[href=\"https://twitter.com/zamzamtrips\"]");
    private final By linkedInIconLocator = By.cssSelector("a[href=\"https://www.linkedin.com/company/zamzamtrips\"]");
    private final By youtubeIconLocator = By.cssSelector("a[href=\"https://www.youtube.com/channel/UCc5uQ4hwnLgNsXhxv8pQtYQ\"]");
    private final By instagramIconLocator = By.cssSelector("a[href=\"https://www.instagram.com/zamzamtrips\"]");
    private final By searchCityLocator = By.xpath("//div[@class=\"carousel slide\"]/section/div/div/div[1]/div/form/div/div/div/div[1]/div/input[1]");
    private final By box = By.xpath("//ul[@class=\"ui-menu ui-widget ui-widget-content ui-autocomplete ui-front tpmAutocomplete\"]/li[2]");
    private final By closeLocator = By.cssSelector("div[class=\"modal-header mx-md-3 px-md-5\"] button[class=\"close\"]");
    private final By dateLocator = By.xpath("//div[@class=\"carousel slide\"]/section/div/div/div[1]/div/form/div/div/div/div[2]/div/div/div");
    private final By dateOneLocator = By.xpath("//div[@class=\"flatpickr-rContainer\"]/div[2]/div[2]/span[3]");
    private final By dateTenLocator = By.xpath("//div[@class=\"flatpickr-rContainer\"]/div[2]/div[2]/span[12]");
    private final By roomLocator = By.xpath("//div[@class=\"carousel slide\"]/section/div/div/div[1]/div/form/div/div/div/div[3]/div/div[1]");
    private final By selectRoomLocator = By.xpath("//div[@class=\"col-lg-2 col-md-6 col-12 pb-md-2  cst-pr-0\"]/div[1]/div[2]/div[1]/div[2]/div/select");
    private final By selectNationalityLocator = By.xpath("//div[@class=\"carousel slide\"]/section/div/div/div[1]/div/form/div/div/div/div[4]/div/div[1]/div/select");
    private final By searchButtonLocator = By.cssSelector("button[id=\"searchBtn\"]");
    private final By firstHotelLocator = By.xpath("//div[@class=\"col-12 col-md-12 mapresult\"]/div[1]/div[1]/div/div/div[1]/div/div[2]/h2/span");
    private final By checkLocator = By.xpath("//button[@id=\"checkAvailabilityBtn\"]");
    private final By errorMessage = By.xpath("//div[@class=\"col-md-12 mt-3 text-center\"]/h5");
    //Methods
    public void clickOnFacebookIcon(){
        clickFeature(facebookIconLocator);
    }
    public void clickOnTwitterIcon(){
        clickFeature(twitterIconLocator);
    }
    public void clickOnLinkedinIcon(){
        clickFeature(linkedInIconLocator);
    }
    public void clickOnYoutubeIcon(){
        clickFeature(youtubeIconLocator);
    }
    public void clickOnInstagramIcon(){
        clickFeature(instagramIconLocator);
    }
    public WebElement waitAlert(){
        return waitAlertFeature(closeLocator);
    }
    public void closePage(){
        clickFeature(closeLocator);
    }
    public void searchOCity(String city){
        writeFeature(searchCityLocator,city);
        clickFeature(box);
    }
    public void clickOnDate(){
        clickFeature(dateLocator);
    }
    public void selectDate(){
        clickFeature(dateOneLocator);
        clickFeature(dateTenLocator);
    }
    public void clickOnRoom(){
        clickFeature(roomLocator);
    }
    public void selectRoom(String text){
        Select room = new Select(waitAlertFeature(selectRoomLocator));
        room.selectByVisibleText(text);
    }
    public void selectNationality(String text){
        Select nation = new Select(waitAlertFeature(selectNationalityLocator));
        nation.selectByVisibleText(text);
        clickFeature(searchButtonLocator);
    }
    public void clickOnFirstHotel(){
        clickFeature(firstHotelLocator);
    }
    public void clickOnCheck(){
        clickFeature(checkLocator);
    }
    public WebElement waitCheckOutClick(){
        return waitAlertFeature(checkLocator);
    }
    public String getErrorMessage(){
        return waitAlertFeature(errorMessage).getText();
    }

}
