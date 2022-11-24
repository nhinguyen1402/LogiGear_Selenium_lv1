package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.railway.utils.Constant;

public class RegisterPage extends BasePage {
    private final By txtUserName = By.cssSelector("input#email");
    private final By txtPassword = By.cssSelector("input#password");
    private final By txtConfirmPass = By.cssSelector("input#confirmPassword");
    private final By txtPassPort = By.cssSelector("input#pid");
    private final By btnRegister = By.cssSelector("[value=Register]");
    private final By lblRegisterError = By.cssSelector("p.message.error");
    private final By lblUserNameError = By.cssSelector("li.email label.validation-error");
    private final By lblPassWordError = By.cssSelector("li.password label.validation-error");
    private final By lblPidError = By.cssSelector("li.pid-number label.validation-error");
    private final By lblSuccessRegister = By.cssSelector("#content p");

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
    private WebElement getLblUserNameError() {
        return Constant.DRIVER.findElement(lblUserNameError);
    }
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
        inputUserName(email);
        inputPassword(password);
        inputConfirmPassword(confirmPassword);
        inputPID(pid);
        clickRegisterButton();
    }
    public void clickRegisterButton() {
        scrollToElement(getBtnRegister());
        getBtnRegister().click();
    }
    public void inputUserName(String userName) {
        scrollToElement(getTxtUserName());
        getTxtUserName().sendKeys(userName);
    }
    public void inputPassword(String password) {
        scrollToElement(getTxtPassword());
        getTxtPassword().sendKeys(password);
    }
    public void inputConfirmPassword(String confirmPassword) {
        scrollToElement(getTxtConfirmPass());
        getTxtConfirmPass().sendKeys(confirmPassword);
    }
    public void inputPID(String pid) {
        scrollToElement(getTxtConfirmPass());
        getTxtPassPort().sendKeys(pid);
    }
    public String getRegisterErrorMsgText() {
        scrollToElement(getLblRegisterError());
        return this.getLblRegisterError().getText();
    }
    public String getUserNameErrorMsgText () {
        scrollToElement(getLblUserNameError());
        return this.getLblUserNameError().getText();
    }
    public String getPassWordErrorMsgText () {
        scrollToElement(getLblPassWordError());
        return this.getLblPassWordError().getText();
    }
    public String getPIDErrorMgsText () {
        scrollToElement(getLblPidError());
        return this.getLblPidError().getText();
    }
}
