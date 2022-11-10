import org.railway.common.Constant;
import org.railway.pages.HomePage;
import org.railway.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01 extends BaseTest{

    @Test
    public void TC01() {
        System.out.println("TC01 - User can log into Railway with valid username and password");
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        homePage.openHomePage();
        loginPage.goToLoginPage();

        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        String actualMsg = loginPage.getWelcomeMsg();
        String expectedMsg = "Welcome " + Constant.USERNAME;

        Assert.assertEquals(actualMsg, expectedMsg, "Welcome message is not displayed as expected");
    }
}
