package Tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

public class BaseTest {

    WebDriver driver;
    protected static ExtentReports report;
    protected static ExtentTest test;
    @BeforeSuite
    public void setUp(){
        report = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter(new File("reports/report.html"));
        spark.config().setTheme(Theme.DARK);
        report.attachReporter(spark);
    }
    @BeforeMethod
    public void precondition() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("src/main/resources/GIGHMMPIOBKLFEPJOCNAMGKKBIGLIDOM_6_6_0_0.crx"));
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://zamzam.com/");
        Thread.sleep(4000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.close();
        driver.switchTo().window(tabs.getFirst());
    }

    @AfterMethod
    public void after() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @AfterSuite
    public void tearDown() throws IOException {
        report.flush();
        Desktop.getDesktop().open(new File("reports/report.html"));
    }
}
