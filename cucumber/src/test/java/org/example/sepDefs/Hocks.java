package org.example.sepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hocks {

    public static WebDriver driver;
    @Before
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.automationexercise.com/");
    }

    @After
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        Hocks.driver.quit();
    }
}
