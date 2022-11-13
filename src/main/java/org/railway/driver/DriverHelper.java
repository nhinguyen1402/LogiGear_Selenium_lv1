package org.railway.driver;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.railway.utils.Constant;

public class DriverHelper {
    public static void openChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        Constant.DRIVER = new ChromeDriver();
    }

    public static void openFirefoxBrowser() {
        WebDriverManager.firefoxdriver().setup();
        Constant.DRIVER = new FirefoxDriver();
    }

    public static void openEdgeBrowser() {
        WebDriverManager.edgedriver().setup();
        Constant.DRIVER = new EdgeDriver();
    }

    public static void navigate(String url) {
        Constant.DRIVER.get(url);
    }
}
