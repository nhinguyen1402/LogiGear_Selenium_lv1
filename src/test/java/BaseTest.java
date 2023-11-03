import org.railway.helper.DriverHelper;
import org.railway.utils.Constant;
import org.railway.utils.Log4j;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
    @Parameters({"browser"})
    @BeforeMethod
    public void beforeMethod(String browser) {
        switch (browser) {
            case "firefox":
                DriverHelper.openFirefoxBrowser();
                break;
            case "edge":
                DriverHelper.openEdgeBrowser();
                break;
            default:
                DriverHelper.openChromeBrowser();
                break;
        }
        Log4j.info("Go to " + Constant.THE_INTERNET_HEROKUAPP);
        DriverHelper.navigate(Constant.THE_INTERNET_HEROKUAPP);
    }

    @AfterMethod
    public void afterMethod() {
        Log4j.info("Close browser");
        Constant.DRIVER.quit();
    }
}
