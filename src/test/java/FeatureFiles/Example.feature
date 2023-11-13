Feature: Example Feature Functionality
  Background:
    Given Navigate to website

  @Smoke @Regression
  Scenario: Navigate to features successfully
    When Click to hamburger button and click to works button
    Then Verify that the current URL contains the works word

    And Click to hamburger button and click to products service button
    Then Verify that the current URL contains the products-services word

    And Click to hamburger button and click to careers button
    Then Verify that the current URL contains the careers word

    And Click to hamburger button and click to about button
    Then Verify that the current URL contains the about word