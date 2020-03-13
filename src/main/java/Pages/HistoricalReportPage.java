package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.json.JsonOutput;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HistoricalReportPage extends WebDriverSettingUL {

    String clickDownloadCSV = "section:nth-child(6) > div.title > a";
    String clickRunReport = "button.button.new";
    //select
    String clickMetrics = "div.active";
    String clickSelectAllMetrics = "div.content.scroll > div:nth-child(1) > label > i";
    String clickAgents = "div.title.tabs > div:nth-child(2)";
    String clickSelectAllAgent = "div.active.css-uzl1i4 > label > i";
    String clickReportType = "div.Select-placeholder";
    String clickAllTeams = "div:nth-child(1) > label > i";
    String clickFrom = "div.Select-placeholder";
    String clickTo = "div.Select-placeholder";
    String clickCountry = "div.title.tabs > div:nth-child(2)";
    String clickExportedACVSFile = "div:nth-child(3) > label > i";
    //checkTableDisplay
    String checkTableDisplayAgentList = "div.rt-resizable-header-content";
    String checkTableDisplayAgentListPerHour = "div.rt-table > div.rt-thead.-header > div";
    String checkTableDisplayASRByCountry = "div.rt-table > div.rt-thead.-header > div";
    String checkTableDisplayASRByCountryByHour = "div.rt-thead.-header > div";
    String checkTableDisplayASRPerCallerID = "div.rt-table > div.rt-thead.-header";
    String checkTableDisplayInqueueAbadons = "section:nth-child(5) > div.title";
    String checkTableDisplayRedialCounter = "div.scroll > table > thead";
    String checkTableDisplaySensitiveDataAR = "div.scroll > table > thead > tr";
    //checkValueTotalIsNotZero
    String valueTotalIsNotZeroASRPerCallerID = "div:nth-child(2)";
    String valueTotalIsNotZeroAgentList = "div.rt-tfoot > div > div:nth-child(6)";
    String valueTotalIsNotZeroASRByCountry = "div.rt-tbody > div > div > div:nth-child(2)";
    String valueTotalIsNotZeroASRByCountryByHour = "div.rt-tfoot > div > div:nth-child(2)";
    String valueTotalIsNotZeroRedialCounter = "div.scroll > table > tbody > tr.total > td:nth-child(3)";
    String valueTotalIsNotSDAR = "div.scroll > table > tbody > tr > td:nth-child(3) > span";

    public void checkTableDisplaySensitiveDataAR() {
        List<WebElement> radioNamelist = driver
                .findElements(By
                        .cssSelector(checkTableDisplaySensitiveDataAR));
        System.out.println("radioNamelist " + radioNamelist.size());
        boolean visible;
        if (radioNamelist.size() <= 0) {
            visible = false;
            System.out.println("WARNING The table was not formed");
        } else {
            visible = true;
            System.out.println("The table was formed");
        }
        Assert.assertTrue("message !!!!!", visible);
    }

    public void checkTableDisplayRedialCounter() {
        List<WebElement> radioNamelist = driver
                .findElements(By
                        .cssSelector(checkTableDisplayRedialCounter));
        System.out.println("radioNamelist " + radioNamelist.size());
        boolean visible;
        if (radioNamelist.size() <= 0) {
            visible = false;
            System.out.println("WARNING The table was not formed");
        } else {
            visible = true;
            System.out.println("The table was formed");
        }
        Assert.assertTrue("message !!!!!", visible);
    }

    public void checkTableDisplayInqueueAbadons() {
        List<WebElement> radioNamelist = driver
                .findElements(By
                        .cssSelector(checkTableDisplayInqueueAbadons));
        System.out.println("radioNamelist " + radioNamelist.size());
        boolean visible;
        if (radioNamelist.size() <= 0) {
            visible = false;
            System.out.println("WARNING The table was not formed");
        } else {
            visible = true;
            System.out.println("The table was formed");
        }
        Assert.assertTrue("message !!!!!", visible);
    }

    public void checkTableDisplayASRPerCallerID() {
        List<WebElement> radioNamelist = driver
                .findElements(By
                        .cssSelector(checkTableDisplayASRPerCallerID));
        System.out.println("radioNamelist " + radioNamelist.size());
        boolean visible;
        if (radioNamelist.size() <= 0) {
            visible = false;
            System.out.println("WARNING The table was not formed");
        } else {
            visible = true;
            System.out.println("The table was formed");
        }
        Assert.assertTrue("message !!!!!", visible);
    }

    public void checkTableDisplayASRByCountryByHour() {
        List<WebElement> radioNamelist = driver
                .findElements(By
                        .cssSelector(checkTableDisplayASRByCountryByHour));
        System.out.println("radioNamelist " + radioNamelist.size());
        boolean visible;
        if (radioNamelist.size() <= 0) {
            visible = false;
            System.out.println("WARNING The table was not formed");
        } else {
            visible = true;
            System.out.println("The table was formed");
        }
        Assert.assertTrue("message !!!!!", visible);
    }

    public void checkTableDisplayASRByCountry() {
        List<WebElement> radioNamelist = driver
                .findElements(By
                        .cssSelector(checkTableDisplayASRByCountry));
        System.out.println("radioNamelist " + radioNamelist.size());
        boolean visible;
        if (radioNamelist.size() <= 0) {
            visible = false;
            System.out.println("WARNING The table was not formed");
        } else {
            visible = true;
            System.out.println("The table was formed");
        }
        Assert.assertTrue("message !!!!!", visible);
    }

    public void checkTableDisplayAgentListPerHour() {
        List<WebElement> radioNamelist = driver
                .findElements(By
                        .cssSelector(checkTableDisplayAgentListPerHour));
        System.out.println("radioNamelist " + radioNamelist.size());
        boolean visible;
        if (radioNamelist.size() <= 0) {
            visible = false;
            System.out.println("WARNING The table was not formed");
        } else {
            visible = true;
            System.out.println("The table was formed");
        }
        Assert.assertTrue("message !!!!!", visible);
    }


    public void checkTableDisplayAgentList() {
        List<WebElement> radioNamelist = driver
                .findElements(By
                        .cssSelector(checkTableDisplayAgentList));
        System.out.println("radioNamelist " + radioNamelist.size());
        boolean visible;
        if (radioNamelist.size() <= 0) {
            visible = false;
            System.out.println("WARNING The table was not formed");
        } else {
            visible = true;
            System.out.println("The table was formed");
        }
        Assert.assertTrue("message !!!!!", visible);
    }

    public void to() {
        driver.findElement(By.cssSelector(clickTo)).click();
        driver.findElement(By.xpath("//*[text()='24:00']")).click();
    }

    public void from() {
        driver.findElement(By.cssSelector(clickFrom)).click();
        driver.findElement(By.xpath("//*[text()='00:00']")).click();
    }

    public void selectExportedACVSFile() {
        driver.findElement(By.cssSelector(clickExportedACVSFile)).click();
    }

    public void selectRussiaFromCountry() {
        driver.findElement(By.cssSelector(clickCountry)).click();
        driver.findElement(By.xpath("//*[text()='Russia']")).click();
    }

    public void downloadCSV() {
        driver.findElement(By.cssSelector(clickDownloadCSV)).click();
    }

    public void goToRunReport() {
        driver.findElement(By.cssSelector(clickRunReport)).click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void selectAllUsers() {
        driver.findElement(By.cssSelector(clickSelectAllAgent)).click();
    }

    public void selectAllAgent() {
        driver.findElement(By.cssSelector(clickAgents)).click();
        driver.findElement(By.cssSelector(clickSelectAllAgent)).click();
    }

    public void selectAllTeamsAndAgents() {
        driver.findElement(By.cssSelector(clickSelectAllAgent)).click();
    }

    public void selectAllTeams() {
        driver.findElement(By.cssSelector(clickAllTeams)).click();
    }

    public void selectTeamsJulia() {
        driver.findElement(By.cssSelector("div.css-1t8qxa5 > label:nth-child(15) > i")).click();
    }

    public void selectAllMetrics() {
        driver.findElement(By.cssSelector(clickMetrics)).click();
        driver.findElement(By.cssSelector(clickSelectAllMetrics)).click();
    }

    public void selectQueuesJul() {
        driver.findElement(By.xpath("//*[text()='Jul']")).click();
    }

    public void selectReportAgentList() {
        driver.findElement(By.cssSelector(clickReportType)).click();
        driver.findElement(By.xpath("//*[text()='Agent List']")).click();
    }

    public void selectReportAgentListPerHour() {
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(clickReportType)).click();
        driver.findElement(By.xpath("//*[text()='Agent List - Per hour']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Agent List - Per hour']")).click();
    }

    public void selectReportASRByCountry() {
        driver.findElement(By.cssSelector(clickReportType)).click();
        driver.findElement(By.xpath("//*[text()='ASR by country']")).click();
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
    }

    public void selectReportASRByCountryByHour() {
        driver.findElement(By.cssSelector(clickReportType)).click();
        driver.findElement(By.xpath("//*[text()='ASR by country by hour']")).click();
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
    }

    public void selectReportASRPerCallerID() {
        driver.findElement(By.cssSelector(clickReportType)).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[text()='ASR per Caller ID']")).click();
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
    }

    public void selectReportInqueueAbandons() throws InterruptedException {
        driver.findElement(By.cssSelector(clickReportType)).click();
        driver.findElement(By.xpath("//*[text()='Inqueue Abandons']")).isDisplayed();
        driver.findElement(By.xpath("//*[text()='Inqueue Abandons']")).click();
    }

    public void selectReportRedialCountry() throws InterruptedException {
        driver.findElement(By.cssSelector(clickReportType)).click();
        driver.findElement(By.xpath("//*[text()='Redial Counter']")).click();
    }

    public void selectReportSensitiveDataAccessReport() {
        driver.findElement(By.cssSelector(clickReportType)).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[text()='Sensitive Data Access Report']")).click();
    }

    public void valueTotalIsNotZeroASRPerCallerID() {
        String totalCallAttempts = driver.findElement(By.cssSelector(valueTotalIsNotZeroASRPerCallerID)).getText();
        boolean bool = true;
        if (totalCallAttempts.equals("0")) {
            bool = false;
            System.out.println("Total Call Attempts Is Zero");
        } else {
            System.out.println("Total Call Attempts Is Not Zero");
        }
        Assert.assertTrue("WARNING Total Call Attempts = 0", bool);
    }

    public void valueTotalIsNotZeroAgentList() {
        String totalCalls = driver.findElement(By.cssSelector(valueTotalIsNotZeroAgentList)).getText();
        boolean bool = true;
        if (totalCalls.equals("0")) {
            bool = false;
            System.out.println("Total Calls (TC) Is Zero");
        } else {
            System.out.println("Total Calls (TC) Is Not Zero");
        }
        Assert.assertTrue("WARNING Total Calls (TC) = 0", bool);
    }

    public void valueTotalIsNotZeroASRByCountry() {
        String totalAmountOfAttempts = driver.findElement(By.cssSelector(valueTotalIsNotZeroASRByCountry)).getText();
        boolean bool = true;
        if (totalAmountOfAttempts.equals("0")) {
            bool = false;
            System.out.println("Total Amount Of Attempts Is Zero");
        } else {
            System.out.println("Total Amount Of Attempts Is Not Zero");
        }
        Assert.assertTrue("WARNING Total Amount Of Attempts = 0", bool);
    }

    public void valueTotalIsNotZeroASRByCountryByHour() {
        String totalCallAttempts = driver.findElement(By.cssSelector(valueTotalIsNotZeroASRByCountryByHour)).getText();
        boolean bool = true;
        if (totalCallAttempts.equals("0")) {
            bool = false;
            System.out.println("Total Call Attempts Is Zero");
        } else {
            System.out.println("Total Call Attempts Is Not Zero");
        }
        Assert.assertTrue("WARNING Total Call Attempts = 0", bool);
    }

    public void valueTotalIsNotZeroRedialCounter() {
        String callsCount = driver.findElement(By.cssSelector(valueTotalIsNotZeroRedialCounter)).getText();
        boolean bool = true;
        if (callsCount.equals("0")) {
            bool = false;
            System.out.println("Calls count Is Zero");
        } else {
            System.out.println("Calls count Is Not Zero");
        }
        Assert.assertTrue("WARNING Calls count = 0", bool);
    }

    public void valueTotalIsNotSDAR() {
        List<WebElement> radioNamelist = driver
                .findElements(By
                        .cssSelector(valueTotalIsNotSDAR));
        System.out.println("radioNamelist " + radioNamelist.size());
        boolean visible;
        if (radioNamelist.size() <= 0) {
            visible = false;
            System.out.println("Nobody Exported a CSV file");
        } else {
            visible = true;
            System.out.println("Someone Exported a CSV file");
        }
        Assert.assertTrue("WARNING Nobody Exported a CSV file", visible);
    }
}
