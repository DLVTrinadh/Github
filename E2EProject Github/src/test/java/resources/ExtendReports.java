package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReports {

	public static void main(String[] args) {

		
		
		String path= System.getProperty("user.dir")+"\\extentreports5\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
		reporter.config().setDocumentTitle("Testing ");
		reporter.config().setReportName("WebAutomation");

		ExtentReports reports = new ExtentReports();
		reports.attachReporter(reporter);
		
		ExtentTest test=reports.createTest("sampleA");
		ExtentTest node = test.createNode("MyFirstChildTest", "Node Description");
		test.log(Status.PASS, "pass");
		System.out.println("giiii");
		test.log(Status.FAIL, "fail");
		
		reports.flush();
		test.addScreenCaptureFromBase64String("hi");
		node.createNode("jgfjhg");
		
		
		
		
		
	}

}
