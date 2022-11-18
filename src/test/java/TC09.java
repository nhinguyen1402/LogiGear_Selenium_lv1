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

public class TC09 extends BaseTest{
    HomePage homePage= new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage= new LoginPage();
    ChangePasswordPage changePasswordPage= new ChangePasswordPage();

    @Test(priority = 1, testName = "TC_009", description = "User can change password")
    public void testcase009() {
        Log4j.header("Testcase 009");
        Log4j.info("Precondition: Register new account");
        homePage.goToRegisterTab();
        String email = DataHelper.randomValidUsername();
        String password = ConfigLoader.getInstance().getPropertyByKey(PASSWORD);
        String pid = Integer.toString(DataHelper.randomValidPid());
        registerPage.register(email, password, password, pid);

        Log4j.info("Step: User Login and change Password");
        registerPage.goToLoginPage();
        loginPage.login(email, password);
        homePage.goToChangePasswordTab();
        String newPass= DataHelper.randomValidPassWord();
        changePasswordPage.changePass(password, newPass, newPass);

        Log4j.info("Verify: Change Password success");
        Assert.assertEquals(changePasswordPage.getChangePassSuccessMsg(), "Your password has been updated!", "Change Password failed");
    }
}
