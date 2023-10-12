package tek.capstone.guardians.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.guardians.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

	// created a constructor by using the initElements method from pageFactory
	// class. initialize the page object in this class
	public RetailHomePage() {// Constructor
		PageFactory.initElements(getDriver(), this);

	}


	@FindBy(id = "hamburgerBtn")
	public WebElement allOptionsbar;

	@FindBy(xpath = "//div[@class='sidebar__content']//span")
	public List<WebElement> shopBaredisplay;

	@FindBy(xpath = "//div[@class='sidebar_content-item']//span")
	public List<WebElement> SidebarOptinss;
}
