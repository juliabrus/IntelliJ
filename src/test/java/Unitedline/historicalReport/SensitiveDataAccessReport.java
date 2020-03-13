package Unitedline.historicalReport;

import Pages.CalendarPage;
import Pages.HistoricalReportPage;
import Pages.Menu;
import Pages.WebDriverSettingUL;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class SensitiveDataAccessReport extends WebDriverSettingUL {
    @Test
    public void Last7Day() throws InterruptedException {
        CalendarPage calendarPage = new CalendarPage();
        HistoricalReportPage historicalReportPage = new HistoricalReportPage();
        Menu menu = new Menu();

        menu.goToHistoricalReport();
        menu.createNewReport();
        historicalReportPage.selectReportSensitiveDataAccessReport();
        calendarPage.selectLast7DayForSDAR();
        historicalReportPage.selectExportedACVSFile();
        historicalReportPage.selectAllUsers();
        historicalReportPage.goToRunReport();
//        historicalReportPage.downloadCSV();
        historicalReportPage.checkTableDisplaySensitiveDataAR();
        historicalReportPage.valueTotalIsNotSDAR();
    }
    @Test
    public void LastMont() throws InterruptedException {
        CalendarPage calendarPage = new CalendarPage();
        HistoricalReportPage historicalReportPage = new HistoricalReportPage();
        Menu menu = new Menu();

        menu.goToHistoricalReport();
        menu.createNewReport();
        historicalReportPage.selectReportSensitiveDataAccessReport();
        calendarPage.selectLastMonthForSDAR();
        historicalReportPage.selectExportedACVSFile();
        historicalReportPage.selectAllUsers();
        historicalReportPage.goToRunReport();
//        historicalReportPage.downloadCSV();
        historicalReportPage.checkTableDisplaySensitiveDataAR();
        historicalReportPage.valueTotalIsNotSDAR();
    }
    @Test
    public void LastYear() throws InterruptedException {
        CalendarPage calendarPage = new CalendarPage();
        HistoricalReportPage historicalReportPage = new HistoricalReportPage();
        Menu menu = new Menu();

        menu.goToHistoricalReport();
        menu.createNewReport();
        historicalReportPage.selectReportSensitiveDataAccessReport();
        calendarPage.selectLastYearForSDAR();
        historicalReportPage.selectExportedACVSFile();
        historicalReportPage.selectAllUsers();
        historicalReportPage.goToRunReport();
//        historicalReportPage.downloadCSV();
        historicalReportPage.checkTableDisplaySensitiveDataAR();
        historicalReportPage.valueTotalIsNotSDAR();
    }
    @Test
    public void ThisMounth() throws InterruptedException {
        CalendarPage calendarPage = new CalendarPage();
        HistoricalReportPage historicalReportPage = new HistoricalReportPage();
        Menu menu = new Menu();

        menu.goToHistoricalReport();
        menu.createNewReport();
        historicalReportPage.selectReportSensitiveDataAccessReport();
        calendarPage.selectThisMounthForSDAR();
        historicalReportPage.selectExportedACVSFile();
        historicalReportPage.selectAllUsers();
        historicalReportPage.goToRunReport();
//        historicalReportPage.downloadCSV();
        historicalReportPage.checkTableDisplaySensitiveDataAR();
        historicalReportPage.valueTotalIsNotSDAR();
    }
    @Test
    public void Today() throws InterruptedException {
        CalendarPage calendarPage = new CalendarPage();
        HistoricalReportPage historicalReportPage = new HistoricalReportPage();
        Menu menu = new Menu();

        menu.goToHistoricalReport();
        menu.createNewReport();
        historicalReportPage.selectReportSensitiveDataAccessReport();
        calendarPage.selectTodayForSDAR();
        historicalReportPage.selectExportedACVSFile();
        historicalReportPage.selectAllUsers();
        historicalReportPage.goToRunReport();
//        historicalReportPage.downloadCSV();
        historicalReportPage.checkTableDisplaySensitiveDataAR();
        historicalReportPage.valueTotalIsNotSDAR();
    }
    @Test
    public void Yesterday() throws InterruptedException {
        CalendarPage calendarPage = new CalendarPage();
        HistoricalReportPage historicalReportPage = new HistoricalReportPage();
        Menu menu = new Menu();

        menu.goToHistoricalReport();
        menu.createNewReport();
        historicalReportPage.selectReportSensitiveDataAccessReport();
        calendarPage.selectYesterdayForSDAR();
        historicalReportPage.selectExportedACVSFile();
        historicalReportPage.selectAllUsers();
        historicalReportPage.goToRunReport();
//        historicalReportPage.downloadCSV();
        historicalReportPage.checkTableDisplaySensitiveDataAR();
        historicalReportPage.valueTotalIsNotSDAR();
    }
}
