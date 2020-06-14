package com.mavenit.selenium.training.pages;

import com.mavenit.selenium.training.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDescriptionPage extends DriverManager {

    @FindBy(css = ".xs-8--none")
    private WebElement trolleyBtn;

    @FindBy(css = ".button--full.xs-hidden.sm-block")
    private WebElement goToTrolleyBtn;

    public void addToBasket() {

        waitUntilElementClickable(trolleyBtn).click();
    }

    public void goToTrolley() {

        waitUntilElementClickable(goToTrolleyBtn).click();
    }
}
