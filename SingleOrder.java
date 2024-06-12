package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleOrder {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//Login with invalid credentials
		driver.findElement(By.xpath("//* [@id = 'user-name']")).sendKeys("standard_use");
		driver.findElement(By.xpath("//* [@id = 'password']")).sendKeys("secret_sauc");
		driver.findElement(By.xpath("//* [@id = 'login-button']")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Login with valid credentials
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//* [@id = 'user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//* [@id = 'password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//* [@id = 'login-button']")).click();
		
		//Add to Cart button functionality
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Remove button functionality
		driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();	
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
			
		//Checkout form functionality
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Ashwin");
		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Kumar");
		driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("600100");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.close();
		
	
	}
}
