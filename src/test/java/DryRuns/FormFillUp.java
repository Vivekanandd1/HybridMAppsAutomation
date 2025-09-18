package DryRuns;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class FormFillUp extends BaseClass1 {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Margo");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));")).click();

        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();



        
	}

}
