package utils;

import io.qameta.allure.Attachment;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static com.codeborne.selenide.Selenide.screenshot;

public class AllureListeners implements ITestListener {

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] saveScreenshot() {
        return screenshot("failedTest").getBytes();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        saveScreenshot();
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("===== Test Execution Started =====");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("===== Test Execution Finished =====");
    }
}
