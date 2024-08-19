package org.example.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import java.awt.*;

@CucumberOptions(
        features = "src/main/resources/register.feature",
        glue = "org.example.sepDefs",
        tags = "@happy",
        plugin = {
                "pretty",
                "html:Report/report.html"
        }
)

public class Runner extends AbstractTestNGCucumberTests {
}
