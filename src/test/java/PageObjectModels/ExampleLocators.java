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

    @FindBy(xpath = "//textarea[@aria-label='username']")
    public WebElement usernameBox;
    @FindBy(xpath = "//textarea[@aria-label='password']")
    public WebElement passwordBox;
    @FindBy(xpath = "(//input[@name='btnK'])[2]")
    public WebElement loginBtn;
    @FindBy(xpath = "(//input[@name='btnK'])[1]")
    public WebElement logoutBtn;
}
