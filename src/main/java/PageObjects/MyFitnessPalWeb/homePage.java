package PageObjects.MyFitnessPalWeb;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class homePage {

    @FindBy( how = How.CSS, using = "div[class = 'add-buttons'] a[href = '/exercise/diary']")
    public WebElement btn_addExercise;

    @FindBy( how = How.CSS, using = "div[class = 'add-buttons'] a[href = '/food/diary']")
    public WebElement btn_addFood;
}
