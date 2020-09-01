package SanityTests;

import Extensions.verifications;
import Utilities.commonOps;
import Utilities.listeners;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import workFlows.mobileFlows;

@Listeners(listeners.class)
public class myFitnessPalMobile extends commonOps {

    @Test(description = "Test01: Login to MyFitnessPal Mobile")
    @Description("Test Description: Login into MyFitnessPal mobile application")
    public void test01_login(){
        mobileFlows.login("member1234@gmail.com", "member1234");
        String username = "member11";
        verifications.textInElement(fitnessPalMobileMePage.txt_userName, username);
    }

    @Test(description = "Test02: Add water cups")
    @Description("Test Description: Add water cups into my diary")
    public void test02_addWaterCups(){
        mobileFlows.addWaterCups("4");
        String cups = "cups";
        verifications.textInElement(fitnessPalMobileDiaryPage.txt_addedWater, "4 " + cups);

    }

    @Test(description = "Test03: Delete water cups")
    @Description("Test Description: Delete water cups from my diary")
    public void test03_deleteWaterCups(){
        mobileFlows.deleteWaterCups();
    }
}
