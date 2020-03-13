package Pages;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Menu extends WebDriverSettingUL {

    String clickReporting = "div.main-menu > li._current.dropdown > p";
    String selectHistoricalReport = "div.main-menu > li._current.dropdown > ul > li:nth-child(2) > a";
    String createNewReport = "div.scheduler-data__addbtn";



    public void goToHistoricalReport() {
        driver.findElement(By.cssSelector(clickReporting)).click();
        driver.findElement(By.cssSelector(selectHistoricalReport)).click();
    }

    public void createNewReport() throws InterruptedException {

        driver.findElement(By.cssSelector(createNewReport)).click();
//        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        Thread.sleep(2000);
    }

    public void openCDR() {
        driver.findElement(By.cssSelector(clickReporting)).click();
        driver.findElement(By.xpath("//*[text()='CDR']")).click();
    }
}
