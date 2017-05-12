package ui.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import ui.common.PageHelper;

/**
 * Created by kamru on 5/8/2017.
 */
public class CreateAccountPage extends PageHelper {
    WebDriver driver;

    @FindBy(xpath = "html/body/header/div/div/div[2]/div[1]/a")
    private WebElement signInList;
    @FindBy(xpath = "html/body/header/div/div/div[2]/div[1]/div/a[2]")
    private WebElement createAccountButton;
    @FindBy(id = "firstName")
    private WebElement fNameField;
    @FindBy(id = "lastName")
    private WebElement lNameField;
    @FindBy(xpath = "html/body/main/section/form[2]/fieldset/label[3]/input")
    private WebElement eMailAddressField;
    @FindBy(id = "password")
    private WebElement passWordField;
    @FindBy (name = "confirmPassword")
    private WebElement confirmPasswordField;
    @FindBy(xpath = "html/body/main/section/form[2]/fieldset/label[6]/div")
    private WebElement reciveEmailCheckBOx;
    @FindBy(xpath = "html/body/main/section/form[2]/fieldset/div[2]/input")
    private WebElement submitButton;

    public CreateAccountPage(WebDriver webDriver) {
        super(webDriver);
        this.driver = webDriver;
    }

    public void navigateToCreateAccountPage() throws InterruptedException {
        Thread.sleep(1000);
        Actions action = new Actions(driver);
        action.moveToElement(signInList).perform();
        action.moveToElement(createAccountButton).click().build().perform();
    }

    public void submitCreateAccountForm() throws InterruptedException{
        Thread.sleep(1000);
        fNameField.sendKeys("Jason");
        lNameField.sendKeys("Butler");
        eMailAddressField.sendKeys("google123@email.com");
        passWordField.sendKeys("Testing123");
        confirmPasswordField.sendKeys("Fake123");
        Thread.sleep(1000);
        reciveEmailCheckBOx.click();
        Thread.sleep(1000);
        submitButton.click();
    }

    public String getConfirmPasswordFieldError() throws InterruptedException {
        Thread.sleep(1000);
        return driver.findElement(By.xpath("//*[@class='validation-error error']/span")).getText();
    }


}
