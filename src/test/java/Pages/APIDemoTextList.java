package Pages;

import Framework.AppControl;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Google 'Image' page
 */
public class APIDemoTextList {

    public APIDemoTextList() {
        /* Empty constructor */
    }

    // Options.
    public WebElement editTextOption = new AppControl(By.id("android:id/list")).findElement(MobileBy.AndroidUIAutomator("new UiSelector().index(0)"));

}
