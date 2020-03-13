package Unitedline.historicalReport;

import Pages.CalendarPage;
import Pages.HistoricalReportPage;
import Pages.Menu;
import Pages.WebDriverSettingUL;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class agentListPerHour extends WebDriverSettingUL {
    @Test
    public void firstTestUL() throws InterruptedException {
        CalendarPage calendarPage = new CalendarPage();
        HistoricalReportPage historicalReportPage = new HistoricalReportPage();
        Menu menu = new Menu();

        menu.goToHistoricalReport();
        menu.createNewReport();
        historicalReportPage.selectReportAgentListPerHour();
        calendarPage.selectDay();
        historicalReportPage.selectAllTeamsAndAgents();
        historicalReportPage.goToRunReport();
        historicalReportPage.checkTableDisplayAgentListPerHour();
    }
}
