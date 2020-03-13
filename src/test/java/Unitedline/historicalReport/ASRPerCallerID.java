package Unitedline.historicalReport;

import Pages.CalendarPage;
import Pages.HistoricalReportPage;
import Pages.Menu;
import Pages.WebDriverSettingUL;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class ASRPerCallerID extends WebDriverSettingUL {
    @Test
    public void Last7Days() throws InterruptedException {
        CalendarPage calendarPage = new CalendarPage();
        HistoricalReportPage historicalReportPage = new HistoricalReportPage();
        Menu menu = new Menu();

        menu.goToHistoricalReport();
        menu.createNewReport();
        historicalReportPage.selectReportASRPerCallerID();
        calendarPage.selectLast7Days();
        historicalReportPage.selectAllMetrics();
        historicalReportPage.goToRunReport();
//        historicalReportPage.downloadCSV();
        historicalReportPage.checkTableDisplayASRPerCallerID();
        historicalReportPage.valueTotalIsNotZeroASRPerCallerID();
    }
    @Test
    public void LastMonth() throws InterruptedException {
        CalendarPage calendarPage = new CalendarPage();
        HistoricalReportPage historicalReportPage = new HistoricalReportPage();
        Menu menu = new Menu();

        menu.goToHistoricalReport();
        menu.createNewReport();
        historicalReportPage.selectReportASRPerCallerID();
        calendarPage.selectLastMonth();
        historicalReportPage.selectAllMetrics();
        historicalReportPage.goToRunReport();
//        historicalReportPage.downloadCSV();
        historicalReportPage.checkTableDisplayASRPerCallerID();
        historicalReportPage.valueTotalIsNotZeroASRPerCallerID();
    }
    @Test
    public void LastYear() throws InterruptedException {
        CalendarPage calendarPage = new CalendarPage();
        HistoricalReportPage historicalReportPage = new HistoricalReportPage();
        Menu menu = new Menu();

        menu.goToHistoricalReport();
        menu.createNewReport();
        historicalReportPage.selectReportASRPerCallerID();
        calendarPage.selectLastYear();
        historicalReportPage.selectAllMetrics();
        historicalReportPage.goToRunReport();
//        historicalReportPage.downloadCSV();
        historicalReportPage.checkTableDisplayASRPerCallerID();
        historicalReportPage.valueTotalIsNotZeroASRPerCallerID();
    }
    @Test
    public void ThisMount() throws InterruptedException {
        CalendarPage calendarPage = new CalendarPage();
        HistoricalReportPage historicalReportPage = new HistoricalReportPage();
        Menu menu = new Menu();

        menu.goToHistoricalReport();
        menu.createNewReport();
        historicalReportPage.selectReportASRPerCallerID();
        calendarPage.selectThisMounth();
        historicalReportPage.selectAllMetrics();
        historicalReportPage.goToRunReport();
//        historicalReportPage.downloadCSV();
        historicalReportPage.checkTableDisplayASRPerCallerID();
        historicalReportPage.valueTotalIsNotZeroASRPerCallerID();
    }
    @Test
    public void Today() throws InterruptedException {
        CalendarPage calendarPage = new CalendarPage();
        HistoricalReportPage historicalReportPage = new HistoricalReportPage();
        Menu menu = new Menu();

        menu.goToHistoricalReport();
        menu.createNewReport();
        historicalReportPage.selectReportASRPerCallerID();
        calendarPage.selectToday();
        historicalReportPage.selectAllMetrics();
        historicalReportPage.goToRunReport();
//        historicalReportPage.downloadCSV();
        historicalReportPage.checkTableDisplayASRPerCallerID();
        historicalReportPage.valueTotalIsNotZeroASRPerCallerID();
    }
    @Test
    public void Yesterday() throws InterruptedException {
        CalendarPage calendarPage = new CalendarPage();
        HistoricalReportPage historicalReportPage = new HistoricalReportPage();
        Menu menu = new Menu();

        menu.goToHistoricalReport();
        menu.createNewReport();
        historicalReportPage.selectReportASRPerCallerID();
        calendarPage.selectYesterday();;
        historicalReportPage.selectAllMetrics();
        historicalReportPage.goToRunReport();
//        historicalReportPage.downloadCSV();
        historicalReportPage.checkTableDisplayASRPerCallerID();
        historicalReportPage.valueTotalIsNotZeroASRPerCallerID();
    }
}
