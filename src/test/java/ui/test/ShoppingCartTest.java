package ui.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import ui.common.TestHelper;
import ui.page.ShoppingCartPage;

/**
 * Created by KAMRUBY on 4/5/2017.
 */
public class ShoppingCartTest extends TestHelper {

    @Test
    public void verifyShoppingCart() {
        ShoppingCartPage shoppingCartPage = PageFactory.initElements(driver, ShoppingCartPage.class);
        shoppingCartPage.addToCart("#432952");
        Assert.assertEquals("#432952", shoppingCartPage.getCartStyleItem());
        Assert.assertEquals("1", shoppingCartPage.getCartQuantity());
    }


}
