package Tests;

import Pages.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BaseTest {

    WebDriver driver;
    BasePage basePage;
    LoginPage loginPage ;
    ProductPage productPage;
    CartPage cartPage;
    CheckOutPage checkOutPage;
    protected static ExtentReports report;
    protected static ExtentTest test;
    @BeforeSuite
    public void setUp(){
        report = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter(new File("reports/report.html"));
        spark.config().setTheme(Theme.DARK);
        report.attachReporter(spark);
    }

    @BeforeTest
    public void precondition(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        basePage = new BasePage();
        basePage.setDriver(driver);
        loginPage = new LoginPage();
        productPage = new ProductPage();
        cartPage = new CartPage();
        checkOutPage = new CheckOutPage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterTest
    public void afterTest() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @AfterSuite
    public void tearDown() throws IOException {
        report.flush();
        Desktop.getDesktop().open(new File("reports/report.html"));
    }


}
