import org.railway.pages.LoginPage;
import org.railway.utils.Constant;
import org.railway.utils.Log4j;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC03 extends BaseTest{
    LoginPage loginPage = new LoginPage();
    @Test(priority = 1, testName = "TC_03", description = "TC03 - User cannot log into Railway with invalid password ")
    public void TC03() {
        String username = Constant.USERNAME;
        String password = Constant.INVALID_PASSWORD;

        Log4j.header("Testcase 003");
        Log4j.info("Go to Login page");
        loginPage.goToLoginPage();
        Log4j.info("Login with valid Name: " + username + " and invalid password: "+password);
        loginPage.login(username, password);

        String actualMsg = loginPage.getErrorMsgText();
        String expectedMsg = "Invalid username or password. Please try again.";
        Log4j.info("Verify that Error message is displayed.");
        Assert.assertEquals(actualMsg, expectedMsg, "There was a problem with your login and/or errors exist in your form.");
    }
}
