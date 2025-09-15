package DryRuns;

import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BrowserClass {

	public static AndroidDriver Capabilities(String Device) throws MalformedURLException {

		UiAutomator2Options options = new UiAutomator2Options().setAutomationName("UiAutomator2");
		options.setCapability("ignoreHiddenApiPolicyError", true);
		options.setCapability("chromedriver_autodownload", true);

		options.withBrowserName("Chrome").setChromedriverExecutable("");

		if (Device.equalsIgnoreCase("Emulator")) {
			options.setDeviceName("TestPhone");

		} else if (Device.equalsIgnoreCase("Real")) {
			options.setDeviceName("Android Device");
		} else {
			System.out.println("Wrong String passed in Capabiltiies method");
		}

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);

		return driver;

	}

}
