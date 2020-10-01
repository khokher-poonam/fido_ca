package co.fido.qa.selenium.Listeners;

import co.fido.qa.selenium.Utils.CaptureType;
import co.fido.qa.selenium.Utils.FrameWorkUtls;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        FrameWorkUtls.captureScreen(iTestResult.getName(), CaptureType.PASS);



    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        FrameWorkUtls.captureScreen(iTestResult.getName(), CaptureType.FAIL);

    }
    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
