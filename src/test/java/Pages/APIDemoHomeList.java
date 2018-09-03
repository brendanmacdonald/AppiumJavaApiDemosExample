package Pages;

import Framework.App;
import Framework.AppControl;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Google 'Image' page
 */
public class APIDemoHomeList {

    public APIDemoHomeList() {
        /* Empty constructor */
    }

    // Options.
    //public WebElement accessibilityOption = new AppControl(By.id("android:id/list")).findElement(MobileBy.AndroidUIAutomator("new UiSelector().index(0)"));
    public WebElement accessibilityOption = App.driver.findElement(By.id("android:id/list")).findElement(MobileBy.AndroidUIAutomator("new UiSelector().index(0)"));
    public WebElement animationOption = new AppControl(By.id("android:id/list")).findElement(MobileBy.AndroidUIAutomator("new UiSelector().index(1)"));
    public WebElement appOption = new AppControl(By.id("android:id/list")).findElement(MobileBy.AndroidUIAutomator("new UiSelector().index(2)"));
    public WebElement contentOption = new AppControl(By.id("android:id/list")).findElement(MobileBy.AndroidUIAutomator("new UiSelector().index(3)"));
    public WebElement graphicsOption = new AppControl(By.id("android:id/list")).findElement(MobileBy.AndroidUIAutomator("new UiSelector().index(4)"));
    public WebElement hardwareOption = new AppControl(By.id("android:id/list")).findElement(MobileBy.AndroidUIAutomator("new UiSelector().index(5)"));
    public WebElement mediaOption = new AppControl(By.id("android:id/list")).findElement(MobileBy.AndroidUIAutomator("new UiSelector().index(6)"));
    public WebElement nfcOption = new AppControl(By.id("android:id/list")).findElement(MobileBy.AndroidUIAutomator("new UiSelector().index(7)"));
    public WebElement osOption = new AppControl(By.id("android:id/list")).findElement(MobileBy.AndroidUIAutomator("new UiSelector().index(8)"));
    public WebElement preferenceOption = new AppControl(By.id("android:id/list")).findElement(MobileBy.AndroidUIAutomator("new UiSelector().index(9)"));
    public WebElement securityOption = new AppControl(By.id("android:id/list")).findElement(MobileBy.AndroidUIAutomator("new UiSelector().index(10)"));
    public WebElement viewsOption = new AppControl(By.id("android:id/list")).findElement(MobileBy.AndroidUIAutomator("new UiSelector().index(11)"));

}
