package DryRuns;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;


public class UiAutomator extends BaseClass{
	
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver driver = Capabilities();
		driver.findElement(AppiumBy.androidUIAutomator("text(\"Views\")")).click();

      
	

	}

}
