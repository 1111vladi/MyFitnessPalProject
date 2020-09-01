package SanityTests;

import Extensions.verifications;
import Utilities.commonOps;
import Utilities.listeners;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import workFlows.calculatorFlows;


@Listeners(listeners.class)
public class calculatorDesktop extends commonOps {

    @Test(description = "Test01: Add numbers and verify")
    @Description("Test Description: Add numbers and verify the result")
    public void test01_addition(){
        calculatorFlows.addNumbers();
        verifications.textInElement(calculatorTest.field_calculatorResult, "8");
    }
}
