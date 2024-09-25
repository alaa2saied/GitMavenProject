package org.example.Tests;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;

public class Home {
    HomePage page = new HomePage();
    SoftAssert soft = new SoftAssert();
    Faker faker = new Faker();
    WebDriverWait wait ;
    @Given("Open URL")
    public void openURl(){
        Assert.assertEquals(Hocks.driver.getCurrentUrl(),"https://etmana.com/en/homePage","Home page successfully loaded");
    }

    @When("Click on sign up button")
    public void clickOnSignUpButton() {
        page.signUp.click();
    }

    @And("Enter first and last name")
    public void enterFirstAndLastName() {
        page.firstName.sendKeys(faker.name().firstName());
        page.lastName.sendKeys(faker.name().lastName());
    }

    @And("Enter phone number")
    public void enterPhoneNumber() {
        page.phoneNumber.sendKeys("01279737688");
    }

    @And("Enter email address")
    public void enterEmailAddress() {
        page.emailAddress.sendKeys(faker.internet().safeEmailAddress());
    }

    @And("Enter password")
    public void enterPassword() {
        page.password.sendKeys(faker.internet().password(7,11,true,false,true));
    }

    @And("Click on create an account")
    public void clickOnCreateAnAccount() {
        page.createAccountButton.click();
    }

    @Then("User register successfully")
    public void userRegisterSuccessfully() {
    }

    @When("click on search box")
    public void clickOnSearchBox() {
        page.searchButton.click();
    }

    @And("Enter name of product {string}")
    public void enterNameOfProduct(String text) {
        page.searchText.sendKeys(text);
    }

    @And("click on search button")
    public void clickOnSearchButton() {
        page.searchBoxButton.click();
    }

    @Then("System should show product successfully")
    public void systemShouldShowProductSuccessfully() {
        for (int i=0 ; i<page.productSearched.size() ; i++){
            soft.assertTrue(page.productSearched.get(i).getText().toLowerCase().contains("slip"),"slipper appear");
        }
        soft.assertAll();
    }

    @When("click on women category")
    public void clickOnWomenCategory() {
        page.womenCategory.click();
    }

    @And("click on tops")
    public void clickOnTops() {
        page.tops_product.click();
    }

    @Then("System should show tops product")
    public void systemShouldShowTopsProduct() {
       for (int i=0 ; i< page.topsProductPage.size();i++){
           soft.assertTrue(page.topsProductPage.get(i).getText().toLowerCase().contains("top"));
       }
       soft.assertAll();
    }

    @When("Open bag page in women category")
    public void openBagPageInWomenCategory() {
        wait = new WebDriverWait(Hocks.driver, Duration.ofSeconds(10));
        page.womenCategory.click();
        wait.until(ExpectedConditions.elementToBeClickable(page.bagProduct)).click();
    }

    @And("Click on wish button of one product")
    public void clickOnWishButtonOfOneProduct() {

        wait = new WebDriverWait(Hocks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(page.productWishButton)).click();
    }

    @And("Open wish list")
    public void openWishList() {
        page.wishListButton.click();
    }

    @Then("System should add product to wish list")
    public void systemShouldAddProductToWishList() {
        soft.assertTrue(page.backBag.getText().toLowerCase().contains("back"));
        soft.assertAll();
    }

    @When("Click on facebook icon")
    public void clickOnFacebookIcon() {
        page.facebookIcon.click();
    }

    @Then("System should open facebook page in website")
    public void systemShouldOpenFacebookPageInWebsite() throws InterruptedException {
        Thread.sleep(5000);
        ArrayList<String> tabs = new ArrayList<>(Hocks.driver.getWindowHandles());
        Hocks.driver.switchTo().window(tabs.get(1));
        soft.assertEquals(Hocks.driver.getCurrentUrl(),"https://www.facebook.com/etmanaeg/");
        Hocks.driver.close();
        Hocks.driver.switchTo().window(tabs.getFirst());
        soft.assertAll();

    }

    @And("Ener invalid {string} and {string}")
    public void enerInvalidAnd(String arg0, String arg1) {
    }

    @And("Enter valid data in other field")
    public void enterValidDataInOtherField() {
    }

    @Then("System should prevent user from registration")
    public void systemShouldPreventUserFromRegistration() {
    }
}
