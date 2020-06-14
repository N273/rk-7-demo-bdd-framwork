package com.mavenit.selenium.training.pages;

import com.mavenit.selenium.training.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverManager {
    @FindBy(xpath = "//div[@class='_3-aaF']//a[2]")
    private WebElement accountButton;

    @FindBy(id = "email-address")
    private  WebElement emmailField;

    @FindBy(id = "current-password")
    private  WebElement passwordField;

    @FindBy(xpath = "//button[@class='button']")
    private  WebElement sighnInButton;

    public void clicOnAccount(){
        accountButton.click();

    }
    public  void enterEmail(String email){
        emmailField.sendKeys(email);
    }
    public void enterPassword(String password){
        passwordField.sendKeys(password);
    }
    public void clickSighnIn(){
        sighnInButton.submit();
    }

}
