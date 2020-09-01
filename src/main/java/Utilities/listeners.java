package Utilities;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners extends commonOps implements ITestListener {

    public void onTestStart(ITestResult iTestResult) {
        System.out.println("------------------ Starting Test: " + iTestResult.getName() + " ------------------");
    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("------------------ Starting Test: " + iTestResult.getName() + " Passed ------------------");
    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("------------------ Starting Test: " + iTestResult.getName() + " Failed ------------------");
        if (platform.equalsIgnoreCase("web"))
        saveScreenshot();
    }

    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("------------------ Skipping Test: " + iTestResult.getName() + " ------------------");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {
        System.out.println("------------------ Starting Execution ------------------");
    }

    public void onFinish(ITestContext iTestContext) {
        System.out.println("------------------ Ending Execution ------------------");
    }

    @Attachment(value = "Page Screen-Shot", type = "image/png")
    public byte[] saveScreenshot(){
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
}
