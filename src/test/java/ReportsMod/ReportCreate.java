package ReportsMod;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.baseOne;

public class  ReportCreate extends baseOne{
	@Test (priority =2)
	public void report() throws InterruptedException {
		test= extent.createTest(new Object(){}.getClass().getEnclosingMethod().getName())
				.assignAuthor("Murali Sukumar").assignCategory("Regression").assignDevice("Windows");
		report_Page.getReportClick().click();
		Assert.assertEquals("Reports Dashboard", report_Page.getReportDashboard().getText() ,
				"Report dashboard text not displayed");
		report_Page.getComponentDropdown().click();
		
	}

}



