package com.bookit.pages;

import com.bookit.utilities.BrowserUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy (name = "email")
    private WebElement email;

    @FindBy(name ="password")
    private WebElement password;

public void login(String email_text, String password_text){
    BrowserUtils.waitForPageToLoad(10);
    email.sendKeys(email_text);
    password.sendKeys(password_text, Keys.ENTER);

}





}
