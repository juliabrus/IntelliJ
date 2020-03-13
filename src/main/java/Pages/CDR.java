package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CDR extends WebDriverSettingUL {
    String typeClick = "#react-select-2--value";
    String selectTypeInbound = "//*[@id='filters']/div/div[1]/div[6]/label /.. //div[text()='Inbound']";
    String searchCDR = "#filters > div > div.filters__row._btns > input";
    String openCDR = "#cdr > table > tbody > tr:nth-child(1) > td.common-table__cell.cdr-table__date";


    public void selectTypeInbound() {

        driver.findElement(By.cssSelector(typeClick)).click();
        driver.findElement(By.xpath(selectTypeInbound)).click();
    }

    public void searchCDR() {
        driver.findElement(By.cssSelector(searchCDR)).click();
    }
    public void openCDR() {
        driver.findElement(By.cssSelector(openCDR)).click();
    }

}
