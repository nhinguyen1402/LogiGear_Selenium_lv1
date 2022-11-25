package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.railway.utils.Constant;


public class MyTicketPage extends BasePage {
    private final String rowTicketInfo = ("//tr//td[contains(text(),'%s')]//following::td[contains(text(),'%s')]//following::td[contains(text(),'%s')]");
    private final By lblNote = By.cssSelector("div#content div.message li");
    private final By ccbArriveStationFilter = By.xpath("//select[@name='FilterArStation']");
    private final By btnApplyFilter = By.xpath("//input[@value='Apply Filter']");

    private WebElement getCcbArriveStationFilter() {
        return Constant.DRIVER.findElement(ccbArriveStationFilter);
    }
    private WebElement getBtnApplyFilter() {
        return Constant.DRIVER.findElement(btnApplyFilter);
    }
    private WebElement getRowTicketInfo(Object... args) {
        String dynamicLocator = String.format(rowTicketInfo, args);
        return Constant.DRIVER.findElement(By.xpath(dynamicLocator));
    }

    public void selectArriveByText(String text) {
        scrollToElement(getCcbArriveStationFilter());
        Select selectTicketAmount = new Select(getCcbArriveStationFilter());
        selectTicketAmount.selectByVisibleText(text);
    }
    public void clickApplyFilterButton() {
        scrollToElement(getBtnApplyFilter());
        getBtnApplyFilter().click();
    }

    public boolean isRowTicketInfoDisplay(String departStation, String arriveStation, String seatType) {
        try {
            return getRowTicketInfo(departStation, arriveStation, seatType).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
