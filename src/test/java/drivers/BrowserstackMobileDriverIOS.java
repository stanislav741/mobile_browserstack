package drivers;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackMobileDriverIOS implements WebDriverProvider {

    public static URL getBrowserstackURLiOS() {
        try {
            return new URL("http://hub.browserstack.com/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {

        // Set your access credentials
        desiredCapabilities.setCapability("browserstack.user", "stanislav_1VMLq5");
        desiredCapabilities.setCapability("browserstack.key", "sYsMVx7uqgucREFWsyvV");

        // Set URL of the application under test
        desiredCapabilities.setCapability("app", "bs://444bd0308813ae0dc236f8cd461c02d3afa7901d");

        // Specify device and os_version for testing
        desiredCapabilities.setCapability("device", "iPhone 12 Mini");
        desiredCapabilities.setCapability("os_version", "14");

        // Set other BrowserStack capabilities
        desiredCapabilities.setCapability("project", "First Java Project");
        desiredCapabilities.setCapability("build", "Java iOS");
        desiredCapabilities.setCapability("name", "first_test");

        return new IOSDriver(getBrowserstackURLiOS(), desiredCapabilities);
    }
}