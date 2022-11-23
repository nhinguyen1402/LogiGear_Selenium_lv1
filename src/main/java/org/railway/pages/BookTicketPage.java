package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.railway.utils.Constant;

public class BookTicketPage extends BasePage {
    private final By ccbDepartDate = By.xpath("//select[@name='Date']");
    private final By ccbDepartStation = By.xpath("//select[@name='DepartStation']");
    private final By ccbArriveStation = By.xpath("//select[@name='ArriveStation']");
    private final By ccbSeatType = By.xpath("//select[@name='SeatType']");
    private final By ccbTicketAmount = By.xpath("//select[@name='TicketAmount']");
    private final By btnBookTicket = By.xpath("//input[@value='Book ticket']");
    private final By lblBookTicketSuccess = By.cssSelector("div#content h1");
    private final String lblDepartDate = "//select[@name='Date']/option[@value='%s']";
    private final String lblSeatType = "//select[@name='SeatType']/option[@value='%s']";
    private final By lblSelectedDepartFrom = By.xpath("//select[@name='DepartStation']/option[@selected='selected']");
    private final By lblSelectedArriveAt = By.xpath("//select[@name='ArriveStation']/option[@selected='selected']");
    private final By clmDepartStation = By.xpath("//tbody//following::td[1]");
    private final By clmArriveStation = By.xpath("//tbody//following::td[2]");
    private final By clmSeatType = By.xpath("//tbody//following::td[3]");
    private final By clmDepartDate = By.xpath("//tbody//following::td[4]");
    private final By clmAmount = By.xpath("//tbody//following::td[7]");

    private WebElement getCcbDepartDate() {
        return Constant.DRIVER.findElement(ccbDepartDate);
    }
    private WebElement getCcbDepartStation() {
        return Constant.DRIVER.findElement(ccbDepartStation);
    }
    private WebElement getCcbArriveStation() {
        return Constant.DRIVER.findElement(ccbArriveStation);
    }
    private WebElement getCcbSeatType() {
        return Constant.DRIVER.findElement(ccbSeatType);
    }
    private WebElement getCcbTicketAmount() {
        return Constant.DRIVER.findElement(ccbTicketAmount);
    }
    private WebElement getBtnBookTicket() {
        return Constant.DRIVER.findElement(btnBookTicket);
    }
    private WebElement getLblBookTicketSuccess() {
        return Constant.DRIVER.findElement(lblBookTicketSuccess);
    }
    private WebElement getLblDepartDate(String text) {
        return Constant.DRIVER.findElement(By.xpath(String.format(lblDepartDate, text)));
    }
    private WebElement getLblSeatType(String text) {
        return Constant.DRIVER.findElement(By.xpath(String.format(lblSeatType, text)));
    }
    private WebElement getLblSelectedDepartFrom() {
        return Constant.DRIVER.findElement(lblSelectedDepartFrom);
    }
    private WebElement getLblSelectedArriveAt() {
        return Constant.DRIVER.findElement(lblSelectedArriveAt);
    }
    private WebElement getDepartStation() {
        return Constant.DRIVER.findElement(clmDepartStation);
    }
    private WebElement getArriveStation() {
        return Constant.DRIVER.findElement(clmArriveStation);
    }
    private WebElement getSeatType() {
        return Constant.DRIVER.findElement(clmSeatType);
    }
    private WebElement getAmount() {
        return Constant.DRIVER.findElement(clmAmount);
    }
    private WebElement getDepartDate() {
        return Constant.DRIVER.findElement(clmDepartDate);
    }
    public String getBookTicketSuccessMsg() {
        return getLblBookTicketSuccess().getText();
    }

    public void clickBookTicketButton() {
        scrollToElement(getBtnBookTicket());
        getBtnBookTicket().click();
    }

    public void selectDepartDateByValue(String value) {
        scrollToElement(getCcbDepartDate());
        Select selectDepartDate = new Select(getCcbDepartDate());
        selectDepartDate.selectByValue(value);
    }

    public void selectDepartStationByText(String text) {
        scrollToElement(getCcbDepartStation());
        Select selectDepartStation = new Select(getCcbDepartStation());
        selectDepartStation.selectByVisibleText(text);
    }

    public void selectArriveStationByText(String text) {
        scrollToElement(getCcbArriveStation());
        Select selectArriveStation = new Select(getCcbArriveStation());
        selectArriveStation.selectByVisibleText(text);
    }

    public void selectSeatTypeByValue(String value) {
        scrollToElement(getCcbSeatType());
        Select selectSeatType = new Select(getCcbSeatType());
        selectSeatType.selectByValue(value);
    }

    public void selectTicketAmountByValue(String value) {
        scrollToElement(getCcbTicketAmount());
        Select selectTicketAmount = new Select(getCcbTicketAmount());
        selectTicketAmount.selectByValue(value);
    }

    public String getDepartStationText() {
        return this.getDepartStation().getText();
    }

    public String getArriveStationText() {
        return this.getArriveStation().getText();
    }

    public String getSeatTypeText() {
        return this.getSeatType().getText();
    }

    public String getAmountText() {
        return this.getAmount().getText();
    }

    public String getDepartDateText() {
        return this.getDepartDate().getText();
    }

    public String getLblDepartDateText(String a) {
        return getLblDepartDate(a).getText();
    }

    public String getLblSeatTypeText(String text) {
        return getLblSeatType(text).getText();
    }

    public String getLblSelectedDepartFromText() {
        return getLblSelectedDepartFrom().getText();
    }

    public String getLblSelectedArriveAtText() {
        return getLblSelectedArriveAt().getText();
    }
}
