package Extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import Utilities.commonOps;

public class uiActions extends commonOps {

    /** ----- Web ----- */
    @Step("Click on Element")
    public static void click(WebElement elem){
        if (platform.equalsIgnoreCase("web"))
            wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }

    @Step("Click on Element")
    public static void clearText(WebElement elem){
        if (!platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.clear();
    }

    @Step("Send Text to Text-Field")
    public static void updateText(WebElement elem, String value){
        if (!platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(value);
    }

    @Step("Update DropDown Field ")
    public static void updateDropDown(WebElement elem, String value){
        if (!platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        Select myValue = new Select(elem);
        myValue.selectByVisibleText(value);
    }

    @Step("Mouse Hover to Element")
    public static void mouseHoverElements(WebElement startElem, WebElement endElem){
        if (!platform.equalsIgnoreCase("mobile"))
            wait.until(ExpectedConditions.visibilityOf(startElem));
        action.moveToElement(startElem).moveToElement(endElem).click().build().perform();
    }

}
