package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.railway.utils.Constant;

public class BookTicketPage extends BasePage {
    private final By ccbDepartDate = By.cssSelector("[name=Date]");
    private final By ccbDepartStation = By.cssSelector("[name=DepartStation]");
    private final By ccbArriveStation = By.cssSelector("[name=ArriveStation]");
    private final By ccbSeatType = By.cssSelector("[name=SeatType]");
    private final By ccbTicketAmount = By.cssSelector("[name=TicketAmount]");
    private final By btnBookTicket = By.xpath("//input[@value='Book ticket']");
    private final By lblBookTicketSuccess = By.cssSelector("div#content h1");
    private final String lblDepartDate = "//select[@name='Date']/option[@value='%s']";
    private final String lblSeatType = "//select[@name='SeatType']/option[@value='%s']";
    private final By lblSelectedDepartFrom = By.xpath("//select[@name='DepartStation']/option[@selected='selected']");
    private final By lblSelectedArriveAt = By.xpath("//select[@name='ArriveStation']/option[@selected='selected']");
    private final By dblDepartStation = By.xpath("//tbody//following::td[1]");
    private final By dblArriveStation = By.xpath("//tbody//following::td[2]");
    private final By dblSeatType = By.xpath("//tbody//following::td[3]");
    private final By dblDepartDate = By.xpath("//tbody//following::td[4]");
    private final By dblAmount = By.xpath("//tbody//following::td[7]");
}
