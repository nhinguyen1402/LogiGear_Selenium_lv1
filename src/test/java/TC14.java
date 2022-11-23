import org.railway.helper.DataHelper;
import org.railway.pages.*;
import org.railway.data.SeatType;
import org.railway.data.Station;
import org.railway.utils.Constant;
import org.railway.utils.Log4j;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC14 extends BaseTest {
    HomePage homePage= new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage= new LoginPage();
    BookTicketPage bookTicketPage = new BookTicketPage();

    @Test(priority = 1, testName = "TC_014", description = "User can book 1 ticket at a time")
    public void testcase014() {
        Log4j.header("Testcase 014");
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

        String dateValue= Integer.toString(DataHelper.randomNumber(4, 30));
        Log4j.info("Step: Select Depart Date by value: " + dateValue);
        bookTicketPage.selectDepartDateByValue(dateValue);
        String date = bookTicketPage.getLblDepartDateText(dateValue);

        String departStationValue= Station.SAI_GON.getValue();
        Log4j.info("Step: Select Depart Station by value: " + departStationValue);
        bookTicketPage.selectDepartStationByText(departStationValue);

        String arriveStationValue= Station.NHA_TRANG.getValue();
        Log4j.info("Step: Select Arrive At by value: " + arriveStationValue);
        bookTicketPage.selectArriveStationByText(arriveStationValue);

        String seatTypeValue= SeatType.SOFT_SEAT_WITH_AIR_CONDITIONER.getValue();
        Log4j.info("Step: Select Seat Type by value: " + seatTypeValue);
        bookTicketPage.selectSeatTypeByValue(seatTypeValue);
        String seatType = bookTicketPage.getLblSeatTypeText(seatTypeValue);

        String ticketAmount= Integer.toString(DataHelper.randomNumber(1, 10));
        Log4j.info("Step: Select Ticket Amount Type by value: " + ticketAmount);
        bookTicketPage.selectTicketAmountByValue(ticketAmount);

        bookTicketPage.clickBookTicketButton();

        Log4j.info("Verify: Message Ticket booked successfully! displays");
        Assert.assertEquals(bookTicketPage.getBookTicketSuccessMsg(), "Ticket Booked Successfully!", "Success message does not display as expected!");

        Log4j.info("Verify: Ticket information display correctly with Depart Date: " + date + ", Depart Station: " + departStationValue + ", Arrive Station: " + arriveStationValue + ", Seat Type: " + seatType + " and Amount: " + ticketAmount);
        Assert.assertEquals(bookTicketPage.getDepartDateText(), date, "Depart Date is not same");
        Assert.assertEquals(bookTicketPage.getDepartStationText(), departStationValue, "Depart Station is not same");
        Assert.assertEquals(bookTicketPage.getArriveStationText(), arriveStationValue, "Arrive Station is not same");
        Assert.assertEquals(bookTicketPage.getSeatTypeText(), seatType, "Seat Type is not same");
        Assert.assertEquals(bookTicketPage.getAmountText(), ticketAmount, "Amount is not same");
    }
}

