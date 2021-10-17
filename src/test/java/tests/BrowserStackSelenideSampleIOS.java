package tests;

        import com.codeborne.selenide.Configuration;
        import drivers.BrowserstackMobileDriverIOS;
        import io.appium.java_client.ios.IOSElement;
        import org.junit.jupiter.api.Test;

        import io.appium.java_client.MobileBy;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;

        import static com.codeborne.selenide.Condition.text;
        import static com.codeborne.selenide.Selenide.*;

public class BrowserStackSelenideSampleIOS {

    @Test
    void searchTest() {

        Configuration.browser = BrowserstackMobileDriverIOS.class.getName();
        Configuration.startMaximized = false;
        Configuration.browserSize = null;
        Configuration.timeout = 10000;

        open();

        // Test case for the BrowserStack sample iOS app.
        // If you have uploaded your app, update the test case here.
//        IOSElement textButton = (IOSElement) new WebDriverWait(driver, 30).until(
//                ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Button")));
//        textButton.click();
        $(MobileBy.AccessibilityId("Text Button")).click();

//        IOSElement textInput = (IOSElement) new WebDriverWait(driver, 30).until(
//                ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Input")));
//        textInput.sendKeys("hello@browserstack.com");
        $(MobileBy.AccessibilityId("Text Input")).val("hello@browserstack.com");

//        Thread.sleep(5000);
//        IOSElement textOutput = (IOSElement) new WebDriverWait(driver, 30).until(
//                ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Output")));
//
//        if(textOutput != null && textOutput.getText().equals("hello@browserstack.com"))
//            assert(true);
//        else
//            assert(false);

//        $(MobileBy.AccessibilityId("Text Output")).shouldHave(text("hello@browserstack.com"));

        closeWebDriver();

    }

}