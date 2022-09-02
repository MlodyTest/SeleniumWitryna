package tester.tests;

import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import tester.models.Customer;
import tester.pages.HomePage;
import tester.pages.OrderDetailsPage;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutTest() {
        Customer customer = new Customer();

        OrderDetailsPage orderDetailsPage = new HomePage(driver)
                .openShopPage()
                .openProduct("Java Selenium WebDriver")
                .adProductToCart()
                .viewCart()
                .openAdressDetalies()
                .fillAddressDetails(customer, "some random coments");


        Assert.assertEquals(orderDetailsPage.
                getOrderNotice().getText(),"Thank you. Your order has been received.");

    }

}



