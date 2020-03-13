package Unitedline.historicalReport;

import Pages.CalendarPage;
import Pages.HistoricalReportPage;
import Pages.Menu;
import Pages.WebDriverSettingUL;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class AgentList extends WebDriverSettingUL {
    @Test
    public void Last7Days() throws InterruptedException {

        CalendarPage calendarPage = new CalendarPage();
        HistoricalReportPage historicalReportPage = new HistoricalReportPage();
        Menu menu = new Menu();

        menu.goToHistoricalReport();
        menu.createNewReport();
        historicalReportPage.selectReportAgentList();
        calendarPage.selectLast7Days();
        historicalReportPage.selectAllMetrics();
        historicalReportPage.selectAllAgent();
        historicalReportPage.goToRunReport();
//        historicalReportPage.downloadCSV();
        historicalReportPage.checkTableDisplayAgentList();
        historicalReportPage.valueTotalIsNotZeroAgentList();
    }
    @Test
    public void LastMonth() throws InterruptedException {

        CalendarPage calendarPage = new CalendarPage();
        HistoricalReportPage historicalReportPage = new HistoricalReportPage();
        Menu menu = new Menu();

        menu.goToHistoricalReport();
        menu.createNewReport();
        historicalReportPage.selectReportAgentList();
        calendarPage.selectLastMonth();
        historicalReportPage.selectAllMetrics();
        historicalReportPage.selectAllAgent();
        historicalReportPage.goToRunReport();
//        historicalReportPage.downloadCSV();
        historicalReportPage.checkTableDisplayAgentList();
        historicalReportPage.valueTotalIsNotZeroAgentList();
    }
    @Test
    public void LastYear() throws InterruptedException {

        CalendarPage calendarPage = new CalendarPage();
        HistoricalReportPage historicalReportPage = new HistoricalReportPage();
        Menu menu = new Menu();

        menu.goToHistoricalReport();
        menu.createNewReport();
        historicalReportPage.selectReportAgentList();
        calendarPage.selectLastYear();
        historicalReportPage.selectAllMetrics();
        historicalReportPage.selectAllAgent();
        historicalReportPage.goToRunReport();
//        historicalReportPage.downloadCSV();
        historicalReportPage.checkTableDisplayAgentList();
        historicalReportPage.valueTotalIsNotZeroAgentList();
    }
    @Test
    public void ThisMounth() throws InterruptedException {
        CalendarPage calendarPage = new CalendarPage();
        HistoricalReportPage historicalReportPage = new HistoricalReportPage();
        Menu menu = new Menu();

        menu.goToHistoricalReport();
        menu.createNewReport();
        historicalReportPage.selectReportAgentList();
        calendarPage.selectThisMounth();
        historicalReportPage.selectAllMetrics();
        historicalReportPage.selectAllAgent();
        historicalReportPage.goToRunReport();
//        historicalReportPage.downloadCSV();
        historicalReportPage.checkTableDisplayAgentList();
        historicalReportPage.valueTotalIsNotZeroAgentList();
    }
    @Test
    public void Today() throws InterruptedException {
        CalendarPage calendarPage = new CalendarPage();
        HistoricalReportPage historicalReportPage = new HistoricalReportPage();
        Menu menu = new Menu();

        menu.goToHistoricalReport();
        menu.createNewReport();
        historicalReportPage.selectReportAgentList();
        calendarPage.selectToday();
        historicalReportPage.selectAllMetrics();
        historicalReportPage.selectAllAgent();
        historicalReportPage.goToRunReport();
//        historicalReportPage.downloadCSV();
        historicalReportPage.checkTableDisplayAgentList();
        historicalReportPage.valueTotalIsNotZeroAgentList();
    }
    @Test
    public void Yesterday() throws InterruptedException {

        CalendarPage calendarPage = new CalendarPage();
        HistoricalReportPage historicalReportPage = new HistoricalReportPage();
        Menu menu = new Menu();

        menu.goToHistoricalReport();
        menu.createNewReport();
        historicalReportPage.selectReportAgentList();
        calendarPage.selectYesterday();
        historicalReportPage.selectAllMetrics();
        historicalReportPage.selectAllAgent();
        historicalReportPage.goToRunReport();
//        historicalReportPage.downloadCSV();
        historicalReportPage.checkTableDisplayAgentList();
        historicalReportPage.valueTotalIsNotZeroAgentList();
    }
}
