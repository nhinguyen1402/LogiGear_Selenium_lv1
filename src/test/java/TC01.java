import org.railway.utils.Constant;
import org.railway.utils.Log4j;
import org.railway.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC01 extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test(priority = 1, testName = "TC_01", description = "User can log into Railway with valid username and password")
    public void TC01() {
        String username = Constant.USERNAME;
        String password = Constant.PASSWORD;
        Log4j.info("Go to Login page");
        loginPage.goToLoginPage();
        Log4j.info("Login with Name: " + username + " and password: "+password);
        loginPage.login(username, password);

        String actualMsg = loginPage.getWelcomeMsg();
        String expectedMsg = "Welcome " + username;

        Log4j.info("Verify that Welcome user message is displayed.");
        Assert.assertEquals(actualMsg, expectedMsg, "Welcome message is not displayed as expected");
    }
}
