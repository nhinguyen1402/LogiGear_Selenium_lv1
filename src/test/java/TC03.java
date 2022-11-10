import org.railway.common.Constant;
import org.railway.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03 extends BaseTest{
    LoginPage loginPage = new LoginPage();
    @Test(priority = 1, testName = "TC_03", description = "TC03 - User cannot log into Railway with invalid password ")
    public void TC03() {
        loginPage.goToLoginPage();
        loginPage.login(Constant.USERNAME, Constant.INVALID_PASSWORD);
        String actualMsg = loginPage.getErrorMsg();
        String expectedMsg = "There was a problem with your login and/or errors exist in your form.";
        Assert.assertEquals(actualMsg, expectedMsg, "There was a problem with your login and/or errors exist in your form.");
    }
}
