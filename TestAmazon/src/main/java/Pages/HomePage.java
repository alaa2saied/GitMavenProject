package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class HomePage extends BasePage{


    public HomePage(WebDriver driver){
        super(driver);
    }

    //Locators
    private final By searchBoxLocator = By.cssSelector("input[id=\"twotabsearchtextbox\"]");
    private final By searchButtonLocator = By.cssSelector("input[type=\"submit\"]");
    private final By productLocator = By.xpath("//div[@class=\"s-main-slot s-result-list s-search-results sg-row\"]/div/div/div/div/div/span/div/div/div[2]/div[1]/h2/a/span");
    private final By priceLocator = By.xpath("//div[@class=\"s-main-slot s-result-list s-search-results sg-row\"]/div/div/div/div/div/span/div/div/div[2]/div[3]/div/div[1]/a/span/span[2]/span[2]");

    //Methode
    public void writeInSearchBox(String text){
        writeFeature(searchBoxLocator,text);
        clickFeature(searchButtonLocator);
    }

    public List productList(){
        return returnList(productLocator);
    }

    public List priceList(){
        return returnList(priceLocator);
    }



}
