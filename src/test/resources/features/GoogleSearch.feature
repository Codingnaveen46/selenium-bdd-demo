Feature: Google Search

  Scenario: Search for Selenium
    Given I open Google
    When I search for "Selenium"
    Then the title should contain "Selenium"

  Scenario: Search for Java
    Given I open Google
    When I search for "Java"
    Then the title should contain "Java"

  Scenario: Search for FailTest
    Given I open Google
    When I search for "FailTest"
    Then the title should contain "NotInTitle"
