package Framework;

import Pages.*;
import io.appium.java_client.android.AndroidDriver;

/* Driver wrapper */
public class App {

    public static AndroidDriver driver;

    public static APIDemoHomeList APIDemoHome() {
        return new APIDemoHomeList();
    }

    public static APIDemoAccessibilityList APIDemoAccessibilityList() {
        return new APIDemoAccessibilityList();
    }

    public static APIDemoAccessibilityNodeQueryingPage APIDemoAccessibilityNodeQueryingPage() {
        return new APIDemoAccessibilityNodeQueryingPage();
    }

    public static APIDemoViewsList APIDemoViewsList() {
        return new APIDemoViewsList();
    }

    public static APIDemoTextList APIDemoTextList() {
        return new APIDemoTextList();
    }

    public static APIDemoEditTextPage APIDemoEditTextPage() {
        return new APIDemoEditTextPage();
    }
}
