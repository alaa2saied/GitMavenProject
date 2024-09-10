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
    WebDriver driver;

    WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void clickFeature(By locator){
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = driver.findElement(locator);
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }
    public void writeFeature(By locator , String text){
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement element = driver.findElement(locator);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys(text);
    }
    public WebElement forAssert(By locator){
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement element = driver.findElement(locator);
        wait.until(ExpectedConditions.visibilityOf(element));
        return element;
    }
    public List forPrintFeature(By locator){
        return driver.findElements(locator);
    }
}
