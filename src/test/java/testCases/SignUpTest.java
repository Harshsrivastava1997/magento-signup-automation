package testCases;
import org.testng.annotations.Test;
import pageObjects.CreateAccountPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.PasswordChange;
import testBase.BaseTest;

public class SignUpTest extends BaseTest  {
    String email = "john.doe" + System.currentTimeMillis() + "@example.com";
    String password = "Test@1234";

    @Test(priority = 1)
    public void createAccountTest() {
        HomePage home = new HomePage(driver);
        home.clickSignIn();
        home.clickCreateAccount();

        CreateAccountPage createAccount = new CreateAccountPage(driver);
        createAccount.registerUser("John", "Doe", email, password);
    }

    @Test(priority = 2)
    public void loginTest() throws InterruptedException {
        HomePage home = new HomePage(driver);
        // Step 1: Logout first (as user is already logged in after registration)
        home.logout();

        // Step 2: Proceed with login
        Thread.sleep(3000); // allow page to refresh
        home.clickSignIn();

        LoginPage login = new LoginPage(driver);
        login.login(email, password);
    }

        @Test(priority = 3)
                public void password_change() throws InterruptedException{
        Thread.sleep(3000);
                   HomePage hp = new HomePage(driver);
                   hp. changepasword();

                   PasswordChange pc = new PasswordChange(driver);
                   pc.password_change();

            //Again login with new password
            LoginPage lp = new LoginPage(driver);
            lp.login( email,  "Harsh@12345");

            System.out.println("Password change and re-login with new password successful");
        }

}



