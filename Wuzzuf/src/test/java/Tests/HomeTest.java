package Tests;

import Pages.HomePage;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
    public void searchFunction() throws InterruptedException {
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
        //click on Entry level position
        page.clickOnEntryLevel();
        //click on full time job
        page.clickOnFullTime();
        //click on remote job
        page.clickOnRemote();
        //Enter field of job that required
        page.clickOnElectricalEngineer();
        //Enter expected salary
        page.enterExpectedSalary("10000");
        //continue process
        page.clickOnSaveAndContinue();
        //Enter date of birth
        page.chooseDate();
        //Select female
        page.chooseFemale();
        //Enter Location
        page.selectLocation();
        //wait till invisibility of overlap
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("css-m16exc")));
        //Enter phone number
        page.enterPhoneNumber("01544354547");
        //click on save
        page.clickOnSaveButton();
        //enter experience year
        page.setYearsExperience();
        //scroll down
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");
        //Enter study field and university
        page.enterStudyInformation("Electrical","Helwan");
        //Enter languages
        page.editLanguage();
        //Enter skills of job that searched about it
        page.enterSkills("Software testing");
        page.enterSkills2("Embedded System");
        //Enter get started to apply for job
        page.clickOnGetStarted();
        soft.assertAll();


    }
}
