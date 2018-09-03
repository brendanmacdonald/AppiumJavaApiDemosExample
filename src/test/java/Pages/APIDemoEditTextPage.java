package Pages;

import Framework.AppControl;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Google 'Image' page
 */
public class APIDemoEditTextPage {

    public APIDemoEditTextPage() {
        /* Empty constructor */
    }

    // Elements.
    public AppControl editText0 = new AppControl(By.id("com.example.android.apis:id/edit0"));
    public WebElement editText1 = new AppControl(By.id("android:id/content")).findElement(MobileBy.AndroidUIAutomator("new UiSelector().index(3)"));
}
