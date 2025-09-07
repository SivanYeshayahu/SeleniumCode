package com.saucedemo.pages;

import org.openqa.selenium.By; //להשתמש בקלאס By שמגיע מתוך ספריית Selenium.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {  //parent class name BasePage

    public static WebDriver driver;

    public void setDriver(WebDriver driver) {
        BasePage.driver = driver; //השמה
    }

    protected WebElement find(By locator){
        return driver.findElement(locator);
    }

    protected void set(By locator, String text) {
        find(locator).clear();
        find(locator).sendKeys(text);
    }

    protected void click(By locator) {
        find(locator).click();
    }

}

