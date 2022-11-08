package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.railway.common.Constant;
import org.railway.driver.WebDriverManager;

public class HomePage extends BasePage{
    private By linkCreateAcc = By.xpath("//div[@id='content']//following::a[contains(@href,'Account')]");

    public WebElement getLinkCreateAcc() {
        return driver.findElement(linkCreateAcc);
    }

    public HomePage open() {
        WebDriverManager.getDriver().navigate().to(Constant.RAILWAY_URL);
        return this;
    }
}
