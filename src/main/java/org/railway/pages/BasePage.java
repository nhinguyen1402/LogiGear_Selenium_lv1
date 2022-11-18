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

    private WebElement getPageTitle() {
        return Constant.DRIVER.findElement(pageTitle);
    }
    private WebElement getTabHome() {
        return Constant.DRIVER.findElement(tabHome);
    }
    private WebElement getTabFAQ() {
        return Constant.DRIVER.findElement(tabFAQ);
    }
    private WebElement getTabContact() {
        return Constant.DRIVER.findElement(tabContact);
    }
    private WebElement getTabTimetable() {
        return Constant.DRIVER.findElement(tabTimetable);
    }
    private WebElement getTabTicketPrice() {
        return Constant.DRIVER.findElement(tabTicketPrice);
    }
    private WebElement getTabBookTicket() {
        return Constant.DRIVER.findElement(tabBookTicket);
    }
    private WebElement getTabChangePassword() {
        return Constant.DRIVER.findElement(tabChangePassword);
    }
    private WebElement getTabMyTicket() {
        return Constant.DRIVER.findElement(tabMyTicket);
    }
    private WebElement getTabRegister() {
        return Constant.DRIVER.findElement(tabRegister);
    }
    private WebElement getTabLogout() {
        return Constant.DRIVER.findElement(tabLogout);
    }
    private WebElement getTabLogin() {
        return Constant.DRIVER.findElement(tabLogin);
    }
    private WebElement getLblWelcomeMsg() {
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
        Log4j.info("Click on Login tab");
        this.getTabLogin().click();
    }
    public void goToBookTicket() {
        Log4j.info("Click on BookTick tab");
        this.getTabBookTicket().click();
    }
    public void goToRegisterTab() {
        Log4j.info("Click on Register tab");
        this.getTabRegister().click();
    }
    public void goToMyTicketTab() {
        Log4j.info("Click on My Ticket tab");
        this.getTabMyTicket().click();
    }
    public void goToChangePasswordTab() {
        Log4j.info("Click on Change Password tab");
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
