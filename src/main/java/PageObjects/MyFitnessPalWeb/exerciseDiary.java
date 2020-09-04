package PageObjects.MyFitnessPalWeb;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class exerciseDiary {

    @FindBy( how = How.XPATH, using = "//a[@href = '/exercise/add_to_diary?type=cardio']")
    public WebElement btn_cardiovascularAddExercise;

    @FindBy( how = How.XPATH, using = "//a[@href = '#quick_tools_0']")
    public WebElement btn_cardiovascularQuickTools;

    @FindBy( how = How.XPATH, using = "//a[@href = '/exercise/add_to_diary?type=strength']")
    public WebElement btn_strengthTrainingAddExercise;

    @FindBy( how = How.XPATH, using = "//a[@href = '#quick_tools_1']")
    public WebElement btn_strengthTrainingQuickTools;

    @FindBy( how = How.XPATH, using = "//table[2][@class = 'table0']//a[contains(text(), 'Deadlift, Straight Leg')]")
    public WebElement txt_exerciseName;

    @FindBy( how = How.XPATH, using = "//table[2][@class = 'table0']//tbody/tr//i[@class = 'icon-minus-sign']")
    public List <WebElement> rows_deleteStrengthExercise;

    @FindBy( how = How.XPATH, using = "//table[1][@class = 'table0']//tbody/tr//i[@class = 'icon-minus-sign']")
    public List <WebElement> rows_deleteCardiovascularExercise;

    @FindBy( how = How.XPATH, using = "//table[2][@class = 'table0']//tbody//td[@class = 'first alt']")
    public List <WebElement> rows_exercises;
}
