package org.example.StepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Product {
    ProductPage page = new ProductPage();
    SoftAssert soft = new SoftAssert();
    WebDriverWait wait ;
    Faker faker = new Faker();
    @Given("Open URL")
    public void openURL(){
        soft.assertEquals(Hocks.driver.getCurrentUrl(),"https://www.ikea.com/eg/en/");
        soft.assertAll();
    }


    @When("Click on sign up button")
    public void clickOnSignUpButton() {
        page.signUpButton.click();
    }

    @And("Click on create new  account")
    public void clickOnCreateNewAccount() {
        wait = new WebDriverWait(Hocks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(page.createAccountButton)).click();
    }

    @And("Enter  valid data in all field")
    public void enterValidDataInAllField() throws InterruptedException {
        wait = new WebDriverWait(Hocks.driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(page.acceptCookies)).click();
        wait.until(ExpectedConditions.visibilityOf(page.firstName)).sendKeys(faker.name().firstName());
        page.lastName.sendKeys(faker.name().lastName());
        page.email.sendKeys(faker.internet().safeEmailAddress());
        page.password.sendKeys(faker.internet().password(8,20,true,false,true));
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) Hocks.driver;
        js.executeScript("window.scrollBy(0,500)");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("css-m16exc")));
        page.checkBox.click();

    }

    @And("Click on create")
    public void clickOnCreate()  {
        wait = new WebDriverWait(Hocks.driver,Duration.ofSeconds(10));
        page.createButton.click();
        wait.until(ExpectedConditions.invisibilityOf(page.successMessage));
    }

    @And("Navigate back to home page")
    public void navigateBackToHomePage() {
        Hocks.driver.navigate().back();
    }
    @And("Click on sofa")
    public void clickOnSofa() throws InterruptedException {
        wait = new WebDriverWait(Hocks.driver,Duration.ofSeconds(10));
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) Hocks.driver;
        js.executeScript("window.scrollBy(0,1800)");
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("css-m16exc")));
        page.sofasButton.click();
    }
    @And("Filter result from high to low")
    public void filterResultFromHighToLow() {
        wait = new WebDriverWait(Hocks.driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(page.sortButton)).click();
        page.highToLowSelect.click();
        page.sortButton.click();
    }
    @And("Add {string} product to cart")
    public void addProductToCart(String arg0) throws InterruptedException {
        wait = new WebDriverWait(Hocks.driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("css-m16exc")));
        List<String> productNameStore = new ArrayList<>();
        List<String> productPriceStore = new ArrayList<>();
        for (int i=0 ; i< Integer.parseInt(arg0) ; i++){
            wait.until(ExpectedConditions.elementToBeClickable(page.productToAddToCart.get(i))).click();
            productNameStore.add(i,page.productName.get(i).getText());
            productPriceStore.add(i,page.productPrice.get(i).getText().replaceAll("[^\\d.]",""));
        }
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) Hocks.driver;
        js.executeScript("window.scrollBy(0,-1800)");
        page.cartButton.click();
        int totalPriceStore = 0;
        for (int j=0 ; j<page.productInCartName.size() ; j++){
           soft.assertTrue(page.productInCartName.get(j).getText().contains(productNameStore.get(j)));
           //[^//d.] to remove all character from string to transfer string to integer number
            soft.assertEquals(page.productInCartPrice.get(j).getText().replaceAll("[^\\d.]",""),productPriceStore.get(j));
            totalPriceStore += Integer.parseInt(productPriceStore.get(j).replaceAll("[^\\d.]",""));
        }
        soft.assertEquals(Integer.parseInt(page.totalPrice.getText().replaceAll("[^\\d.]","")),totalPriceStore);

        soft.assertAll();
    }
    @And("Move second element to wish list")
    public void moveSecondElementToWishList() throws InterruptedException {
        //scroll down
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) Hocks.driver;
        js.executeScript("window.scrollBy(0,500)");
        page.moveToFavourite.click();


    }
    @And("Remove third product from cart")
    public void removeThirdProductFromCart() {
        page.removeThirdElement.click();
    }
    @And("Click on checkout button")
    public void clickOnCheckoutButton() {
        page.checkOutButton.click();
    }
    @And("Enter valid data in all field in checkout page")
    public void enterValidDataInAllFieldInCheckoutPage() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(page.fullNameCheckOut)).sendKeys(faker.name().fullName());
        Select govSelect = new Select(page.governorate);
        govSelect.selectByVisibleText("Cairo");
        Select citySelect = new Select(page.city);
        citySelect.selectByVisibleText("15Th Of May");
        page.emailCheckOut.sendKeys(faker.internet().safeEmailAddress());
        page.phoneNumber.sendKeys(faker.phoneNumber().phoneNumber());
        page.address.sendKeys(faker.address().fullAddress());
        page.building.sendKeys(faker.address().streetAddress());
        page.continueButton.click();

        wait.until(ExpectedConditions.visibilityOf(page.continueCheckOut));
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) Hocks.driver;
        js.executeScript("window.scrollBy(0,1000)");
        page.continueCheckOut.click();

    }

    @Then("System register successfully")
    public void systemRegisterSuccessfully() {
        System.out.println("done ");
    }



}
