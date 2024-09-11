package org.example.StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;

public class Hocks {

    public static WebDriver driver;
    @Before
    public static void precondition() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("src/main/resources/GIGHMMPIOBKLFEPJOCNAMGKKBIGLIDOM_6_9_0_0.crx"));
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.ikea.com/eg/en/");
        Thread.sleep(5000);
        ArrayList<String> tabs = new ArrayList<>(Hocks.driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.close();
        driver.switchTo().window(tabs.getFirst());
    }
    @After
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
