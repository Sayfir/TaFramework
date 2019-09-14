package pageobject_model.page;

import org.openqa.selenium.WebDriver;
import pageobject_model.driver.DriverSingleton;

public abstract class DriverContainer {
    public WebDriver driver = DriverSingleton.getDriver();
}