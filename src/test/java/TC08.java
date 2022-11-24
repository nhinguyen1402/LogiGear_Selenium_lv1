import org.railway.helper.DataHelper;
import org.railway.pages.HomePage;
import org.railway.pages.LoginPage;
import org.railway.utils.Constant;
import org.railway.utils.Log4j;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC08 extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test(priority = 1, testName = "TC_008", description = "User can't login with an account hasn't been registered")
    public void testcase008() {
        Log4j.header("Testcase 008");
        Log4j.info("Go to Login page");
        homePage.goToLoginPage();

        String email = DataHelper.randomValidUsername();
        String password = Constant.PASSWORD;

        Log4j.info("Login with invalid email: " + email + ", password: " + password);
        loginPage.login(email, password);

        Log4j.info("Verify: Login with random account success");
        Assert.assertEquals(loginPage.getErrorMsgText(), "Invalid username or password. Please try again.", "Login failed");
    }
}
