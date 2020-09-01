package PageObjects.MyFitnessPalMobile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class actualLoginPage {

    @FindBy(how = How.ID, using = "email_address_edit")
    public WebElement txt_username;

    @FindBy(how = How.ID, using = "password_edit")
    public WebElement txt_password;

    @FindBy(how = How.ID, using = "login_button")
    public WebElement btn_login;
}
