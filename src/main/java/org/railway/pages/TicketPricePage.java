package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.railway.utils.Constant;

public class TicketPricePage extends BasePage{
    private final String btnCheckPriceByDepartInfo = "//li[contains(text(),'%s')]//ancestor::tr//a[contains(text(),'Check Price')]";
    private final String btnBookTicketBySeatType = "//td[text() = '%s']//ancestor::tr//a";
    private final String dblTicketPriceBySeatType = "//th[contains(text(),'Price')]//ancestor::tr//td[count(//td[.='%s']//preceding-sibling::td)+1]";
    private WebElement getBtnCheckPriceByDepartInfo(String info) {
        return Constant.DRIVER.findElement(By.xpath(String.format(btnCheckPriceByDepartInfo, info)));
    }
    private WebElement getbtnBookTicketBySeatType(String info) {
        return Constant.DRIVER.findElement(By.xpath(String.format(btnBookTicketBySeatType, info)));
    }
    private WebElement getDblTicketPriceBySeatType(String info) {
        return Constant.DRIVER.findElement(By.xpath(String.format(dblTicketPriceBySeatType, info)));
    }
    public void clickCheckPriceByDepartInfoButton (String info) {
        scrollToElement(getBtnCheckPriceByDepartInfo(info));
        getBtnCheckPriceByDepartInfo(info).click();
    }
    public void clickBookTicketBySeatTypeButton (String info) {
        scrollToElement(getbtnBookTicketBySeatType(info));
        getbtnBookTicketBySeatType(info).click();
    }
    public String getTicketPriceBySeatTypeText (String info) {
        scrollToElement(getDblTicketPriceBySeatType(info));
        return getDblTicketPriceBySeatType(info).getText();
    }
}
