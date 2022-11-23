import org.railway.helper.DataHelper;
import org.railway.pages.*;
import org.railway.data.Station;
import org.railway.utils.Constant;
import org.railway.utils.Log4j;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC15 extends BaseTest {
    HomePage homePage= new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage= new LoginPage();
    TimeTablePage timeTablePage = new TimeTablePage();
    BookTicketPage bookTicketPage = new BookTicketPage();
    SoftAssert softAssert = new SoftAssert();

    @Test(priority = 1, testName = "TC_015", description = "User can open Book ticket page by clicking on Book ticket link in Train timetable page")
    public void testcase015() {
        Log4j.header("Testcase 015");
        Log4j.info("Precondition: Register new account");

        Log4j.info("Step: Go to Register page");
        homePage.goToRegisterTab();
        String email = DataHelper.randomValidUsername();
        String password = Constant.PASSWORD;
        String pid = Integer.toString(DataHelper.randomValidPid());

        Log4j.info("Step: Register new account with email: " + email + ", password: " + password + ", confirm password: " + password + ", pid: " + pid);
        registerPage.register(email, password, password, pid);

        Log4j.info("Step: Go to Login page");
        registerPage.goToLoginPage();

        Log4j.info("Step: Login with Name: " + email + " and password: " + password);
        loginPage.login(email, password);

        Log4j.info("Step: Go to Time Table page");
        homePage.goToTimeTableTab();

        String departFromValue = Station.HUE.getValue();
        String arriveAtValue = Station.SAI_GON.getValue();
        Log4j.info("Step: Click Book Ticket link of the route from Huế to Sài Gòn");
        timeTablePage.clickLinkBookTicket(departFromValue, arriveAtValue);

        String departFromSelected = bookTicketPage.getLblSelectedDepartFromText();
        String arriveAtSelected = bookTicketPage.getLblSelectedArriveAtText();

        Log4j.info("Verify: Book ticket page is loaded with correct Depart from: " + departFromValue + "and Arrive At: " + arriveAtValue);
        Assert.assertEquals(departFromSelected, departFromValue, "The Depart From value is not match");
        Assert.assertEquals(arriveAtSelected, arriveAtValue, "The Arrive At value is not match");
    }
}
