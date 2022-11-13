package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.railway.utils.Constant;

public class HomePage extends BasePage{
    private final By linkCreateAcc = By.xpath("//div[@id='content']//following::a[contains(@href,'Account')]");

    public WebElement getLinkCreateAcc() {
        return Constant.DRIVER.findElement(linkCreateAcc);
    }
}
