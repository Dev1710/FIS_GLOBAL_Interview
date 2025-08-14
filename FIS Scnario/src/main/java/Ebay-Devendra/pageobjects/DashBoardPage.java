package Ebay-Devendra.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

importEbay-Devendra.AbstractComponents.AbstractComponent;

public class DashboardPage extends AbstractComponent {

	WebDriver driver;

	public DashboardPage (WebDriver driver) {
		// initialization
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = " //input[@id='gh-ac'] ")
	WebElement  search;
	
	@FindBy(xpath = " //div[@class='s-card__title'] ")
	List<WebElement> products;


	public List<WebElement> getProductList() {
		return products;
	}
	
	public WebElement getProductByName(String productName)
	{
		WebElement prod =getProductList().stream().filter(product->
		product. findFirst().orElse(null);
		return prod;
	}
	}
	
	
	
