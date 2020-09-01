package PageObjects.MyFitnessPal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPage {

    @FindBy( how = How.CLASS_NAME, using = "fancylink")
    public WebElement btn_goToLoginPopup;

    @FindBy( how = How.CSS, using = "div[id= 'fancybox-content'] input[name ='username']")
    public WebElement txt_username;

    @FindBy( how = How.CSS, using = "div[id= 'fancybox-content'] input[name ='password']")
    public WebElement txt_password;

    @FindBy( how = How.CLASS_NAME, using = "expand-width")
    public WebElement btn_actualLogin;

    @FindBy( how = How.CLASS_NAME, using = "close-btn")
    public WebElement btn_closePopup;


}
