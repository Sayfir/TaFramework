package pageobject_model.utils;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SwitchingToFrameUtils {
    public static void switchToFrame(WebDriver driver, int frameNumber) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().
                frame(frameNumber);
    }
}
