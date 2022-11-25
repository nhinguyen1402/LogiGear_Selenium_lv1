package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.railway.utils.Constant;

public class TimeTablePage extends BasePage {

    private String checkPriceXPath = "//tbody//following::td[contains(text(),'DepartStation')]//following-sibling::td[contains(text(),'ArriveStation')]//following-sibling::td//a[contains(text(),'check price')]";
    private String bookTicketXPath = "//tbody//following::td[contains(text(),'Depart_Station')]//following-sibling::td[contains(text(),'Arrive_Station')]//following-sibling::td//a[contains(text(),'book ticket')]";
    private By linkCheckPrice;
    private By linkBookTicket;
}

