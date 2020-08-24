package Academy;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.BaseTest;
import resources.ExtentreporterNG;



public class Listener implements ITestListener {
	BaseTest base = new BaseTest();
	ExtentTest test;

	ExtentReports extent = ExtentreporterNG.getextentobject();
	ThreadLocal<ExtentTest> extentreport = new ThreadLocal<ExtentTest>();
	
	
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

		
		test = extent.createTest(result.getMethod().getMethodName());
		extentreport.set(test);
		extentreport.get().pass("Test passed");
		extentreport.get().addScreenCaptureFromBase64String("screeshot default tried");
		extentreport.get().log(Status.PASS, "test passed 2");
		
			

	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		try {
			extentreport.get().addScreenCaptureFromPath(base.getscreenshot(result.getName()), result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			base.getscreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestFailure(ITestResult result) {
		extentreport.get().fail(result.getThrowable());
		
		
			try {
				extentreport.get().addScreenCaptureFromPath(base.getscreenshot(result.getName()), result.getMethod().getMethodName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
			// TODO Auto-generated catch block


		
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		
		// TODO Auto-generated method stub

		extent.flush();
	}

}
