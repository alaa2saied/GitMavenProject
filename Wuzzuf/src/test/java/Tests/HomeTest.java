package Tests;

import Pages.HomePage;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HomeTest extends BaseTest{

    SoftAssert soft = new SoftAssert();
    HomePage page;
    Actions actions;
    Faker faker ;

    @Test
    public void searchFunction(){
        //create object from home page
        page  = new HomePage(driver);
        actions = new Actions(driver);
        faker = new Faker();
        test = reports.createTest("Wuzzuf");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        //assert URL
        soft.assertEquals(driver.getCurrentUrl(),"https://wuzzuf.net/jobs/egypt");
        test.pass("Website open correctly "+ driver.getCurrentUrl());
        //search about  software testing
        page.writeSearchBox("Software testing");
        page.clickOnSearchButton();
        //assert button is clickable
        soft.assertTrue(page.assertFeature().isEnabled());
       test.pass("Button is enable to click");
       //wait invisible of over lab
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("css-m16exc")));
        //hover to this feature
        actions.moveToElement(page.assertFeature()).perform();
        //Detect job that post before a week
       page.clickOnPostButton();
       page.clickOnPostWeek();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("css-m16exc")));
        //print all job that have name software testing
        List<WebElement> jobs = page.printAllJob();
        for (int i=0 ; i< jobs.size() ; i++){
            System.out.println(jobs.get(i).getText());
            soft.assertTrue(jobs.get(i).getText().toLowerCase().contains("test")| jobs.get(i).getText().toLowerCase().contains("software"));
            test.pass("This job for testing Engineer");
        }
        //Click on first job
        page.clickOnFirstJob();
        //switch to the page of job
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        //click on apply for job button
        page.clickOnApplyButton();
        //Enter first name
        page.enterFirstName(faker.name().firstName());
        //Enter last name
        page.enterLastName(faker.name().lastName());
        //Enter email address
        page.enterEmail(faker.internet().safeEmailAddress());
        //Enter password
        page.enterPassword(faker.internet().password(8,15,true,true,true));
        //Click on sign up button
        page.clickOnSignUpButton();
        page.clickOnSignUpButton();
        soft.assertAll();


    }
}
