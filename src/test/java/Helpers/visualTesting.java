package Helpers;

import Utilities.commonOps;
import Utilities.helperMethods;
import org.testng.annotations.Test;
import workFlows.webFlows;

public class visualTesting extends commonOps {

    @Test
    public void createScreenshot(){
        webFlows.login("member1234@gmail.com", "member1234");
        helperMethods.takeElementScreenshot(fitnessPalHeaderWrap.img_myFitnessPalLogo, "MyFitnessPalLogo_Ver1.00");
    }

}
