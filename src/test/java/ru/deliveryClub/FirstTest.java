package ru.deliveryClub;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.*;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest extends WebDriverSettings {
    @Test
    public void firstTest1() {
        //открыть страницу браузера
        driver.get("https://www.delivery-club.ru/");
//        driver.get("https://google.com/");
        //Thread.sleep(500);

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Delivery club"));
        //нажать на кнопку
        driver.findElement(By.cssSelector("body > div.wrap > header > div.header-container > div.header__buttons-container > button")).click();

        driver.findElement(By.cssSelector("body > div.wrap > header > div.login-popup.popup--def.is-opened > div.popup--def__container > div.popup--def__container-wrap > div.popup--def__content > div.form-field > div:nth-child(1) > label > input")).click();
        //вписать что-то в поле
        driver.findElement(By.cssSelector("body > div.wrap > header > div.login-popup.popup--def.is-opened > div.popup--def__container > div.popup--def__container-wrap > div.popup--def__content > div.form-field > div:nth-child(1) > label > input")).sendKeys(("9688454422"));

    }
}
