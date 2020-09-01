package Extensions;

import Utilities.commonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class verifications extends commonOps {

    @Step("Verify Text in Element")
    public static void textInElement(WebElement elem, String expectedValue){
        if(platform.equalsIgnoreCase("web"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        if(platform.equalsIgnoreCase("desktop")) {
            // TODO - Only useful on the Calculator Desktop
            assertEquals(elem.getText().replaceAll("Display is", "").trim(), expectedValue);
        } else {
            assertEquals(elem.getText(), expectedValue);
        }
    }

    @Step("Verify Visibility of the Number of Elements to")
    public static void numberOfElements(List <WebElement> elems, int expectedValue){
        wait.until(ExpectedConditions.visibilityOfAllElements(elems));
        assertEquals(elems.size(), expectedValue);
    }

    @Step("Verify Invisibility of the Number of Elements to")
    public static void emptyElementsList(List <WebElement> elems, int expectedValue){
        wait.until(ExpectedConditions.invisibilityOfAllElements(elems));
        assertEquals(elems.size(), expectedValue);
    }

    @Step("Verify Element Visually")
    public static void visualElement(WebElement imageElement, String expectedImageName){
        BufferedImage expectedImage = null;
        try{
            expectedImage = ImageIO.read(new File(getData("ImageRepo") + expectedImageName + ".png"));
        } catch (Exception e){
            System.out.println("Error reading image file: " + e);
        }
        Screenshot imageScreenshot = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver, imageElement);
        BufferedImage actualImage = imageScreenshot.getImage();
        diff = imgDiff.makeDiff(actualImage, expectedImage);
        assertFalse(diff.hasDiff());
    }

    @Step("Verify text with text")
    public static void text(String actualText, String expectedText){
        assertEquals(actualText, expectedText);
    }

}
