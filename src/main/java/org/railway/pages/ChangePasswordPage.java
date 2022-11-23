package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.railway.utils.Constant;

public class ChangePasswordPage extends BasePage{
    private final By txtCurrentPass = By.xpath("//input[@id='currentPassword']");
    private final By txtNewPass = By.xpath("//input[@id='newPassword']");
    private final By txtConfirmPass = By.xpath("//input[@id='confirmPassword']");
    private final By bntChangePass = By.xpath("//input[contains(@title,'Change')]");
    private final By lblRegisterError = By.xpath("//p[@class='message error']");
    private final By lblCurrentPassError = By.xpath("//li[@class='current-password']//label[@class='validation-error']");
    private final By lblNewPassError = By.xpath("//li[@class='new-password']//label[@class='validation-error']");
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
    private WebElement getLblRegisterError() {
        return Constant.DRIVER.findElement(lblRegisterError);
    }
    private WebElement getLblCurrentPassError() {
        return Constant.DRIVER.findElement(lblCurrentPassError);
    }
    private WebElement getLblNewPassError() {
        return Constant.DRIVER.findElement(lblNewPassError);
    }
    private WebElement getLblChangePass() {
        return Constant.DRIVER.findElement(lblChangePass);
    }

    public void changePass(String currentPass, String newPass, String confirmPass) {
        getTxtCurrentPass().sendKeys(currentPass);
        getTxtNewPass().sendKeys(newPass);
        getTxtConfirmPass().sendKeys(confirmPass);
        getBntChangePass().click();
    }
    public String getChangePassSuccessMsg() {
        return this.getLblChangePass().getText();
    }
}
