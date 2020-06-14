package com.mavenit.selenium.training.pages;

import com.mavenit.selenium.training.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends DriverManager {

    public static String searchItem;

    @FindBy(id = "searchTerm")
    private WebElement searchTxtBox;

    @FindBy(xpath = "//button[@class='_2mKaC']")
    private WebElement magifierGlass;

    public void doSearch(String item) {
        searchItem=item;
        waitUntilElementClickable(searchTxtBox);
        searchTxtBox.sendKeys(item);
        waitUntilElementClickable(magifierGlass);
        magifierGlass.click();
    }

    public void emptySearch(){
        magifierGlass.click();
    }


    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
