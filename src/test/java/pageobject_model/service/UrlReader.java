package pageobject_model.service;

import pageobject_model.model.Url;

public class UrlReader {

    public static final String TESTDATA_HOMEPAGE_URL = "testdata.homepage.url";

    public static Url getHomePageUrl() {
        return new Url(TESTDATA_HOMEPAGE_URL);
    }
}
