package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.SearchPage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Search {
    SearchPage page = new SearchPage();
    SoftAssert soft = new SoftAssert();
    WebDriverWait wait = new WebDriverWait(Hocks.driver, Duration.ofSeconds(10));
    Actions action = new Actions(Hocks.driver);
    @Given("Open URL")
    public void OpenURL(){
        soft.assertEquals(Hocks.driver.getCurrentUrl(),"https://almatar.com/en/");
        soft.assertAll();
    }

    @When("Enter country that searched hotels in {string}")
    public void enterCountryThatSearchedHotelsInIt(String country) {
        page.destinationSearch.sendKeys(country);
        page.location.click();
    }

    @And("Enter date")
    public void enterDate() {
        page.date.click();
        page.date30.click();
        page.buttonNavigateDate.click();
        page.date5.click();
    }

    @And("Enter number of adults {string} and children {string}")
    public void enterNumberOfAdultsAndChildren(String ageAdult, String ageChild) {
        page.room.click();
        for (int i=0 ;i<Integer.parseInt(ageAdult)-1 ; i++){
            page.adultIncrease.click();
        }
        for (int i=0 ;i<Integer.parseInt(ageChild) ; i++){
            page.childIncrease.click();
        }
        page.child1Menu.click();
        page.child1Year.click();
        page.child2Menu.click();
        page.child2Year.click();
    }

    @And("Click on apply")
    public void clickOnApply() {
        page.applyButton.click();
    }

    @And("Click on search button")
    public void clickOnSearchButton() {
        page.searchButton.click();
    }

    @And("Set five stars and maximum price")
    public void setFiveStarsAndMaximumPrice() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(page.slider1));
        Thread.sleep(2000);
        action.dragAndDropBy(page.slider1, -189,0);
        action.perform();
        page.fiveStars.click();
    }

    @Then("Number of hotels shown in search page")
    public void numberOfHotelsShownInSearchPage() {
        for (int i=0 ;i<page.hotels.size();i++){
            System.out.println(page.hotels.get(i).getText()+"\t"+page.prices.get(i).getText());
        }

    }


}
