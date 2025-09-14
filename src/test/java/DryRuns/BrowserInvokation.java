package DryRuns;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.AndroidDriver;

public class BrowserInvokation extends BrowserClass {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException  {
		AndroidDriver driver = Capabilities("Emulator");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(130));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.hideKeyboard();
		WebElement Login = driver.findElement(By.xpath("//button[@type='submit']"));
		wait.until(ExpectedConditions.elementToBeClickable(Login));
		Login.click();
		System.out.println(driver.getTitle());
		System.out.println("Clicked");
	}

}
