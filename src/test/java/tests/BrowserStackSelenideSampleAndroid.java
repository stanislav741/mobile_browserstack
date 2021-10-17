package tests;

import com.codeborne.selenide.Configuration;
import drivers.BrowserstackMobileDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;

public class BrowserStackSelenideSampleAndroid {

    @Test
    void searchTest() {

        Configuration.browser = BrowserstackMobileDriver.class.getName();
        Configuration.startMaximized = false;
        Configuration.browserSize = null;
        Configuration.timeout = 10000;

    open();
    $(MobileBy.AccessibilityId("Search Wikipedia")).click();
    $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).val("BrowserStack");
    $$(MobileBy.id("org.wikipedia.alpha:id/page_list_item_container")).shouldHave(sizeGreaterThan(0));

    closeWebDriver();
    }
}
