package org.railway.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.railway.utils.Constant;
import org.railway.utils.Log4j;

public class ChangePasswordPage extends BasePage{
    private final By txtCurrentPass = By.xpath("//input[@id='currentPassword']");
    private final By txtNewPass = By.xpath("//input[@id='newPassword']");
    private final By txtConfirmPass = By.xpath("//input[@id='confirmPassword']");
    private final By bntChangePass = By.xpath("//input[contains(@title,'Change')]");
    private final By registerErrorMsg = By.xpath("//p[@class='message error']");
    private final By currentPassErrorMsg = By.xpath("//li[@class='current-password']//label[@class='validation-error']");
    private final By newPassErrorMsg = By.xpath("//li[@class='new-password']//label[@class='validation-error']");
    private final By changePassMsg = By.cssSelector("p.message.success");

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
    private WebElement getRegisterErrorMsg() {
        return Constant.DRIVER.findElement(registerErrorMsg);
    }
    private WebElement getCurrentPassErrorMsg() {
        return Constant.DRIVER.findElement(currentPassErrorMsg);
    }
    private WebElement getNewPassErrorMsg() {
        return Constant.DRIVER.findElement(newPassErrorMsg);
    }
    private WebElement getChangePassMsg() {
        return Constant.DRIVER.findElement(changePassMsg);
    }

    public void changePass(String currentPass, String newPass, String confirmPass) {
        getTxtCurrentPass().sendKeys(currentPass);
        getTxtNewPass().sendKeys(newPass);
        getTxtConfirmPass().sendKeys(confirmPass);
        getBntChangePass().click();
    }
    public String getChangePassSuccessMsg() {
        return this.getChangePassMsg().getText();
    }
}
