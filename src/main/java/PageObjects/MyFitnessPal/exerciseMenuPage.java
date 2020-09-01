package PageObjects.MyFitnessPal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class exerciseMenuPage {

    @FindBy( how = How.XPATH, using = "//div[@id= 'subNav-bg']//a[contains(text(), 'Exercise Diary')]")
    public WebElement btn_exerciseDiary;

    @FindBy( how = How.XPATH, using = "//div[@id= 'subNav-bg']//a[contains(text(), 'Database')]")
    public WebElement btn_database;

    @FindBy( how = How.XPATH, using = "//div[@id= 'subNav-bg']//a[contains(text(), 'My Exercises')]")
    public WebElement btn_myExercise;

    @FindBy( how = How.XPATH, using = "//div[@id= 'subNav-bg']//a[contains(text(), 'Settings')]")
    public WebElement btn_settings;
}
