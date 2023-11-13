package StepDefinitions;

import PageObjectModels.ExampleLocators;
import Utilities.DriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ExampleSteps {
    ExampleLocators locators = new ExampleLocators();

    @Given("Navigate to website")
    public void navigateToWebsite() {
        DriverManager.get().navigate().to("https://www.kaizentech.net/");

        if (locators.acceptCookieButton.isDisplayed()) {
            locators.acceptCookieButton.click();
        }
    }

    @When("Click to hamburger button and click to works button")
    public void clickToHamburgerButtonAndClickToWorksButton() {
        locators.click(locators.hamburgerButton);
        locators.click(locators.works);
    }

    @Then("Verify that the current URL contains the works word")
    public void verifyThatTheCurrentURLContainsTheWorksWord() {
        DriverManager.get().getCurrentUrl().contains("works");
    }

    @And("Click to hamburger button and click to products service button")
    public void clickToHamburgerButtonAndClickToProductsServiceButton() {
        DriverManager.getWait().until(ExpectedConditions.elementToBeClickable(locators.hamburgerButton));
        locators.jsClick(locators.hamburgerButton);
        locators.jsClick(locators.productServices);
    }

    @Then("Verify that the current URL contains the products-services word")
    public void verifyThatTheCurrentURLContainsTheProductsServicesWord() {
        DriverManager.get().getCurrentUrl().contains("products-services");
    }

    @And("Click to hamburger button and click to careers button")
    public void clickToHamburgerButtonAndClickToCareersButton() {
        DriverManager.getWait().until(ExpectedConditions.elementToBeClickable(locators.hamburgerButton));
        locators.jsClick(locators.hamburgerButton);
        locators.click(locators.careers);
    }

    @Then("Verify that the current URL contains the careers word")
    public void verifyThatTheCurrentURLContainsTheCareersWord() {
        DriverManager.get().getCurrentUrl().contains("careers");
    }

    @And("Click to hamburger button and click to about button")
    public void clickToHamburgerButtonAndClickToAboutButton() {
        DriverManager.getWait().until(ExpectedConditions.elementToBeClickable(locators.hamburgerButton));
        locators.jsClick(locators.hamburgerButton);
        locators.click(locators.about);
    }

    @Then("Verify that the current URL contains the about word")
    public void verifyThatTheCurrentURLContainsTheAboutWord() {
        DriverManager.get().getCurrentUrl().contains("about");
    }
}
