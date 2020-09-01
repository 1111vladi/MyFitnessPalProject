package SanityTests;

import Extensions.verifications;
import Utilities.commonOps;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import workFlows.webFlows;

@Listeners(Utilities.listeners.class)
public class myFitnessPalDB extends commonOps {

    @Test(description = "Test01: Login to MyFitnessPal with DB")
    @Description("Test Description: Login into MyFitnessPal web application with DB")
    public void test01_loginDB(){
        webFlows.loginDb();
        String username = "member11";
        verifications.textInElement(fitnessPalHeaderWrap.txt_hi, "Hi, " + username);
    }
}
