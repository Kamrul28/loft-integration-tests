package ui.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import ui.common.PageHelper;

/**
 * Created by KAMRUBY on 4/5/2017.
 */
public class SignInPage extends PageHelper {
    WebDriver driver;
    @FindBy(xpath = "html/body/header/div/div/div[2]/div[1]/div/a[1]")
    private WebElement clickOnSignInPageLink;
    @FindBy(id = "login-submit")
    private WebElement clickOnsignInPageSignInButton;
    @FindBy(xpath = "html/body/main/section/form[1]/fieldset/label[1]/span/span")
    private WebElement emailFieldvaliedtionerror;
    @FindBy(xpath = "html/body/header/div/div/div[2]/div[1]/a")
    private WebElement mainSignInLink;
    @FindBy(xpath = "/html/body/header/div/div/div[2]/div[1]/div/a[1]")
    private WebElement subSignInLink;

    public SignInPage(WebDriver webDriver) {
        super(webDriver);
        this.driver = webDriver;
    }


    public void navigateToSignInPage() {
        try {
            Thread.sleep(2000); //TODO use global explicit wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Handling mouse over in drop down
        Actions actions = new Actions(driver);  //TODO move this to global
        actions.moveToElement(mainSignInLink).perform();
        actions.moveToElement(subSignInLink).click().build().perform();
    }


    public String verifySignInPage() {
        try {
            Thread.sleep(1000); //TODO use global explicit wait
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOnsignInPageSignInButton.click();
        return emailFieldvaliedtionerror.getText();
    }

}
