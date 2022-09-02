package tester.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import tester.pages.HomePage;

public class RegisterTest extends BaseTest {

    @Test
    public void registerTest() {

        int random = (int) (Math.random() * 1000);

        WebElement dashboardLink = new HomePage(driver).openMyAccountPage()
                .registerUserValidData("test" + random + "tes@mlody12345.pl", "test@tklomldas")
                .getDashboardLink();


        Assert.assertEquals(dashboardLink.getText(), "Dashboard");

    }

    @Test
    public void registerUserWithSameEmailTest() {

        WebElement error = new HomePage(driver)
                .openMyAccountPage()
                .registerUserInvalidData("tes@mlody12345.pl", "test@tklomldas")
                .getError();

        Assert.assertTrue(error.getText().contains("An account is already registered with your email address"));


    }
}