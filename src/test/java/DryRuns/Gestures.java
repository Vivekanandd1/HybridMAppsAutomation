package DryRuns;

import java.net.MalformedURLException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.appium.java_client.android.AndroidDriver;

public class Gestures extends BaseClass{
      
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver driver = Capabilities();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']")).click();
		
		/*Tap action*/
		WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		 Actions Act = new Actions(driver);
		 Act.clickAndHold(element).pause(Duration.ofSeconds(2)).release().perform();
		 Thread.sleep(1000);
		 System.out.println(driver.findElement(By.id("android:id/title")).isDisplayed());
		   
		
	}
}
