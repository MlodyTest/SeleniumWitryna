package tester.tests;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import tester.utils.DriverFactory;

import java.util.concurrent.TimeUnit;

public class BaseTest {

        protected WebDriver driver;

        @BeforeEach
        public void setup() {
            driver = DriverFactory.getDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("http://seleniumdemo.com/");

        }
//        @AfterEach
//        public void tearDown() {
//            driver.quit();
//
//        }


    }
