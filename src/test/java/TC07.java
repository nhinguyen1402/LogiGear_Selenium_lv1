import org.railway.pages.HomePage;
import org.railway.utils.ConfigLoader;
import org.railway.utils.Log4j;
import org.railway.pages.LoginPage;
import org.railway.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.railway.driver.DataHelper.randomValidPid;
import static org.railway.driver.DataHelper.randomValidUsername;

public class TC07 extends BaseTest{
    LoginPage loginPage = new LoginPage();
    HomePage homePage= new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test(priority = 1, testName = "TC_007", description = "User can create new account")
    public void testcase007() {
        Log4j.header("Testcase 007");
        Log4j.info("Step: Register new account with random valid email and account");
        homePage.goToRegisterTab();
        String email = randomValidUsername();
        String password = ConfigLoader.getInstance().getValidPassword();
        String pid = Integer.toString(randomValidPid());
        registerPage.register(email, password, password, pid);
        Log4j.info("Verify: Login with random account success");
        Assert.assertEquals(registerPage.getSuccessMsg(), "You're here", "Login failed");
    }
}
