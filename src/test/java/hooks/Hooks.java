package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import scenarios.GoogleSteps;

public class Hooks {

    @Before
    public void setUp() {
        GoogleSteps.driver = new org.openqa.selenium.chrome.ChromeDriver();
    }

    @After
    public void tearDown() {
        if (GoogleSteps.driver != null) {
            GoogleSteps.driver.quit();
        }
    }
}
