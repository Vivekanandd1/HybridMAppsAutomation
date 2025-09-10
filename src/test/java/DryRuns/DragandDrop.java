package DryRuns;
import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.appium.java_client.android.AndroidDriver;

public class DragandDrop extends BaseClass {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver driver = Capabilities();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Drag and Drop']")).click();
		Actions Act = new Actions(driver);
		WebElement Source = driver.findElement(By.xpath("//android.view.View[@resource-id='io.appium.android.apis:id/drag_dot_3']"));
		WebElement Destination = driver.findElement(By.xpath("//android.view.View[@resource-id='io.appium.android.apis:id/drag_dot_2']"));
				
		Act.clickAndHold(Source).pause(Duration.ofSeconds(2)).moveToElement(Destination).release().build().perform();
		
		
	}


}
