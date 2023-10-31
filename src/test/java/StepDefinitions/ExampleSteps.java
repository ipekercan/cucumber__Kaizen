package StepDefinitions;

import PageObjectModels.ExampleLocators;
import Utilities.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExampleSteps {
    ExampleLocators locators = new ExampleLocators();

    @Given("Navigate to website")
    public void navigateToWebsite() {
        DriverManager.get().navigate().to("https://www.facebook.com/");
    }

    @When("Enter username and password from excel")
    public void enterUsernameAndPasswordFromExcel() {
        locators.sendKeys(locators.usernameBox,"username");
        locators.sendKeys(locators.passwordBox,"password");
        locators.click(locators.loginBtn);
    }

    @Then("Verify login successfully")
    public void verifyLoginSuccessfully() {
        locators.verifyContainsText(locators.logoutBtn,"log out");
    }
}
