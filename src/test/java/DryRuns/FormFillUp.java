package DryRuns;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"))
				.click();

		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

		/* Code for checking negative scenarios toast message */
//        String ToastMsg = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
//        System.out.println(ToastMsg);
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView("
				+ "new UiSelector().text(\"Jordan Lift Off\"));"));

		int count = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();

			if (text.equalsIgnoreCase("Jordan Lift Off")) {

				driver.findElement(By.id("com.androidsample.generalstore:id/productAddCart")).click();
				break;
			}

		}
		
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		

		driver.findElement(By.className("android.widget.CheckBox")).click();
		
	}

}
