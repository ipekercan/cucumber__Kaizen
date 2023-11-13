package PageObjectModels;

import Utilities.DriverManager;
import Utilities.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExampleLocators extends Methods {
    public ExampleLocators() {
        PageFactory.initElements(DriverManager.get(), this);
    }
    @FindBy(xpath = "//button[text()='Accept All']")
    public WebElement acceptCookieButton;
    @FindBy(css = "a[class='linkStyle']")
    public WebElement kaizen;
    @FindBy(css = "label[for='burger_check']")
    public WebElement hamburgerButton;
    @FindBy(xpath = "//li[text()='Works']")
    public WebElement works;
    @FindBy(xpath = "//li[text()='Products & Service']")
    public WebElement productServices;
    @FindBy(xpath = "//li[text()='Careers']")
    public WebElement careers;
    @FindBy(xpath = "//li[text()='About']")
    public WebElement about;

}
