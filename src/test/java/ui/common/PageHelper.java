package ui.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by KAMRUBY on 4/5/2017.
 */
public class PageHelper {

    private WebDriver driver;

    public PageHelper(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void rejectPromoPopup() {
        String parentWindow = driver.getWindowHandle();
        String popupWindow = null;
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()) {
            popupWindow = iterator.next();
        }
        try {
            //change to popup window
            driver.switchTo().window(popupWindow);
            driver.findElement(By.xpath("bx-close-link")).click();
        } catch (Exception e) {
        }
        //change back to parent window
        driver.switchTo().window(parentWindow);
    }

}
