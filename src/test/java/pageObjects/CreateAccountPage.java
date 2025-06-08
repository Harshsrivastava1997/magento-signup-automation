package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage {

    public CreateAccountPage(WebDriver driver)
    {
        super(driver);
    }

      @FindBy(id="firstname")
    WebElement firstName ;
    @FindBy(id="lastname")
    WebElement lastName;
    @FindBy(id="email_address")
    WebElement email;
    @FindBy(id="password")
    WebElement password;
    @FindBy(id="password-confirmation")
    WebElement confirmPassword;
    @FindBy(css="button[title='Create an Account']")
    WebElement createAccountButton;



    public void registerUser(String fName, String lName, String emailAddr, String pwd) {
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        email.sendKeys(emailAddr);
        password.sendKeys(pwd);
        confirmPassword.sendKeys(pwd);
        createAccountButton.click();
    }
}
