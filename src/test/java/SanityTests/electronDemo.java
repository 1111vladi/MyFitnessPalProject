package SanityTests;

import Extensions.verifications;
import Utilities.commonOps;
import Utilities.listeners;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import workFlows.electronFlows;


@Listeners(listeners.class)
public class electronDemo extends commonOps {

    @Test(description = "Test01: Verify Screen Resolution")
    @Description("Test Description: Get the resolution from App and verify")
    public void test01_screenResolution(){
        electronFlows.getScreenInfo();
        verifications.textInElement(electronTestPage.field_gotScreenInfo, "Your screen is: 1920px x 1080px");
    }
}
