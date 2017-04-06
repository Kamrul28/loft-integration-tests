package ui.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.common.TestHelper;

/**
 * Created by KAMRUBY on 4/6/2017.
 */
public class OrderStatusPage extends TestHelper{
    WebDriver driver;
    @FindBy(xpath = "html/body/header/div/div/div[2]/div[1]/a")
    public WebElement clickOnSignInButton;




}
