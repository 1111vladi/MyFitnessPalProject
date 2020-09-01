package workFlows;

import Extensions.uiActions;
import Utilities.commonOps;
import io.qameta.allure.Step;

public class calculatorFlows extends commonOps {

    @Step("Calculate Addition")
    public static void addNumbers() {
        uiActions.click(calculatorTest.btn_clear);
        uiActions.click(calculatorTest.btn_one);
        uiActions.click(calculatorTest.btn_plus);
        uiActions.click(calculatorTest.btn_seven);
        uiActions.click(calculatorTest.btn_equals);
    }
}
