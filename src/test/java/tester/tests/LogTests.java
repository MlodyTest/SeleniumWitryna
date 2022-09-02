package tester.tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import tester.pages.HomePage;

public class LogTests extends BaseTest {

    @Test
    public void logInTest() {

        WebElement dashboardLink = new HomePage(driver)
                .openMyAccountPage()
                .logInValidData("tes@mlody12345.pl", "test@tklomldas")
                .getDashboardLink();

        Assert.assertEquals(dashboardLink.getText(), "Dashboard");

    }

    @Test
    public void logInWithInvalidPasswordTest() {

        WebElement error = new HomePage(driver)
                .openMyAccountPage()
                .logInInvalidData("tes@mlody12345.pl", "tek@tklomldas")
                .getError();

        Assert.assertTrue(error.getText().contains("Incorrect username or password"));


    }
}