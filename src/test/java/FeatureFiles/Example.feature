Feature: Example Feature Functionality

  @Smoke, @Regression, @Auth
  Scenario: Login successfully
    Given Navigate to website
    When Enter username and password from excel
    Then Verify login successfully