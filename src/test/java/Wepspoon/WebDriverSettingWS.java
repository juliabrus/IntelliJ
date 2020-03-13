package Wepspoon;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettingWS {

    public ChromeDriver driver;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/juliebr/Desktop/driver/chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void close() {
        //закрыть браузер
//        driver.quit();
    }
}
