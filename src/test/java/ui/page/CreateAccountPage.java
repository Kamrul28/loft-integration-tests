package ui.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.common.PageHelper;
import ui.common.TestHelper;

/**
 * Created by kamru on 5/8/2017.
 */
public class CreateAccountPage extends PageHelper {
    WebDriver driver;

    @FindBy(xpath = "html/body/header/div/div/div[2]/div[1]")
    public WebElement onSignInButton;
    @FindBy(xpath = "html/body/header/div/div/div[2]/div[1]/div/a[2]")
    public WebElement createAccountButton;
    @FindBy(id = "firstName")
    public WebElement fNameField;
    @FindBy(id = "lastName")
    public WebElement lNameField;
    @FindBy(id = "emailAddress")
    public WebElement eMailAddressField;
    @FindBy(id = "password")
    public WebElement passWordField;
    @FindBy (name = "confirmPassword")
    public WebElement confirmPasswordField;
    @FindBy(xpath = "html/body/main/section/form[2]/fieldset/label[6]/div")
    public WebElement reciveEmailRadioButton;
    @FindBy(xpath = "html/body/main/section/form[2]/fieldset/div[2]/input")
    public WebElement submitButton;

    public CreateAccountPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void nagivateTocreateAccountPage() throws InterruptedException{
        Thread.sleep(1000);
        onSignInButton.click();
        Thread.sleep(1000);
        createAccountButton.click();
        Thread.sleep(1000);
        fNameField.sendKeys("Jason");
        Thread.sleep(1000);
        lNameField.sendKeys("Butler");
        Thread.sleep(1000);
        eMailAddressField.sendKeys("Google123@gmail.com");
        Thread.sleep(1000);
        passWordField.sendKeys("Testing123");
        Thread.sleep(1000);
        confirmPasswordField.sendKeys("Testing123");
        Thread.sleep(1000);
        reciveEmailRadioButton.click();
        Thread.sleep(1000);
        submitButton.click();




    }


}
