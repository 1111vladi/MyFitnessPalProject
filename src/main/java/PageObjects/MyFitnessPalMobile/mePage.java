package PageObjects.MyFitnessPalMobile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class mePage {

    @FindBy(how = How.ID, using = "toolbarUsername")
    public WebElement txt_userName;

}
