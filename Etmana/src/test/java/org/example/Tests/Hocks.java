package org.example.Tests;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hocks {
    public static WebDriver driver;
    @Before
    public static void precondition(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://etmana.com/en/homePage");

    }

    @After
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        //driver.quit();
    }

}
