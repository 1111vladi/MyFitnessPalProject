package workFlows;

import Extensions.mobileActions;
import Extensions.uiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;

public class mobileFlows extends commonOps {

    @Step("Login MyFitnessPal Flow - Mobile")
    public static void login(String user, String password) {
        mobileActions.click(fitnessPalMobileLoginPage.btn_login);
        uiActions.clearText(fitnessPalMobileActualLoginPage.txt_username);
        uiActions.updateText(fitnessPalMobileActualLoginPage.txt_username, user);
        uiActions.updateText(fitnessPalMobileActualLoginPage.txt_password, password);
        mobileActions.click(fitnessPalMobileActualLoginPage.btn_login);
        mobileActions.click(fitnessPalMobileHomePage.btn_me);
    }

    @Step("Add water cups to my diary")
    public static void addWaterCups(String numOfWaterCups) {
        uiActions.click(fitnessPalMobileHomePage.btn_diary);
        mobileActions.scrollToElement(fitnessPalMobileDiaryPage.txt_addedWater);
        uiActions.click(fitnessPalMobileDiaryPage.btn_addWater);
        uiActions.updateText(fitnessPalMobileAddWaterPage.txt_addWater, numOfWaterCups);
        uiActions.click(fitnessPalMobileAddWaterPage.btn_confirm);
    }

    @Step("Delete water cups to my diary")
    public static void deleteWaterCups() {
        uiActions.click(fitnessPalMobileHomePage.btn_diary);
        mobileActions.longPressOnElement(fitnessPalMobileDiaryPage.txt_addedWater);
        uiActions.click(fitnessPalMobileDiaryPage.btn_deleteEntry);
    }
}
