package PageObjects.MyFitnessPalMobile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class addWaterPage {

    @FindBy(how = How.ID, using = "quick_pick_1")
    public WebElement btn_add1Cup;

    @FindBy(how = How.XPATH, using = "//*[@class='android.widget.TextView' and @x = '912' and @y = '84']")
    public WebElement btn_confirm;

    @FindBy(how = How.ID, using = "water_value")
    public WebElement txt_addWater;



}
