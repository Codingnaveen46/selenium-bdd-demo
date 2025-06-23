package scenarios;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class GoogleSteps {

    public static WebDriver driver;

    @Given("I open Google")
    public void i_open_google() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @When("I search for {string}")
    public void i_search_for(String query) {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(query + Keys.ENTER);
    }

    @Then("the title should contain {string}")
    public void the_title_should_contain(String expected) {
        try {
            Thread.sleep(2000); // just to simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String title = driver.getTitle();
        assertTrue("Title doesn't contain: " + expected, title.contains(expected));
    }

    // added new comment
    //to integrate this bugasura in windows need to use .bat ext


}
