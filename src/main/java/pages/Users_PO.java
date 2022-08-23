package pages;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utility.baseOne;

public class Users_PO extends baseOne{
	
		
	@FindBy(id = "container_users")
	private WebElement total_Contain_Users;
	@FindBy (xpath= "//div[@class='components_button_label' and contains(text(), 'New User')]")
	private WebElement verificationMods;
	@FindBy (id= "createUserPanel_firstNameField")
	private WebElement  enterFirstName;
	@FindBy (id= "createUserPanel_lastNameField")
	private WebElement enterLastName;
	@FindBy(id ="createUserPanel_emailField")
	private WebElement enterEmailId;
	@FindBy (xpath ="//div[@class='title' and contains(text(), '-- department not assigned --')]")
	private WebElement enterTitleText;
	@FindBy (xpath ="//div[@class='item'][3]")
	private WebElement selectClassItem;
	@FindBy (xpath="//div[@class='components_button_label' and contains(text(), 'Save & Send Invitation')]")
	private WebElement clickSubmitButton;
	@FindBy (xpath="//div[@class='closeLink']//span[text()='Close'][1]")
	private WebElement closeLink;
	public WebElement getTotal_Contain_Users() {
		return total_Contain_Users;
	}
	public WebElement getVerificationMods() {
		return verificationMods;
	}
	public WebElement getEnterFirstName() {
		return enterFirstName;
	}
	public WebElement getEnterLastName() {
		return enterLastName;
	}
	public WebElement getEnterEmailId() {
		return enterEmailId;
	}
	public WebElement getEnterTitleText() {
		return enterTitleText;
	}
	public WebElement getSelectClassItem() {
		return selectClassItem;
	}
	public WebElement getClickSubmitButton() {
		return clickSubmitButton;
	}
	public WebElement getCloseLink() {
		return closeLink;
	}
	
	

}
