# Selenium BDD Demo

## Overview

This repository demonstrates how to use Selenium WebDriver with Cucumber for Behavior Driven Development (BDD) testing in Java. The project provides automated browser-based test scenarios using Gherkin syntax, with all test execution and result reporting managed via Maven and a shell script that also integrates with Bugasura for defect tracking.

## Features

- Automated browser testing using Selenium WebDriver (Chrome).
- BDD-style scenarios written in Gherkin and executed via Cucumber.
- Step definitions implemented in Java.
- JUnit runner for executing test suites.
- Test result reporting with integration to Bugasura (for defect/result tracking).
- Example feature: Google Search (different search queries, pass/fail demonstration).

## Project Structure

```
src/
  test/
    java/
      hooks/         # Setup and teardown hooks for Selenium WebDriver
      runner/        # Cucumber JUnit test runner
      scenarios/     # Step definitions for feature steps
    resources/
      features/      # Gherkin feature files (BDD scenarios)
run.sh               # Shell script to run tests and upload results
pom.xml              # Maven project file with dependencies
```

## Getting Started

### Prerequisites

- Java JDK 8 or higher
- Maven
- Google Chrome browser installed
- ChromeDriver available in your system PATH
- (Optional) Bugasura account for result uploads

### Installation & Running Tests

1. Clone the repository:
   ```sh
   git clone https://github.com/Codingnaveen46/selenium-bdd-demo.git
   cd selenium-bdd-demo
   ```

2. To run tests:
   ```sh
   mvn clean test
   ```
   Or, use the provided shell script to also upload results to Bugasura:
   ```sh
   bash run.sh
   ```

   > **Note:** Update the `run.sh` script with your own Bugasura API key and project details if you want result uploads.

### Example Feature

```gherkin
Feature: Google Search

  Scenario: Search for Selenium
    Given I open Google
    When I search for "Selenium"
    Then the title should contain "Selenium"

  Scenario: Search for Java
    Given I open Google
    When I search for "Java"
    Then the title should contain "Java"
```

## Key Files

- `src/test/resources/features/GoogleSearch.feature`: Example BDD scenarios.
- `src/test/java/scenarios/GoogleSteps.java`: Step definitions using Selenium WebDriver.
- `src/test/java/hooks/Hooks.java`: Setup and teardown of WebDriver for each scenario.
- `src/test/java/runner/TestRunner.java`: JUnit runner with Cucumber integration.
- `run.sh`: Script to run tests and upload results to Bugasura.

## Continuous Integration

You can integrate this project into CI pipelines by invoking Maven or the `run.sh` script.

## Contribution

Feel free to fork, experiment, and submit pull requests for enhancements or new scenarios.

## License

This project is licensed under the MIT License.
