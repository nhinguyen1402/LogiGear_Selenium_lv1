package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.railway.utils.Constant;
import org.railway.utils.Log4j;


public class BasePage {
    private final By tabHome = By.xpath("//div[@id='menu']//following::span[contains(text(),'Home')]");
    private final By tabFAQ = By.xpath("//div[@id='menu']//following::span[contains(text(),'FAQ')]");
    private final By tabContact = By.xpath("//div[@id='menu']//following::span[contains(text(),'Contact')]");
    private final By tabTimetable = By.xpath("//div[@id='menu']//following::span[contains(text(),'Timetable')]");
    private final By tabTicketPrice = By.xpath("//div[@id='menu']//following::span[contains(text(),'price')]");
    private final By tabBookTicket = By.xpath("//div[@id='menu']//following::span[contains(text(),'Book ticket')]");
    private final By tabMyTicket = By.xpath("//div[@id='menu']//following::span[contains(text(),'My ticket')]");
    private final By tabChangePassword = By.xpath("//div[@id='menu']//following::span[contains(text(),'password')]");
    private final By tabRegister = By.xpath("//div[@id='menu']//following::span[contains(text(),'Register')]");
    private final By tabLogout = By.xpath("//div[@id='menu']//following::span[contains(text(),'out')]");
    private final By tabLogin = By.xpath("//div[@id='menu']//following::span[contains(text(),'in')]");
    private final By lblWelcomeMsg = By.xpath("//div[@class='account']/strong");

    private final By pageTitle = By.cssSelector("#content h1");

    public WebElement getPageTitle() {
        return Constant.DRIVER.findElement(pageTitle);
    }
    public WebElement getTabHome() {
        return Constant.DRIVER.findElement(tabHome);
    }
    public WebElement getTabFAQ() {
        return Constant.DRIVER.findElement(tabFAQ);
    }
    public WebElement getTabContact() {
        return Constant.DRIVER.findElement(tabContact);
    }
    public WebElement getTabTimetable() {
        return Constant.DRIVER.findElement(tabTimetable);
    }
    public WebElement getTabTicketPrice() {
        return Constant.DRIVER.findElement(tabTicketPrice);
    }
    public WebElement getTabBookTicket() {
        return Constant.DRIVER.findElement(tabBookTicket);
    }
    public WebElement getTabChangePassword() {
        return Constant.DRIVER.findElement(tabChangePassword);
    }
    public WebElement getTabMyTicket() {
        return Constant.DRIVER.findElement(tabMyTicket);
    }
    public WebElement getTabRegister() {
        return Constant.DRIVER.findElement(tabRegister);
    }
    public WebElement getTabLogout() {
        return Constant.DRIVER.findElement(tabLogout);
    }
    public WebElement getTabLogin() {
        return Constant.DRIVER.findElement(tabLogin);
    }
    public WebElement getLblWelcomeMsg() {
        return Constant.DRIVER.findElement(lblWelcomeMsg);
    }

    public boolean isElementPresented(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    public void goToLoginPage() {
        this.getTabLogin().click();
    }
    public void goToBookTicket() {
        this.getTabBookTicket().click();
    }
    public void goToRegisterTab() {
        this.getTabRegister().click();
    }
    public void goToMyTicketTab() {
        this.getTabMyTicket().click();
    }
    public void goToChangePasswordTab() {
        this.getTabChangePassword().click();
    }
    public String getWelcomeMsg() {
        return this.getLblWelcomeMsg().getText();
    }
    public String getPageTitleText() {
        return this.getPageTitle().getText();
    }

    public Boolean isLoginTabDisplayed() {
        return isElementPresented(getTabLogin());
    }
    public Boolean isLogoutTabDisplayed() {
        return isElementPresented(getTabLogout());
    }
    public Boolean isMyTicketDisplayed() {
        return isElementPresented(getTabMyTicket());
    }
    public Boolean isChangPasswordDisplayed() {
        return isElementPresented(getTabChangePassword());
    }
}
