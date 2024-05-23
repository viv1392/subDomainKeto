package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class MyExtent {
	public static ExtentSparkReporter sparkReporter;
	public static ExtentReports reports;
	
	public static ExtentReports repExtent() {
		File filepath =new File(System.getProperty("user.dir")+"\\ExtentReport\\extent.html");
		sparkReporter=new ExtentSparkReporter(filepath);
		sparkReporter.config().setReportName("ketoBalanced");
		sparkReporter.config().setDocumentTitle("ketoBalancedTestReport");
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss");
		
		reports=new ExtentReports();
		reports.attachReporter(sparkReporter);
		File fisProp=new File(System.getProperty("user.dir")+"\\Configuration\\global.properties");
		Properties prop=new Properties();
		try {
        FileInputStream fis=new FileInputStream(fisProp);
	    prop=new Properties();
		prop.load(fis);
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
		reports.setSystemInfo("Application Url", prop.getProperty("url"));
		reports.setSystemInfo("Browser", prop.getProperty("Br"));
		reports.setSystemInfo("operatingSystem", System.getProperty("os.name"));
		reports.setSystemInfo("Java Version", System.getProperty("java.version"));
		reports.setSystemInfo("Enviroment", "Production");
		reports.setSystemInfo("Tested By", "Vivek Pandey");
		return reports;
		
	}
}
