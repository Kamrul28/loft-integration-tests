package ui.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.common.PageHelper;

/**
 * Created by KAMRUBY on 4/5/2017.
 */
public class SignInPage extends PageHelper {
    WebDriver driver;
    @FindBy(xpath ="html/body/header/div/div/div[2]/div[1]/div/a[1]")
    private WebElement clickOnSignInPageLink;
    @FindBy(id = "login-submit")
    private WebElement clickOnsignInPageSignInButton;
    @FindBy(xpath = "html/body/main/section/form[1]/fieldset/label[1]/span/span")
    private WebElement emailFieldvaliedtionerror;




    public SignInPage(WebDriver webDriver) {
        super(webDriver);
    }
    public String verifySignInPage(){
        clickOnSignInPageLink.click();
        clickOnsignInPageSignInButton.click();
        return emailFieldvaliedtionerror.getText();
    }

}
