package PageObjects.MyFitnessPalMobile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class homePage {

    @FindBy(how = How.XPATH, using = "//*[@text='Home']")
    public WebElement btn_home;

    @FindBy(how = How.XPATH, using = "//*[@text='Diary']")
    public WebElement btn_diary;

    @FindBy(how = How.XPATH, using = "//*[@text='Recipes']")
    public WebElement btn_recipes;

    @FindBy(how = How.XPATH, using = "//*[@text='Plans']")
    public WebElement btn_plans;

    @FindBy(how = How.XPATH, using = "//*[@text='Me']")
    public WebElement btn_me;


}
