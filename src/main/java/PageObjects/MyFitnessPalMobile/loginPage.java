package PageObjects.MyFitnessPalMobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class loginPage {

    public AppiumDriver driver;

    public loginPage(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 3, TimeUnit.SECONDS), this);
    }

    @FindBy(id = "btnSignIn")
    public WebElement btn_login;

    @FindBy(id = "btnNewAccount")
    public WebElement btn_signUp;

}
