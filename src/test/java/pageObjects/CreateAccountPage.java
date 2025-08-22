package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOf(firstName)).sendKeys(fName);
        wait.until(ExpectedConditions.visibilityOf(lastName)).sendKeys(lName);
        wait.until(ExpectedConditions.visibilityOf(email)).sendKeys(emailAddr);
        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(pwd);
        wait.until(ExpectedConditions.visibilityOf(confirmPassword)).sendKeys(pwd);
        wait.until(ExpectedConditions.elementToBeClickable(createAccountButton)).click();
    }
}

