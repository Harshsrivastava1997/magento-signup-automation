package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PasswordChange extends BasePage
{
    public PasswordChange(WebDriver driver)
        {
            super(driver);
        }

        @FindBy(xpath="//input[@name='current_password']")
        WebElement current_password_feild;

        @FindBy(xpath="//input[@name='password' and @id='password']")
         WebElement new_password_feild;

        @FindBy(xpath="//input[@name='password_confirmation' and @id='password-confirmation']")
         WebElement password_confirmation_feild;

         @FindBy(xpath ="//button[@type='submit' and @title='Save']")
          WebElement save_button_feild;


         public void password_change(){
             current_password_feild.sendKeys("Test@1234");
             new_password_feild.sendKeys("Harsh@12345");
             password_confirmation_feild.sendKeys("Harsh@12345");
             save_button_feild.click();


         }













}
