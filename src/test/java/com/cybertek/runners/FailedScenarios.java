package com.cybertek.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports",
                "json:target/jsonReports/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features="@target/rerun.txt",
        glue = "com/cybertek/step_definitions"

)
public class FailedScenarios {
}
