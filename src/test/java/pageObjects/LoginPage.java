package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {   //Constructor
        super(driver);
    }

    @FindBy(id="email")
      WebElement emailField;
     @FindBy (id="pass")
       WebElement passwordField;
      @FindBy(id="send2")
      WebElement signInButton;



    public void login(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        signInButton.click();
    }
}
