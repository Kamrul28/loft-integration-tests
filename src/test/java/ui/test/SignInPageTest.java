package ui.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import ui.common.TestHelper;
import ui.page.SignInPage;

/**
 * Created by KAMRUBY on 4/5/2017.
 */
public class SignInPageTest extends TestHelper {
    @Test
    public void verifySignInPage() {
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
        signInPage.navigateToSignInPage();
        Assert.assertEquals("Please enter your email address", signInPage.verifySignInPage());
    }

    //TODO write test for create account fields validations
    //TODO create test suite

}
