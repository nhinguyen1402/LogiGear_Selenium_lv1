import org.railway.helper.DataHelper;
import org.railway.pages.HomePage;
import org.railway.pages.RegisterPage;
import org.railway.utils.Constant;
import org.railway.utils.Log4j;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TC11 extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    SoftAssert softAssert = new SoftAssert();

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

        Log4j.info("Verify: Error message appears above the form ");
        softAssert.assertEquals(registerPage.getRegisterErrorMsgText(), "There're errors in the form. Please correct the errors and try again.", "Error message does not display!");
        Log4j.info("Verify: Error message Invalid password length displays");
        softAssert.assertEquals(registerPage.getPassWordErrorMsgText(), "Invalid password length", "Password error message does not display!");
        Log4j.info("Verify: Error message Invalid ID length displays");
        softAssert.assertEquals(registerPage.getPIDErrorMgsText(), "Invalid ID length", "PID error message does not display!");
        softAssert.assertAll();
    }
}
