package ui.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ui.common.PageHelper;
import ui.common.TestHelper;
import ui.page.CreateAccountPage;

/**
 * Created by kamru on 5/8/2017.
 */
public class CreateAccountTest extends TestHelper{
    WebDriver driver;
    @Test
    public void VerifyCreateAccountPage() throws InterruptedException{
        CreateAccountPage createAccountPage =  PageFactory.initElements(driver,CreateAccountPage.class);
    }


}
