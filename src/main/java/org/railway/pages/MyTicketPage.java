package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.railway.utils.Constant;


public class MyTicketPage extends BasePage {
    private final String btnCancelByTicketInfo = ("//tr//td[contains(text(),'%s')]//following::td[contains(text(),'%s')]//following::td[contains(text(),'%s')]//ancestor::tr//input[@value='Cancel']");
    private final By lblNote = By.cssSelector("div#content div.message li");
}
