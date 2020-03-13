package Wepspoon;

import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Webspoon extends WebDriverSettingWS {
    @Test
    public void firstTestUL() {
        openMainPage();
        //нажатие кнопки Вход
        driver.findElement(By.cssSelector("body > div.PanelHeader > div.PanelHeader-rightButtons > div.PanelHeader-fullButtons > div > a:nth-child(1)")).click();
//        WebDriverWait wait = new WebDriverWait(driver, 10);

        driver.findElement(By.cssSelector("#login-form > input.Login-field.field--text")).click();
        driver.findElement(By.cssSelector("#login-form > input.Login-field.field--text")).sendKeys("brusencevaulia275@gmail.com");

        driver.findElement(By.cssSelector("#login-form > input.Login-field.field--password")).click();
        driver.findElement(By.cssSelector("#login-form > input.Login-field.field--password")).sendKeys("Qwerty123");

        driver.findElement(By.cssSelector("#login-form > input.Login-submitBtn")).click();
//        driver.findElement(By.cssSelector("#Register-form > div:nth-child(3) > input")).sendKeys("test@test.test");
//
//        driver.findElement(By.cssSelector("#Register-form > div:nth-child(4) > input")).click();
//        driver.findElement(By.cssSelector("#Register-form > div:nth-child(4) > input")).sendKeys("test@test.test");
//
//        driver.findElement(By.cssSelector("#recaptcha-anchor > div.recaptcha-checkbox-border")).click();
//        driver.findElement(By.cssSelector("#receive_news")).click();
    }

    private void openMainPage() {
        //максимальный размер браузерного окна
        driver.manage().window().maximize();
        driver.get("https://webspoon.ru/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
