package org.example.TestRunner;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/Features.feature",
        glue = "org.example.StepDefs",
        tags = "@happy",
        plugin = {
                "pretty",
                "html:Report/report.html"
        }
)


public class Runner extends AbstractTestNGCucumberTests {
}
