import org.railway.common.Constant;
import org.railway.pages.HomePage;
import org.railway.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01 extends BaseTest{
    LoginPage loginPage = new LoginPage();
    @Test(priority = 1, testName = "TC_01", description = "User can log into Railway with valid username and password")
    public void TC01() {
        loginPage.goToLoginPage();
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        String actualMsg = loginPage.getWelcomeMsg();
        String expectedMsg = "Welcome " + Constant.USERNAME;
        Assert.assertEquals(actualMsg, expectedMsg, "Welcome message is not displayed as expected");
    }
}
