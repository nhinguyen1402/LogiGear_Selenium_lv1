package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.railway.utils.Constant;


public class BasePage {
    private final By tabHome = By.xpath("//div[@id='menu']//span[contains(text(),'Home')]");
    private final By tabFAQ = By.xpath("//div[@id='menu']//span[contains(text(),'FAQ')]");
    private final By tabContact = By.xpath("//div[@id='menu']//span[contains(text(),'Contact')]");
    private final By tabTimetable = By.xpath("//div[@id='menu']//span[contains(text(),'Timetable')]");
    private final By tabTicketPrice = By.xpath("//div[@id='menu']//span[contains(text(),'price')]");
    private final By tabBookTicket = By.xpath("//div[@id='menu']//span[contains(text(),'Book ticket')]");
    private final By tabMyTicket = By.xpath("//div[@id='menu']//span[contains(text(),'My ticket')]");
    private final By tabChangePassword = By.xpath("//div[@id='menu']//span[contains(text(),'password')]");
    private final By tabRegister = By.xpath("//div[@id='menu']//span[contains(text(),'Register')]");
    private final By tabLogout = By.xpath("//div[@id='menu']//span[contains(text(),'out')]");
    private final By tabLogin = By.xpath("//div[@id='menu']//span[contains(text(),'Login')]");
    private final By lblWelcomeMsg = By.xpath("//div[@class='account']/strong");
    private final By lblPageTitle = By.cssSelector("#content h1");
}
