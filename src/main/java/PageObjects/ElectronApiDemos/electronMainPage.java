package PageObjects.ElectronApiDemos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class electronMainPage {

    @FindBy( how = How.ID, using = "button-windows")
    public WebElement btn_createManageWindows;

    @FindBy( how = How.ID, using = "button-app-sys-information")
    public WebElement btn_getAppUserSysInfo;

    @FindBy( how = How.ID, using = "screen-info-demo-toggle")
    public WebElement btn_ScreenInfoToggle;

    @FindBy( how = How.ID, using = "screen-info")
    public WebElement btn_getScreenInfo;

    @FindBy( how = How.ID, using = "got-screen-info")
    public WebElement field_gotScreenInfo;
}
