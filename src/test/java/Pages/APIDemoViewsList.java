package Pages;

import Framework.AppControl;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Google 'Image' page
 */
public class APIDemoViewsList {

    public APIDemoViewsList() {
        /* Empty constructor */
    }

    // Options.
    public WebElement textOption = new AppControl(By.id("android:id/list")).findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Text\").instance(0))"));
}
