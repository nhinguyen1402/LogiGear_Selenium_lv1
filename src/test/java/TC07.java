import org.railway.helper.DataHelper;
import org.railway.pages.HomePage;
import org.railway.utils.Constant;
import org.railway.utils.Log4j;
import org.railway.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC07 extends BaseTest{
    HomePage homePage= new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test(priority = 1, testName = "TC_007", description = "User can create new account")
    public void testcase007() {
        Log4j.header("Testcase 007");
        Log4j.info("Step: Register new account with random valid email and account");
        Log4j.info("Go to Register page");
        homePage.goToRegisterTab();

        String email = DataHelper.randomValidUsername();
        String password = Constant.PASSWORD;
        String pid = Integer.toString(DataHelper.randomValidPid());

        Log4j.info("Register with email: " + email + ", password: " + password + " and PID: " + pid);
        registerPage.register(email, password, password, pid);

        Log4j.info("Verify: Login with random account success");
        Assert.assertEquals(registerPage.getSuccessMsg(), "You're here", "Login failed");
    }
}
