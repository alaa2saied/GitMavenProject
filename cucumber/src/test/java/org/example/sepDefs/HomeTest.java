package org.example.sepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomeTest {
    HomePage page = new HomePage();
    @Given("Open URL Almatar")
    public void precondition(){
        System.out.println("precondition");
    }

    @When("Enter going to")
    public void enterGoingTo() {
        page.going.sendKeys("Mecca");
        page.goingLocation.click();

    }

    @And("Enter check in and check out")
    public void enterCheckInAndCheckOut() {
        page.calender.click();
        page.num9.click();
        page.num18.click();

    }

    @And("Enter visitor and their age")
    public void enterVisitorAndTheirAge() {
        page.icon.click();
       page.adult.click();
       page.child.click();
       page.child.click();
       page.menuChild1.click();
       page.child1.click();
       page.menuChild2.click();
       page.child2.click();
       page.applyButton.click();
    }

    @And("Click on search hotels")
    public void clickOnSearchHotels() {
        page.searchButton.click();
    }

    @Then("System should show numbers of hotel in this destination")
    public void systemShouldShowNumbersOfHotelInThisDestination() {
        System.out.println("hotels shows");
    }
}
