package AppiumBasic;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

public class RunApp {



    @Test
    public void invalidLogin() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();
        //System.setProperty("ANDROID_HOME", "C:\\Users\\Alaa\\AppData\\Local\\Android\\Sdk");
        cap.setCapability("appium:appActivity", "free.programming.programming.MainActivityNew");
        cap.setCapability("appium:appPackage", "free.programming.programming");
        cap.setCapability("appium:deviceName", "AlaaSaied");
        cap.setCapability("appium:platformName", "ANDROID");
        cap.setCapability("appium:platformVersion", "13.0");
        cap.setCapability("appium:udid", "R58N60L60YK");
        cap.setCapability("appium:automationName", "UiAutomator2");
        AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723"), cap);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("free.programming.programming:id/skip_btn")).click();
        driver.findElement(By.id("free.programming.programming:id/editTextEmail")).sendKeys("Alaas3132");
        driver.findElement(By.id("free.programming.programming:id/editTextPassword")).sendKeys("Alaa_saied1");
        driver.findElement(By.id("free.programming.programming:id/logInButton")).click();
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("free.programming.programming:id/loading_text"))));
        String text = driver.findElement(By.id("free.programming.programming:id/loginORSignup")).getText();
        Assert.assertEquals(text,"Login or Sign up","Bad credentials");
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void successLogin() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("appium:appActivity","free.programming.programming.MainActivityNew");
        cap.setCapability("appium:appPackage","free.programming.programming");
        cap.setCapability("appium:deviceName","AlaaSaied");
        cap.setCapability("appium:platformName","ANDROID");
        cap.setCapability("appium:platformVersion","13.0");
        cap.setCapability("appium:udid","R58N60L60YK");
        cap.setCapability("appium:automationName","UiAutomator2");

        AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723"),cap);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("free.programming.programming:id/skip_btn")).click();
        driver.findElement(By.id("free.programming.programming:id/editTextEmail")).sendKeys("Alaas3132@gmail.com");
        driver.findElement(By.id("free.programming.programming:id/editTextPassword")).sendKeys("Alaa_saied1");
        driver.findElement(By.id("free.programming.programming:id/logInButton")).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("free.programming.programming:id/logoText"))));
        String text = driver.findElement(By.id("free.programming.programming:id/logoText")).getText();
        Assert.assertTrue(text.toLowerCase().contains("geeksforgeeks"));
        Thread.sleep(3000);
        driver.quit();
    }

}
