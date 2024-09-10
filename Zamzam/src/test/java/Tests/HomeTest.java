package Tests;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;

public class HomeTest extends BaseTest {

    SoftAssert soft = new SoftAssert();
    HomePage page ;
    WebDriverWait wait;
    @Test
    public void TestCase() throws InterruptedException {
        test = report.createTest("report");
        //create object from home page
        page = new HomePage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        //assert website open
        soft.assertEquals(driver.getCurrentUrl(),"https://zamzam.com/");
        test.pass("the correct URL "+driver.getCurrentUrl());
        //close page of non robot
        wait.until(ExpectedConditions.visibilityOf(page.waitAlert()));
        page.closePage();
        //to scroll down page
        Thread.sleep(1000);
        JavascriptExecutor sc = (JavascriptExecutor) driver;
        sc.executeScript("window.scrollBy(0,2000)");
        //wait until invisible of overlap
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("css-m16exc")));
        //assert facebook page open Zamzam page
        page.clickOnFacebookIcon();
        soft.assertTrue(driver.getCurrentUrl().toLowerCase().contains("zam"));
        test.pass("Open page of  Zamzam website");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        //close tab of facebook
        driver.switchTo().window(tabs.get(1));
        driver.close();
        driver.switchTo().window(tabs.get(0));
        //assert click on twitter icon open Zamzam page in twitter
        page.clickOnTwitterIcon();
        soft.assertTrue(driver.getCurrentUrl().toLowerCase().contains("zam"));
        test.pass("Twitter icon open Zamzam page in twitter");
        tabs= new ArrayList<>(driver.getWindowHandles());
        //close tab of twitter
        driver.switchTo().window(tabs.get(1));
        driver.close();
        driver.switchTo().window(tabs.get(0));
        //assert click on LinkedIn icon open Zamzam page in Linkedin
        page.clickOnLinkedinIcon();
        soft.assertTrue(driver.getCurrentUrl().toLowerCase().contains("zam"));
        test.pass("LinkedIn icon open Zamzam page in twitter");
        tabs= new ArrayList<>(driver.getWindowHandles());
        //close tab of LinkedIn
        driver.switchTo().window(tabs.get(1));
        driver.close();
        driver.switchTo().window(tabs.get(0));
        //assert click on youtube icon open Zamzam page in Youtube
        page.clickOnYoutubeIcon();
        soft.assertTrue(driver.getCurrentUrl().toLowerCase().contains("zam"));
        test.pass("Youtube icon open Zamzam page in twitter");
        tabs= new ArrayList<>(driver.getWindowHandles());
        //close tab of Youtube
        driver.switchTo().window(tabs.get(1));
        driver.close();
        driver.switchTo().window(tabs.get(0));
        //assert click on Instagram icon open Zamzam page in Instagram
        page.clickOnInstagramIcon();
        soft.assertTrue(driver.getCurrentUrl().toLowerCase().contains("zam"));
        test.pass("Instagram icon open Zamzam page in twitter");
        tabs= new ArrayList<>(driver.getWindowHandles());
        //close tab of Instagram
        driver.switchTo().window(tabs.get(1));
        driver.close();
        driver.switchTo().window(tabs.get(0));
        //scroll up
        Thread.sleep(1000);
        sc.executeScript("window.scrollBy(0,-2000)");
        //Search on city
        page.searchOCity("ma");
        //select date
        page.clickOnDate();
        page.selectDate();
        //Select on number of room
        page.clickOnRoom();
        page.selectRoom("2 Rooms");
        //select nationality
        page.selectNationality("Egypt");
        //Click on first hotel
        page.clickOnFirstHotel();
        //Scroll down in page
        Thread.sleep(1000);
        sc.executeScript("window.scrollBy(0,1500)");
        //Click in check out
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("css-m16exc")));
        page.clickOnCheck();
        //Get error message
        System.out.println(page.getErrorMessage());
        soft.assertAll();
    }
}
