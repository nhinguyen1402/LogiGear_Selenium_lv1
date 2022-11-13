package org.railway.driver;

import org.openqa.selenium.WebDriver;

public class WebDriverManager {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (null == driver) {
            return driver = io.github.bonigarcia.wdm.WebDriverManager.chromedriver().create();
        } else return driver;
    }

//    public void openPage(String url){
//        Constant.DRIVER.navigate().to(url);
//    }
}
