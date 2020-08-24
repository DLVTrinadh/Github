package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentreporterNG {

	static ExtentReports extent;
	
	public static ExtentReports getextentobject()
	{
		
		String path= System.getProperty("user.dir")+"\\extentreports\\index.html";
		
		ExtentSparkReporter extentsparkreporter = new ExtentSparkReporter(path);
		
		extentsparkreporter.config().setReportName("Automation Results");
		extentsparkreporter.config().setDocumentTitle("Test Results");
		
		extent= new ExtentReports();
		extent.attachReporter(extentsparkreporter);
		extent.setSystemInfo("Tester", "D Trinadh");
		return extent;
		
		
		
	}
}
