import org.railway.pages.LoginPage;
import org.railway.utils.Constant;
import org.railway.utils.Log4j;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02 extends BaseTest{
    LoginPage loginPage = new LoginPage();
    @Test(priority = 1, testName = "TC_02", description = "TC02 - User can't login with blank Username textBox")
    public void TC02() {
        String password = Constant.PASSWORD;
        Log4j.info("Go to Login page");
        loginPage.goToLoginPage();
        Log4j.info("Login with blank username: " + " and password: "+password);
        loginPage.login("", password);

        String actualMsg = loginPage.getErrorMsg();
        String expectedMsg = "There was a problem with your login and/or errors exist in your form.";
        Log4j.info("Verify that Error message is displayed.");
        Assert.assertEquals(actualMsg, expectedMsg, "Login Error message is not displayed as expected");
    }
}
