package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

       @FindBy (linkText="Create an Account")
       WebElement createAccountLink;
      @FindBy(linkText="Sign In")
      WebElement signInLink;
    @FindBy(css = ".customer-welcome > .customer-name")
    WebElement accountDropdown;
    @FindBy(linkText = "Sign Out")
    WebElement signOutLink;


    public void clickCreateAccount() {
        createAccountLink.click();
    }

    public void clickSignIn() {
        signInLink.click();
    }
    public void logout() throws InterruptedException {
        Thread.sleep(2000);
        accountDropdown.click();
        Thread.sleep(2000);
        signOutLink.click();
    }
}

