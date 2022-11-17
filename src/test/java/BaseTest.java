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
        if (browser.equals("chrome")) {
            DriverHelper.openChromeBrowser();
        } else {
            if (browser.equals("firefox")) {
                DriverHelper.openFirefoxBrowser();
            } else if (browser.equals("edge")) {
                DriverHelper.openEdgeBrowser();
            } else DriverHelper.openChromeBrowser();
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
