package com.cybertek.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports",
                "json:target/cucumber2.json",
                "rerun:target/rerun.txt"
        },
        features="src/test/resources/features",
        glue = "com/cybertek/step_definitions",
        dryRun = false,
        tags = "@account"
)
public class SmokeTestRunner2 {
}
