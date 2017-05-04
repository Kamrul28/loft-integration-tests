package ui.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import ui.common.TestHelper;
import ui.page.ShoppingCartPage;

import static org.junit.Assert.assertEquals;

/**
 * Created by KAMRUBY on 4/5/2017.
 */
public class ShoppingCartTest extends TestHelper {

    @Test
    public void verifyShoppingCart() throws InterruptedException {
        String itemNum = "#432952";
        ShoppingCartPage shoppingCartPage = PageFactory.initElements(driver, ShoppingCartPage.class);
        shoppingCartPage.addToCart(itemNum);
        assertEquals("STYLE " + itemNum, shoppingCartPage.getCartStyleItem());
        assertEquals("1", shoppingCartPage.getCartQuantity());
    }


}
