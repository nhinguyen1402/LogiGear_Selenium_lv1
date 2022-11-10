import org.openqa.selenium.WebDriver;
import org.railway.driver.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Pre-Condition");
        driver = WebDriverManager.getDriver();

    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Post-Condition");
        driver.quit();
    }
}
