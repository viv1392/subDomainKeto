package utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import javax.swing.text.Utilities;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class KetoListnersWeb implements ITestListener {
	ExtentReports reports;
	ExtentTest test;

	@Override
	public void onStart(ITestContext context) {
		reports = MyExtent.repExtent();

	}

	@Override
	public void onTestStart(ITestResult result) {
		test = reports.createTest(result.getName());
		test.log(Status.INFO, result.getName() + "  TestStartExecuting");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getName() + "  TestSucced");

	}

	@Override
	public void onTestFailure(ITestResult result) {

		test.log(Status.INFO, result.getThrowable());
		test.log(Status.FAIL, result.getName() + "  TestFailed");
		WebDriver driver = null;

		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}

		try {
			String destinationScreenshotPath = UtilisClass.screenShot(driver, result.getName());
			test.addScreenCaptureFromPath(destinationScreenshotPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.INFO, result.getThrowable());
		test.log(Status.SKIP, result.getName() + "  TestSkipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		reports.flush();
		File extentReport = new File(System.getProperty("user.dir") + "\\ExtentReport\\extent.html");
		try {
			Desktop.getDesktop().browse(extentReport.toURI());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
