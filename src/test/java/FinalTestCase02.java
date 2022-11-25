import org.railway.data.SeatType;
import org.railway.data.Station;
import org.railway.data.TrainsDepartFromHue;
import org.railway.data.TrainsDepartFromSaiGon;
import org.railway.helper.DataHelper;
import org.railway.pages.*;
import org.railway.utils.Constant;
import org.railway.utils.Log4j;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FinalTestCase02 extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();
    TicketPricePage ticketPricePage = new TicketPricePage();
    BookTicketPage bookTicketPage = new BookTicketPage();
    MyTicketPage myTicketPage = new MyTicketPage();

    @Test(testName = "FinalTestCase01", description = "User can filter Manage ticket table with both Arrive station and Depart date")
    public void FinalTestCase02() {
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

        Log4j.info("Step :  Click on 'Ticket price' tab");
        homePage.goToTicketPriceTab();

        Log4j.info("Step : Book ticket from Sài Gòn to Phan Thiết");
        String departStationInfo1 = TrainsDepartFromSaiGon.SAI_GON_TO_PHAN_THIET.getValue();
        ticketPricePage.clickCheckPriceByDepartInfoButton(departStationInfo1);
        String seatTypeValue1 = SeatType.SOFT_BED.getValue();
        ticketPricePage.clickBookTicketBySeatTypeButton(seatTypeValue1);
        bookTicketPage.clickBookTicketButton();

        Log4j.info("Step :  Click on 'Ticket price' tab");
        homePage.goToTicketPriceTab();

        Log4j.info("Step :  Book ticket from Sài Gòn to Đà Nẵng");
        String departStationInfo2 = TrainsDepartFromSaiGon.SAI_GON_TO_DA_NANG.getValue();
        ticketPricePage.clickCheckPriceByDepartInfoButton(departStationInfo2);
        String seatTypeValue2 = SeatType.SOFT_BED.getValue();
        ticketPricePage.clickBookTicketBySeatTypeButton(seatTypeValue2);
        bookTicketPage.clickBookTicketButton();

        Log4j.info("Step :  Click on 'Ticket price' tab");
        homePage.goToTicketPriceTab();

        Log4j.info("Step : Book ticket from Sài Gòn to Huế");
        String departStationInfo3 = TrainsDepartFromSaiGon.SAI_GON_TO_HUE.getValue();
        ticketPricePage.clickCheckPriceByDepartInfoButton(departStationInfo3);
        String seatTypeValue3 = SeatType.SOFT_BED.getValue();
        ticketPricePage.clickBookTicketBySeatTypeButton(seatTypeValue3);
        bookTicketPage.clickBookTicketButton();

        Log4j.info("Step :  Click on 'Ticket price' tab");
        homePage.goToTicketPriceTab();

        Log4j.info("Step : Book ticket from Sài Gòn to Nha Trang");
        String departStationInfo4 = TrainsDepartFromSaiGon.SAI_GON_TO_NHA_TRANG.getValue();
        ticketPricePage.clickCheckPriceByDepartInfoButton(departStationInfo4);
        String seatTypeValue4 = SeatType.SOFT_BED.getValue();
        ticketPricePage.clickBookTicketBySeatTypeButton(seatTypeValue4);
        bookTicketPage.clickBookTicketButton();

        Log4j.info("Step :  Click on 'Ticket price' tab");
        homePage.goToTicketPriceTab();

        Log4j.info("Step : Book ticket from Sài Gòn to Quảng Ngãi");
        String departStationInfo5 = TrainsDepartFromSaiGon.HUE_TO_QUANG_NGAI.getValue();
        ticketPricePage.clickCheckPriceByDepartInfoButton(departStationInfo5);
        String seatTypeValue5 = SeatType.SOFT_BED.getValue();
        ticketPricePage.clickBookTicketBySeatTypeButton(seatTypeValue5);
        bookTicketPage.clickBookTicketButton();

        Log4j.info("Step :  Click on 'Ticket price' tab");
        homePage.goToTicketPriceTab();

        Log4j.info("Step : Book ticket from Huế to Sài Gòn");
        String departStationInfo6 = TrainsDepartFromHue.HUE_TO_SAI_GON.getValue();
        ticketPricePage.clickCheckPriceByDepartInfoButton(departStationInfo6);
        String seatTypeValue6 = SeatType.SOFT_BED.getValue();
        String departFrom = Station.HUE.getValue();
        String arriveAt = Station.SAI_GON.getValue();
        ticketPricePage.clickBookTicketBySeatTypeButton(seatTypeValue6);
        bookTicketPage.clickBookTicketButton();

        Log4j.info("Step :  Click on 'Ticket price' tab");
        homePage.goToTicketPriceTab();

        Log4j.info("Step : Book ticket from Huế to  Đà Nẵng");
        String departStationInfo7 = TrainsDepartFromHue.HUE_TO_DA_NANG.getValue();
        ticketPricePage.clickCheckPriceByDepartInfoButton(departStationInfo7);
        String seatTypeValue7 = SeatType.SOFT_BED.getValue();
        ticketPricePage.clickBookTicketBySeatTypeButton(seatTypeValue7);
        bookTicketPage.clickBookTicketButton();

        Log4j.info("Step :  Click on 'My Ticket' tab");
        bookTicketPage.goToMyTicketTab();

        Log4j.info("Step: Select Filter Arrive");
        String arriveValue= Station.SAI_GON.getValue();
        myTicketPage.selectArriveByText(arriveValue);

        Log4j.info("Step: Click Apply Filter button");
        myTicketPage.clickApplyFilterButton();

        Log4j.info("Verify: Manage ticket table shows correct ticket(s)");
        Assert.assertTrue(myTicketPage.isRowTicketInfoDisplay(departFrom, arriveAt, seatTypeValue6), "My ticket tab is not displayed!");
    }
}
