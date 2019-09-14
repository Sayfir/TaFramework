package pageobject_model.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pageobject_model.driver.DriverSingleton;
import pageobject_model.page.*;

import java.awt.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest extends DriverContainer {

    @BeforeClass(alwaysRun = true)
    public void setUp() throws InterruptedException, IOException, AWTException {
        DriverSingleton.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        new CloudGoogleHomePage(driver).openPage();
        new CloudGoogleProductsPage(driver).openPage();
        new CloudGooglePricingPage(driver).openPage();
        new CloudGoogleCalculatorPage(driver).openPage().fillForm();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        DriverSingleton.closeDriver();
    }
}