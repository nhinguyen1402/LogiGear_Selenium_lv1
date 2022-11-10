package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.railway.driver.WebDriverManager;

public class BasePage {
    protected WebDriver driver = WebDriverManager.getDriver();

    private By tabHome = By.xpath("//div[@id='menu']//following::span[contains(text(),'Home')]");
    private By tabFAQ = By.xpath("//div[@id='menu']//following::span[contains(text(),'FAQ')]");
    private By tabContact = By.xpath("//div[@id='menu']//following::span[contains(text(),'Contact')]");
    private By tabTimetable = By.xpath("//div[@id='menu']//following::span[contains(text(),'Timetable')]");
    private By tabTicketPrice = By.xpath("//div[@id='menu']//following::span[contains(text(),'price')]");
    private By tabBookTicket = By.xpath("//div[@id='menu']//following::span[contains(text(),'Book ticket')]");
    private By tabChangePassword = By.xpath("//div[@id='menu']//following::span[contains(text(),'password')]");
    private By tabRegister = By.xpath("//div[@id='menu']//following::span[contains(text(),'Register')]");
    private By tabLogout = By.xpath("//div[@id='menu']//following::span[contains(text(),'out')]");
    private By tabLogin = By.xpath("//div[@id='menu']//following::span[contains(text(),'in')]");
    private By lblWelcomeMsg = By.xpath("//div[@class='account']/strong");

    public WebElement getTabHome() {
        return driver.findElement(tabHome);
    }

    public WebElement getTabFAQ() {
        return driver.findElement(tabFAQ);
    }

    public WebElement getTabContact() {
        return driver.findElement(tabContact);
    }

    public WebElement getTabTimetable() {
        return driver.findElement(tabTimetable);
    }

    public WebElement getTabTicketPrice() {
        return driver.findElement(tabTicketPrice);
    }

    public WebElement getTabBookTicket() {
        return driver.findElement(tabBookTicket);
    }

    public WebElement getTabChangePassword() {
        return driver.findElement(tabChangePassword);
    }

    public WebElement getTabRegister() {
        return driver.findElement(tabRegister);
    }

    public WebElement getTabLogout() {
        return driver.findElement(tabLogout);
    }

    public WebElement getTabLogin() {
        return driver.findElement(tabLogin);
    }

    public WebElement getLblWelcomeMsg() {
        return driver.findElement(lblWelcomeMsg);
    }

    public void goToLoginPage() {
        this.getTabLogin().click();
    }
    public String getWelcomeMsg() {
        return this.getLblWelcomeMsg().getText();
    }
}
