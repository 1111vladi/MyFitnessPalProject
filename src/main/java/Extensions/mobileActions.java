package Extensions;

import com.google.common.util.concurrent.Uninterruptibles;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class mobileActions extends uiActions{

    @Step("Tap on Element")
    public static void tap(int fingers, MobileElement elem, int duration)
    {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        mobileDriver.tap(fingers, elem, duration);
    }

    @Step("Swipe")
    public static void swipe(int startX, int startY, int endX, int endY, int duration)
    {
        Uninterruptibles.sleepUninterruptibly(500, TimeUnit.MILLISECONDS);
        mobileDriver.swipe(startX, startY, endX ,endY ,duration);
    }

    @Step("Zoom Element")
    public static void zoom(MobileElement elem)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        mobileDriver.zoom(elem);
    }

    @Step("Pinch Element")
    public static void pinch(MobileElement elem)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        mobileDriver.pinch(elem);
    }

    @Step("Execute Script")
    public static void executeScript(String script)
    {
        mobileDriver.executeScript(script);
    }

    /** ----- Mobile ----- */
    @Step("Long Press on Element")
    public static void longPressOnElement(WebElement elem){
        if (!platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elem));
    }

    @Step("Swipe to Element")
    public static void scrollToElement(WebElement elem){
        if (!platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.elementToBeClickable(elem));
    }

}
