package part2.com.saucedemo.tests.products;

import com.saucedemo.pages.ProductsPage;
//import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

//test user that can login the app verfie if the products display
public class ProductsTest extends BaseTest {

    @Test
    public void testProductsHeaderIsDisplayed(){
        //if username & password true will go to productspage
        ProductsPage productsPage =  loginPage.
                logIntoApplication("standard_user","secret_sauce");
        //if not showing products header this massage will be after test
        assertTrue(productsPage.isProductsHeaderDisplayed(), "\n Products Header Is Not Displayed \n");
       // Assert.assertTrue(productsPage.isProductsHeaderDisplayed());

    }

}
