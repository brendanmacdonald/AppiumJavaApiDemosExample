package Tests;

import Framework.App;
import Framework.TestBase;
import io.appium.java_client.android.AndroidKeyCode;
import org.testng.annotations.Test;

public class APIDemoTest extends TestBase {

    @Test
    public void testHomeList() {
        App.APIDemoHome().accessibilityOption.click();
        App.driver.pressKeyCode(AndroidKeyCode.BACK);
        App.APIDemoHome().animationOption.click();
        App.driver.pressKeyCode(AndroidKeyCode.BACK);
        App.APIDemoHome().appOption.click();
        App.driver.pressKeyCode(AndroidKeyCode.BACK);
        App.APIDemoHome().contentOption.click();
        App.driver.pressKeyCode(AndroidKeyCode.BACK);
        App.APIDemoHome().graphicsOption.click();
        App.driver.pressKeyCode(AndroidKeyCode.BACK);
        App.APIDemoHome().hardwareOption.click();
        App.driver.pressKeyCode(AndroidKeyCode.BACK);
        App.APIDemoHome().mediaOption.click();
        App.driver.pressKeyCode(AndroidKeyCode.BACK);
    }

    @Test
    public void testAccessibilityNodeQueryingPage() {
        App.APIDemoHome().accessibilityOption.click();
        App.APIDemoAccessibilityList().accessibilityNodeQuerying.click();
        App.APIDemoAccessibilityNodeQueryingPage().takeOutTrash.click();
        App.APIDemoAccessibilityNodeQueryingPage().conquerWorld.click();
        App.APIDemoAccessibilityNodeQueryingPage().doTaxes.click();
        App.driver.pressKeyCode(AndroidKeyCode.BACK);
        App.APIDemoAccessibilityList().accessibilityNodeQuerying.click();
        App.APIDemoAccessibilityNodeQueryingPage().takeOutTrash.click();
        App.driver.pressKeyCode(AndroidKeyCode.BACK);
    }

    @Test
    public void testEditTextPage() {
        App.APIDemoHome().viewsOption.click();
        App.APIDemoViewsList().textOption.click();
        App.APIDemoTextList().editTextOption.click();
        App.APIDemoEditTextPage().editText0.sendKeys("First line of text");
        App.APIDemoEditTextPage().editText1.sendKeys("Second line of text");
        App.driver.pressKeyCode(AndroidKeyCode.BACK);
        App.driver.pressKeyCode(AndroidKeyCode.BACK);
    }
}
