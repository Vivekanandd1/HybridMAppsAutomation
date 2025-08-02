package DryRuns;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class MobileTest extends BaseClass {
	
	
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver driver = Capabilities();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
	}

}
