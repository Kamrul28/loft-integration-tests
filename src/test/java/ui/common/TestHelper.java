package ui.common;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by KAMRUBY on 4/5/2017.
 */
public class TestHelper {

    public static WebDriver driver;

    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> pref = new HashMap<String, Object>();
        pref.put("profile.default_content_settings.popups", 0);
        pref.put("credentials_enable_service", false);
        pref.put("password_manager_enabled", false);
        options.addArguments("disable-extensions");
        options.setExperimentalOption("prefs", pref);
        options.addArguments("disable-infobars");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        System.setProperty("webdriver.chrome.driver", "C:\\apps\\chromedriver.exe");
        driver = new ChromeDriver(capabilities);
        driver.manage().window().maximize();
        driver.get("https://www.loft.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // default 90

        //if promo popup display
        try {
            driver.switchTo().activeElement();
            driver.findElement(By.xpath("//*[@class='bx-close-link']")).click();
        } catch (Exception e) {

        }
    }

    @After
    public void tearDown() {
        driver.quit();
    }


}
