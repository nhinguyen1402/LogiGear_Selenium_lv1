import org.railway.utils.ConfigLoader;
import org.railway.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.railway.utils.Constant.*;

public class TC03 extends BaseTest{
    LoginPage loginPage = new LoginPage();
    @Test(priority = 1, testName = "TC_03", description = "TC03 - User cannot log into Railway with invalid password ")
    public void TC03() {
        String username = ConfigLoader.getInstance().getPropertyByKey(USERNAME);
        String password = ConfigLoader.getInstance().getPropertyByKey(INVALID_PASSWORD);

        loginPage.goToLoginPage();

        loginPage.login(username, password);

        String actualMsg = loginPage.getErrorMsg();
        String expectedMsg = "Invalid username or password. Please try again.";

        Assert.assertEquals(actualMsg, expectedMsg, "There was a problem with your login and/or errors exist in your form.");
    }
}
