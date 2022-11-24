package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.railway.utils.Constant;

public class HomePage extends BasePage{
    private final By lnkCreateAcc = By.xpath("//div[@id='content']//following::a[contains(@href,'Account')]");

    private WebElement getLnkCreateAcc() {
        return Constant.DRIVER.findElement(lnkCreateAcc);
    }
}
