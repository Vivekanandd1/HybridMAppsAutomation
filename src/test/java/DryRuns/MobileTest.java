package DryRuns;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class MobileTest extends BaseClass {
	
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver driver = Capabilities();
		 driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		 driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
		 driver.findElement(By.id("android:id/checkbox")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		 driver.findElement(By.className("android.widget.EditText")).sendKeys("VivekVats");
		 driver.findElements(By.className("android.widget.Button")).get(1).click();
	}

}
