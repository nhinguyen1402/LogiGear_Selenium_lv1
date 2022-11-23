package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.railway.utils.Constant;

public class RegisterPage extends BasePage {
    private final By linkLogin = By.xpath("//div[@id='content']//following::a[contains(@href,'Login')]");
    private final By linkConfirm = By.xpath("/div[@id='content']//following::a[contains(@href,'Confirm')]");
    private final By txtUserName = By.xpath("//input[@id='email']");
    private final By txtPassword = By.xpath("//input[@id='password']");
    private final By txtConfirmPass = By.xpath("//input[@id='confirmPassword']");
    private final By txtPassPort = By.xpath("//input[@id='pid']");
    private final By btnRegister = By.xpath("//input[@value='Register']");
    private final By lblRegisterError = By.xpath("//p[@class='message error']");
    private final By lblUserNameError = By.xpath("//li[@class='email']//label[@class='validation-error']");
    private final By lblPassWordError = By.xpath("//li[@class='password']//label[@class='validation-error']");
    private final By lblPidError = By.xpath("//li[@class='pid-number']//label[@class='validation-error']");
    private final By lblSuccessRegister = By.cssSelector("#content p");
    private WebElement getLinkLogin() {
        return Constant.DRIVER.findElement(linkLogin);
    }
    private WebElement getLinkConfirm() {
        return Constant.DRIVER.findElement(linkConfirm);
    }
    private WebElement getTxtUserName() {
        return Constant.DRIVER.findElement(txtUserName);
    }
    private WebElement getTxtConfirmPass() {
        return Constant.DRIVER.findElement(txtConfirmPass);
    }
    private WebElement getTxtPassPort() {
        return Constant.DRIVER.findElement(txtPassPort);
    }
    private WebElement getTxtPassword() {
        return Constant.DRIVER.findElement(txtPassword);
    }
    private WebElement getBtnRegister() {
        return Constant.DRIVER.findElement(btnRegister);
    }
    private WebElement getLblRegisterError() {
        return Constant.DRIVER.findElement(lblRegisterError);
    }
    private WebElement getLblUserNameError() { return Constant.DRIVER.findElement(lblUserNameError); }
    private WebElement getLblPassWordError() {
        return Constant.DRIVER.findElement(lblPassWordError);
    }
    private WebElement getLblPidError() {
        return Constant.DRIVER.findElement(lblPidError);
    }
    private WebElement getLblSuccessRegister() {
        return Constant.DRIVER.findElement(lblSuccessRegister);
    }

    public String getSuccessMsg() {
        return getLblSuccessRegister().getText();
    }
    public void register(String email, String password, String confirmPassword, String pid) {
        getTxtUserName().sendKeys(email);
        getTxtPassword().sendKeys(password);
        getTxtConfirmPass().sendKeys(confirmPassword);
        getTxtPassPort().sendKeys(pid);
        getBtnRegister().click();
    }
    public String getRegisterErrorMsgText() {
        return this.getLblRegisterError().getText();
    }
    public String getUserNameErrorMsgText () { return this.getLblUserNameError().getText(); }
    public String getPassWordErrorMsgText () { return this.getLblPassWordError().getText(); }
    public String getPIDErrorMgsText () { return this.getLblPidError().getText(); }
}
