package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.railway.utils.Constant;

public class TimeTablePage extends BasePage {

    private String checkPriceXPath = "//tbody//following::td[contains(text(),'DepartStation')]//following-sibling::td[contains(text(),'ArriveStation')]//following-sibling::td//a[contains(text(),'check price')]";
    private String bookTicketXPath = "//tbody//following::td[contains(text(),'Depart_Station')]//following-sibling::td[contains(text(),'Arrive_Station')]//following-sibling::td//a[contains(text(),'book ticket')]";
    private By linkCheckPrice;
    private By linkBookTicket;

    private WebElement getLinkCheckPrice(String DepartStation, String ArriveStation) {
        checkPriceXPath.replace("DepartStation", DepartStation);
        checkPriceXPath.replace("ArriveStation", ArriveStation);

        linkCheckPrice = By.xpath(checkPriceXPath);
        return Constant.DRIVER.findElement(linkCheckPrice);
    }
    private WebElement getLinkBookTicket(String DepartStation, String ArriveStation) {
        bookTicketXPath = bookTicketXPath.replace("Depart_Station", DepartStation);
        bookTicketXPath = bookTicketXPath.replace("Arrive_Station", ArriveStation);

        linkBookTicket = By.xpath(bookTicketXPath);
        return Constant.DRIVER.findElement(linkBookTicket);
    }

    public void clickLinkCheckPrice(String DepartStation, String ArriveStation) {
        scrollToElement(getLinkCheckPrice(DepartStation, ArriveStation));
        getLinkCheckPrice(DepartStation, ArriveStation).click();
    }
    public void clickLinkBookTicket(String DepartStation, String ArriveStation) {
        scrollToElement(getLinkBookTicket(DepartStation, ArriveStation));
        getLinkBookTicket(DepartStation, ArriveStation).click();
    }
}

