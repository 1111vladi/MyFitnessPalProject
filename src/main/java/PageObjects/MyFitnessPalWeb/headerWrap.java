package PageObjects.MyFitnessPalWeb;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class headerWrap {

    @FindBy( how = How.XPATH, using = "//div[@class = 'header-wrap clearfix']//li[@class = 'first' and contains(text(), 'Hi')]")
    public WebElement txt_hi;

    @FindBy( how = How.XPATH, using = "//div[@class = 'header-wrap clearfix']//a[@class = 'user-2']")
    public WebElement txt_userName;

    @FindBy( how = How.XPATH, using = "//div[@class = 'header-wrap clearfix']//a[contains(@href, '/account/logout')]")
    public WebElement btn_logout;

    @FindBy( how = How.CSS, using = "div[id = 'logo'] a[href = 'http://www.myfitnesspal.com/']")
    public WebElement img_myFitnessPalLogo;


}


