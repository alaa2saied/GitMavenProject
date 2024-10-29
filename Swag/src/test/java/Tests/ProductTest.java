package Tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

public class ProductTest extends BaseTest{

    SoftAssert softAssert = new SoftAssert();


    @Test
    public void openIcon() throws InterruptedException {
        test = report.createTest("report");
        loginPage.setCredentials("standard_user","secret_sauce");
        //Click on linkedIn icon
        productPage.clickOnLinkedinIcon();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        softAssert.assertTrue(driver.getCurrentUrl().contains("linkedin"));
        test.pass("Open tab linkedin successfully");
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(tabs.getFirst());
        //Click on facebook icon
        productPage.clickOnFacebookIcon();
        tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        softAssert.assertTrue(driver.getCurrentUrl().contains("facebook"));
        test.pass("Open tab facebook successfully");
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(tabs.getFirst());
        //Click on twitter icon
        productPage.clickOnTwitterIcon();
        tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        softAssert.assertTrue(driver.getCurrentUrl().contains("twitter"));
        test.pass("Open tab tewitter successfully");
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(tabs.getFirst());

    }
    @Test
    public void addShirtToCart(){
        test = report.createTest("report");
        loginPage.setCredentials("standard_user","secret_sauce");
        productPage.clickOnAddShirtToCart();
        softAssert.assertTrue(productPage.assertRemoveButtonAppear().toLowerCase().contains("remo"));
        test.pass("product added to cart");
        softAssert.assertAll();
    }

    @Test
    public void selectFilterOfPrice(){
        test = report.createTest("report");
        loginPage.setCredentials("standard_user","secret_sauce");
        productPage.filterProduct("Price (low to high)");
        List<WebElement> pricesWithDol = productPage.listOfProduct();
        List<String> priceWithoutDol = new ArrayList<>();
        for (int i = 0; i< pricesWithDol.size() ; i++){

             priceWithoutDol.add(i,pricesWithDol.get(i).getText().replaceAll("[^\\d.]",""));
        }
        int  i =0;
        while ( i<=priceWithoutDol.size()-1 ){

            if (Double.parseDouble(priceWithoutDol.get(i)) < Double.parseDouble(priceWithoutDol.get(i+1))){

                i++;
                softAssert.assertTrue(Double.parseDouble(priceWithoutDol.get(i)) < Double.parseDouble(priceWithoutDol.get(i+1)));
                test.pass("product arrange from low to high price");
            }
            else {

                break;
            }
        }
        softAssert.assertAll();
    }
    @Test
    public void resetCarr(){
        test = report.createTest("report");
        loginPage.setCredentials("standard_user","secret_sauce");
        productPage.clickOnAddShirtToCart();
        softAssert.assertTrue(productPage.assertInvisibleOfNumber().getText().contains("1"));
        test.pass("product added to cart");
        productPage.clickOnThreeHyphenMenu();
        productPage.clickOnResetButton();
        softAssert.assertAll();
    }

}
