package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.railway.utils.Constant;
import org.railway.utils.Log4j;

public class RegisterPage extends BasePage {
    private final By linkLogin = By.xpath("//div[@id='content']//following::a[contains(@href,'Login')]");
    private final By linkConfirm = By.xpath("/div[@id='content']//following::a[contains(@href,'Confirm')]");
    private final By txtUserName = By.xpath("//input[@id='email']");
    private final By txtPassword = By.xpath("//input[@id='password']");
    private final By txtConfirmPass = By.xpath("//input[@id='confirmPassword']");
    private final By txtPassPort = By.xpath("//input[@id='pid']");
    private final By btnRegister = By.xpath("//input[@value='Register']");
    private final By registerErrorMsg = By.xpath("//p[@class='message error']");
    private final By userNameErrorMsg = By.xpath("//li[@class='email']//label[@class='validation-error']");
    private final By passWordErrorMsg = By.xpath("//li[@class='password']//label[@class='validation-error']");
    private final By pidErrorMsg = By.xpath("//li[@class='pid-number']//label[@class='validation-error']");
    private final By successRegisterMsg = By.cssSelector("#content p");
    public WebElement getLinkLogin() {
        return Constant.DRIVER.findElement(linkLogin);
    }

    public WebElement getLinkConfirm() {
        return Constant.DRIVER.findElement(linkConfirm);
    }

    public WebElement getTxtUserName() {
        return Constant.DRIVER.findElement(txtUserName);
    }

    public WebElement getTxtConfirmPass() {
        return Constant.DRIVER.findElement(txtConfirmPass);
    }

    public WebElement getTxtPassPort() {
        return Constant.DRIVER.findElement(txtPassPort);
    }

    public WebElement getTxtPassword() {
        return Constant.DRIVER.findElement(txtPassword);
    }

    public WebElement getBtnRegister() {
        return Constant.DRIVER.findElement(btnRegister);
    }

    public WebElement getRegisterErrorMsg() {
        return Constant.DRIVER.findElement(registerErrorMsg);
    }

    public WebElement getUserNameErrorMsg() {

        return Constant.DRIVER.findElement(userNameErrorMsg);
    }

    public WebElement getPassWordErrorMsg() {
        return Constant.DRIVER.findElement(passWordErrorMsg);
    }

    public WebElement getPidErrorMsg() {
        return Constant.DRIVER.findElement(pidErrorMsg);
    }
    public WebElement getSuccessRegisterMsg() {
        return Constant.DRIVER.findElement(successRegisterMsg);
    }
    public String getSuccessMsg() {
        return getSuccessRegisterMsg().getText();
    }
    public void register(String email, String password, String confirmPassword, String pid) {
        Log4j.info("Input to Email text box: " + email);
        getTxtUserName().sendKeys(email);
        Log4j.info("Input to Password text box: " + password);
        getTxtPassword().sendKeys(password);
        Log4j.info("Input to Confirm Password text box: " + confirmPassword);
        getTxtConfirmPass().sendKeys(confirmPassword);
        Log4j.info("Input to PID text box: " + pid);
        getTxtPassPort().sendKeys(pid);
        Log4j.info("Click on Register Button");
        getBtnRegister().click();
    }
}
