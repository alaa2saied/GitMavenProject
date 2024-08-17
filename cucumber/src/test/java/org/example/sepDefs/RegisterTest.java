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
        page.clickOnLogin();
    }


    @When("Enter valid data in name as {string} and email {string}")
    public void enterValidDataInEmailAsAndPassword(String name, String email) {
        page.enterEmail(name,email);

    }

    @And("Click on register button")
    public void clickOnRegisterButton() {
        page.clickOnSignUpButton();
    }

    @Then("User can navigate to register page")
    public void userCanNavigateToRegisterPage() {
        Assert.assertEquals(Hocks.driver.getCurrentUrl(),"https://www.automationexercise.com/signup");
    }
}
