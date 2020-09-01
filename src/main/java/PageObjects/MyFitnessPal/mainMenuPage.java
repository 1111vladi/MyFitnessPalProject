package PageObjects.MyFitnessPal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class mainMenuPage {

    @FindBy( how = How.CSS, using = "div[class = 'top-nav'] a[href = '/']")
    public WebElement btn_myHomeHomeMenu;

    @FindBy( how = How.CSS, using = "div[class = 'top-nav'] a[href = '/food/diary']")
    public WebElement btn_myHomeFoodMenu;

    @FindBy( how = How.CSS, using = "div[class = 'top-nav'] a[href = '/exercise/diary']")
    public WebElement btn_myHomeExerciseMenu;

    @FindBy( how = How.CSS, using = "div[class = 'top-nav'] a[href = '/reports']")
    public WebElement btn_myHomeReportsMenu;

    @FindBy( how = How.CSS, using = "div[class = 'top-nav'] a[href = '/apps']")
    public WebElement btn_myHomeAppsMenu;

    @FindBy( how = How.CSS, using = "div[class = 'top-nav'] a[href = '/forums']")
    public WebElement btn_myHomeCommunityMenu;

    @FindBy( how = How.CSS, using = "div[class = 'top-nav'] a[href = 'http://blog.myfitnesspal.com']")
    public WebElement btn_myHomeBlogMenu;

    @FindBy( how = How.CLASS_NAME, using = "shop")
    public WebElement btn_myHomeShopMenu;

    @FindBy( how = How.CSS, using = "div[class = 'top-nav'] a[href = '/premium?source=menu_bar']")
    public WebElement btn_myHomePremiumMenu;

    // After Clicking away from "Home Menu" top navigate buttons change class
    @FindBy( how = How.CSS, using = "div[id = 'nav-bg'] a[href = '/exercise/diary/']")
    public WebElement btn_exerciseMenu;
}
