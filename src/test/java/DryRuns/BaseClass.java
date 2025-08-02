package DryRuns;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseClass {
	
	
	public static AndroidDriver Capabilities() throws MalformedURLException {
		
		File f = new File("src\\test\\resources\\");
		File fs = new File(f,"ApiDemos-debug.apk");
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("TestPhone");
		options.setApp(fs.getAbsolutePath());
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"),options);
		return driver;
		
		
		
	}

}
