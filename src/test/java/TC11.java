import org.railway.helper.DataHelper;
import org.railway.pages.ChangePasswordPage;
import org.railway.pages.HomePage;
import org.railway.pages.LoginPage;
import org.railway.pages.RegisterPage;
import org.railway.utils.ConfigLoader;
import org.railway.utils.Constant;
import org.railway.utils.Log4j;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.railway.utils.Constant.EMPTY_PASSWORD;

public class TC11 {
    HomePage homePage= new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage= new LoginPage();
    ChangePasswordPage changePasswordPage= new ChangePasswordPage();

    @Test(priority = 1, testName = "TC_011", description = "User can't create account while password and PID fields are empty")
    public void testcase011() {
        Log4j.header("Testcase 011");
        Log4j.info("Step: Register new account while password and PID fields are empty");
        homePage.goToRegisterTab();
        String email = DataHelper.randomValidUsername();
        String password = Constant.EMPTY_PASSWORD;
        String pid = Constant.EMPTY_PID;

        Log4j.info("Step: Register new account with email: " + email + ", password: " + password + ", confirm password: " + password + ", pid: " + pid);
        registerPage.register(email, password, password, pid);

        Log4j.info("Verify: User can't create account while password and PID fields are empty");
        Assert.assertEquals(registerPage.getRegisterErrorMsgText(), "There're errors in the form. Please correct the errors and try again.", "There are some errors!");
    }
}
