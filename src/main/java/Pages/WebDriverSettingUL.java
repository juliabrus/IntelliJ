package Pages;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverSettingUL {

    public static ChromeDriver driver;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/juliebr/Desktop/driver/chromedriver");
        driver = new ChromeDriver();
        //maximum browser window size
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        openBrowserPage();

    }

    @After
    public void close() {

//        driver.quit();
    }

    private void openBrowserPage() {
        driver.get("https://callcenter.unitedline.net/");
        driver.findElement(By.cssSelector("#user_email")).click();
        driver.findElement(By.cssSelector("#user_email")).sendKeys(("testjulia@testjulia.com"));
        driver.findElement(By.cssSelector("#user_password")).click();
        driver.findElement(By.cssSelector("#user_password")).sendKeys(("testjulia@testjulia.com"));
        driver.findElement(By.cssSelector("#new_user > div.actions > input")).click();
    }
}
