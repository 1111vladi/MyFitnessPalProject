package PageObjects.MyFitnessPalMobile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class premiumAfterLoginPage {

    @FindBy(how = How.CLASS_NAME, using = "android.widget.ImageButton")
    public WebElement btn_returnHome;


}
