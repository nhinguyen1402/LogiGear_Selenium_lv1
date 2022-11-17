import org.railway.utils.Log4j;
import org.railway.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC04 extends BaseTest{
    HomePage homePage= new HomePage();
    @Test(priority = 1, testName = "TC_04", description = "TC04 - Login page displays when un-logged User clicks on Book ticket tab")
    public void TC04() {
        homePage.goToBookTicket();
        Log4j.info("Verify that Login page displays instead of Book ticket page");
        Assert.assertEquals(homePage.getPageTitleText(),"Login Page","Login page is not display!");
    }
}
