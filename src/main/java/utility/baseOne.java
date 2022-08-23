package utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pages.Login_PO;
import pages.Report_PO;
import pages.Users_PO;


public class baseOne {
	public static WebDriver driver =null;
	public static WebDriverWait wait=null;
	public static Login_PO login_Page= null;
	public static FileInputStream freader=null;
	public static Properties prop=null;
	public static Users_PO user_Page =null;
	public static Report_PO report_Page=null;
	public static FileInputStream extent_reader = null;
	public static Properties extentProperty = null;
	public static ExtentReports extent = null;
	public static ExtentSparkReporter  spark = null;
	public static ExtentTest test= null;
	public static File screenshot= null;
	public static Date date = new Date();
	
	//Added below lines
	public static File file = null;
	public static POIFSFileSystem fs = null;
	public static HSSFWorkbook wb = null;
	public static HSSFSheet sheet = null;
	public static HSSFRow row = null;
	public static HSSFCell cell = null;
	//end
	
	@BeforeSuite
 
	public void initSetup() throws IOException {
		 freader= new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/config.properties");
		prop=new Properties();
		prop.load(freader);
		extent_reader = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/extent.properties");
		extentProperty = new Properties();
		prop.load(extent_reader);
		
	//Added below lines

		file = new File(System.getProperty("user.dir")+"/src/test/resources/testData/testData.xls");
		fs = new POIFSFileSystem(new FileInputStream(file));
		wb = new HSSFWorkbook(fs);
	    HSSFRow row;
	    HSSFCell cell;
	    
	    //end
		System.setProperty("webdriver.chrome.driver",  "/Users/ankitagovind/Downloads/chromedriver");
		driver = new ChromeDriver();
		wait= new WebDriverWait(driver, 30);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
	}
	
	@BeforeTest
	public void launching() throws IOException {
		login_Page= PageFactory.initElements(driver, Login_PO.class);
		user_Page=PageFactory.initElements(driver, Users_PO.class);
		report_Page=PageFactory.initElements(driver, Report_PO.class);
}
	@AfterSuite
	public void sessionEnd() throws IOException {
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
		login_Page.closeConnection();
		freader.close();
		
	
		
		
	}
}