package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {

    public static WebDriver driver;
    WebDriverWait wait;

    public void setDriver(WebDriver driver){
        BasePage.driver = driver;
    }

    protected void write(By locator,String text){
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement element = driver.findElement(locator);
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(text);
    }

    protected void clickFeature(By locator){
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement element = driver.findElement(locator);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    protected WebElement returnMessage(By locator){

        return driver.findElement(locator);
    }
    protected List getList(By locator){
        return driver.findElements(locator);
    }




}
