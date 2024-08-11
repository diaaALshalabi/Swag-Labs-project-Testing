package secondprojectautomationjuly;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class project1 {
	
	WebDriver driver = new ChromeDriver();
	
	
	
	@BeforeTest
	public void mysetup() {
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		
	}
	@Test(priority =1 )  
	
	public void mytest() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
				
		
	}
	
	@Test(priority =2 )
	public void Addtocarttest() throws InterruptedException {
		List<WebElement> addToCart = driver.findElements(By.cssSelector(".btn_primary"));
		
		int x = Math.min(6, addToCart.size());
		for(int i=0; i<x ; i++) {
			
			WebElement y = addToCart.get(i);
			y.click();
			Thread.sleep(1000);
			
		}
	
	}
	
	@Test(priority = 3)
	public void removetocart() throws InterruptedException {
		WebElement CartIcon = driver.findElement(By.cssSelector(".shopping_cart_link"));
		CartIcon.click();
		List<WebElement> removebuttons= driver.findElements(By.cssSelector(".cart_button"));
		int x = Math.min(6, removebuttons.size());
		for(int i=0 ;i<x ;i++) {
			WebElement z = removebuttons.get(i);
			z.click();
			Thread.sleep(700);
			
				
		}
		driver.navigate().back();
	}
		@Test(priority = 4)
		public void myTest2() throws InterruptedException {
			List<WebElement> addtoCart2 = driver.findElements(By.cssSelector(".btn_primary"));
			int x2 = Math.min(3, addtoCart2.size());
			for(int i=0; i<x2;i++ ) {
				
				WebElement dd = addtoCart2.get(i);
				dd.click();
				Thread.sleep(850);
				
				
			
		}
		}
		@Test(priority = 5)
		public void mytestremove() throws InterruptedException {
		WebElement remove = driver.findElement(By.cssSelector(".shopping_cart_link"));
		remove.click();
		List<WebElement> removeitem = driver.findElements(By.cssSelector(".cart_button"));
			int a = Math.min(3,removeitem.size() );
			for(int i=0; i<a ;i++) {
				
				WebElement zz = removeitem.get(i);
				zz.click();
				Thread.sleep(600);
				
		}
			driver.navigate().back();
	}
		
		
		
	}

	
	
	


