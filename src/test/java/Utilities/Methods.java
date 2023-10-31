package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Methods {
    public void sendKeys(WebElement element, String text) {
        DriverManager.getWait().until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text);
    }

    public void click(WebElement element) {
        DriverManager.getWait().until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void jsClick(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.get();
        js.executeScript ("arguments[0].click();", element);
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.get();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void verifyContainsText(WebElement element, String value) {
        DriverManager.getWait().until(ExpectedConditions.textToBePresentInElement(element, value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
}
}