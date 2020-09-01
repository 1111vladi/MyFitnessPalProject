package PageObjects.MyFitnessPal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class myHomeMenuPage {

    @FindBy(how = How.CSS, using = "div[class = 'sub-nav'] a[href = '/']")
    public WebElement btn_home;

    @FindBy(how = How.CSS, using = "div[class = 'sub-nav'] a[href = '/account/my_goals']")
    public WebElement btn_goals;

    @FindBy(how = How.CSS, using = "div[class = 'sub-nav'] a[href = '/measurements/check_in']")
    public WebElement btn_checkIn;

    @FindBy(how = How.CSS, using = "div[class = 'sub-nav'] a[href = '/messages']")
    public WebElement btn_mail;

    @FindBy(how = How.CSS, using = "div[class = 'sub-nav'] a[href = '/profile/member11']")
    public WebElement btn_profile;

    @FindBy(how = How.CSS, using = "div[class = 'sub-nav'] a[href = '/blog/member11']")
    public WebElement btn_myBlog;

    @FindBy(how = How.CSS, using = "div[class = 'sub-nav'] a[href = '/friends']")
    public WebElement btn_friends;

    @FindBy(how = How.CSS, using = "div[class = 'sub-nav'] a[href = '/account/settings']")
    public WebElement btn_settings;
}
