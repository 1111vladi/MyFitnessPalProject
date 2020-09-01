package PageObjects.MyFitnessPal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class exerciseDiaryAddExercise {

    // Searching
    @FindBy(how = How.ID, using = "search")
    public WebElement input_searchExercise;

    @FindBy(how = How.CSS, using = "#searchFoodByName .button")
    public WebElement btn_searchExercise;

    // Exercises Names
    @FindBy(how = How.XPATH, using = "//ul[@id= 'matching']//a[contains(text(), 'Deadlift')]")
    public WebElement txt_deadLift;

    // Adding Parameters
    @FindBy(how = How.ID, using = "exercise_entry_sets")
    public WebElement input_numbersOfSets;

    @FindBy(how = How.ID, using = "exercise_entry_quantity")
    public WebElement input_repetitionsPerSet;

    @FindBy(how = How.ID, using = "exercise_entry_weight")
    public WebElement input_weightPerSet;

    @FindBy(how = How.ID, using = "update_exercise")
    public WebElement btn_addExercise;


}
