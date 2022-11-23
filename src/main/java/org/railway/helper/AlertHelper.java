package org.railway.helper;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.railway.utils.Constant;

import java.time.Duration;

public class AlertHelper {

    public static void dismissAlert() {
        waitForAlertVisible();
        Constant.DRIVER.switchTo().alert().dismiss();
    }

    public static void acceptAlert() {
        waitForAlertVisible();
        Constant.DRIVER.switchTo().alert().accept();
    }

    public static String getAlertText() {
        waitForAlertVisible();
        return Constant.DRIVER.switchTo().alert().getText();
    }

    public static void waitForAlertVisible() {
        WebDriverWait wait = new WebDriverWait(Constant.DRIVER, Duration.ofSeconds(Constant.TIMEOUT_IN_SECONDS));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    /**
     * To check if Alert is Present
     *
     * @return True if alert is present
     */
    public static boolean isAlertPresent() {
        try {
            waitForAlertVisible();
            Constant.DRIVER.switchTo().alert();
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
