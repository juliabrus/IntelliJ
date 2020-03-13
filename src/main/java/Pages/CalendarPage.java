package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class CalendarPage extends WebDriverSettingUL{

    String clickCalendar = "i.calendar-field__icon._new-calendar";
    String clickCalendarForSDAR = "input.calendar-field__input";
    String selectTodayDate = "div.calendar-overlay__header > ul > li:nth-child(1)";
    String selectYesterdayDate = "div.calendar-overlay__header > ul > li:nth-child(2)";
    String selectThisMount = "div.calendar-overlay__header > ul > li:nth-child(3)";
    String selectLastYear = "div.calendar-overlay__header > ul > li:nth-child(6)";
    String selectLastMonth = "div.calendar-overlay__header > ul > li:nth-child(5)";
    String selectLast7Days = "div.calendar-overlay__header > ul > li:nth-child(4)";

    public void selectToday() {
        driver.findElement(By.cssSelector(clickCalendar)).click();
        driver.findElement(By.cssSelector(selectTodayDate)).click();
    }

    public void selectTodayForSDAR() {
        driver.findElement(By.cssSelector(clickCalendarForSDAR)).click();
        driver.findElement(By.cssSelector(selectTodayDate)).click();
    }

    public void selectYesterday() {
        driver.findElement(By.cssSelector(clickCalendar)).click();
        driver.findElement(By.cssSelector(selectYesterdayDate)).click();
    }

    public void selectYesterdayForSDAR() {
        driver.findElement(By.cssSelector(clickCalendarForSDAR)).click();
        driver.findElement(By.cssSelector(selectYesterdayDate)).click();
    }

    public void selectLast7Days() {
        driver.findElement(By.cssSelector(clickCalendar)).click();
        driver.findElement(By.cssSelector(selectLast7Days)).click();
    }

    public void selectLast7DayForSDAR() {
        driver.findElement(By.cssSelector(clickCalendarForSDAR)).click();
        driver.findElement(By.cssSelector(selectLast7Days)).click();
    }

    public void selectLastMonth() {
        driver.findElement(By.cssSelector(clickCalendar)).click();
        driver.findElement(By.cssSelector(selectLastMonth)).click();
    }

    public void selectLastMonthForSDAR() {
        driver.findElement(By.cssSelector(clickCalendarForSDAR)).click();
        driver.findElement(By.cssSelector(selectLastMonth)).click();
    }

    public void selectThisMounth() {
        driver.findElement(By.cssSelector(clickCalendar)).click();
        driver.findElement(By.cssSelector(selectThisMount)).click();
    }

    public void selectThisMounthForSDAR() {
        driver.findElement(By.cssSelector(clickCalendarForSDAR)).click();
        driver.findElement(By.cssSelector(selectThisMount)).click();
    }

    public void selectLastYear() {
        driver.findElement(By.cssSelector(clickCalendar)).click();
        driver.findElement(By.cssSelector(selectLastYear)).click();
    }

    public void selectLastYearForSDAR() {
        driver.findElement(By.cssSelector(clickCalendarForSDAR)).click();
        driver.findElement(By.cssSelector(selectLastYear)).click();
    }

    public void selectDay() {
        driver.findElement(By.cssSelector(clickCalendar)).click();
        driver.findElement(By.cssSelector("#report > div > section:nth-child(3) > div.content > div > div.calendar-field > div > div > div.SingleDatePicker_picker.SingleDatePicker_picker_1.SingleDatePicker_picker__directionLeft.SingleDatePicker_picker__directionLeft_2 > div > div > div > div.DayPicker_focusRegion.DayPicker_focusRegion_1 > div.DayPicker_transitionContainer.DayPicker_transitionContainer_1.DayPicker_transitionContainer__horizontal.DayPicker_transitionContainer__horizontal_2 > div > div:nth-child(2) > div > table > tbody > tr:nth-child(2) > td:nth-child(3)")).click();
    }

}