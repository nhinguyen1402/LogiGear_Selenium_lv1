package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.railway.utils.Constant;


public class TimetablePage extends BasePage {

    private final String checkPrice = "//tbody//following::td[contains(text(),'Depart Station')]//following-sibling::td[contains(text(),'Arrive Station')]//following-sibling::td//a[contains(text(),'check price')]";
    private final String bookTicket = "//tbody//following::td[contains(text(),'Depart Station')]//following-sibling::td[contains(text(),'Arrive Station')]//following-sibling::td//a[contains(text(),'book ticket')]";
    private By linkCheckPrice = By.xpath(checkPrice);
    private By linkBookTicket = By.xpath(bookTicket);

    public WebElement getLinkCheckPrice(String a, String b) {
        checkPrice.replace("Depart Station", a);
        checkPrice.replace("Arrive Station", b);
        linkCheckPrice = By.xpath(checkPrice);
        return Constant.DRIVER.findElement(linkCheckPrice);
    }

    public WebElement getLinkBookTicket(String a, String b) {
        checkPrice.replace("Depart Station", a);
        checkPrice.replace("Arrive Station", b);
        linkBookTicket = By.xpath(bookTicket);
        return Constant.DRIVER.findElement(linkBookTicket);
    }
}

