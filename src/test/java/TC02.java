import org.railway.common.Constant;
import org.railway.pages.HomePage;
import org.railway.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02 extends BaseTest{
    @Test
    public void TC02() {
        System.out.println("TC02 - User can't login with blank Username textBox");
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage();
        homePage.openHomePage();
        loginPage.goToLoginPage();

        loginPage.login("", Constant.PASSWORD);
        String actualMsg = loginPage.getErrorMsg();
        String expectedMsg = "There was a problem with your login and/or errors exist in your form.";

        Assert.assertEquals(actualMsg, expectedMsg, "Login Error message is not displayed as expected");
    }
}
