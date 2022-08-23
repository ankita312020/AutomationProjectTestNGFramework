package Common;

import java.io.IOException;

import org.testng.annotations.Test;

import utility.baseOne;

public class CommonTest extends baseOne{
	@Test (priority =0)
	public void login_ActiTime() throws InterruptedException, IOException {
		test= extent.createTest(new Object(){}.getClass().getEnclosingMethod().getName())
				.assignAuthor("Murali Sukumar").assignCategory("Regression").assignDevice("Windows");
		login_Page.getUsername_tbox().sendKeys(prop.getProperty("admin_username"));
		login_Page.getPassword_tbox().sendKeys(prop.getProperty("admin_password"));
		login_Page.getKeepLogin_cbox().click();
		login_Page.getLogin_button().click();
		
		}

}
