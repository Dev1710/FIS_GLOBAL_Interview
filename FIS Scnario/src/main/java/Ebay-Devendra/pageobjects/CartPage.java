package Ebay-Devendra.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class CartPage  {
	WebDriver driver;

	@FindBy(xpath = " //*[text()='Add to cart'] ")
	WebElement AddtoCart;

	@FindBy(xpath = " (//a[@class='gh-flyout__target'])[3] ")
	WebElement Cart;

               @FindBy(xpath = " (//*[@aria-label='Your shopping cart contains 1 items'])[2]] ")
	WebElement Quantity;

	public OrderPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
}
