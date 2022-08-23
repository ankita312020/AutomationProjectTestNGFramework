package Users;

import java.sql.Timestamp;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DataProviders.DataExcel;
import pages.Users_PO;
import utility.baseOne;

public class User extends baseOne{

	@Test (dataProvider="UserCreation", dataProviderClass=DataExcel.class)
	public void user(String taskOne, String tasktwo, String taskthree) throws InterruptedException {
		test= extent.createTest(new Object(){}.getClass().getEnclosingMethod().getName())
				.assignAuthor("Murali Sukumar").assignCategory("Regression").assignDevice("Windows");
		user_Page.getTotal_Contain_Users().click();
		wait.until(ExpectedConditions.visibilityOf(user_Page.getVerificationMods()));
		user_Page.getVerificationMods().click();
		wait.until(ExpectedConditions.visibilityOf(user_Page.getEnterFirstName()));
		
		Thread.sleep(5000);
		Date date = new Date();
        System.out.println(new Timestamp(date.getTime()));
		user_Page.getEnterFirstName().sendKeys(taskOne+new Timestamp(date.getTime()).toString());
		user_Page.getEnterLastName().sendKeys(tasktwo +new Timestamp(date.getTime()).toString());
		user_Page.getEnterEmailId().sendKeys(taskthree);
		user_Page.getEnterTitleText().click();
		Thread.sleep(5000);
		user_Page.getSelectClassItem().click();
		Thread.sleep(5000);
		user_Page.getClickSubmitButton().click();
		Thread.sleep(5000);
        user_Page.getCloseLink().click();
        Thread.sleep(5000);
	}
}

