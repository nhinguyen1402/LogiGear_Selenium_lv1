import org.railway.utils.ConfigLoader;
import org.railway.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.railway.utils.Constant.PASSWORD;

public class TC02 extends BaseTest{
    LoginPage loginPage = new LoginPage();
    @Test(priority = 1, testName = "TC_02", description = "TC02 - User can't login with blank Username textBox")
    public void TC02() {
        String password = ConfigLoader.getInstance().getPropertyByKey(PASSWORD);

        loginPage.goToLoginPage();
        loginPage.login("", password);

        String actualMsg = loginPage.getErrorMsg();
        String expectedMsg = "There was a problem with your login and/or errors exist in your form.";

        Assert.assertEquals(actualMsg, expectedMsg, "Login Error message is not displayed as expected");
    }
}
