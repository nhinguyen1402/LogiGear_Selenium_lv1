import org.railway.helper.DataHelper;
import org.railway.pages.ChangePasswordPage;
import org.railway.pages.HomePage;
import org.railway.pages.LoginPage;
import org.railway.pages.RegisterPage;
import org.railway.utils.ConfigLoader;
import org.railway.utils.Log4j;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.railway.utils.Constant.PASSWORD;

public class TC10 extends BaseTest{
    HomePage homePage= new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test(priority = 1, testName = "TC_010", description = "User can't create account with Confirm password is not the same with Password")
    public void testcase010() {
        Log4j.header("Testcase 010");
        Log4j.info("Step: Register new account with Confirm password is not the same with Password");
        homePage.goToRegisterTab();
        String email = DataHelper.randomValidUsername();
        String password = ConfigLoader.getInstance().getPropertyByKey(PASSWORD);
        String confirmPassword = DataHelper.randomValidPassWord();
        String pid = Integer.toString(DataHelper.randomValidPid());
        registerPage.register(email, password, confirmPassword, pid);

        Log4j.info("Verify: User can't create account with Confirm password is not the same with Password");
        Assert.assertEquals(registerPage.getRegisterErrorMsgText(), "There're errors in the form. Please correct the errors and try again.", "There are some errors!");
    }
}

