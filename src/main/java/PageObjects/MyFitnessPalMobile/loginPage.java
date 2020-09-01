package PageObjects.MyFitnessPalMobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class loginPage {

    public AppiumDriver driver;

    public loginPage(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 3, TimeUnit.SECONDS), this);
    }

    @AndroidFindBy(id = "btnSignIn")
    public AndroidElement btn_login;

    @AndroidFindBy(id = "btnNewAccount")
    public AndroidElement btn_signUp;

//    @FindBy(how = How.ID, using = "btnSignIn")
//    public WebElement btn_login;
//
//    @FindBy(how = How.ID, using = "btnNewAccount")
//    public WebElement btn_signUp;



}
