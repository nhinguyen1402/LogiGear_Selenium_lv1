package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends BasePage {
    private By linkLogin = By.xpath("//div[@id='content']//following::a[contains(@href,'Login')]");
    private By linkConfirm = By.xpath("/div[@id='content']//following::a[contains(@href,'Confirm')]");
    private By txtUserName = By.xpath("//input[@id='email']");
    private By txtPassword = By.xpath("//input[@id='password']");
    private By txtConfirmPass = By.xpath("//input[@id='confirmPassword']");
    private By txtPassPort = By.xpath("//input[@id='pid']");
    private By btnRegister = By.xpath("//input[@value='Register']");
    private By registerErrorMsg = By.xpath("//p[@class='message error']");
    private By userNameErrorMsg = By.xpath("//li[@class='email']//label[@class='validation-error']");
    private By passWordErrorMsg = By.xpath("//li[@class='password']//label[@class='validation-error']");
    private By pidErrorMsg = By.xpath("//li[@class='pid-number']//label[@class='validation-error']");

    public WebElement getLinkLogin() {
        return driver.findElement(linkLogin);
    }

    public WebElement getLinkConfirm() {
        return driver.findElement(linkConfirm);
    }

    public WebElement getTxtUserName() {
        return driver.findElement(txtUserName);
    }

    public WebElement getTxtConfirmPass() {
        return driver.findElement(txtConfirmPass);
    }

    public WebElement getTxtPassPort() {
        return driver.findElement(txtPassPort);
    }

    public WebElement getTxtPassword() {
        return driver.findElement(txtPassword);
    }

    public WebElement getBtnRegister() {
        return driver.findElement(btnRegister);
    }

    public WebElement getRegisterErrorMsg() {
        return driver.findElement(registerErrorMsg);
    }

    public WebElement getUserNameErrorMsg() {

        return driver.findElement(userNameErrorMsg);
    }

    public WebElement getPassWordErrorMsg() {
        return driver.findElement(passWordErrorMsg);
    }

    public WebElement getPidErrorMsg() {
        return driver.findElement(pidErrorMsg);
    }

    public void Register(String username, String pass, String confirm, String PID) {
        getTxtUserName().sendKeys(username);
        getTxtPassword().sendKeys(pass);
        getTxtConfirmPass().sendKeys(confirm);
        getTxtPassPort().sendKeys(PID);
        getBtnRegister().click();
    }
}
