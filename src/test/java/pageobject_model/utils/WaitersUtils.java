package pageobject_model.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitersUtils {
    public static void waitUntilClickable(String locator, WebDriver driver) {
        new WebDriverWait(driver, 15)
                .until(ExpectedConditions
                        .elementToBeClickable(By.xpath(locator)));
    }
}
