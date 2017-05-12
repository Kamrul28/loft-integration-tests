package ui.test;

import org.junit.Assert;
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
    @Test
    public void confirmPasswordFieldValidation() throws InterruptedException{
        CreateAccountPage createAccountPage =  PageFactory.initElements(driver,CreateAccountPage.class);
        //navigate to create account page
        createAccountPage.navigateToCreateAccountPage();

        // enter name, email, pass, conf pass, click submit
        createAccountPage.submitCreateAccountForm();

        //verify field validation errorSt
        String actulError =  createAccountPage.getConfirmPasswordFieldError();
        Assert.assertEquals("Password and confirm password entries do not match",actulError);
    }


}
