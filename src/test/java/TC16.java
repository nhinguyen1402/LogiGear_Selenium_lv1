import org.railway.data.SeatType;
import org.railway.helper.AlertHelper;
import org.railway.helper.DataHelper;
import org.railway.pages.*;
import org.railway.data.Station;
import org.railway.utils.Constant;
import org.railway.utils.Log4j;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC16 extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    BookTicketPage bookTicketPage = new BookTicketPage();
    MyTicketPage myTicketPage = new MyTicketPage();

    @Test(priority = 1, testName = "TC_016", description = "User can cancel a ticket")
    public void testcase016() {
        Log4j.header("Testcase 016");
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

        Log4j.info("Step: Go to Book ticket page");
        homePage.goToBookTicketTab();

        String dateValue = Integer.toString(DataHelper.randomNumber(4, 30));
        Log4j.info("Step: Select Depart Date by value: " + dateValue);
        bookTicketPage.selectDepartDateByValue(dateValue);
        String departDate = bookTicketPage.getLblDepartDateText(dateValue);

        String departStationValue = Station.SAI_GON.getValue();
        Log4j.info("Step: Select Depart Station by value: " + departStationValue);
        bookTicketPage.selectDepartStationByText(departStationValue);

        String arriveStationValue = Station.NHA_TRANG.getValue();
        Log4j.info("Step: Select Arrive At by value: " + arriveStationValue);
        bookTicketPage.selectArriveStationByText(arriveStationValue);

        String seatTypeValue = SeatType.SOFT_SEAT_WITH_AIR_CONDITIONER.getValue();
        Log4j.info("Step: Select Seat Type by value: " + seatTypeValue);
        bookTicketPage.selectSeatTypeByValue(seatTypeValue);
        String seatType = bookTicketPage.getLblSeatTypeText(seatTypeValue);

        String ticketAmount = Integer.toString(DataHelper.randomNumber(1, 10));
        Log4j.info("Step: Select Ticket Amount Type by value: " + ticketAmount);
        bookTicketPage.selectTicketAmountByValue(ticketAmount);

        bookTicketPage.clickBookTicketButton();

        Log4j.info("Verify: Message Ticket booked successfully! displays");
        Assert.assertEquals(bookTicketPage.getBookTicketSuccessMsg(), "Ticket Booked Successfully!",
                "Success message does not display as expected!");

        Log4j.info("Step: Go to My ticket page");
        registerPage.goToMyTicketTab();

        Log4j.info("Cancel ticket is loaded with correct Depart from: "
                + departStationValue + "and Arrive At: " + arriveStationValue);
        myTicketPage.clickCancelButtonByTicketInfo(departStationValue, arriveStationValue, departDate);

        Log4j.info("Click on 'OK' button on Confirmation message 'Are you sure?'");
        AlertHelper.acceptAlert();

        Log4j.info("Verify that the canceled ticket is disappeared.");
        Assert.assertEquals(myTicketPage.getNoteText(), "You currently book 0 ticket, you can book 10 more.",
                "Cancel ticket does not successfully");
    }
}
