package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BookTicketPage extends BasePage {
    private By selectDate = By.xpath("//select[@name='Date']");
    private By selectDepartStation = By.xpath("//select[@name='DepartStation']");
    private By selectArriveStation = By.xpath("//select[@name='ArriveStation']");
    private By selectSeatType = By.xpath("//select[@name='SeatType']");
    private By selectTicketAmount = By.xpath("//select[@name='TicketAmount']");
    private By btnBook = By.xpath("//input[@value='Book ticket']");

    public WebElement getSelectDate() {
        return driver.findElement(selectDate);
    }
    public WebElement getSelectDepartStation() {
        return driver.findElement(selectDepartStation);
    }
    public WebElement getSelectArriveStation() {
        return driver.findElement(selectArriveStation);
    }
    public WebElement getSelectSeatType() {
        return driver.findElement(selectSeatType);
    }
    public WebElement getSelectTicketAmount() {
        return driver.findElement(selectTicketAmount);
    }
    public WebElement getBtnBook() {
        return driver.findElement(btnBook);
    }
    public void selectBtnBook() {
        getBtnBook().click();
    }
}
