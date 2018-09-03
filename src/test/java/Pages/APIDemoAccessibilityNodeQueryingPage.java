package Pages;

import Framework.AppControl;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Google 'Image' page
 */
public class APIDemoAccessibilityNodeQueryingPage {

    public APIDemoAccessibilityNodeQueryingPage() {
        /* Empty constructor */
    }

    // Accessibility options
    public WebElement takeOutTrash = new AppControl(By.id("android:id/list")).findElement(MobileBy.AndroidUIAutomator("new UiSelector().index(0)")).findElement(By.className("android.widget.CheckBox"));
    public WebElement conquerWorld = new AppControl(By.id("android:id/list")).findElement(MobileBy.AndroidUIAutomator("new UiSelector().index(2)")).findElement(By.className("android.widget.CheckBox"));
    public WebElement doTaxes = new AppControl(By.id("android:id/list")).findElement(MobileBy.AndroidUIAutomator("new UiSelector().index(4)")).findElement(By.className("android.widget.CheckBox"));
}
