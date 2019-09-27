package pageobject_model.page;

import org.openqa.selenium.WebDriver;

import static pageobject_model.service.UrlReader.TESTDATA_HOMEPAGE_URL;

public class CloudGoogleHomePage extends BasePage {

    public CloudGoogleHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public CloudGoogleHomePage openPage() {
        driver.get(TESTDATA_HOMEPAGE_URL);
        driver.manage().window().maximize();
        return this;
    }

    protected BasePage initElements() {
        return this;
    }
}