import org.railway.data.SeatType;
import org.railway.data.Station;
import org.railway.data.TrainsDepartFromHue;
import org.railway.pages.BookTicketPage;
import org.railway.pages.HomePage;
import org.railway.pages.LoginPage;
import org.railway.pages.TicketPricePage;
import org.railway.utils.Constant;
import org.railway.utils.Log4j;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FinalTestCase01 extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    TicketPricePage ticketPricePage = new TicketPricePage();
    BookTicketPage bookTicketPage = new BookTicketPage();

    @Test(testName = "FinalTestCase01", description = "User can book ticket after checking price")
    public void TC01() {
        String email = Constant.EMAIL;
        String password = Constant.PASSWORD;

        Log4j.info("Step 1: Navigate to Login page");
        homePage.goToLoginPage();

        Log4j.info("Step 2: Login with Email: " + email + " and password: "+password);
        loginPage.login(email, password);

        Log4j.info("Step 3:  Click on 'Ticket price' tab");
        homePage.goToTicketPriceTab();

        Log4j.info("Step 4: Click 'Check Price' in section 'Trains depart from Huế' for checking price Huế to Nha Trang");
        String departFrom = Station.HUE.getValue();
        String arriveAt = Station.NHA_TRANG.getValue();
        String departStationInfo = TrainsDepartFromHue.HUE_TO_NHA_TRANG.getValue();
        ticketPricePage.clickCheckPriceByDepartInfoButton(departStationInfo);

        Log4j.info("Step 5: On Ticket price page, click 'Book ticket' with Soft bed");
        String seatTypeValue = SeatType.SOFT_BED.getValue();
        String shortValue = SeatType.SOFT_BED.getShortValue();
        String softBedPrice = ticketPricePage.getTicketPriceBySeatTypeText(shortValue);
        ticketPricePage.clickBookTicketBySeatTypeButton(seatTypeValue);

        String selectedDepartFrom = bookTicketPage.getLblSelectedDepartFromText();
        String selectedArriveAt = bookTicketPage.getLblSelectedArriveAtText();
        String selectedSeatType = bookTicketPage.getLblSelectedSeatTypeText();

        Log4j.info("Verify: Book ticket page displays default values correctly: Depart Station: " + departFrom + " Arrive Station: " + arriveAt + " Seat Type: " + seatTypeValue);
        Assert.assertEquals(selectedDepartFrom, departFrom, "Depart Station is not same");
        Assert.assertEquals(selectedArriveAt, arriveAt, "Arrive Station is not same");
        Assert.assertEquals(selectedSeatType, seatTypeValue, "Seat Type is not same");

        Log4j.info("Step 6: Click 'Book ticket' with default information");
        bookTicketPage.clickBookTicketButton();

        String totalPrice = bookTicketPage.getTotalPriceText();
        Log4j.info("Verify: Ticket information display correctly total price: ");
        Assert.assertEquals(totalPrice, softBedPrice, "Total price is not same");

    }
}
