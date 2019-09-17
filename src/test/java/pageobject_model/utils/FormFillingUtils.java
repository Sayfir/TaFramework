package pageobject_model.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static pageobject_model.utils.WaitersUtils.waitUntilClickable;


public class FormFillingUtils {
    public static void fillTextField(WebDriver driver, String locator, WebElement textField, String text) {
        waitUntilClickable(locator, driver);
        textField.click();
        textField.sendKeys(text);
    }

    public static void choosingElementFromDropdown(WebDriver driver, String dropDownLocator, WebElement dropdownWebElement1,
                                                   String dropDownElementLocator,
                                                   WebElement dropDownWebElement2) {
        waitUntilClickable(dropDownLocator, driver);
        dropdownWebElement1.click();
        waitUntilClickable(dropDownElementLocator, driver);
        dropDownWebElement2.click();
    }
}