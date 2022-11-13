import org.railway.pages.HomePage;
import org.railway.pages.LoginPage;
import org.railway.pages.RegisterPage;
import org.railway.utils.ConfigLoader;
import org.railway.utils.Log4j;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.railway.driver.DataHelper.randomValidPid;
import static org.railway.driver.DataHelper.randomValidUsername;

public class TC06 extends BaseTest{
    LoginPage loginPage = new LoginPage();
    HomePage homePage= new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Test(priority = 1, testName = "TC_006", description = "Additional pages display once user logged in")
    public void testcase006() {
        Log4j.header("Testcase 006");
        homePage.goToLoginPage();
        loginPage.login(ConfigLoader.getInstance().getValidUserName(), ConfigLoader.getInstance().getValidPassword());

        Log4j.info("Step: Look at My Ticket tab is displayed");
        Assert.assertTrue(homePage.isMyTicketDisplayed(),"My ticket tab is not displayed!");

        Log4j.info("Step: Look at Change Password tab is displayed");
        Assert.assertTrue(homePage.isChangPasswordDisplayed(),"Change Password tab is not displayed!");

        Log4j.info("Step: Look at Log out tab is displayed");
        Assert.assertTrue(homePage.isLogoutTabDisplayed(),"Log out tab is not displayed!");

        Log4j.info("Step: Click 'My ticket' tab");
        homePage.goToMyTicketTab();

        Log4j.info("Verify that User will be directed to My ticket page");
        Assert.assertEquals(homePage.getPageTitleText(),"Manage Tickets","My ticket tab is not displayed!");

        Log4j.info("Step: Click 'Change Password' tab");
        homePage.goToChangePasswordTab();

        Log4j.info("Verify that User will be directed to Change Password page");
        Assert.assertEquals(homePage.getPageTitleText(),"Change password","Change Password tab is not displayed!");
    }
}