package org.example.sepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Register;
import org.testng.Assert;

public class RegisterTest {

    Register page = new Register();
    @Given("Open URL")
    public void precondition(){
        page.loginButton.click();
    }


    @When("Enter valid data in {string} and {string}")
    public void enterValidDataInEmailAsAndPassword(String name, String email) {
        page.nameInput.sendKeys(name);
        page.emailInput.sendKeys(email);
    }

    @And("Click on register button")
    public void clickOnRegisterButton() {
        page.signUpButton.click();
    }

    @Then("User can navigate to register page")
    public void userCanNavigateToRegisterPage() {
        Assert.assertEquals(Hocks.driver.getCurrentUrl(),"https://www.automationexercise.com/signup");
    }


}
