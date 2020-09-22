package co.fido.qa.selenium.Reports;

import co.fido.qa.selenium.Utils.FrameWorkUtls;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class HtmlReports {private ExtentReports reports;
    private static HtmlReports instance;

    private HtmlReports() {
        reports = new ExtentReports();
        reports.attachReporter(new ExtentHtmlReporter(FrameWorkUtls.getReportFile()));
    }

    public static ExtentReports getReport(){
        if(instance==null){
            instance = new HtmlReports();
        }
        return instance.reports;

    }
}
