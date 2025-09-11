package DryRuns;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.appium.java_client.android.AndroidDriver;

public class SwipeGesture extends BaseClass {
	
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver driver = Capabilities("Real");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Date Widgets']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='2. Inline']")).click();
		Actions Act = new Actions(driver);
		driver.findElement(By.xpath("//*[@content-desc='9']")).click();
		WebElement First = driver.findElement(By.xpath("//*[@content-desc='15']"));
		WebElement Second = driver.findElement(By.xpath("//*[@content-desc='45']"));
		Act.clickAndHold(First).pause(Duration.ofSeconds(2)).moveToElement(Second).release().perform();
		
	
	}

}
