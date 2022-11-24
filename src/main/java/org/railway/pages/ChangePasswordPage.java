package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.railway.utils.Constant;

public class ChangePasswordPage extends BasePage{
    private final By txtCurrentPass = By.cssSelector("input#currentPassword");
    private final By txtNewPass = By.cssSelector("input#newPassword");
    private final By txtConfirmPass = By.cssSelector("input#confirmPassword");
    private final By bntChangePass = By.cssSelector("p.form-actions input");
    private final By lblChangePass = By.cssSelector("p.message.success");

    private WebElement getTxtCurrentPass() {
        return Constant.DRIVER.findElement(txtCurrentPass);
    }
    private WebElement getTxtNewPass() {
        return Constant.DRIVER.findElement(txtNewPass);
    }
    private WebElement getTxtConfirmPass() {
        return Constant.DRIVER.findElement(txtConfirmPass);
    }
    private WebElement getBntChangePass() {
        return Constant.DRIVER.findElement(bntChangePass);
    }
    private WebElement getLblChangePass() {
        return Constant.DRIVER.findElement(lblChangePass);
    }

    public void changePass(String currentPass, String newPass, String confirmPass) {
        inputCurrentPassword(currentPass);
        inputNewPassword(newPass);
        inputConfirmPassword(confirmPass);
        clickChangePasswordButton();
    }
    public void clickChangePasswordButton() {
        scrollToElement(getBntChangePass());
        getBntChangePass().click();
    }
    public void inputCurrentPassword(String currentPass) {
        scrollToElement(getTxtCurrentPass());
        getTxtCurrentPass().sendKeys(currentPass);
    }
    public void inputNewPassword(String newPass) {
        scrollToElement(getTxtNewPass());
        getTxtNewPass().sendKeys(newPass);
    }
    public void inputConfirmPassword(String confirmPassword) {
        scrollToElement(getTxtConfirmPass());
        getTxtConfirmPass().sendKeys(confirmPassword);
    }
    public String getChangePassSuccessMsg() {
        scrollToElement(getLblChangePass());
        return this.getLblChangePass().getText();
    }
}
