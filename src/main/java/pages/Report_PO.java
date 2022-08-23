package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Report_PO {

	@FindBy (xpath="//a[@class='content reports']//div[@id='container_reports']")
	private WebElement reportClick;
	@FindBy(xpath="//div[text()='Reports Dashboard']")
	private WebElement reportDashboard;
	@FindBy(xpath="//div[contains(@class, 'components-Dropdown-trigger--1w6PGjU6')]//div//span[2]")
	private WebElement componentDropdown;
	@FindBy(xpath="//li[contains(@class, 'components-SelectableListItem-listItem--1LT4sdPD')]//span//span//span[contains(text(), 'Shortcuts')]")
	private WebElement componentDropdown1;
	public WebElement getReportClick() {
		return reportClick;
	}
	public WebElement getReportDashboard() {
		return reportDashboard;
	}
	public WebElement getComponentDropdown() {
		return componentDropdown;
	}
	
	

}



	