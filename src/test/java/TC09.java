import org.railway.helper.DataHelper;
import org.railway.pages.ChangePasswordPage;
import org.railway.pages.HomePage;
import org.railway.pages.LoginPage;
import org.railway.pages.RegisterPage;
import org.railway.utils.Constant;
import org.railway.utils.Log4j;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC09 extends BaseTest{
    HomePage homePage= new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage= new LoginPage();
    ChangePasswordPage changePasswordPage= new ChangePasswordPage();

    @Test(priority = 1, testName = "TC_009", description = "User can change password")
    public void testcase009() {
        Log4j.header("Testcase 009");
        Log4j.info("Precondition: Register new account");

        Log4j.info("Step: Go to Register page");
        homePage.goToRegisterTab();
        String email = DataHelper.randomValidUsername();
        String password = Constant.PASSWORD;
        String pid = Integer.toString(DataHelper.randomValidPid());

        Log4j.info("Step: Register new account with email: " + email + ", password: " + password + ", confirm password: " + password + ", pid: " + pid);
        registerPage.register(email, password, password, pid);

        Log4j.info("Step: Go to Login page");
        registerPage.goToLoginPage();

        Log4j.info("Login with Name: " + email + " and password: "+password);
        loginPage.login(email, password);

        Log4j.info("Step: Go to Change password page");
        homePage.goToChangePasswordTab();
        String newPass= DataHelper.randomValidPassWord();

        Log4j.info("Step: Change password with old password: " + password + ", new password: " + newPass + " and confirm password: " + newPass);
        changePasswordPage.changePass(password, newPass, newPass);

        Log4j.info("Verify: Change Password success");
        Assert.assertEquals(changePasswordPage.getChangePassSuccessMsg(), "Your password has been updated!", "Change Password failed");
    }
}
