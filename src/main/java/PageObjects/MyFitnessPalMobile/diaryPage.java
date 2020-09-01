package PageObjects.MyFitnessPalMobile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class diaryPage {

    @FindBy(how = How.XPATH, using = "//*[@text='Add Water']")
    public WebElement btn_addWater;

    @FindBy(how = How.XPATH, using = "//*[@class='android.widget.RelativeLayout']/*[@id = 'txtItemDetails']")
    public WebElement txt_addedWater;

    @FindBy(how = How.XPATH, using = "//*[@text='Delete Entry']")
    public WebElement btn_deleteEntry;







}
