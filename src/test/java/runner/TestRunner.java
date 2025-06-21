package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"scenarios"}, // 👈 This is key!
        plugin = {"pretty", "junit:target/surefire-reports/result.xml"},
        monochrome = true
)
public class TestRunner {
}
