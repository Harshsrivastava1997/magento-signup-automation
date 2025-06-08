package testCases;
import org.testng.annotations.Test;
import pageObjects.CreateAccountPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseTest;

public class SignUpTest extends BaseTest  {
    String email = "john.doe" + System.currentTimeMillis() + "@example.com";
    String password = "Test@1234";

    @Test(priority = 1)
    public void createAccountTest() {
        HomePage home = new HomePage(driver);
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
}



