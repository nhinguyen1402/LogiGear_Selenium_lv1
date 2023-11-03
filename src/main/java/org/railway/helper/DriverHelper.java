package org.railway.helper;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.railway.utils.Constant;

import java.util.HashMap;
import java.util.Map;

public class DriverHelper {
    static String downloadPath = Constant.DOWNLOAD_PATH;
    public static void openChromeBrowser() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", getChromePrefs(downloadPath));
        Constant.DRIVER = new ChromeDriver(options);
    }

    public static void openFirefoxBrowser() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addPreference("browser.download.dir", downloadPath);
        Constant.DRIVER = new FirefoxDriver(options);
    }

    public static void openEdgeBrowser() {
        WebDriverManager.edgedriver().setup();
        Constant.DRIVER = new EdgeDriver();
        Constant.DRIVER.get("edge://settings/downloads");
        // Use Selenium to set the download path in the Edge settings
    }

    public static void navigate(String url) {
        Constant.DRIVER.get(url);
    }

    private static Map<String, Object> getChromePrefs(String downloadPath) {
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", downloadPath);
        prefs.put("download.prompt_for_download", false);
        prefs.put("download.directory_upgrade", true);
        prefs.put("plugins.always_open_pdf_externally", true);
        return prefs;
    }
}
