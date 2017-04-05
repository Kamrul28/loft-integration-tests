package ui.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import ui.common.PageHelper;
import ui.common.TestHelper;
import ui.page.SignInPage;

/**
 * Created by KAMRUBY on 4/5/2017.
 */
public class SignInPageTest extends TestHelper{
    @Test
    public void verifySignInPage(){
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
        Assert.assertEquals("Please enter your email address",signInPage.verifySignInPage());
    }
}
