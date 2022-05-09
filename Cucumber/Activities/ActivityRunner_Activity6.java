package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepDefinitions"},
        tags = "@activity5",
        plugin = {"json: test-reports/json-report.json"},
        monochrome = true
)
public class ActivityRunner_Activity6 {
    //empty
}