package ui.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.common.PageHelper;

/**
 * Created by KAMRUBY on 4/5/2017.
 */
public class ShoppingCartPage extends PageHelper {

    @FindBy(xpath = ".//*[@id='search-toggle']")
    private WebElement searchToggle;
    @FindBy(xpath = "//*[@id='endeca-search-bar-frame']/span/div/input")
    private WebElement searchField;
    @FindBy(xpath = "//*[@id='endeca-search-bar-frame']/a[1]")
    private WebElement lookupLink;
    @FindBy(xpath = "//*[@class='active']//aside")
    private WebElement itemStyleNumText;
    @FindBy(xpath = "//*[@class='l']")
    private WebElement sizeLButton;
    @FindBy(xpath = "//*[@class='colors']//label[1]")
    private WebElement firstColorButton;
    @FindBy(id = "pdp-add-to-bag")
    private WebElement addToBagButton;
    @FindBy(id = "my-bag-icon")
    private WebElement myBagButton;
    @FindBy(xpath = "//*[@class='details']//aside")
    private WebElement cartSytleNumText;
    @FindBy(xpath = "//*[@class='selection']//em[4]")
    private WebElement cartQuantityText;


    public ShoppingCartPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void addToCart(String styleItemNum) throws InterruptedException {
        Thread.sleep(1000); //TODO use explicit wait
        searchToggle.click();
        Thread.sleep(1000); //TODO use explicit wait
        searchField.clear();
        searchField.sendKeys(styleItemNum);
        lookupLink.click();
        Thread.sleep(1000); //TODO use explicit wait
        itemStyleNumText.getText().contains(styleItemNum);
        sizeLButton.click();
        firstColorButton.click();
        Thread.sleep(1000); //TODO use explicit wait
        addToBagButton.click();
        myBagButton.click();
    }

    public String getCartStyleItem() {
        return cartSytleNumText.getText();
    }

    public String getCartQuantity() throws InterruptedException {
        Thread.sleep(1000); //TODO use explicit wait
        return cartQuantityText.getText();
    }


}
