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
}
