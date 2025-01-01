package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
    private static ExtentReports extent;

//    public static ExtentReports getInstance() {
//        if (extent == null) {
//            // Configure the ExtentSparkReporter
//            ExtentSparkReporter sparkReporter = new ExtentSparkReporter("C:\\Users\\daiya\\IdeaProjects\\iqrashoppingdemo_v5\\test-output.html");
//
//            // Attach the reporter to the ExtentReports instance
//            extent = new ExtentReports();
//            extent.attachReporter(sparkReporter);
//
//            // Add system information or environment details if needed
//            extent.setSystemInfo("Operating System", System.getProperty("os.name"));
//            extent.setSystemInfo("User", System.getProperty("user.name"));
//        }
//        return extent;
//    }

    public static ExtentReports getInstance() {
        if (extent == null) {
            String reportPath = System.getProperty("user.dir") + "/test-output/ExtentReport.html";
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportPath);

            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);

            // Add system info to the report
            extent.setSystemInfo("Project Name", "QA IqraShoppingDemo");
            extent.setSystemInfo("Version", "v1.5");
            extent.setSystemInfo("Environment", "QA");
            extent.setSystemInfo("Tester", "Your Name");
        }
        return extent;
    }
}