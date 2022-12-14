import org.railway.pages.HomePage;
import org.railway.pages.LoginPage;
import org.railway.utils.ConfigLoader;
import org.railway.utils.Constant;
import org.railway.utils.Log4j;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC06 extends BaseTest {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Test(priority = 1, testName = "TC_006", description = "Additional pages display once user logged in")
    public void testcase006() {
        String username = Constant.USERNAME;
        String password = Constant.PASSWORD;

        Log4j.header("Testcase 006");
        Log4j.info("Go to Login page");
        homePage.goToLoginPage();

        Log4j.info("Login with Name: " + username + " and password: "+password);
        loginPage.login(username, password);

        Log4j.info("Step: Look at My Ticket tab is displayed");
        Assert.assertTrue(homePage.isMyTicketDisplayed(), "My ticket tab is not displayed!");

        Log4j.info("Step: Look at Change Password tab is displayed");
        Assert.assertTrue(homePage.isChangPasswordDisplayed(), "Change Password tab is not displayed!");

        Log4j.info("Step: Look at Log out tab is displayed");
        Assert.assertTrue(homePage.isLogoutTabDisplayed(), "Log out tab is not displayed!");

        Log4j.info("Step: Click 'My ticket' tab");
        homePage.goToMyTicketTab();

        Log4j.info("Verify that User will be directed to My ticket page");
        Assert.assertEquals(homePage.getPageTitleText(), "Manage Tickets", "My ticket tab is not displayed!");

        Log4j.info("Step: Click 'Change Password' tab");
        homePage.goToChangePasswordTab();

        Log4j.info("Verify that User will be directed to Change Password page");
        Assert.assertEquals(homePage.getPageTitleText(), "Change password", "Change Password tab is not displayed!");
    }
}