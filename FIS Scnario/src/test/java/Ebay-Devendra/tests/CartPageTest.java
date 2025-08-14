package Ebay-Devendra.tests;


import java.time.Duration;

import java.util.List;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;


import io.github.bonigarcia.wdm.WebDriverManager;

importEbay-Devendra.pageobjects.LandingPage;



public class CartPageTest extends DashBoardtest {


	public static void main(String[] args) {
	
	// TODO Auto-generated method stub

		
		
WebDriverManager.chromedriver().setup();

WebDriver driver = new ChromeDriver();
		
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
driver.manage().window().maximize();

CartPage  CartPage= DashBoardTest.getCartPage();		
	
CartPage. AddtoCart().click();

Action a =new Action(driver);
a.moveToElement(cart).perform();
thread.sleep(2000ms);
String actual=”Your shopping cart contains 1 items”;
String expected = Quantity.gettext();

Assert a =new Assert();
a.assertEqualsIgnoreCase(actual,expected);



driver.close();
		
		
	}

}
