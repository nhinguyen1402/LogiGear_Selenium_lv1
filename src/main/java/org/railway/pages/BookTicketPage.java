package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.railway.utils.Constant;

public class BookTicketPage extends BasePage {
    private final By selectDate = By.xpath("//select[@name='Date']");
    private final By selectDepartStation = By.xpath("//select[@name='DepartStation']");
    private final By selectArriveStation = By.xpath("//select[@name='ArriveStation']");
    private final By selectSeatType = By.xpath("//select[@name='SeatType']");
    private final By selectTicketAmount = By.xpath("//select[@name='TicketAmount']");
    private final By btnBook = By.xpath("//input[@value='Book ticket']");

    private WebElement getSelectDate() {
        return Constant.DRIVER.findElement(selectDate);
    }
    private WebElement getSelectDepartStation() {
        return Constant.DRIVER.findElement(selectDepartStation);
    }
    private WebElement getSelectArriveStation() {
        return Constant.DRIVER.findElement(selectArriveStation);
    }
    private WebElement getSelectSeatType() {
        return Constant.DRIVER.findElement(selectSeatType);
    }
    private WebElement getSelectTicketAmount() {
        return Constant.DRIVER.findElement(selectTicketAmount);
    }
    private WebElement getBtnBook() {
        return Constant.DRIVER.findElement(btnBook);
    }
    public void selectBtnBook() {
        getBtnBook().click();
    }
}
