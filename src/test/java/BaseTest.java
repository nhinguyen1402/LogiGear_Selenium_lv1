import org.railway.helper.DriverHelper;
import org.railway.utils.Constant;
import org.railway.utils.Log4j;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class BaseTest {
    @Parameters("browser")
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
        Constant.DRIVER.manage().window().maximize();
        DriverHelper.navigate(Constant.RAILWAY_HOME_URL);
    }

    @AfterMethod
    public void afterMethod() {
        Log4j.info("Close browser\n");
        Constant.DRIVER.quit();
    }
}
