import org.railway.pages.LoginPage;
import org.railway.utils.Constant;
import org.railway.utils.Log4j;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC05 extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test(priority = 1, testName = "TC_005", description = "System shows message when user enters wrong password several times")
    public void testcase005() {
        String username = Constant.USERNAME;
        String emptyPassword = Constant.EMPTY_PASSWORD;

        Log4j.header("Testcase 005");
        loginPage.goToLoginPage();

        Log4j.info("Step: Fist time login with invalid account");
        loginPage.login(username, emptyPassword);

        Log4j.info("Step: Second time login with invalid account");
        loginPage.login(username, emptyPassword);

        Log4j.info("Step: Third time login with invalid account");
        loginPage.login(username, emptyPassword);

        Log4j.info("Step: Fourth time login with invalid account");
        loginPage.login(username, emptyPassword);

        String actualMsg = loginPage.getErrorMsgText();
        String expectedMsg = "There was a problem with your login and/or errors exist in your form.";
        Log4j.info("Verify that Error message is displayed.");
        Assert.assertEquals(actualMsg, expectedMsg, "Login Error message is not displayed as expected");
    }
}