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

import Ebay-Devendra.pageobjects.DashBoardPage;



public class OrderTest {


	public static void main(String[] args) {
	
	// TODO Auto-generated method stub

		
String productName = "book";
		
WebDriverManager.chromedriver().setup();

WebDriver driver = new ChromeDriver();
		
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
driver.manage().window().maximize();
	
driver.get("https://www.ebay.com ");

DashBoardPage DashboardPage = new DashBoardPage (driver);		
	DashBoardPage.search().sendkeys(productName);
		
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	
wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".s-card__title ")));

DashboardPage. getProductByName();
				
public void getCartPage()
{

String main =driver.getWindowhandle();

Set<String> otherpage =driver.getWindowhandles();

for(String op : otherpage())
{

if(!(op.gettext().equals(main))
{
driver.switchTo(op);
}
}

}

	driver.close();
	
	
	}

}
