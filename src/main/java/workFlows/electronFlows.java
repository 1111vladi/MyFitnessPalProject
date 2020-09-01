package workFlows;

import Extensions.uiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;


public class electronFlows extends commonOps {

    @Step("Get screen info resolution")
    public static void getScreenInfo() {
        uiActions.click(electronTestPage.btn_createManageWindows);
        uiActions.click(electronTestPage.btn_getAppUserSysInfo);
        uiActions.click(electronTestPage.btn_ScreenInfoToggle);
        uiActions.click(electronTestPage.btn_ScreenInfoToggle);
        uiActions.click(electronTestPage.btn_getScreenInfo);
    }
}
